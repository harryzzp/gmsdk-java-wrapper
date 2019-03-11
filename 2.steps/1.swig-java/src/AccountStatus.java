/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ft.api.gm;

public class AccountStatus {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected AccountStatus(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AccountStatus obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gmsdkJNI.delete_AccountStatus(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setAccount_id(String value) {
    gmsdkJNI.AccountStatus_account_id_set(swigCPtr, this, value);
  }

  public String getAccount_id() {
    return gmsdkJNI.AccountStatus_account_id_get(swigCPtr, this);
  }

  public void setAccount_name(String value) {
    gmsdkJNI.AccountStatus_account_name_set(swigCPtr, this, value);
  }

  public String getAccount_name() {
    return gmsdkJNI.AccountStatus_account_name_get(swigCPtr, this);
  }

  public void setState(int value) {
    gmsdkJNI.AccountStatus_state_set(swigCPtr, this, value);
  }

  public int getState() {
    return gmsdkJNI.AccountStatus_state_get(swigCPtr, this);
  }

  public void setError_code(int value) {
    gmsdkJNI.AccountStatus_error_code_set(swigCPtr, this, value);
  }

  public int getError_code() {
    return gmsdkJNI.AccountStatus_error_code_get(swigCPtr, this);
  }

  public void setError_msg(String value) {
    gmsdkJNI.AccountStatus_error_msg_set(swigCPtr, this, value);
  }

  public String getError_msg() {
    return gmsdkJNI.AccountStatus_error_msg_get(swigCPtr, this);
  }

  public AccountStatus() {
    this(gmsdkJNI.new_AccountStatus(), true);
  }

}
