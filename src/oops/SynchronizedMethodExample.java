/*
 * SynchronizedMethodExample.java
 *
 * Demonstrates use of `synchronized` to make a shared counter thread-safe.
 *
 * Behavior:
 * - `Counter.increment()` and `Counter.getCount()` are `synchronized` instance methods.
 * - The `synchronized` keyword uses the Counter object's intrinsic lock (monitor),
 *   enforcing mutual exclusion so only one thread may execute a synchronized
 *   method on the same Counter instance at a time.
 * - This prevents race conditions when multiple threads increment the shared
 *   `count` field concurrently.
 *
 * Usage (example):
 * - Create a `Runnable` that increments the counter in a loop, start multiple
 *   `Thread` instances with that task to run concurrently, then `join()` them
 *   before reading `counter.getCount()` to obtain the final result.
 * - With `N` threads each doing 1000 increments, final count should be `N * 1000`.
 */

package oops;
class Counter {
    private int count = 0;
    //synchronized method to increment the count and ensure thread safety
    public synchronized void increment() {
        count++;
    }
    public synchronized int getCount() {
        return count;
    }
}
public class SynchronizedMethodExample {
    public static void main(String[] args) throws InterruptedException{
        Counter counter = new Counter();
        Runnable task = () -> { //Runnable task - Declares a variable that holds a task that can be executed by a thread using Lamnda
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
        thread1.join();// wait for thread1 to finish
        thread2.join();// wait for thread2 to finish
        System.out.println("Final count: " + counter.getCount());
    }

}
