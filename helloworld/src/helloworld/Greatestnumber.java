package helloworld;
import java.util.Scanner;
public class Greatestnumber {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int a=sc.nextInt();
		System.out.println("enter b num");
		int b=sc.nextInt();
		if(a>b)
		{
			System.out.println("a is greater than b");
		}else {
			System.out.println("b is greater than a");
		}
sc.close();
	}

}
