package org.extensions.dsl;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.extensions.dsl.data.DSLStats;
import org.extensions.dsl.data.Spectrum;
import org.extensions.dsl.data.Us;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.bitplan.fritzbox.FritzBoxSession;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MonitorProcessor {
  private final BaseFritzBox fritzBox;
  private final long timeout;
  
  public MonitorProcessor(String url, String username, String password, long timeout) {
    this.fritzBox = new BaseFritzBox(url, username, password);
    this.timeout = timeout;
    
  }
  
  public void processMonitor() {
    while (true) {
      FritzBoxSession session = fritzBox.login();
      PrintStream ps = null;
      Calendar lastDate = null;
      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
      String last = "";
      try {
        while (true) {
          long currentTimeMillis = System.currentTimeMillis()+timeout;
          String response = session.getResponse("/internet/dsl_spectrum.lua","?no_sidrenew=1&myXhr=1&useajax=1");
          Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
          Spectrum spectrum = gson.fromJson(response, Spectrum.class);
          String statsResponse = session.getResponse("/internet/dsl_stats_tab.lua","?update=mainDiv&useajax=1&xhr=1");
          
          Document stats = Jsoup.parse(statsResponse);
          DSLStats dslStats = parseDocument(stats);
          
          Us us = spectrum.getPort().get(0).getUs();
          us.setDslStats(dslStats);
          //      gson.toJson(spectrum);
          String json = gson.toJson(us);
          if (!last.equals(json)) {
            last = json;
            
            Calendar now = Calendar.getInstance();
            us.setDate(now.getTime());
            
            if (lastDate==null ||
                lastDate.get(Calendar.DAY_OF_YEAR)!=now.get(Calendar.DAY_OF_YEAR)) {
              if (ps!=null) {
                ps.close();
              }
              ps = new PrintStream(new FileOutputStream("DSL-"+dateFormat.format(now.getTime())+".json", true));
            }
            
            ps.println(gson.toJson(us));
            ps.flush();
          }

          Thread.sleep(currentTimeMillis-System.currentTimeMillis());
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
      try {
        Thread.sleep(timeout);
      } catch (InterruptedException e) {}
    }
  }
  
  private DSLStats parseDocument(Document stats) {
    DSLStats dslStats = new DSLStats();
    Elements trs = stats.getElementsByTag("tr");
    for (Element tr : trs) {
      Elements headers = tr.getElementsByClass("c1");
      if (headers!=null && !headers.isEmpty()) {
        Element td = headers.get(0);
        String val = td.text();
        
        switch (val) {
          case "DSLAM-Datenrate Max.":
            dslStats.setMaxSendDataRate(Integer.parseInt(tr.getElementsByClass("c3").get(0).text()));
            dslStats.setMaxRecvDataRate(Integer.parseInt(tr.getElementsByClass("c4").get(0).text()));
            break;
          case "Leitungskapazität":
            dslStats.setLineSendCapicity(Integer.parseInt(tr.getElementsByClass("c3").get(0).text()));
            dslStats.setLineRecvCapicity(Integer.parseInt(tr.getElementsByClass("c4").get(0).text()));
            break;
          case "Aktuelle Datenrate":
            dslStats.setActualSendRate(Integer.parseInt(tr.getElementsByClass("c3").get(0).text()));
            dslStats.setActualRecvRate(Integer.parseInt(tr.getElementsByClass("c4").get(0).text()));
            break;
          case "Impulsstörungsschutz (INP)":
            dslStats.setInpSend(Integer.parseInt(tr.getElementsByClass("c3").get(0).text()));
            dslStats.setInpRecv(Integer.parseInt(tr.getElementsByClass("c4").get(0).text()));
            break;
          case "Störabstandsmarge":
            dslStats.setNoiseSendDelta(Integer.parseInt(tr.getElementsByClass("c3").get(0).text()));
            dslStats.setNoiseRectDelta(Integer.parseInt(tr.getElementsByClass("c4").get(0).text()));
            break;
          case "Leitungsdämpfung":
            dslStats.setLineSendLoss(Integer.parseInt(tr.getElementsByClass("c3").get(0).text()));
            dslStats.setLineRectLoss(Integer.parseInt(tr.getElementsByClass("c4").get(0).text()));
            break;
          case "Profil":
            dslStats.setProfile(tr.getElementsByClass("c2").get(0).text());
            break;
          case "G.Vector":
            dslStats.setgVectorSend(tr.getElementsByClass("c3").get(0).text());
            dslStats.setgVectorRecv(tr.getElementsByClass("c4").get(0).text());
            break;
          case "Trägersatz":
            dslStats.setTypeSend(tr.getElementsByClass("c3").get(0).text());
            dslStats.setTypeRecv(tr.getElementsByClass("c4").get(0).text());
            break;
          case "FRITZ!Box":
            dslStats.setEsErrorsRouter(Integer.parseInt(tr.getElementsByClass("c2").get(0).text()));
            dslStats.setSesErrorsRouter(Integer.parseInt(tr.getElementsByClass("c3").get(0).text()));
            break;
          case "Vermittlungsstelle":
            dslStats.setEsErrorsSwitch(Integer.parseInt(tr.getElementsByClass("c2").get(0).text()));
            dslStats.setSesErrorsSwitch(Integer.parseInt(tr.getElementsByClass("c3").get(0).text()));
            break;
            
          default:
            break;
        }
      }
      

    }
    
    return dslStats;
  }
  
  
  
  public static void main(String[] args) {
    String password = null;
    String url = "http://fritz.box";
    String user = null;
    int timeout = 30;
    boolean valid = (args.length&1)==0;
    if (valid) {
      for (int i = 0; valid && i<args.length; i+=2) {
        switch (args[i]) {
          case "-p":
            password = args[i+1];
            break;
          case "-u":
            user = args[i+1];
            break;
          case "-h":
            url = args[i+1];
            break;
          case "-t":
            try {
              timeout = Math.max(1, Integer.parseInt(args[i+1]));
            } catch (Exception e) {
              valid = false;
            }
            break;
          default:
            valid = false;
            break;
        }
      }
    }
    if (valid) {
      new MonitorProcessor(url, user, password, timeout).processMonitor();
    } else {
      System.out.println("Usage: MonitorProcessor [-h url] [-u user] -p password [-t timeout (sec.)]");
    }
  }
}
