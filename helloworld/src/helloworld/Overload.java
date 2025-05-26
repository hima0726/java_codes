package helloworld;

public class Overload {
	void display(int a) {
		System.out.println("double: "+a);
	}
	void display(int a,int b) {
		System.out.println("two integers: "+a+"and"+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload obj=new Overload();
		obj.display(20);
		obj.display(47);
		obj.display(6,2);
	}

}
