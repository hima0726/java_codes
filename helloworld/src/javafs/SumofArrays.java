package javafs;

public class SumofArrays {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};  // Example array
        int sum = 0;
        // Use a for loop to add each element to sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
