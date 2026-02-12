package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Overview

// File: ThreadsExCallable.java — a small demo showing task execution using Callable, ExecutorService, and Future.
// Goal: Simulate processing three orders concurrently (or serially depending on the pool) and retrieve results.
// Callable vs Runnable

// Callable<V>: Returns a value (V) and can throw checked exceptions. Used here so each task returns a String status.
// Runnable: No return value and cannot throw checked exceptions.
// Use Callable when you need a result or exception from the task.

//Thread implementation using Callable interface
public class ThreadsExCallable implements Callable<String> {
    private String item;

    public ThreadsExCallable(String item) {
    this.item = item;
    }
    @Override
    public String call() throws Exception {
        // Simulate order processing
        Thread.sleep(2000); // Simulating time taken to process the order
        return "Order for " + item + " has been processed.";
    }
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        // Create order processing tasks
        Callable<String> order1 = new ThreadsExCallable("Product A");
        Callable<String> order2 = new ThreadsExCallable("Product B");
        Callable<String> order3 = new ThreadsExCallable("Product C");

        // Submit tasks to the executor
        Future<String> result1 = executor.submit(order1);
        Future<String> result2 = executor.submit(order2);
        Future<String> result3 = executor.submit(order3);

        // Wait for tasks to complete and retrieve results
        String status1 = null;
        try {
            status1 = result1.get();
        } catch (InterruptedException | ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String status2 = null;
        try {
            status2 = result2.get();
        } catch (InterruptedException | ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String status3 = null;
        try {
            status3 = result3.get();
        } catch (InterruptedException | ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(status1);
        System.out.println(status2);
        System.out.println(status3);

        // Shutdown the executor when done
        executor.shutdown();
    }

}
