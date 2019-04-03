/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ft.api.gm.td;

public final class OrderStatus {
  public final static OrderStatus OrderStatus_Unknown = new OrderStatus("OrderStatus_Unknown", gmtradeJNI.OrderStatus_Unknown_get());
  public final static OrderStatus OrderStatus_New = new OrderStatus("OrderStatus_New", gmtradeJNI.OrderStatus_New_get());
  public final static OrderStatus OrderStatus_PartiallyFilled = new OrderStatus("OrderStatus_PartiallyFilled", gmtradeJNI.OrderStatus_PartiallyFilled_get());
  public final static OrderStatus OrderStatus_Filled = new OrderStatus("OrderStatus_Filled", gmtradeJNI.OrderStatus_Filled_get());
  public final static OrderStatus OrderStatus_DoneForDay = new OrderStatus("OrderStatus_DoneForDay", gmtradeJNI.OrderStatus_DoneForDay_get());
  public final static OrderStatus OrderStatus_Canceled = new OrderStatus("OrderStatus_Canceled", gmtradeJNI.OrderStatus_Canceled_get());
  public final static OrderStatus OrderStatus_PendingCancel = new OrderStatus("OrderStatus_PendingCancel", gmtradeJNI.OrderStatus_PendingCancel_get());
  public final static OrderStatus OrderStatus_Stopped = new OrderStatus("OrderStatus_Stopped", gmtradeJNI.OrderStatus_Stopped_get());
  public final static OrderStatus OrderStatus_Rejected = new OrderStatus("OrderStatus_Rejected", gmtradeJNI.OrderStatus_Rejected_get());
  public final static OrderStatus OrderStatus_Suspended = new OrderStatus("OrderStatus_Suspended", gmtradeJNI.OrderStatus_Suspended_get());
  public final static OrderStatus OrderStatus_PendingNew = new OrderStatus("OrderStatus_PendingNew", gmtradeJNI.OrderStatus_PendingNew_get());
  public final static OrderStatus OrderStatus_Calculated = new OrderStatus("OrderStatus_Calculated", gmtradeJNI.OrderStatus_Calculated_get());
  public final static OrderStatus OrderStatus_Expired = new OrderStatus("OrderStatus_Expired", gmtradeJNI.OrderStatus_Expired_get());
  public final static OrderStatus OrderStatus_AcceptedForBidding = new OrderStatus("OrderStatus_AcceptedForBidding", gmtradeJNI.OrderStatus_AcceptedForBidding_get());
  public final static OrderStatus OrderStatus_PendingReplace = new OrderStatus("OrderStatus_PendingReplace", gmtradeJNI.OrderStatus_PendingReplace_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static OrderStatus swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + OrderStatus.class + " with value " + swigValue);
  }

  private OrderStatus(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private OrderStatus(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private OrderStatus(String swigName, OrderStatus swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static OrderStatus[] swigValues = { OrderStatus_Unknown, OrderStatus_New, OrderStatus_PartiallyFilled, OrderStatus_Filled, OrderStatus_DoneForDay, OrderStatus_Canceled, OrderStatus_PendingCancel, OrderStatus_Stopped, OrderStatus_Rejected, OrderStatus_Suspended, OrderStatus_PendingNew, OrderStatus_Calculated, OrderStatus_Expired, OrderStatus_AcceptedForBidding, OrderStatus_PendingReplace };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

