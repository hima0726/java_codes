package helloworld;
interface a{
	default void parent1() {
		System.out.println("child father");
	}
}
interface b{
	default void parent2() {
		System.out.println("child mother");
	}
}
class c implements a,b{
	public void parent() {
		System.out.println("child");
		a.super.parent1();
		b.super.parent2();
	}
}
public class MultipleInheritance {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		c obj=new c();
		obj.parent1();
		obj.parent2();
		obj.parent();
    }
}
