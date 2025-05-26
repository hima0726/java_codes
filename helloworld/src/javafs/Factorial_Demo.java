package javafs;

import java.util.Scanner;

public class Factorial_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        long factorial = 1;

        // Handle negative input
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Loop to calculate factorial
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }
}