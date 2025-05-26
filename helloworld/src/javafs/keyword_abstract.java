package javafs;

abstract class Lion {
    // Abstract method (no body)
    abstract void sound();

    // Concrete method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog1 extends Lion {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class keyword_abstract {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        dog.sound();
        dog.sleep();
    }
}