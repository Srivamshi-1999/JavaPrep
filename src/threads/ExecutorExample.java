package threads;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * The Executor framework (java.util.concurrent) simplifies thread management by abstracting thread 
 * creation and pooling
 * Executors.newFixedThreadPool(2) creates a thread pool with two threads.
 * Tasks are submitted to the executor, which manages thread allocation.
 * shutdown() ensures the executor terminates after tasks complete.
 */

public class ExecutorExample {
    public static void main(String[] args) throws Exception{
        ExecutorService executor = Executors.newFixedThreadPool(2);
        //Creating a task using the Runnable
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
        //In this case like below we are submiting the task for two thread we may not
        //know in which order it will execute 
        executor.submit(task);

        //If we want to wait for the first thread to complete the exection in the executor case we need to
        //use future instead of Thread.join()
        // Submit the first task and wait for it to complete
        // Future<?> future1 = executor.submit(task);
        // future1.get();

        //Submit the second task
        executor.submit(task);
        executor.shutdown();
        
    }
    

}
