/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototyping.YahooSingleThreadTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 *
 * @author shen
 */
public class SingleThreadYahooGrab
{
    
    public static void main(String ... args) throws MalformedURLException, IOException
    {
        SingleThreadYahooGrab styg = new SingleThreadYahooGrab();
        styg.testGrab();
    }

    //private static final String YAHOO_API_URL_TEST = "http://download.finance.yahoo.com/d/quotes.csv?s=%40%5EDJI,GOOG&f=nsl1op&e=.csv";
    private static final String YAHOO_API_URL_TEST = "http://finance.yahoo.com/d/quotes.csv?s=XOM+BBDb.TO+JNJ+MSFT&f=snd1l1yr";

    //http://www.gummy-stuff.org/Yahoo-data.htm
    
    public SingleThreadYahooGrab()
    {
    }

    public void testGrab() throws MalformedURLException, IOException
    {

        BufferedReader rd;
        OutputStreamWriter wr;
        try
        {
            URL url = new URL(YAHOO_API_URL_TEST);
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            wr = new OutputStreamWriter(conn.getOutputStream());
            wr.flush();

            // Get the response
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null)
            {
                System.out.println(line);
            }
            System.out.println("---end---");
        }
        catch (Exception e)
        {
            System.out.println("Error thrown");
            System.out.println(e.toString());
        };

    }

    public String encode(String str) throws UnsupportedEncodingException
    {
        final String encoding = "UTF-8";
        return URLEncoder.encode(str, encoding);
    }
}
