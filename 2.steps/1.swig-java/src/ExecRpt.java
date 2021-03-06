/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ft.api.gm;

public class ExecRpt {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ExecRpt(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ExecRpt obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gmsdkJNI.delete_ExecRpt(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setStrategy_id(String value) {
    gmsdkJNI.ExecRpt_strategy_id_set(swigCPtr, this, value);
  }

  public String getStrategy_id() {
    return gmsdkJNI.ExecRpt_strategy_id_get(swigCPtr, this);
  }

  public void setAccount_id(String value) {
    gmsdkJNI.ExecRpt_account_id_set(swigCPtr, this, value);
  }

  public String getAccount_id() {
    return gmsdkJNI.ExecRpt_account_id_get(swigCPtr, this);
  }

  public void setAccount_name(String value) {
    gmsdkJNI.ExecRpt_account_name_set(swigCPtr, this, value);
  }

  public String getAccount_name() {
    return gmsdkJNI.ExecRpt_account_name_get(swigCPtr, this);
  }

  public void setCl_ord_id(String value) {
    gmsdkJNI.ExecRpt_cl_ord_id_set(swigCPtr, this, value);
  }

  public String getCl_ord_id() {
    return gmsdkJNI.ExecRpt_cl_ord_id_get(swigCPtr, this);
  }

  public void setOrder_id(String value) {
    gmsdkJNI.ExecRpt_order_id_set(swigCPtr, this, value);
  }

  public String getOrder_id() {
    return gmsdkJNI.ExecRpt_order_id_get(swigCPtr, this);
  }

  public void setExec_id(String value) {
    gmsdkJNI.ExecRpt_exec_id_set(swigCPtr, this, value);
  }

  public String getExec_id() {
    return gmsdkJNI.ExecRpt_exec_id_get(swigCPtr, this);
  }

  public void setSymbol(String value) {
    gmsdkJNI.ExecRpt_symbol_set(swigCPtr, this, value);
  }

  public String getSymbol() {
    return gmsdkJNI.ExecRpt_symbol_get(swigCPtr, this);
  }

  public void setPosition_effect(int value) {
    gmsdkJNI.ExecRpt_position_effect_set(swigCPtr, this, value);
  }

  public int getPosition_effect() {
    return gmsdkJNI.ExecRpt_position_effect_get(swigCPtr, this);
  }

  public void setSide(int value) {
    gmsdkJNI.ExecRpt_side_set(swigCPtr, this, value);
  }

  public int getSide() {
    return gmsdkJNI.ExecRpt_side_get(swigCPtr, this);
  }

  public void setOrd_rej_reason(int value) {
    gmsdkJNI.ExecRpt_ord_rej_reason_set(swigCPtr, this, value);
  }

  public int getOrd_rej_reason() {
    return gmsdkJNI.ExecRpt_ord_rej_reason_get(swigCPtr, this);
  }

  public void setOrd_rej_reason_detail(String value) {
    gmsdkJNI.ExecRpt_ord_rej_reason_detail_set(swigCPtr, this, value);
  }

  public String getOrd_rej_reason_detail() {
    return gmsdkJNI.ExecRpt_ord_rej_reason_detail_get(swigCPtr, this);
  }

  public void setExec_type(int value) {
    gmsdkJNI.ExecRpt_exec_type_set(swigCPtr, this, value);
  }

  public int getExec_type() {
    return gmsdkJNI.ExecRpt_exec_type_get(swigCPtr, this);
  }

  public void setPrice(double value) {
    gmsdkJNI.ExecRpt_price_set(swigCPtr, this, value);
  }

  public double getPrice() {
    return gmsdkJNI.ExecRpt_price_get(swigCPtr, this);
  }

  public void setVolume(long value) {
    gmsdkJNI.ExecRpt_volume_set(swigCPtr, this, value);
  }

  public long getVolume() {
    return gmsdkJNI.ExecRpt_volume_get(swigCPtr, this);
  }

  public void setAmount(double value) {
    gmsdkJNI.ExecRpt_amount_set(swigCPtr, this, value);
  }

  public double getAmount() {
    return gmsdkJNI.ExecRpt_amount_get(swigCPtr, this);
  }

  public void setCommission(double value) {
    gmsdkJNI.ExecRpt_commission_set(swigCPtr, this, value);
  }

  public double getCommission() {
    return gmsdkJNI.ExecRpt_commission_get(swigCPtr, this);
  }

  public void setCost(double value) {
    gmsdkJNI.ExecRpt_cost_set(swigCPtr, this, value);
  }

  public double getCost() {
    return gmsdkJNI.ExecRpt_cost_get(swigCPtr, this);
  }

  public void setCreated_at(long value) {
    gmsdkJNI.ExecRpt_created_at_set(swigCPtr, this, value);
  }

  public long getCreated_at() {
    return gmsdkJNI.ExecRpt_created_at_get(swigCPtr, this);
  }

  public ExecRpt() {
    this(gmsdkJNI.new_ExecRpt(), true);
  }

}
