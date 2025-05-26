package javafs;

public class SumoftheArrays{
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};  // Example array
        int sum = 0;

        // Loop through each element and add to sum
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of the array: " + sum);
    }
}
