/*
 * The query symbols which can be used for the Yahoo stock API
 */
package Prototyping.YahooSingleThreadTest;

/**
 *
 * @author shen
 */
public enum YahooStockApiDataField
{
    ASK("a ", "Ask "),
    AVERAGE_DAILY_VOLUME("a2", "Average Daily Volume "),
    ASK_SIZE("a5", "Ask Size "),
    BID("b ", "Bid "),
    ASK__REAL_TIME_("b2", "Ask (Real-time) "),
    BID__REAL_TIME_("b3", "Bid (Real-time) "),
    BOOK_VALUE("b4", "Book Value "),
    BID_SIZE("b6", "Bid Size "),
    CHANGE___PERCENT_CHANGE("c ", "Change & Percent Change "),
    CHANGE("c1", "Change "),
    COMMISSION("c3", "Commission "),
    CHANGE__REAL_TIME_("c6", "Change (Real-time) "),
    AFTER_HOURS_CHANGE__REAL_TIME_("c8", "After Hours Change (Real-time) "),
    DIVIDEND_SHARE("d ", "Dividend/Share "),
    LAST_TRADE_DATE("d1", "Last Trade Date "),
    TRADE_DATE("d2", "Trade Date "),
    EARNINGS_SHARE("e ", "Earnings/Share "),
    ERROR_INDICATION__RETURNED_FOR_SYMBOL_CHANGED___INVALID_("e1", "Error Indication (returned for symbol changed / invalid) "),
    EPS_ESTIMATE_CURRENT_YEAR("e7", "EPS Estimate Current Year "),
    EPS_ESTIMATE_NEXT_YEAR("e8", "EPS Estimate Next Year "),
    EPS_ESTIMATE_NEXT_QUARTER("e9", "EPS Estimate Next Quarter "),
    FLOAT_SHARES("f6", "Float Shares "),
    DAY_S_LOW("g ", "Day's Low "),
    DAY_S_HIGH("h ", "Day's High "),
    FIFTY_TWO_WEEK_LOW("j ", "52-week Low "),
    FIFTY_TWO_WEEK_HIGH("k ", "52-week High "),
    HOLDINGS_GAIN_PERCENT("g1", "Holdings Gain Percent "),
    ANNUALIZED_GAIN("g3", "Annualized Gain "),
    HOLDINGS_GAIN("g4", "Holdings Gain "),
    HOLDINGS_GAIN_PERCENT__REAL_TIME_("g5", "Holdings Gain Percent (Real-time) "),
    HOLDINGS_GAIN__REAL_TIME_("g6", "Holdings Gain (Real-time) "),
    MORE_INFO("i ", "More Info "),
    ORDER_BOOK__REAL_TIME_("i5", "Order Book (Real-time) "),
    MARKET_CAPITALIZATION("j1", "Market Capitalization "),
    MARKET_CAP__REAL_TIME_("j3", "Market Cap (Real-time) "),
    EBITDA("j4", "EBITDA "),
    CHANGE_FROM_52_WEEK_LOW("j5", "Change From 52-week Low "),
    PERCENT_CHANGE_FROM_52_WEEK_LOW("j6", "Percent Change From 52-week Low "),
    LAST_TRADE__REAL_TIME__WITH_TIME("k1", "Last Trade (Real-time) With Time "),
    CHANGE_PERCENT__REAL_TIME_("k2", "Change Percent (Real-time) "),
    LAST_TRADE_SIZE("k3", "Last Trade Size "),
    CHANGE_FROM_52_WEEK_HIGH("k4", "Change From 52-week High "),
    PERCEBT_CHANGE_FROM_52_WEEK_HIGH("k5", "Percebt Change From 52-week High "),
    LAST_TRADE__WITH_TIME_("l ", "Last Trade (With Time) "),
    LAST_TRADE__PRICE_ONLY_("l1", "Last Trade (Price Only) "),
    HIGH_LIMIT("l2", "High Limit "),
    LOW_LIMIT("l3", "Low Limit "),
    DAY_S_RANGE("m ", "Day's Range "),
    DAY_S_RANGE__REAL_TIME_("m2", "Day's Range (Real-time) "),
    FIFTY_DAY_MOVING_AVERAGE("m3", "50-day Moving Average "),
    TWO_HUNDRED_DAY_MOVING_AVERAGE("m4", "200-day Moving Average "),
    CHANGE_FROM_200_DAY_MOVING_AVERAGE("m5", "Change From 200-day Moving Average "),
    PERCENT_CHANGE_FROM_200_DAY_MOVING_AVERAGE("m6", "Percent Change From 200-day Moving Average "),
    CHANGE_FROM_50_DAY_MOVING_AVERAGE("m7", "Change From 50-day Moving Average "),
    PERCENT_CHANGE_FROM_50_DAY_MOVING_AVERAGE("m8", "Percent Change From 50-day Moving Average "),
    NAME("n ", "Name "),
    NOTES("n4", "Notes "),
    OPEN("o ", "Open "),
    PREVIOUS_CLOSE("p ", "Previous Close "),
    PRICE_PAID("p1", "Price Paid "),
    CHANGE_IN_PERCENT("p2", "Change in Percent "),
    PRICE_SALES("p5", "Price/Sales "),
    PRICE_BOOK("p6", "Price/Book "),
    EX_DIVIDEND_DATE("q ", "Ex-Dividend Date "),
    P_E_RATIO("r ", "P/E Ratio "),
    DIVIDEND_PAY_DATE("r1", "Dividend Pay Date "),
    P_E_RATIO__REAL_TIME_("r2", "P/E Ratio (Real-time) "),
    PEG_RATIO("r5", "PEG Ratio "),
    PRICE_EPS_ESTIMATE_CURRENT_YEAR("r6", "Price/EPS Estimate Current Year "),
    PRICE_EPS_ESTIMATE_NEXT_YEAR("r7", "Price/EPS Estimate Next Year "),
    SYMBOL("s ", "Symbol "),
    SHARES_OWNED("s1", "Shares Owned "),
    SHORT_RATIO("s7", "Short Ratio "),
    LAST_TRADE_TIME("t1", "Last Trade Time "),
    TRADE_LINKS("t6", "Trade Links "),
    TICKER_TREND("t7", "Ticker Trend "),
    ONE_YR_TARGET_PRICE("t8", "1 yr Target Price "),
    VOLUME("v ", "Volume "),
    HOLDINGS_VALUE("v1", "Holdings Value "),
    HOLDINGS_VALUE__REAL_TIME_("v7", "Holdings Value (Real-time) "),
    FIFTY_TWO_WEEK_RANGE("w ", "52-week Range "),
    DAY_S_VALUE_CHANGE("w1", "Day's Value Change "),
    DAY_S_VALUE_CHANGE__REAL_TIME_("w4", "Day's Value Change (Real-time) "),
    STOCK_EXCHANGE("x ", "Stock Exchange "),
    DIVIDEND_YIELD("y ", "Dividend Yield ");

    private String symbol;
    private String desc;
    
    private YahooStockApiDataField(String symbol, String desc)
    {
        this.symbol = symbol;
        this.desc = desc;
    }
}
