/**
 * This program demonstrates creating threads using the Runnable interface.
 * 
 * Key Points:
 * 1. The `CookingJob` class implements the `Runnable` interface and overrides the `run()` method.
 *    - The `run()` method contains the code that will be executed by the thread.
 * 2. In the `main` method, three `Thread` objects (`t1`, `t2`, `t3`) are created, each initialized with a `CookingJob` task.
 * 3. The `start()` method is called on each thread to begin execution.
 *    - The `start()` method internally calls the `run()` method of the `Runnable` object in a new thread.
 * 4. Each thread runs independently and concurrently, simulating the preparation of different dishes in a restaurant.
 * 
 * Output:
 * - The output order is not guaranteed because the threads run concurrently.
 * - Example output:
 *   Soup is being prepared by Thread-0
 *   Pizza is being prepared by Thread-1
 *   Burger is being prepared by Thread-2
 * - The thread names (e.g., Thread-0, Thread-1) are assigned by the JVM and may vary.
 */
package threads;

class CookingJob implements Runnable {
    private String task;

    CookingJob(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println(task + " is being prepared by " +
            Thread.currentThread().getName());
    }
}

public class RestaurantRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new CookingJob("Soup"));
        Thread t2 = new Thread(new CookingJob("Pizza"));
        Thread t3 = new Thread(new CookingJob("Burger"));

        t1.start();
        t2.start();
        t3.start();
    }
}
