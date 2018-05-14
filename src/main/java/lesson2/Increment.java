package lesson2;

import java.util.concurrent.Callable;

/**
 * Created by OleksiiF on 14.05.2018.
 */
public class Increment implements Callable<Long>{
    Long value = 0l;


    @Override
    public Long call() throws Exception {
        value += 1l;
        return value;
    }
}
