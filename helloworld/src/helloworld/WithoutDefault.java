package helloworld;
interface a1{
	void parent1(); 
}
interface b1{
	void parent2(); 
}
class c1 implements a1,b1{
	public void parent1() {
		 System.out.println("child mother");
    } public void parent2() {
		System.out.println("child father");
	}
	public void parent() {
		System.out.println("child");
//		a.super.parent1();
//		b.super.parent2();
    }
}
public class WithoutDefault {
    public static void main(String[] args) {
		c1 obj=new c1();
		obj.parent1();
		obj.parent2();
		obj.parent();
    }
}
