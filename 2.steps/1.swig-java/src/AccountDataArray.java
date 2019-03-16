/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ft.api.gm;

public class AccountDataArray {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected AccountDataArray(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AccountDataArray obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gmsdkJNI.delete_AccountDataArray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int status() {
    return gmsdkJNI.AccountDataArray_status(swigCPtr, this);
  }

  public Account data() {
    long cPtr = gmsdkJNI.AccountDataArray_data(swigCPtr, this);
    return (cPtr == 0) ? null : new Account(cPtr, false);
  }

  public int count() {
    return gmsdkJNI.AccountDataArray_count(swigCPtr, this);
  }

  public Account at(int i) {
    return new Account(gmsdkJNI.AccountDataArray_at(swigCPtr, this, i), false);
  }

  public void release() {
    gmsdkJNI.AccountDataArray_release(swigCPtr, this);
  }

}