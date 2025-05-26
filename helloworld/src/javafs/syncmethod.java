package javafs;

class Counter {
    int count = 0;

    public synchronized void decrement() {
        count--;
    }
}

public class syncmethod {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.decrement();
            }
            
        });

       Thread t2 = new Thread(() -> {
           for (int i = 0; i < 1000; i++) {
                c.decrement();
               
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count (With Sync): " + c.count);
    }
}