
package org.extensions.dsl.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats {
  
  @SerializedName("TOTAL_BTS")
  @Expose
  private int totalbts;
  @SerializedName("AGGR_LOSS_DS")
  @Expose
  private int aggrlossds;
  @SerializedName("AGGR_LOSS_US")
  @Expose
  private int aggrlossus;
  
  public int getTOTALBTS() {
    return totalbts;
  }
  
  public void setTOTALBTS(int tOTALBTS) {
    this.totalbts = tOTALBTS;
  }
  
  public int getAGGRLOSSDS() {
    return aggrlossds;
  }
  
  public void setAGGRLOSSDS(int aGGRLOSSDS) {
    this.aggrlossds = aGGRLOSSDS;
  }
  
  public int getAGGRLOSSUS() {
    return aggrlossus;
  }
  
  public void setAGGRLOSSUS(int aGGRLOSSUS) {
    this.aggrlossus = aGGRLOSSUS;
  }
  
}
