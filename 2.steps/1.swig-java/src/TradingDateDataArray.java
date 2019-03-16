/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ft.api.gm;

public class TradingDateDataArray {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TradingDateDataArray(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TradingDateDataArray obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gmsdkJNI.delete_TradingDateDataArray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int status() {
    return gmsdkJNI.TradingDateDataArray_status(swigCPtr, this);
  }

  public SWIGTYPE_p_a_LEN_ISO_DATATIME__char data() {
    long cPtr = gmsdkJNI.TradingDateDataArray_data(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_LEN_ISO_DATATIME__char(cPtr, false);
  }

  public int count() {
    return gmsdkJNI.TradingDateDataArray_count(swigCPtr, this);
  }

  public SWIGTYPE_p_a_LEN_ISO_DATATIME__char at(int i) {
    return new SWIGTYPE_p_a_LEN_ISO_DATATIME__char(gmsdkJNI.TradingDateDataArray_at(swigCPtr, this, i), false);
  }

  public void release() {
    gmsdkJNI.TradingDateDataArray_release(swigCPtr, this);
  }

}