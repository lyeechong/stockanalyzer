/*
 * Creates the URL for the stock query
 */
package Prototyping.YahooSingleThreadTest;

import java.util.List;

/**
 *
 * @author shen
 */
public class YahooStockUrlCreator
{

    /**
     * The base URL for getting stocks
     */
    private static final String BASE_URL = "http://finance.yahoo.com/d/quotes.csv?s=";

    private YahooStockUrlCreator()
    {
    }

    public static String generateUrl(List<YahooStockApiDataField> ysadfList, List<String> stocks)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(BASE_URL);

        int stocksSize = stocks.size();
        for (int i = 0; i < stocksSize; i++)
        {
            String stockSymbol = stocks.get(i);
            sb.append(stockSymbol);
            if (i != stocksSize - 1)
            {
                sb.append("+");
            }
        }
        sb.append("&f="); //thing before all the tags/fields
        for (YahooStockApiDataField ysadf : ysadfList)
        {
            sb.append(ysadf.getSymbol());
            //no space required
        }

        return sb.toString();
    }
}
