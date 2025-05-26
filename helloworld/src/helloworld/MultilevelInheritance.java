package helloworld;
class grandmother{
	void eat() {
		System.out.println("animal is eating");
	}
}
class mother extends grandmother{
	void bark() {
		System.out.println("dog is barking");
	}
}
class child extends mother{
	void weep() {
		System.out.println("puppy is weeping");
	}
}
public class MultilevelInheritance {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		child p1=new child();
		p1.eat();
		p1.bark();
		p1.weep();
    }
}
