package helloworld;
class Lion{
	void eat() {
		System.out.println("Animal is eating");
	}
}
class cat extends Lion{
	void bark() {
		System.out.println("dog is barking");
	}
}
public class Inheritance {

	public static void main(String[] args) {
        Lion a1=new Lion();
        a1.eat();
        cat d1=new cat();
        d1.eat();
        d1.bark();
	}
}
