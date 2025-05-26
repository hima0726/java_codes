package javafs;

public class swap_two_numbers {

	public static void main(String[] args) {
		int a=10,b=20,c;
		System.out.println("before swaping numbers: a= " +a+ "b="+b);
		//logic swap
		c=a;
		a=b;
		b=c;
		System.out.println("after swaping numbers: a= " +a+ "b="+b);
		
		// with out using third variable
		 
		int x=10,y=20;
		System.out.println("before swaping numbers: x= " +x+ "b="+y);
		x=x+y; // or x=x*y
		y=x-y; // or y=x/y
		x=x-y; // or x=x/y
		System.out.println("after swaping numbers: x= " +x+ "y="+y);
	}

}