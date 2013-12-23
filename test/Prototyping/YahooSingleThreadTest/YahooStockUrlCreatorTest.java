/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototyping.YahooSingleThreadTest;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shen
 */
public class YahooStockUrlCreatorTest
{
    
    public YahooStockUrlCreatorTest()
    {
    }

    /**
     * Test of generateUrl method, of class YahooStockUrlCreator.
     */
    @Test
    public void testGenerateUrl()
    {
        System.out.println("generateUrl");
        List<YahooStockApiDataField> ysadfList = new ArrayList<>();
        ysadfList.add(YahooStockApiDataField.SYMBOL);
        ysadfList.add(YahooStockApiDataField.ASK);
        ysadfList.add(YahooStockApiDataField.BID);        
        List<String> stocks = new ArrayList<>();
        stocks.add("MSFT");
        stocks.add("GOOG");
        stocks.add("F");
        String expResult = "http://finance.yahoo.com/d/quotes.csv?s=MSFT+GOOG+F&f=sab";
        String result = YahooStockUrlCreator.generateUrl(ysadfList, stocks);
        assertEquals(expResult, result);
    }
}