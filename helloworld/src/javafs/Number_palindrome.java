package javafs;

import java.util.Scanner;

public class Number_palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close(); // Close scanner to avoid resource leak

        int originalNumber = number; // Store the original number
        int reverse = 0; // Variable to store the reversed number

        // Reverse the number
        while (number > 0) {
            int digit = number % 10; // Extract last digit
            reverse = (reverse * 10) + digit; // Append digit to reverse
            number = number / 10; // Remove last digit
        }

        // Check if the reversed number matches the original
        if (originalNumber == reverse) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}