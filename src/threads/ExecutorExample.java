package threads;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * The Executor framework (java.util.concurrent) simplifies thread management by abstracting thread 
 * creation and pooling
 */

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Runnable task = () ->{
            for(int i=0; i<5; i++){
                System.out.println(Thread.currentThread().getName() + " Printing: "+ i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println("Thread Interupted:" + e.getMessage());
                }

            }
        };

        executor.submit(task);
        executor.submit(task);
        executor.shutdown();
        
    }
    

}
