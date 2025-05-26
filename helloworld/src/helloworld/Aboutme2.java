package helloworld;

import java.util.Scanner;

public class Aboutme2 {

    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = a.next();
        System.out.println("Your name is: " + name);

        System.out.print("College: ");
        String college = a.nextLine();
        System.out.println("Your college name: " + college);

        System.out.print("Branch: ");
        String branch = a.nextLine();
        System.out.println("Your branch: " + branch);

        System.out.print("CGPA: ");
        float cgpa = a.nextFloat();
        System.out.println("The CGPA: " + cgpa);

        System.out.print("Enter age: ");
        int age = a.nextInt();
        System.out.println("Your age: " + age);

        System.out.print("EXP: ");
        int exp = a.nextInt();
        System.out.println("Total EXP: " + exp);
   System.out.print("Hobbies: ");
        String hobbies = a.nextLine();
        System.out.println("Hobbies are: " + hobbies);

        a.close(); // Always good practice to close the scanner
    }
}
