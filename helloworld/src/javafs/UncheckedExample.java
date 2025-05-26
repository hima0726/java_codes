package javafs;
public class UncheckedExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        // Will throw ArithmeticException at runtime
        int result = a / b;
        System.out.println("Result: " + result);
    }
}