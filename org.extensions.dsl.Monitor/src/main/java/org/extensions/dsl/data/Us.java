
package org.extensions.dsl.data;

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Us {

  @SerializedName("DATE_TIME")
  @Expose
  private Date date = null;

  @SerializedName("TONES_PER_SNR_VALUE")
  @Expose
  private int tonespersnrvalue;
  @SerializedName("MAX_SNR_FREQ")
  @Expose
  private int maxsnrfreq;
  @SerializedName("MAX_BAT_FREQ")
  @Expose
  private int maxbatfreq;
  @SerializedName("BIT_BANDCONFIG")
  @Expose
  private List<BitBandConfig> bitbandconfig = null;
  @SerializedName("DETECTED_RFI_VALUES")
  @Expose
  private List<Object> detectedrfivalues = null;
  @SerializedName("MIN_BIT_VALUES")
  @Expose
  private List<Integer> minbitvalues = null;
  @SerializedName("MAX_SNR_TONE")
  @Expose
  private int maxsnrtone;
  @SerializedName("ACT_BIT_VALUES")
  @Expose
  private List<Integer> actbitvalues = null;
  @SerializedName("MAX_SNR_VALUES")
  @Expose
  private List<Integer> maxsnrvalues = null;
  @SerializedName("MAX_BAT_TONE")
  @Expose
  private int maxbattone;
  @SerializedName("PILOT_VALUES")
  @Expose
  private List<Integer> pilotvalues = null;
  @SerializedName("MAX_BIT_VALUES")
  @Expose
  private List<Integer> maxbitvalues = null;
  @SerializedName("PILOT")
  @Expose
  private int pilot;
  @SerializedName("MODE")
  @Expose
  private String mode;
  @SerializedName("MIN_SNR_VALUES")
  @Expose
  private List<Integer> minsnrvalues = null;
  @SerializedName("TONES_PER_BAT_VALUE")
  @Expose

  private int tonesperbatvalue;
  @SerializedName("BRIDGE_TAPS")
  @Expose

  private BridgeTaps bridgetaps;
  @SerializedName("ACT_SNR_VALUES")
  @Expose
  private List<Integer> actsnrvalues = null;

  @SerializedName("DSL_STATS")
  @Expose
  private DSLStats dslStats = null;
  
  public int getTONESPERSNRVALUE() {
    return tonespersnrvalue;
  }

  public void setTONESPERSNRVALUE(int tONESPERSNRVALUE) {
    this.tonespersnrvalue = tONESPERSNRVALUE;
  }

  public int getMAXSNRFREQ() {
    return maxsnrfreq;
  }

  public void setMAXSNRFREQ(int mAXSNRFREQ) {
    this.maxsnrfreq = mAXSNRFREQ;
  }

  public int getMAXBATFREQ() {
    return maxbatfreq;
  }

  public void setMAXBATFREQ(int mAXBATFREQ) {
    this.maxbatfreq = mAXBATFREQ;
  }

  public List<BitBandConfig> getBITBANDCONFIG() {
    return bitbandconfig;
  }

  public void setBITBANDCONFIG(List<BitBandConfig> bITBANDCONFIG) {
    this.bitbandconfig = bITBANDCONFIG;
  }

  public List<Object> getDETECTEDRFIVALUES() {
    return detectedrfivalues;
  }

  public void setDETECTEDRFIVALUES(List<Object> dETECTEDRFIVALUES) {
    this.detectedrfivalues = dETECTEDRFIVALUES;
  }

  public List<Integer> getMINBITVALUES() {
    return minbitvalues;
  }

  public void setMINBITVALUES(List<Integer> mINBITVALUES) {
    this.minbitvalues = mINBITVALUES;
  }

  public int getMAXSNRTONE() {
    return maxsnrtone;
  }

  public void setMAXSNRTONE(int mAXSNRTONE) {
    this.maxsnrtone = mAXSNRTONE;
  }

  public List<Integer> getACTBITVALUES() {
    return actbitvalues;
  }

  public void setACTBITVALUES(List<Integer> aCTBITVALUES) {
    this.actbitvalues = aCTBITVALUES;
  }

  public List<Integer> getMAXSNRVALUES() {
    return maxsnrvalues;
  }

  public void setMAXSNRVALUES(List<Integer> mAXSNRVALUES) {
    this.maxsnrvalues = mAXSNRVALUES;
  }

  public int getMAXBATTONE() {
    return maxbattone;
  }

  public void setMAXBATTONE(int mAXBATTONE) {
    this.maxbattone = mAXBATTONE;
  }

  public List<Integer> getPILOTVALUES() {
    return pilotvalues;
  }

  public void setPILOTVALUES(List<Integer> pILOTVALUES) {
    this.pilotvalues = pILOTVALUES;
  }

  public List<Integer> getMAXBITVALUES() {
    return maxbitvalues;
  }

  public void setMAXBITVALUES(List<Integer> mAXBITVALUES) {
    this.maxbitvalues = mAXBITVALUES;
  }

  public int getPILOT() {
    return pilot;
  }

  public void setPILOT(int pILOT) {
    this.pilot = pILOT;
  }

  public String getMODE() {
    return mode;
  }

  public void setMODE(String mODE) {
    this.mode = mODE;
  }

  public List<Integer> getMINSNRVALUES() {
    return minsnrvalues;
  }

  public void setMINSNRVALUES(List<Integer> mINSNRVALUES) {
    this.minsnrvalues = mINSNRVALUES;
  }

  public int getTONESPERBATVALUE() {
    return tonesperbatvalue;
  }

  public void setTONESPERBATVALUE(int tONESPERBATVALUE) {
    this.tonesperbatvalue = tONESPERBATVALUE;
  }

  public BridgeTaps getBRIDGETAPS() {
    return bridgetaps;
  }

  public void setBRIDGETAPS(BridgeTaps bRIDGETAPS) {
    this.bridgetaps = bRIDGETAPS;
  }

  public List<Integer> getACTSNRVALUES() {
    return actsnrvalues;
  }

  public void setACTSNRVALUES(List<Integer> aCTSNRVALUES) {
    this.actsnrvalues = aCTSNRVALUES;
  }

  public DSLStats getDslStats() {
    return dslStats;
  }

  public void setDslStats(DSLStats dslStats) {
    this.dslStats = dslStats;
  }

  public Date getDate() {
    return date;
  }


  public void setDate(Date date) {
    this.date = date;
  }
  
  //  public String getCVSHeader() {
  //    StringBuilder sb = new StringBuilder();
  //    sb.append("TONES_PER_SNR_VALUE")
  //    .append(";")
  //    .append("MAX_SNR_FREQ")
  //    .append(";")
  //    .append("MAX_BAT_FREQ")
  //    .append(";")
  //    .append("BIT_BANDCONFIG_FISRT")
  //    .append(";")
  //    .append("BIT_BANDCONFIG_LAST")
  //    .append(";");
  //    for (int i = 0; i<actbitvalues.size(); i++) {
  //      sb.append("MIN_BIT_VALUES")
  //      .append("[")
  //      .append(i)
  //      .append("];");
  //    }
  //
  //    sb.append("MIN_BIT_VALUES")
  //    .append(";")
  //    .append("MAX_SNR_TONE")
  //    .append(";");
  //    for (int i = 0; i<actbitvalues.size(); i++) {
  //      sb.append("ACT_BIT_VALUES")
  //      .append("[")
  //      .append(i)
  //      .append("];");
  //    }
  //    for (int i = 0; i<maxsnrvalues.size(); i++) {
  //      sb.append("MAX_SNR_VALUES")
  //      .append("[")
  //      .append(i)
  //      .append("];");
  //    }
  //    sb.append("MAX_BAT_TONE")
  //    .append(";");
  //    for (int i = 0; i<pilotvalues.size(); i++) {
  //      sb.append("PILOT_VALUES")
  //      .append("[")
  //      .append(i)
  //      .append("];");
  //    }
  //    for (int i = 0; i<maxbitvalues.size(); i++) {
  //      sb.append("MAX_BIT_VALUES")
  //      .append("[")
  //      .append(i)
  //      .append("];");
  //    }
  //
  //
  //
  //    .append("TONES_PER_SNR_VALUE")
  //    .append("TONES_PER_SNR_VALUE")
  //    .append("TONES_PER_SNR_VALUE")
  //    .append("TONES_PER_SNR_VALUE")
  //    .append("TONES_PER_SNR_VALUE")
  //    .append("TONES_PER_SNR_VALUE")
  //    .append("TONES_PER_SNR_VALUE")
  //    .append("TONES_PER_SNR_VALUE")
  //    .append("TONES_PER_SNR_VALUE")
  //    .append("TONES_PER_SNR_VALUE")
  //    .append("TONES_PER_SNR_VALUE")
  //    .append("TONES_PER_SNR_VALUE")
  //    .append("TONES_PER_SNR_VALUE")
  //    .append("TONES_PER_SNR_VALUE");
  //
  //
  //  }
  //
  //  public String toCVS() {
  //    StringBuilder sb = new StringBuilder();
  //    sb.append(false);
  //    return sb.toString();
  //  }

}
