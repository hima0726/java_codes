package javafs;
import java.util.Scanner;

public class Prime_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a num: ");

		int number=sc.nextInt();
		sc.close();
		boolean isPrime=true;
		for(int i=2;i<number/2;i++)
		{
			if(number%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if (isPrime)
		{
			System.out.println("prime number");
			}
			else
			{
				System.out.println(" not prime number");
			}
		}

	
	}


