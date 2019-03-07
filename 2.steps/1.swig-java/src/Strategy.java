/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.skywalker.gmsdk;

public class Strategy {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Strategy(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Strategy obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gmsdkJNI.delete_Strategy(swigCPtr);
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
    gmsdkJNI.Strategy_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    gmsdkJNI.Strategy_change_ownership(this, swigCPtr, true);
  }

  public Strategy(String token, String strategy_id, int mode) {
    this(gmsdkJNI.new_Strategy__SWIG_0(token, strategy_id, mode), true);
    gmsdkJNI.Strategy_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public Strategy() {
    this(gmsdkJNI.new_Strategy__SWIG_1(), true);
    gmsdkJNI.Strategy_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public int run() {
    return gmsdkJNI.Strategy_run(swigCPtr, this);
  }

  public void stop() {
    gmsdkJNI.Strategy_stop(swigCPtr, this);
  }

  public void set_strategy_id(String strategy_id) {
    gmsdkJNI.Strategy_set_strategy_id(swigCPtr, this, strategy_id);
  }

  public void set_token(String token) {
    gmsdkJNI.Strategy_set_token(swigCPtr, this, token);
  }

  public void set_mode(int mode) {
    gmsdkJNI.Strategy_set_mode(swigCPtr, this, mode);
  }

  public int schedule(String data_rule, String time_rule) {
    return gmsdkJNI.Strategy_schedule(swigCPtr, this, data_rule, time_rule);
  }

  public long now() {
    return gmsdkJNI.Strategy_now(swigCPtr, this);
  }

  public int set_backtest_config(String start_time, String end_time, double initial_cash, double transaction_ratio, double commission_ratio, double slippage_ratio, int adjust, int check_cache) {
    return gmsdkJNI.Strategy_set_backtest_config__SWIG_0(swigCPtr, this, start_time, end_time, initial_cash, transaction_ratio, commission_ratio, slippage_ratio, adjust, check_cache);
  }

  public int set_backtest_config(String start_time, String end_time, double initial_cash, double transaction_ratio, double commission_ratio, double slippage_ratio, int adjust) {
    return gmsdkJNI.Strategy_set_backtest_config__SWIG_1(swigCPtr, this, start_time, end_time, initial_cash, transaction_ratio, commission_ratio, slippage_ratio, adjust);
  }

  public int set_backtest_config(String start_time, String end_time, double initial_cash, double transaction_ratio, double commission_ratio, double slippage_ratio) {
    return gmsdkJNI.Strategy_set_backtest_config__SWIG_2(swigCPtr, this, start_time, end_time, initial_cash, transaction_ratio, commission_ratio, slippage_ratio);
  }

  public int set_backtest_config(String start_time, String end_time, double initial_cash, double transaction_ratio, double commission_ratio) {
    return gmsdkJNI.Strategy_set_backtest_config__SWIG_3(swigCPtr, this, start_time, end_time, initial_cash, transaction_ratio, commission_ratio);
  }

  public int set_backtest_config(String start_time, String end_time, double initial_cash, double transaction_ratio) {
    return gmsdkJNI.Strategy_set_backtest_config__SWIG_4(swigCPtr, this, start_time, end_time, initial_cash, transaction_ratio);
  }

  public int set_backtest_config(String start_time, String end_time, double initial_cash) {
    return gmsdkJNI.Strategy_set_backtest_config__SWIG_5(swigCPtr, this, start_time, end_time, initial_cash);
  }

  public int set_backtest_config(String start_time, String end_time) {
    return gmsdkJNI.Strategy_set_backtest_config__SWIG_6(swigCPtr, this, start_time, end_time);
  }

  public int subscribe(String symbols, String frequency, boolean unsubscribe_previous) {
    return gmsdkJNI.Strategy_subscribe__SWIG_0(swigCPtr, this, symbols, frequency, unsubscribe_previous);
  }

  public int subscribe(String symbols, String frequency) {
    return gmsdkJNI.Strategy_subscribe__SWIG_1(swigCPtr, this, symbols, frequency);
  }

  public int unsubscribe(String symbols, String frequency) {
    return gmsdkJNI.Strategy_unsubscribe(swigCPtr, this, symbols, frequency);
  }

  public SWIGTYPE_p_DataArrayT_Account_t get_accounts() {
    long cPtr = gmsdkJNI.Strategy_get_accounts(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_DataArrayT_Account_t(cPtr, false);
  }

  public Order order_volume(String symbol, int volume, int side, int order_type, int position_effect, double price, String account) {
    return new Order(gmsdkJNI.Strategy_order_volume__SWIG_0(swigCPtr, this, symbol, volume, side, order_type, position_effect, price, account), true);
  }

  public Order order_volume(String symbol, int volume, int side, int order_type, int position_effect, double price) {
    return new Order(gmsdkJNI.Strategy_order_volume__SWIG_1(swigCPtr, this, symbol, volume, side, order_type, position_effect, price), true);
  }

  public Order order_volume(String symbol, int volume, int side, int order_type, int position_effect) {
    return new Order(gmsdkJNI.Strategy_order_volume__SWIG_2(swigCPtr, this, symbol, volume, side, order_type, position_effect), true);
  }

  public Order order_value(String symbol, double value, int side, int order_type, int position_effect, double price, String account) {
    return new Order(gmsdkJNI.Strategy_order_value__SWIG_0(swigCPtr, this, symbol, value, side, order_type, position_effect, price, account), true);
  }

  public Order order_value(String symbol, double value, int side, int order_type, int position_effect, double price) {
    return new Order(gmsdkJNI.Strategy_order_value__SWIG_1(swigCPtr, this, symbol, value, side, order_type, position_effect, price), true);
  }

  public Order order_value(String symbol, double value, int side, int order_type, int position_effect) {
    return new Order(gmsdkJNI.Strategy_order_value__SWIG_2(swigCPtr, this, symbol, value, side, order_type, position_effect), true);
  }

  public Order order_percent(String symbol, double percent, int side, int order_type, int position_effect, double price, String account) {
    return new Order(gmsdkJNI.Strategy_order_percent__SWIG_0(swigCPtr, this, symbol, percent, side, order_type, position_effect, price, account), true);
  }

  public Order order_percent(String symbol, double percent, int side, int order_type, int position_effect, double price) {
    return new Order(gmsdkJNI.Strategy_order_percent__SWIG_1(swigCPtr, this, symbol, percent, side, order_type, position_effect, price), true);
  }

  public Order order_percent(String symbol, double percent, int side, int order_type, int position_effect) {
    return new Order(gmsdkJNI.Strategy_order_percent__SWIG_2(swigCPtr, this, symbol, percent, side, order_type, position_effect), true);
  }

  public Order order_target_volume(String symbol, int volume, int position_side, int order_type, double price, String account) {
    return new Order(gmsdkJNI.Strategy_order_target_volume__SWIG_0(swigCPtr, this, symbol, volume, position_side, order_type, price, account), true);
  }

  public Order order_target_volume(String symbol, int volume, int position_side, int order_type, double price) {
    return new Order(gmsdkJNI.Strategy_order_target_volume__SWIG_1(swigCPtr, this, symbol, volume, position_side, order_type, price), true);
  }

  public Order order_target_volume(String symbol, int volume, int position_side, int order_type) {
    return new Order(gmsdkJNI.Strategy_order_target_volume__SWIG_2(swigCPtr, this, symbol, volume, position_side, order_type), true);
  }

  public Order order_target_value(String symbol, double value, int position_side, int order_type, double price, String account) {
    return new Order(gmsdkJNI.Strategy_order_target_value__SWIG_0(swigCPtr, this, symbol, value, position_side, order_type, price, account), true);
  }

  public Order order_target_value(String symbol, double value, int position_side, int order_type, double price) {
    return new Order(gmsdkJNI.Strategy_order_target_value__SWIG_1(swigCPtr, this, symbol, value, position_side, order_type, price), true);
  }

  public Order order_target_value(String symbol, double value, int position_side, int order_type) {
    return new Order(gmsdkJNI.Strategy_order_target_value__SWIG_2(swigCPtr, this, symbol, value, position_side, order_type), true);
  }

  public Order order_target_percent(String symbol, double percent, int position_side, int order_type, double price, String account) {
    return new Order(gmsdkJNI.Strategy_order_target_percent__SWIG_0(swigCPtr, this, symbol, percent, position_side, order_type, price, account), true);
  }

  public Order order_target_percent(String symbol, double percent, int position_side, int order_type, double price) {
    return new Order(gmsdkJNI.Strategy_order_target_percent__SWIG_1(swigCPtr, this, symbol, percent, position_side, order_type, price), true);
  }

  public Order order_target_percent(String symbol, double percent, int position_side, int order_type) {
    return new Order(gmsdkJNI.Strategy_order_target_percent__SWIG_2(swigCPtr, this, symbol, percent, position_side, order_type), true);
  }

  public SWIGTYPE_p_DataArrayT_Order_t order_close_all() {
    long cPtr = gmsdkJNI.Strategy_order_close_all(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_DataArrayT_Order_t(cPtr, false);
  }

  public int order_cancel(String cl_ord_id, String account) {
    return gmsdkJNI.Strategy_order_cancel__SWIG_0(swigCPtr, this, cl_ord_id, account);
  }

  public int order_cancel(String cl_ord_id) {
    return gmsdkJNI.Strategy_order_cancel__SWIG_1(swigCPtr, this, cl_ord_id);
  }

  public int order_cancel_all() {
    return gmsdkJNI.Strategy_order_cancel_all(swigCPtr, this);
  }

  public SWIGTYPE_p_DataArrayT_Order_t get_orders(String account) {
    long cPtr = gmsdkJNI.Strategy_get_orders__SWIG_0(swigCPtr, this, account);
    return (cPtr == 0) ? null : new SWIGTYPE_p_DataArrayT_Order_t(cPtr, false);
  }

  public SWIGTYPE_p_DataArrayT_Order_t get_orders() {
    long cPtr = gmsdkJNI.Strategy_get_orders__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_DataArrayT_Order_t(cPtr, false);
  }

  public SWIGTYPE_p_DataArrayT_Order_t get_unfinished_orders(String account) {
    long cPtr = gmsdkJNI.Strategy_get_unfinished_orders__SWIG_0(swigCPtr, this, account);
    return (cPtr == 0) ? null : new SWIGTYPE_p_DataArrayT_Order_t(cPtr, false);
  }

  public SWIGTYPE_p_DataArrayT_Order_t get_unfinished_orders() {
    long cPtr = gmsdkJNI.Strategy_get_unfinished_orders__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_DataArrayT_Order_t(cPtr, false);
  }

  public SWIGTYPE_p_DataArrayT_ExecRpt_t get_execution_reports(String account) {
    long cPtr = gmsdkJNI.Strategy_get_execution_reports__SWIG_0(swigCPtr, this, account);
    return (cPtr == 0) ? null : new SWIGTYPE_p_DataArrayT_ExecRpt_t(cPtr, false);
  }

  public SWIGTYPE_p_DataArrayT_ExecRpt_t get_execution_reports() {
    long cPtr = gmsdkJNI.Strategy_get_execution_reports__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_DataArrayT_ExecRpt_t(cPtr, false);
  }

  public SWIGTYPE_p_DataArrayT_Cash_t get_cash(String accounts) {
    long cPtr = gmsdkJNI.Strategy_get_cash__SWIG_0(swigCPtr, this, accounts);
    return (cPtr == 0) ? null : new SWIGTYPE_p_DataArrayT_Cash_t(cPtr, false);
  }

  public SWIGTYPE_p_DataArrayT_Cash_t get_cash() {
    long cPtr = gmsdkJNI.Strategy_get_cash__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_DataArrayT_Cash_t(cPtr, false);
  }

  public SWIGTYPE_p_DataArrayT_Position_t get_position(String account) {
    long cPtr = gmsdkJNI.Strategy_get_position__SWIG_0(swigCPtr, this, account);
    return (cPtr == 0) ? null : new SWIGTYPE_p_DataArrayT_Position_t(cPtr, false);
  }

  public SWIGTYPE_p_DataArrayT_Position_t get_position() {
    long cPtr = gmsdkJNI.Strategy_get_position__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_DataArrayT_Position_t(cPtr, false);
  }

  public int add_parameters(Parameter params, int count) {
    return gmsdkJNI.Strategy_add_parameters(swigCPtr, this, Parameter.getCPtr(params), params, count);
  }

  public int del_parameters(String keys) {
    return gmsdkJNI.Strategy_del_parameters(swigCPtr, this, keys);
  }

  public int set_parameters(Parameter params, int count) {
    return gmsdkJNI.Strategy_set_parameters(swigCPtr, this, Parameter.getCPtr(params), params, count);
  }

  public SWIGTYPE_p_DataArrayT_Parameter_t get_parameters() {
    long cPtr = gmsdkJNI.Strategy_get_parameters(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_DataArrayT_Parameter_t(cPtr, false);
  }

  public int set_symbols(String symbols) {
    return gmsdkJNI.Strategy_set_symbols(swigCPtr, this, symbols);
  }

  public SWIGTYPE_p_DataArrayT_char_aLEN_SYMBOLA_t get_symbols() {
    long cPtr = gmsdkJNI.Strategy_get_symbols(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_DataArrayT_char_aLEN_SYMBOLA_t(cPtr, false);
  }

  public void on_init() {
    if (getClass() == Strategy.class) gmsdkJNI.Strategy_on_init(swigCPtr, this); else gmsdkJNI.Strategy_on_initSwigExplicitStrategy(swigCPtr, this);
  }

  public void on_tick(Tick tick) {
    if (getClass() == Strategy.class) gmsdkJNI.Strategy_on_tick(swigCPtr, this, Tick.getCPtr(tick), tick); else gmsdkJNI.Strategy_on_tickSwigExplicitStrategy(swigCPtr, this, Tick.getCPtr(tick), tick);
  }

  public void on_bar(Bar bar) {
    if (getClass() == Strategy.class) gmsdkJNI.Strategy_on_bar(swigCPtr, this, Bar.getCPtr(bar), bar); else gmsdkJNI.Strategy_on_barSwigExplicitStrategy(swigCPtr, this, Bar.getCPtr(bar), bar);
  }

  public void on_order_status(Order order) {
    if (getClass() == Strategy.class) gmsdkJNI.Strategy_on_order_status(swigCPtr, this, Order.getCPtr(order), order); else gmsdkJNI.Strategy_on_order_statusSwigExplicitStrategy(swigCPtr, this, Order.getCPtr(order), order);
  }

  public void on_execution_report(ExecRpt rpt) {
    if (getClass() == Strategy.class) gmsdkJNI.Strategy_on_execution_report(swigCPtr, this, ExecRpt.getCPtr(rpt), rpt); else gmsdkJNI.Strategy_on_execution_reportSwigExplicitStrategy(swigCPtr, this, ExecRpt.getCPtr(rpt), rpt);
  }

  public void on_parameter(Parameter param) {
    if (getClass() == Strategy.class) gmsdkJNI.Strategy_on_parameter(swigCPtr, this, Parameter.getCPtr(param), param); else gmsdkJNI.Strategy_on_parameterSwigExplicitStrategy(swigCPtr, this, Parameter.getCPtr(param), param);
  }

  public void on_schedule(String data_rule, String time_rule) {
    if (getClass() == Strategy.class) gmsdkJNI.Strategy_on_schedule(swigCPtr, this, data_rule, time_rule); else gmsdkJNI.Strategy_on_scheduleSwigExplicitStrategy(swigCPtr, this, data_rule, time_rule);
  }

  public void on_backtest_finished(Indicator indicator) {
    if (getClass() == Strategy.class) gmsdkJNI.Strategy_on_backtest_finished(swigCPtr, this, Indicator.getCPtr(indicator), indicator); else gmsdkJNI.Strategy_on_backtest_finishedSwigExplicitStrategy(swigCPtr, this, Indicator.getCPtr(indicator), indicator);
  }

  public void on_account_status(AccountStatus account_status) {
    if (getClass() == Strategy.class) gmsdkJNI.Strategy_on_account_status(swigCPtr, this, AccountStatus.getCPtr(account_status), account_status); else gmsdkJNI.Strategy_on_account_statusSwigExplicitStrategy(swigCPtr, this, AccountStatus.getCPtr(account_status), account_status);
  }

  public void on_error(int error_code, String error_msg) {
    if (getClass() == Strategy.class) gmsdkJNI.Strategy_on_error(swigCPtr, this, error_code, error_msg); else gmsdkJNI.Strategy_on_errorSwigExplicitStrategy(swigCPtr, this, error_code, error_msg);
  }

  public void on_stop() {
    if (getClass() == Strategy.class) gmsdkJNI.Strategy_on_stop(swigCPtr, this); else gmsdkJNI.Strategy_on_stopSwigExplicitStrategy(swigCPtr, this);
  }

  public void on_market_data_connected() {
    if (getClass() == Strategy.class) gmsdkJNI.Strategy_on_market_data_connected(swigCPtr, this); else gmsdkJNI.Strategy_on_market_data_connectedSwigExplicitStrategy(swigCPtr, this);
  }

  public void on_trade_data_connected() {
    if (getClass() == Strategy.class) gmsdkJNI.Strategy_on_trade_data_connected(swigCPtr, this); else gmsdkJNI.Strategy_on_trade_data_connectedSwigExplicitStrategy(swigCPtr, this);
  }

  public void on_market_data_disconnected() {
    if (getClass() == Strategy.class) gmsdkJNI.Strategy_on_market_data_disconnected(swigCPtr, this); else gmsdkJNI.Strategy_on_market_data_disconnectedSwigExplicitStrategy(swigCPtr, this);
  }

  public void on_trade_data_disconnected() {
    if (getClass() == Strategy.class) gmsdkJNI.Strategy_on_trade_data_disconnected(swigCPtr, this); else gmsdkJNI.Strategy_on_trade_data_disconnectedSwigExplicitStrategy(swigCPtr, this);
  }

}