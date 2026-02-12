package threads;

/* ExplicitLock.java 
Explicit Locks provide more flexibility and control over synchronization 
 compared to synchronized methods or blocks. They allow you to acquire and release locks explicitly, 
 which can be useful in certain scenarios where you need more fine-grained control over
 the locking behavior. The `java.util.concurrent.locks` package provides the `Lock`
 interface and its implementations, such as `ReentrantLock`, which can be used for 
 explicit locking in Java. 

 Explanation:

 -The try-finally block ensures the lock is released even if an exception occurs.
 -Locks offer advanced features like try-locking and fairness policies.
 -ReentrantLock allows explicit locking and unlocking, ensuring thread safety.
 */

import java.util.concurrent.locks.ReentrantLock;

class CounterLock{
    private int counter = 0;
    private final ReentrantLock lock = new ReentrantLock();

    public void increment(){
        lock.lock();
        try{
            counter++;
        }
        finally{
            lock.unlock();
        }
    }

    public int getCount(){
        lock.lock();
        try{
            return counter;
        }
        finally{
            lock.unlock();
        }
    }
}
/**
 * 
 */
public class ExplicitLocks extends Thread {
    public static void main(String[] args) throws InterruptedException{
        CounterLock counter = new CounterLock();
        Runnable task = () -> {
            for(int i=0; i<1000;i++){
                counter.increment();
            }
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Final count:"+ counter.getCount());

    }

}
