package javafs;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int num=sc.nextInt();
		long factorial=1;
		for (int i=1; i<=num; i++) {
			factorial *=i;
		}
        System.out.println("factorial of "+ num + "is: " + factorial);
	}

}
