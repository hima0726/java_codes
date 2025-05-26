package helloworld;

import java.util.Scanner;
public class Aboutme {
    public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	
	System.out.println("Enter name: ");
	String name=a.next();
	a.nextLine();
	System.out.println("your name is: "+name);
	
	System.out.println("College: ");
	String college=a.nextLine();
	System.out.println("your college name: "+college);
	
	System.out.println("Branch: ");
	String Branch=a.nextLine();
	System.out.println(" your Branch: "+Branch);
	
	System.out.println("CGPA: ");
	float CGPA=a.nextFloat();
	System.out.println("The CGPA: "+CGPA);
	
	System.out.println("Enter age: ");
	int age=a.nextInt();
	System.out.println("your age: "+age);
	
	System.out.println("EXP: ");
	int EXP=a.nextInt();
	System.out.println("Total EXP: "+EXP);
	
	a.nextLine();
	System.out.println("Hobbies: ");
	String Hobbies=a.nextLine();
	
	System.out.println("Hobbies are: "+ Hobbies);
	
	a.close();
	}
}
