/**
 * This program demonstrates creating threads by extending the Thread class.
 * 
 * Key Points:
 * 1. The `CookingTask` class extends the `Thread` class and overrides the `run()` method.
 *    - The `run()` method contains the code that will be executed when the thread starts.
 * 2. In the `main` method, three threads (`t1`, `t2`, `t3`) are created, each representing a cooking task.
 * 3. The `start()` method is called on each thread to begin execution.
 *    - The `start()` method internally calls the `run()` method of the thread.
 * 4. Each thread runs independently and concurrently, simulating the preparation of different dishes in a restaurant.
 * 
 * Output:
 * - The output order is not guaranteed because the threads run concurrently.
 * - Example output:
 *   Pasta is being prepared by Thread-0
 *   Saalad is being prepared by Thread-1
 *   Dessert is being prepared by Thread-2
 * - The thread names (e.g., Thread-0, Thread-1) are assigned by the JVM and may vary.
 */
package threads;

class CookingTask extends Thread{
    private String task;
    CookingTask(String task){
        this.task = task;
    }

    public void run(){
        System.out.println(task + " is being prepared by " + 
            Thread.currentThread().getName()
        );
    }
}
public class Restaurant{
    public static void main(String[] args) {
        Thread t1 = new CookingTask("Pasta");
        Thread t2 = new CookingTask("Saalad");
        Thread t3 = new CookingTask("Dessert");

        t1.start();
        t2.start();
        t3.start();
        
    }
}
