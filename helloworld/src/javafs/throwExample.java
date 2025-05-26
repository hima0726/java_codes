package javafs;

public class throwExample {

    public static void checkAge(int age) {
        if (age < 18) {
            // Throw an exception manually
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are eligible!");
        }
    }

    public static void main(String[] args) {
        // Try with different ages
        checkAge(7); // This will throw the exception
        // checkAge(20); // Uncomment this to see the success message
    }
}
