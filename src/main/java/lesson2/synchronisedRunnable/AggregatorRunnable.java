package lesson2.synchronisedRunnable;

import lesson2.synchronizedTask.Task2Synchronised;

/**
 * Created by OleksiiF on 14.05.2018.
 */

public class AggregatorRunnable implements Runnable{

    @Override
    public void run() {
        Task2Synchronised.increment();
    }
}