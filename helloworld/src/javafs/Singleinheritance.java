package javafs;
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
public class Singleinheritance{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}
}


