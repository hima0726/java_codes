package helloworld;
abstract class Animal {
    // Abstract method (without implementation)
    abstract void sound();
    // Concrete method (with implementation)
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class Animalabstract {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Calls implemented method from Dog class
        dog.sleep(); // Calls concrete method from Animal class
    }
}