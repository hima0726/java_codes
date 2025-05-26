package javafs;

import java.util.Scanner;

public class Palindrome_Strings{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine(); // Read the input string
        scanner.close(); // Close scanner to prevent resource leak
        String reverse = ""; // Variable to store reversed string
      // Reverse the string manually
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i); // Append characters in reverse order
        }
//Check if the original and reversed strings are the same
if (str.equals(reverse)) { // Case insensitive comparison
    System.out.println(str + " is a palindrome.");
} else {
    System.out.println(str + " is not a palindrome.");
}
}
}