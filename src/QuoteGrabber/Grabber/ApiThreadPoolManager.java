package QuoteGrabber.Grabber;

import Symbol.TickerSymbol;
import java.util.Date;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Interacts with the Yahoo! API.
 *
 * @author lchong
 */
class ApiThreadPoolManager //package private
{
    
    private ExecutorService threadPool;
    private final int NUM_THREADS = 10;

    public ApiThreadPoolManager()
    {
        threadPool = Executors.newFixedThreadPool(NUM_THREADS);
    }

    public void run()
    {
        CompletionService<String> pool = new ExecutorCompletionService<Double>(threadPool);

        for (int i = 0; i < 10; i++)
        {
            TickerSymbol symbol = new TickerSymbol("AAPL");
            Date date = new Date(System.currentTimeMillis());
            ApiRequestTask requestTask = new ApiRequestTask(symbol, date);
            pool.submit(new ApiRequestWorker(requestTask));
        }

        for (int i = 0; i < 10; i++)
        {
            String result = pool.take().get();

            //Compute the result
        }

        threadPool.shutdown();
    }

    public double getValueForDateTime(TickerSymbol tickerSymbol)
    {
        return 0.0;
    }
}
