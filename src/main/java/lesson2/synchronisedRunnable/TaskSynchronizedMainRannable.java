package lesson2.synchronisedRunnable;

import lesson2.synchronizedTask.Task2Synchronised;

/**
 * Created by OleksiiF on 14.05.2018.
 */
public class TaskSynchronizedMainRannable {

    static AggregatorRunnable Agregators[] = new AggregatorRunnable[4];

    public static void initThreads(){
        for (int i=0; i<4; i++){
            Agregators[i] = new AggregatorRunnable();
        }
    }

    public static void performTask() {

        initThreads();

        while(Task2Synchronised.value < 1000000){
            for(int i=0; i<4; i++){
                Agregators[i].run();
            }
        }
    }

}