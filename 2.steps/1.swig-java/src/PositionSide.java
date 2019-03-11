/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ft.api.gm;

public final class PositionSide {
  public final static PositionSide PositionSide_Unknown = new PositionSide("PositionSide_Unknown", gmsdkJNI.PositionSide_Unknown_get());
  public final static PositionSide PositionSide_Long = new PositionSide("PositionSide_Long", gmsdkJNI.PositionSide_Long_get());
  public final static PositionSide PositionSide_Short = new PositionSide("PositionSide_Short", gmsdkJNI.PositionSide_Short_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static PositionSide swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + PositionSide.class + " with value " + swigValue);
  }

  private PositionSide(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private PositionSide(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private PositionSide(String swigName, PositionSide swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static PositionSide[] swigValues = { PositionSide_Unknown, PositionSide_Long, PositionSide_Short };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

