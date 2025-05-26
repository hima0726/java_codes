package javafs;

public class Finally_method {

	public static void main(String[] args) {
		 try {
	            int data = 10 / 0;
	        } catch (ArithmeticException e) {
	            System.out.println("Exception caught");
	        } finally {
	            System.out.println("Finally block always executes");
	        }
	    }
		       
		


	}
