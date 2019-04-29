/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ft.api.gm.td;

public class Trade {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Trade(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Trade obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gmtradeJNI.delete_Trade(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    gmtradeJNI.Trade_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    gmtradeJNI.Trade_change_ownership(this, swigCPtr, true);
  }

  public Trade(String token) {
    this(gmtradeJNI.new_Trade__SWIG_0(token), true);
    gmtradeJNI.Trade_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public Trade() {
    this(gmtradeJNI.new_Trade__SWIG_1(), true);
    gmtradeJNI.Trade_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public int start() {
    return gmtradeJNI.Trade_start(swigCPtr, this);
  }

  public void stop() {
    gmtradeJNI.Trade_stop(swigCPtr, this);
  }

  public void set_token(String token) {
    gmtradeJNI.Trade_set_token(swigCPtr, this, token);
  }

  public void set_endpoint(String serv_addr) {
    gmtradeJNI.Trade_set_endpoint(swigCPtr, this, serv_addr);
  }

  public int login(String account_ids) {
    return gmtradeJNI.Trade_login(swigCPtr, this, account_ids);
  }

  public Order order_volume(String symbol, int volume, int side, int order_type, int position_effect, double price, String account) {
    return new Order(gmtradeJNI.Trade_order_volume__SWIG_0(swigCPtr, this, symbol, volume, side, order_type, position_effect, price, account), true);
  }

  public Order order_volume(String symbol, int volume, int side, int order_type, int position_effect, double price) {
    return new Order(gmtradeJNI.Trade_order_volume__SWIG_1(swigCPtr, this, symbol, volume, side, order_type, position_effect, price), true);
  }

  public Order order_volume(String symbol, int volume, int side, int order_type, int position_effect) {
    return new Order(gmtradeJNI.Trade_order_volume__SWIG_2(swigCPtr, this, symbol, volume, side, order_type, position_effect), true);
  }

  public Order order_value(String symbol, double value, int side, int order_type, int position_effect, double price, String account) {
    return new Order(gmtradeJNI.Trade_order_value__SWIG_0(swigCPtr, this, symbol, value, side, order_type, position_effect, price, account), true);
  }

  public Order order_value(String symbol, double value, int side, int order_type, int position_effect, double price) {
    return new Order(gmtradeJNI.Trade_order_value__SWIG_1(swigCPtr, this, symbol, value, side, order_type, position_effect, price), true);
  }

  public Order order_value(String symbol, double value, int side, int order_type, int position_effect) {
    return new Order(gmtradeJNI.Trade_order_value__SWIG_2(swigCPtr, this, symbol, value, side, order_type, position_effect), true);
  }

  public Order order_percent(String symbol, double percent, int side, int order_type, int position_effect, double price, String account) {
    return new Order(gmtradeJNI.Trade_order_percent__SWIG_0(swigCPtr, this, symbol, percent, side, order_type, position_effect, price, account), true);
  }

  public Order order_percent(String symbol, double percent, int side, int order_type, int position_effect, double price) {
    return new Order(gmtradeJNI.Trade_order_percent__SWIG_1(swigCPtr, this, symbol, percent, side, order_type, position_effect, price), true);
  }

  public Order order_percent(String symbol, double percent, int side, int order_type, int position_effect) {
    return new Order(gmtradeJNI.Trade_order_percent__SWIG_2(swigCPtr, this, symbol, percent, side, order_type, position_effect), true);
  }

  public Order order_target_volume(String symbol, int volume, int position_side, int order_type, double price, String account) {
    return new Order(gmtradeJNI.Trade_order_target_volume__SWIG_0(swigCPtr, this, symbol, volume, position_side, order_type, price, account), true);
  }

  public Order order_target_volume(String symbol, int volume, int position_side, int order_type, double price) {
    return new Order(gmtradeJNI.Trade_order_target_volume__SWIG_1(swigCPtr, this, symbol, volume, position_side, order_type, price), true);
  }

  public Order order_target_volume(String symbol, int volume, int position_side, int order_type) {
    return new Order(gmtradeJNI.Trade_order_target_volume__SWIG_2(swigCPtr, this, symbol, volume, position_side, order_type), true);
  }

  public Order order_target_value(String symbol, double value, int position_side, int order_type, double price, String account) {
    return new Order(gmtradeJNI.Trade_order_target_value__SWIG_0(swigCPtr, this, symbol, value, position_side, order_type, price, account), true);
  }

  public Order order_target_value(String symbol, double value, int position_side, int order_type, double price) {
    return new Order(gmtradeJNI.Trade_order_target_value__SWIG_1(swigCPtr, this, symbol, value, position_side, order_type, price), true);
  }

  public Order order_target_value(String symbol, double value, int position_side, int order_type) {
    return new Order(gmtradeJNI.Trade_order_target_value__SWIG_2(swigCPtr, this, symbol, value, position_side, order_type), true);
  }

  public Order order_target_percent(String symbol, double percent, int position_side, int order_type, double price, String account) {
    return new Order(gmtradeJNI.Trade_order_target_percent__SWIG_0(swigCPtr, this, symbol, percent, position_side, order_type, price, account), true);
  }

  public Order order_target_percent(String symbol, double percent, int position_side, int order_type, double price) {
    return new Order(gmtradeJNI.Trade_order_target_percent__SWIG_1(swigCPtr, this, symbol, percent, position_side, order_type, price), true);
  }

  public Order order_target_percent(String symbol, double percent, int position_side, int order_type) {
    return new Order(gmtradeJNI.Trade_order_target_percent__SWIG_2(swigCPtr, this, symbol, percent, position_side, order_type), true);
  }

  public OrderDataArray order_close_all() {
    long cPtr = gmtradeJNI.Trade_order_close_all(swigCPtr, this);
    return (cPtr == 0) ? null : new OrderDataArray(cPtr, false);
  }

  public int order_cancel(String cl_ord_id, String account) {
    return gmtradeJNI.Trade_order_cancel__SWIG_0(swigCPtr, this, cl_ord_id, account);
  }

  public int order_cancel(String cl_ord_id) {
    return gmtradeJNI.Trade_order_cancel__SWIG_1(swigCPtr, this, cl_ord_id);
  }

  public int order_cancel_all() {
    return gmtradeJNI.Trade_order_cancel_all(swigCPtr, this);
  }

  public Order place_order(String symbol, int volume, int side, int order_type, int position_effect, double price, int order_duration, int order_qualifier, double stop_price, String account) {
    return new Order(gmtradeJNI.Trade_place_order__SWIG_0(swigCPtr, this, symbol, volume, side, order_type, position_effect, price, order_duration, order_qualifier, stop_price, account), true);
  }

  public Order place_order(String symbol, int volume, int side, int order_type, int position_effect, double price, int order_duration, int order_qualifier, double stop_price) {
    return new Order(gmtradeJNI.Trade_place_order__SWIG_1(swigCPtr, this, symbol, volume, side, order_type, position_effect, price, order_duration, order_qualifier, stop_price), true);
  }

  public Order place_order(String symbol, int volume, int side, int order_type, int position_effect, double price, int order_duration, int order_qualifier) {
    return new Order(gmtradeJNI.Trade_place_order__SWIG_2(swigCPtr, this, symbol, volume, side, order_type, position_effect, price, order_duration, order_qualifier), true);
  }

  public Order place_order(String symbol, int volume, int side, int order_type, int position_effect, double price, int order_duration) {
    return new Order(gmtradeJNI.Trade_place_order__SWIG_3(swigCPtr, this, symbol, volume, side, order_type, position_effect, price, order_duration), true);
  }

  public Order place_order(String symbol, int volume, int side, int order_type, int position_effect, double price) {
    return new Order(gmtradeJNI.Trade_place_order__SWIG_4(swigCPtr, this, symbol, volume, side, order_type, position_effect, price), true);
  }

  public Order place_order(String symbol, int volume, int side, int order_type, int position_effect) {
    return new Order(gmtradeJNI.Trade_place_order__SWIG_5(swigCPtr, this, symbol, volume, side, order_type, position_effect), true);
  }

  public int get_cash(Cash cash, String accounts) {
    return gmtradeJNI.Trade_get_cash__SWIG_0(swigCPtr, this, Cash.getCPtr(cash), cash, accounts);
  }

  public int get_cash(Cash cash) {
    return gmtradeJNI.Trade_get_cash__SWIG_1(swigCPtr, this, Cash.getCPtr(cash), cash);
  }

  public OrderDataArray get_orders(String account) {
    long cPtr = gmtradeJNI.Trade_get_orders__SWIG_0(swigCPtr, this, account);
    return (cPtr == 0) ? null : new OrderDataArray(cPtr, false);
  }

  public OrderDataArray get_orders() {
    long cPtr = gmtradeJNI.Trade_get_orders__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new OrderDataArray(cPtr, false);
  }

  public OrderDataArray get_unfinished_orders(String account) {
    long cPtr = gmtradeJNI.Trade_get_unfinished_orders__SWIG_0(swigCPtr, this, account);
    return (cPtr == 0) ? null : new OrderDataArray(cPtr, false);
  }

  public OrderDataArray get_unfinished_orders() {
    long cPtr = gmtradeJNI.Trade_get_unfinished_orders__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new OrderDataArray(cPtr, false);
  }

  public ExecRptDataArray get_execution_reports(String account) {
    long cPtr = gmtradeJNI.Trade_get_execution_reports__SWIG_0(swigCPtr, this, account);
    return (cPtr == 0) ? null : new ExecRptDataArray(cPtr, false);
  }

  public ExecRptDataArray get_execution_reports() {
    long cPtr = gmtradeJNI.Trade_get_execution_reports__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new ExecRptDataArray(cPtr, false);
  }

  public PositionDataArray get_position(String account) {
    long cPtr = gmtradeJNI.Trade_get_position__SWIG_0(swigCPtr, this, account);
    return (cPtr == 0) ? null : new PositionDataArray(cPtr, false);
  }

  public PositionDataArray get_position() {
    long cPtr = gmtradeJNI.Trade_get_position__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new PositionDataArray(cPtr, false);
  }

  public void on_order_status(Order order) {
    if (getClass() == Trade.class) gmtradeJNI.Trade_on_order_status(swigCPtr, this, Order.getCPtr(order), order); else gmtradeJNI.Trade_on_order_statusSwigExplicitTrade(swigCPtr, this, Order.getCPtr(order), order);
  }

  public void on_execution_report(ExecRpt rpt) {
    if (getClass() == Trade.class) gmtradeJNI.Trade_on_execution_report(swigCPtr, this, ExecRpt.getCPtr(rpt), rpt); else gmtradeJNI.Trade_on_execution_reportSwigExplicitTrade(swigCPtr, this, ExecRpt.getCPtr(rpt), rpt);
  }

  public void on_account_status(AccountStatus account_status) {
    if (getClass() == Trade.class) gmtradeJNI.Trade_on_account_status(swigCPtr, this, AccountStatus.getCPtr(account_status), account_status); else gmtradeJNI.Trade_on_account_statusSwigExplicitTrade(swigCPtr, this, AccountStatus.getCPtr(account_status), account_status);
  }

  public void on_error(int error_code, String error_msg) {
    if (getClass() == Trade.class) gmtradeJNI.Trade_on_error(swigCPtr, this, error_code, error_msg); else gmtradeJNI.Trade_on_errorSwigExplicitTrade(swigCPtr, this, error_code, error_msg);
  }

  public void on_trade_data_connected() {
    if (getClass() == Trade.class) gmtradeJNI.Trade_on_trade_data_connected(swigCPtr, this); else gmtradeJNI.Trade_on_trade_data_connectedSwigExplicitTrade(swigCPtr, this);
  }

  public void on_trade_data_disconnected() {
    if (getClass() == Trade.class) gmtradeJNI.Trade_on_trade_data_disconnected(swigCPtr, this); else gmtradeJNI.Trade_on_trade_data_disconnectedSwigExplicitTrade(swigCPtr, this);
  }

}