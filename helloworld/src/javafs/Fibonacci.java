package javafs;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of terms
        int first = 0, second = 1;
         System.out.println(first + " " + second + " ");
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.println(next + " ");
            first = second;
            second = next;
        }
    }
}