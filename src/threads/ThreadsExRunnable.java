package threads;

public class ThreadsExRunnable implements Runnable {
    public void run(){
        System.out.println("Inside the thread");
    }
    public static void main(String[] args) {
        ThreadsExRunnable obj = new ThreadsExRunnable();
        Thread thread = new Thread(obj);
        thread.start();
        try {
            thread.sleep(2000); // Pause for 2000 milliseconds (2 seconds)
        } catch (InterruptedException e) {
            thread.currentThread().interrupt(); // Restore the interrupt status
            System.out.println("Thread was interrupted!");
        }
        System.out.println("This code is outside of the thread");
    }

}
