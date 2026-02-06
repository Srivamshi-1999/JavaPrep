package oops;



// This is a classic threading issue. When you call thread.start(), it doesn't immediately execute the run() method. Instead, it queues the thread to run, and the main thread continues executing immediately. 
// So the main thread prints "This code is outside of the thread" before the spawned thread gets a chance to run.

// The fix is to make the main thread wait for the spawned thread to complete using join():

// Edited
// ThreadsEx.java+6-6
// Now when you run the program, thread.join() makes the main thread wait until the spawned thread finishes executing, so you'll get the output in the expected order:

// "This code is running in a thread"
// "This code is outside of the thread"
public class ThreadsEx extends Thread {
    public void run(){
            System.out.println("This code is running in a thread");
        }
        public static void main(String[] args) {
        ThreadsEx thread = new ThreadsEx();
        thread.start();
        try {
            thread.join(); // Wait for the thread to complete
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupt status
            System.out.println("Thread was interrupted!");
        }
        System.out.println("This code is outside of the thread");
    }

}
