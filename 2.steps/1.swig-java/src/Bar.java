/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ft.api.gm;

public class Bar {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Bar(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Bar obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gmsdkJNI.delete_Bar(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSymbol(String value) {
    gmsdkJNI.Bar_symbol_set(swigCPtr, this, value);
  }

  public String getSymbol() {
    return gmsdkJNI.Bar_symbol_get(swigCPtr, this);
  }

  public void setBob(double value) {
    gmsdkJNI.Bar_bob_set(swigCPtr, this, value);
  }

  public double getBob() {
    return gmsdkJNI.Bar_bob_get(swigCPtr, this);
  }

  public void setEob(double value) {
    gmsdkJNI.Bar_eob_set(swigCPtr, this, value);
  }

  public double getEob() {
    return gmsdkJNI.Bar_eob_get(swigCPtr, this);
  }

  public void setOpen(float value) {
    gmsdkJNI.Bar_open_set(swigCPtr, this, value);
  }

  public float getOpen() {
    return gmsdkJNI.Bar_open_get(swigCPtr, this);
  }

  public void setClose(float value) {
    gmsdkJNI.Bar_close_set(swigCPtr, this, value);
  }

  public float getClose() {
    return gmsdkJNI.Bar_close_get(swigCPtr, this);
  }

  public void setHigh(float value) {
    gmsdkJNI.Bar_high_set(swigCPtr, this, value);
  }

  public float getHigh() {
    return gmsdkJNI.Bar_high_get(swigCPtr, this);
  }

  public void setLow(float value) {
    gmsdkJNI.Bar_low_set(swigCPtr, this, value);
  }

  public float getLow() {
    return gmsdkJNI.Bar_low_get(swigCPtr, this);
  }

  public void setVolume(double value) {
    gmsdkJNI.Bar_volume_set(swigCPtr, this, value);
  }

  public double getVolume() {
    return gmsdkJNI.Bar_volume_get(swigCPtr, this);
  }

  public void setAmount(double value) {
    gmsdkJNI.Bar_amount_set(swigCPtr, this, value);
  }

  public double getAmount() {
    return gmsdkJNI.Bar_amount_get(swigCPtr, this);
  }

  public void setPre_close(float value) {
    gmsdkJNI.Bar_pre_close_set(swigCPtr, this, value);
  }

  public float getPre_close() {
    return gmsdkJNI.Bar_pre_close_get(swigCPtr, this);
  }

  public void setPosition(long value) {
    gmsdkJNI.Bar_position_set(swigCPtr, this, value);
  }

  public long getPosition() {
    return gmsdkJNI.Bar_position_get(swigCPtr, this);
  }

  public void setFrequency(String value) {
    gmsdkJNI.Bar_frequency_set(swigCPtr, this, value);
  }

  public String getFrequency() {
    return gmsdkJNI.Bar_frequency_get(swigCPtr, this);
  }

  public Bar() {
    this(gmsdkJNI.new_Bar(), true);
  }

}
