package lesson2.reenturantLock;

import lesson2.Increment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by OleksiiF on 14.05.2018.
 */
public class ReadWriteLock {
    private static List<Future<Long>> futureList = new ArrayList<>();
    private static ExecutorService executorService = Executors.newFixedThreadPool(4);
    private static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private static Increment increment = new Increment();

    public static void performAddition(){
        futuers();
        for (Future<Long> f: futureList){

            try{
                readWriteLock.writeLock().lock();
                f.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } finally {
                readWriteLock.writeLock().unlock();
            }
            executorService.shutdown();
        }
    }


    private static void futuers(){
        for (int i = 0; i < 1_000_000; i++) {
            futureList.add(executorService.submit(increment));
        }
    }
}
