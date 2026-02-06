package oops;

 class Mythread extends Thread {
    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " printing: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException  e) {
                System.out.println("Thread Inturupted "+ e.getMessage());    
            }            
        }
    }
}
public class ThreadExample {
    public static void main(String[] args) {
        Mythread thread1 = new Mythread();
        Mythread thread2 = new Mythread();
        thread1.start(); // Start the first thread
        
        // try {
        //     thread1.join(); // Wait for the first thread to finish before starting the second
        // } catch (InterruptedException e) {
        //     System.out.println("Main thread interrupted: " + e.getMessage());
        // }
        thread2.start(); // Start the second thread
    }
}
