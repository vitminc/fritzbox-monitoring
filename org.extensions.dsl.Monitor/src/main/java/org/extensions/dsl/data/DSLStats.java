package org.extensions.dsl.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DSLStats {
  @SerializedName("DSLAM_SEND_DATARATE_MAX")
  @Expose
  int dslamSendDataRateMax;
  
  @SerializedName("DSLAM_RECV_DATARATE_MAX")
  @Expose
  int dslamRectDataRateMax;

  @SerializedName("LINE_SEND_CAPICITY")
  @Expose
  int lineSendCapicity;

  
  @SerializedName("LINE_RECV_CAPICITY")
  @Expose
  int lineRecvCapicity;
  
  @SerializedName("ACTUAL_SEND_RATE")
  @Expose
  int actualSendRate;
  
  @SerializedName("ACTUAL_RECV_RATE")
  @Expose
  int actualRecvRate;
  
  @SerializedName("INP_SEND")
  @Expose
  int inpSend;
  
  @SerializedName("INP_RECV")
  @Expose
  int inpRecv;
  

  public int getInpSend() {
    return inpSend;
  }
  
  public void setInpSend(int inpSend) {
    this.inpSend = inpSend;
  }
  
  public int getInpRecv() {
    return inpRecv;
  }

  public void setInpRecv(int inpRecv) {
    this.inpRecv = inpRecv;
  }

  @SerializedName("LINE_SEND_LOSS")
  @Expose
  int lineSendLoss;

  @SerializedName("LINE_RECV_LOSS")
  @Expose
  int lineRectLoss;

  @SerializedName("NOISE_SEND_DELTA")
  @Expose
  int noiseSendDelta;

  @SerializedName("NOISE_RECV_DELTA")
  @Expose
  int noiseRectDelta;

  @SerializedName("BITSWAP_SEND")
  @Expose
  int bitswapSend;

  @SerializedName("BITSWAP_RECV")
  @Expose
  int bitswapRecv;

  @SerializedName("PROFILE")
  @Expose
  String profile;

  @SerializedName("GVECTOR_SEND")
  @Expose
  String gVectorSend;
  
  @SerializedName("GVECTOR_RECV")
  @Expose
  String gVectorRecv;
  

  @SerializedName("TYPE_SEND")
  @Expose
  String typeSend;

  @SerializedName("TYPE_RECV")
  @Expose
  String typeRecv;

  
  @SerializedName("ES_ERRORS_ROUTER")
  @Expose
  int esErrorsRouter;

  @SerializedName("ES_ERRORS_SWITCH")
  @Expose
  int esErrorsSwitch;

  @SerializedName("SES_ERRORS_ROUTER")
  @Expose
  int sesErrorsRouter;

  @SerializedName("SES_ERRORS_SWITCH")
  @Expose
  int sesErrorsSwitch;

  public int getDslamSendDataRateMax() {
    return dslamSendDataRateMax;
  }

  public void setMaxSendDataRate(int dslamSendDataRateMax) {
    this.dslamSendDataRateMax = dslamSendDataRateMax;
  }

  public int getDslamRectDataRateMax() {
    return dslamRectDataRateMax;
  }

  public void setMaxRecvDataRate(int dslamRectDataRateMax) {
    this.dslamRectDataRateMax = dslamRectDataRateMax;
  }

  public int getLineSendCapicity() {
    return lineSendCapicity;
  }

  public void setLineSendCapicity(int lineSendCapicity) {
    this.lineSendCapicity = lineSendCapicity;
  }

  public int getLineRecvCapicity() {
    return lineRecvCapicity;
  }

  public void setLineRecvCapicity(int lineRecvCapicity) {
    this.lineRecvCapicity = lineRecvCapicity;
  }

  public int getActualSendRate() {
    return actualSendRate;
  }

  public void setActualSendRate(int actualSendRate) {
    this.actualSendRate = actualSendRate;
  }

  public int getActualRecvRate() {
    return actualRecvRate;
  }

  public void setActualRecvRate(int actualRecvRate) {
    this.actualRecvRate = actualRecvRate;
  }

  public int getLineSendLoss() {
    return lineSendLoss;
  }

  public void setLineSendLoss(int lineSendLoss) {
    this.lineSendLoss = lineSendLoss;
  }

  public int getLineRectLoss() {
    return lineRectLoss;
  }

  public void setLineRectLoss(int lineRectLoss) {
    this.lineRectLoss = lineRectLoss;
  }

  public int getNoiseSendDelta() {
    return noiseSendDelta;
  }

  public void setNoiseSendDelta(int noiseSendDelta) {
    this.noiseSendDelta = noiseSendDelta;
  }

  public int getNoiseRectDelta() {
    return noiseRectDelta;
  }

  public void setNoiseRectDelta(int noiseRectDelta) {
    this.noiseRectDelta = noiseRectDelta;
  }

  public int getBitswapSend() {
    return bitswapSend;
  }

  public void setBitswapSend(int bitswapSend) {
    this.bitswapSend = bitswapSend;
  }

  public int getBitswapRecv() {
    return bitswapRecv;
  }

  public void setBitswapRecv(int bitswapRecv) {
    this.bitswapRecv = bitswapRecv;
  }

  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public String getgVectorSend() {
    return gVectorSend;
  }
  
  public void setgVectorSend(String gVectorSend) {
    this.gVectorSend = gVectorSend;
  }
  
  public String getgVectorRecv() {
    return gVectorRecv;
  }
  
  public void setgVectorRecv(String gVectorRecv) {
    this.gVectorRecv = gVectorRecv;
  }
  
  public String getTypeSend() {
    return typeSend;
  }

  public void setTypeSend(String typeSend) {
    this.typeSend = typeSend;
  }

  public String getTypeRecv() {
    return typeRecv;
  }

  public void setTypeRecv(String typeRecv) {
    this.typeRecv = typeRecv;
  }
  
  public int getEsErrorsRouter() {
    return esErrorsRouter;
  }
  
  public void setEsErrorsRouter(int esErrorsRouter) {
    this.esErrorsRouter = esErrorsRouter;
  }
  
  public int getEsErrorsSwitch() {
    return esErrorsSwitch;
  }
  
  public void setEsErrorsSwitch(int esErrorsSwitch) {
    this.esErrorsSwitch = esErrorsSwitch;
  }
  
  public int getSesErrorsRouter() {
    return sesErrorsRouter;
  }
  
  public void setSesErrorsRouter(int sesErrorsRouter) {
    this.sesErrorsRouter = sesErrorsRouter;
  }
  
  public int getSesErrorsSwitch() {
    return sesErrorsSwitch;
  }
  
  public void setSesErrorsSwitch(int sesErrorsSwitch) {
    this.sesErrorsSwitch = sesErrorsSwitch;
  }
  
  
}
