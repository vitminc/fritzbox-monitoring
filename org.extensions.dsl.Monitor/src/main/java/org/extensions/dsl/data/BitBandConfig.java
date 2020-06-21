
package org.extensions.dsl.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BitBandConfig {
  
  @SerializedName("FIRST")
  @Expose
  private int first;
  @SerializedName("LAST")
  @Expose
  private int last;
  
  public int getFIRST() {
    return first;
  }
  
  public void setFIRST(int fIRST) {
    this.first = fIRST;
  }
  
  public int getLAST() {
    return last;
  }
  
  public void setLAST(int lAST) {
    this.last = lAST;
  }
  
}
