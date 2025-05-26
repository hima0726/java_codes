package helloworld;
interface Vehicle {
    void start(); // Abstract method

    default void stop() {  // Default method (Java 8+)
        System.out.println("Vehicle stopped");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is started");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is started");
    }
}
public class Interface {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        car.start();  // Calls start() method from Car
        car.stop();   // Uses default stop() from Vehicle interface

        bike.start();  // Calls start() method from Bike
        bike.stop();   // Uses default stop() from Vehicle interface
    }
}
