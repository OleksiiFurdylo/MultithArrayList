package lesson2.reenturantLock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by OleksiiF on 14.05.2018.
 */
public class Atomic {

    private static AtomicLong aLong = new AtomicLong();
    private static List<Future<AtomicLong>> futureList = new ArrayList<>();
    private static ExecutorService executorService = Executors.newFixedThreadPool(4);
    private static IncrementA incrementA = new IncrementA();

    public static void performAddition(){
        futuers();
        for (Future<AtomicLong> f: futureList){

            try{
                f.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            executorService.shutdown();
        }
    }

    private static void futuers(){
        for (int i = 0; i < 1_000_000; i++) {
            futureList.add(executorService.submit(incrementA));
        }
    }

    static class IncrementA implements Callable<AtomicLong>{

        @Override
        public AtomicLong call() throws Exception {
            aLong.incrementAndGet();
            return aLong;
        }
    }

}
