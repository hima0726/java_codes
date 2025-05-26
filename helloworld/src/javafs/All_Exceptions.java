package javafs;

public class All_Exceptions {
    public static void main(String[] args) {
        // Block 1
        try {
            int[] numbers = {10,20,30};
            numbers[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error: " + e.getMessage());
        }
     // Block 2
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Null Error: " + e.getMessage());
        }
     // Block 3
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Math Error: " + e.getMessage());
        }
        System.out.println("All exceptions handled. Program continues...");
    }
}