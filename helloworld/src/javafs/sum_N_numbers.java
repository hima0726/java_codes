package javafs;

import java.util.Scanner;

public class sum_N_numbers  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a positive number: ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = 0;

        // Check for valid input
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            // Loop to add numbers from 1 to n
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        }
    }
}