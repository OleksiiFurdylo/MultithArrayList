package lesson2.synchronizedTask;

/**
 * Created by OleksiiF on 05.05.2018.
 */
public class Task2Synchronised {

    static final Object lock = new Object();
    public static long value = 0;

    public static void increment(){
        synchronized (lock) {
            value++;
        }
    }

}


