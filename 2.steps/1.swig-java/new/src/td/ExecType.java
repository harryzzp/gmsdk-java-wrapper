/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ft.api.gm.td;

public final class ExecType {
  public final static ExecType ExecType_Unknown = new ExecType("ExecType_Unknown", gmtradeJNI.ExecType_Unknown_get());
  public final static ExecType ExecType_New = new ExecType("ExecType_New", gmtradeJNI.ExecType_New_get());
  public final static ExecType ExecType_DoneForDay = new ExecType("ExecType_DoneForDay", gmtradeJNI.ExecType_DoneForDay_get());
  public final static ExecType ExecType_Canceled = new ExecType("ExecType_Canceled", gmtradeJNI.ExecType_Canceled_get());
  public final static ExecType ExecType_PendingCancel = new ExecType("ExecType_PendingCancel", gmtradeJNI.ExecType_PendingCancel_get());
  public final static ExecType ExecType_Stopped = new ExecType("ExecType_Stopped", gmtradeJNI.ExecType_Stopped_get());
  public final static ExecType ExecType_Rejected = new ExecType("ExecType_Rejected", gmtradeJNI.ExecType_Rejected_get());
  public final static ExecType ExecType_Suspended = new ExecType("ExecType_Suspended", gmtradeJNI.ExecType_Suspended_get());
  public final static ExecType ExecType_PendingNew = new ExecType("ExecType_PendingNew", gmtradeJNI.ExecType_PendingNew_get());
  public final static ExecType ExecType_Calculated = new ExecType("ExecType_Calculated", gmtradeJNI.ExecType_Calculated_get());
  public final static ExecType ExecType_Expired = new ExecType("ExecType_Expired", gmtradeJNI.ExecType_Expired_get());
  public final static ExecType ExecType_Restated = new ExecType("ExecType_Restated", gmtradeJNI.ExecType_Restated_get());
  public final static ExecType ExecType_PendingReplace = new ExecType("ExecType_PendingReplace", gmtradeJNI.ExecType_PendingReplace_get());
  public final static ExecType ExecType_Trade = new ExecType("ExecType_Trade", gmtradeJNI.ExecType_Trade_get());
  public final static ExecType ExecType_TradeCorrect = new ExecType("ExecType_TradeCorrect", gmtradeJNI.ExecType_TradeCorrect_get());
  public final static ExecType ExecType_TradeCancel = new ExecType("ExecType_TradeCancel", gmtradeJNI.ExecType_TradeCancel_get());
  public final static ExecType ExecType_OrderStatus = new ExecType("ExecType_OrderStatus", gmtradeJNI.ExecType_OrderStatus_get());
  public final static ExecType ExecType_CancelRejected = new ExecType("ExecType_CancelRejected", gmtradeJNI.ExecType_CancelRejected_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ExecType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ExecType.class + " with value " + swigValue);
  }

  private ExecType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ExecType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ExecType(String swigName, ExecType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ExecType[] swigValues = { ExecType_Unknown, ExecType_New, ExecType_DoneForDay, ExecType_Canceled, ExecType_PendingCancel, ExecType_Stopped, ExecType_Rejected, ExecType_Suspended, ExecType_PendingNew, ExecType_Calculated, ExecType_Expired, ExecType_Restated, ExecType_PendingReplace, ExecType_Trade, ExecType_TradeCorrect, ExecType_TradeCancel, ExecType_OrderStatus, ExecType_CancelRejected };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
