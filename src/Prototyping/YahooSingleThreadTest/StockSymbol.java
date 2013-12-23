/*
 * Right now it's just a placeholder for a stock symbol
 */
package Prototyping.YahooSingleThreadTest;

/**
 *
 * @author shen
 */
public class StockSymbol
{
    private String stockSymbol;
    
    public StockSymbol(String stockSymbol)
    {
        this.stockSymbol = stockSymbol;
    }

    public String getStockSymbol()
    {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol)
    {
        this.stockSymbol = stockSymbol;
    }
}
