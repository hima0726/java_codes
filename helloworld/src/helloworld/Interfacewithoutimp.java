package helloworld;
interface kookie {
    void start(); // Abstract method (no implementation)

    default void stop() {  // Default method (Java 8+)
        System.out.println("Vehicle stopped");
    }
}
class BMW implements kookie {
    @Override
    public void start() {
        System.out.println("Car is starting......");
    }
}
public class Interfacewithoutimp {
    public static void main(String[] args) {
        BMW car = new  BMW();
        car.start();  // Implemented in Car class
        car.stop();   // Default method from Vehicle interface
    }
}