package javafs;

public class VolatileExample {
    private volatile int count = 0;

    public void increment() {
        count++; 
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileExample example = new VolatileExample();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) example.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) example.increment();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(example.count); 
    }
}