package lesson2;

import lesson2.reenturantLock.Atomic;
import lesson2.reenturantLock.ReadWriteLock;
import lesson2.reenturantLock.ReenturantLockTask;
import lesson2.singleCode.SingleAdder;
import lesson2.synchronisedRunnable.TaskSynchronizedMainRannable;
import lesson2.synchronizedTask.TaskSynchronizedMain;

/**
 * Created by OleksiiF on 14.05.2018.
 */
public class Task2Main {
    public static void main(String[] args) {

    startBenchmark();

    }

    static void startBenchmark(){

        System.out.println("synchronized");
        long startTime = System.nanoTime();
        TaskSynchronizedMain.performTask();
        long endTime = System.nanoTime();
        long result = endTime - startTime;
        System.out.println("result: " + result);

        System.out.println("single");
        long startTime1 = System.nanoTime();
        SingleAdder.performAddition();
        long endTime1 = System.nanoTime();
        long result1 = endTime1 - startTime1;
        System.out.println("result: " + result1);

        System.out.println("runnable");
        long startTime2 = System.nanoTime();
        TaskSynchronizedMainRannable.performTask();
        long endTime2 = System.nanoTime();
        long result2 = endTime2 - startTime2;
        System.out.println("result: " + result2);

        System.out.println("reenturant");
        long startTime3 = System.nanoTime();
        ReenturantLockTask.performAddition();
        long endTime3 = System.nanoTime();
        long result3 = endTime3 - startTime3;
        System.out.println("result: " + result3);

        System.out.println("readWrite");
        long startTime4 = System.nanoTime();
        ReadWriteLock.performAddition();
        long endTime4 = System.nanoTime();
        long result4 = endTime4 - startTime4;
        System.out.println("result: " + result4);

        System.out.println("atomic");
        long startTime5 = System.nanoTime();
        Atomic.performAddition();
        long endTime5 = System.nanoTime();
        long result5 = endTime5 - startTime5;
        System.out.println("result: " + result5);





    }
}
