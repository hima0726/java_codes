package javafs;

public class volatileFlagExample {
    private volatile boolean flag = true; 

    public static void main(String[] args) {
        volatileFlagExample example = new volatileFlagExample();

        
        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(12000); 
                example.flag = false; 
                System.out.println("Thread 1: Flag set to false");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        
        Thread thread2 = new Thread(() -> {
            while (example.flag) { 
                
                System.out.println("Thread 2: Flag is still true...");
                try {
                    Thread.sleep(500); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thread 2: Detected flag change! Exiting...");
        });

        thread1.start(); 
        thread2.start(); 
    }
}