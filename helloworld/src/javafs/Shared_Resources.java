package javafs;

class SharedResource {
    private int item = -1;  // -1 means no item is available

    // Producer thread produces an item
    public synchronized void produce() throws InterruptedException {
        while (item != -1) {  // If item is already produced, wait
            wait();
        }
        item = (int) (Math.random() * 100);  // Produce a random item (number)
//        item = (int) (100);
        System.out.println("Produced: " + item);
        notify();  // Notify the consumer that an item is available
    }

    // Consumer thread consumes an item
    public synchronized void consume() throws InterruptedException {
        while (item == -1) {  // If no item is available, wait
            wait();
        }
        System.out.println("Consumed: " + item);
        item = -1;  // Reset the item after consuming
        notify();  // Notify the producer that the item has been consumed
    }
}

public class Shared_Resources {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                while (true) {
                    sharedResource.produce();
                    Thread.sleep(1);  // Simulate time taken to produce an item
                    break;
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    sharedResource.consume();
                    Thread.sleep(2);
                    break;
                    // Simulate time taken to consume an item
                }
                
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        producer.start();
        consumer.start();
    }
}