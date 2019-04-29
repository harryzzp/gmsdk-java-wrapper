/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ft.api.gm.td;

public class Account {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Account(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Account obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gmtradeJNI.delete_Account(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setAccount_id(String value) {
    gmtradeJNI.Account_account_id_set(swigCPtr, this, value);
  }

  public String getAccount_id() {
    return gmtradeJNI.Account_account_id_get(swigCPtr, this);
  }

  public void setAccount_name(String value) {
    gmtradeJNI.Account_account_name_set(swigCPtr, this, value);
  }

  public String getAccount_name() {
    return gmtradeJNI.Account_account_name_get(swigCPtr, this);
  }

  public void setTitle(String value) {
    gmtradeJNI.Account_title_set(swigCPtr, this, value);
  }

  public String getTitle() {
    return gmtradeJNI.Account_title_get(swigCPtr, this);
  }

  public void setIntro(String value) {
    gmtradeJNI.Account_intro_set(swigCPtr, this, value);
  }

  public String getIntro() {
    return gmtradeJNI.Account_intro_get(swigCPtr, this);
  }

  public void setComment(String value) {
    gmtradeJNI.Account_comment_set(swigCPtr, this, value);
  }

  public String getComment() {
    return gmtradeJNI.Account_comment_get(swigCPtr, this);
  }

  public Account() {
    this(gmtradeJNI.new_Account(), true);
  }

}