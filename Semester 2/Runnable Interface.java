class MyRunnable implements Runnable {
    // Implement the run method
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread running: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of MyRunnable
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        
        // Display a message to show the main thread is running concurrently
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread running: " + i);
            try {
                Thread.sleep(1500); // Sleep for 1.5 seconds
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted!");
            }
        }
    }
}
