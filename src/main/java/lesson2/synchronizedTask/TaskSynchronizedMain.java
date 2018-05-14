package lesson2.synchronizedTask;


public class TaskSynchronizedMain {

    static Aggregator Agregators[] = new Aggregator[4];

    public static void initThreads(){
        for (int i=0; i<4; i++){
            Agregators[i] = new Aggregator();
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
