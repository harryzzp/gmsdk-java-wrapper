/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.skywalker.gmsdk;

public final class StrategyMode {
  public final static StrategyMode MODE_UNDEF = new StrategyMode("MODE_UNDEF", gmsdkJNI.MODE_UNDEF_get());
  public final static StrategyMode MODE_LIVE = new StrategyMode("MODE_LIVE", gmsdkJNI.MODE_LIVE_get());
  public final static StrategyMode MODE_BACKTEST = new StrategyMode("MODE_BACKTEST", gmsdkJNI.MODE_BACKTEST_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static StrategyMode swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + StrategyMode.class + " with value " + swigValue);
  }

  private StrategyMode(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private StrategyMode(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private StrategyMode(String swigName, StrategyMode swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static StrategyMode[] swigValues = { MODE_UNDEF, MODE_LIVE, MODE_BACKTEST };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
