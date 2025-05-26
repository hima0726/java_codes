package javafs;
public class Arith {

	public static void main(String[] args) {
		try {
			int b=5%7;
			System.out.println(b);
		}
			catch(ArithmeticException s)
			{
				System.out.println("cannot be divide by zero");
			}
				

	}

}