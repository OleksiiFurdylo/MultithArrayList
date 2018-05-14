package lesson2.synchronizedTask;

import lesson2.synchronizedTask.Task2Synchronised;

/**
 * Created by OleksiiF on 14.05.2018.
 */

public class Aggregator extends Thread{

    @Override
    public void run() {
        Task2Synchronised.increment();
    }
}