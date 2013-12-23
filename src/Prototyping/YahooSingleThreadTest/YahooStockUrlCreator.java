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
        for (String stockSymbol : stocks)
        {
            sb.append(stockSymbol);
            sb.append("+");
        }
        sb.append("&f="); //thing before all the tags/fields
        for(YahooStockApiDataField ysadf : ysadfList)
        {
            sb.append(ysadf);
            //no space required
        }
        
        return sb.toString();
    }
}
