package lesson1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by OleksiiF on 05.05.2018.
 */
public class Main {

    private int counter;
    private int counter1;

    private List<Integer> ints = new ArrayList<>();
    private List<Integer> mInts = new MArrayList<>();

    boolean isRegularArraylistSafe = true;
    boolean isMArrayListSafe = true;

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        main.test();
        main.conclusion();
    }

    public void increment() {

        ints.add(counter++);
        mInts.add(counter1++);
    }

    public void conclusion(){
        System.out.println("isRegularArraylistSafe: " + isRegularArraylistSafe);
        System.out.println("isMArrayListSafe" + isMArrayListSafe);
    }

    public void test() throws InterruptedException {
        List<Argegator> argegators = new ArrayList<>();



        for (int i=0; i<10; i++){
            Argegator agregator = new Argegator();
            argegators.add(agregator);
            new Thread(agregator).start();
        }

        Thread.sleep(100);


        Set<Integer> regularALints = new HashSet<>();
        Set<Integer> mALints = new HashSet<>();
        for (Argegator argegator : argegators) {
            for (Integer anInt : ints) {
                if (!regularALints.add(anInt)){
                    isRegularArraylistSafe = false;
                    //System.out.println("Duplicates exist. Not threadSafe: " + anInt);
                }
            }
            for(Integer anInt : mInts){
                if(!mALints.add(anInt)){
                    isMArrayListSafe = false;
                    System.out.println("Duplicates exist. Not threadSafe: " + anInt);
                }
            }

        }

    }

    public class Argegator implements Runnable {



        @Override
        public void run() {

        for (int i=0; i<1000; i++){
            increment();
        }

        }
    }



}
