/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ft.api.gm.td;

public class PositionDataArray {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected PositionDataArray(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PositionDataArray obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gmtradeJNI.delete_PositionDataArray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int status() {
    return gmtradeJNI.PositionDataArray_status(swigCPtr, this);
  }

  public Position data() {
    long cPtr = gmtradeJNI.PositionDataArray_data(swigCPtr, this);
    return (cPtr == 0) ? null : new Position(cPtr, false);
  }

  public int count() {
    return gmtradeJNI.PositionDataArray_count(swigCPtr, this);
  }

  public Position at(int i) {
    return new Position(gmtradeJNI.PositionDataArray_at(swigCPtr, this, i), false);
  }

  public void release() {
    gmtradeJNI.PositionDataArray_release(swigCPtr, this);
  }

}