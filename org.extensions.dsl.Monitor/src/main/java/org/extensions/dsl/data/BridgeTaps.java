
package org.extensions.dsl.data;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BridgeTaps {
  
  @SerializedName("STATS")
  @Expose
  private Stats stats;
  @SerializedName("DETAIL")
  @Expose
  private List<Object> detail = null;
  
  public Stats getSTATS() {
    return stats;
  }
  
  public void setSTATS(Stats sTATS) {
    this.stats = sTATS;
  }
  
  public List<Object> getDETAIL() {
    return detail;
  }
  
  public void setDETAIL(List<Object> dETAIL) {
    this.detail = dETAIL;
  }
  
}
