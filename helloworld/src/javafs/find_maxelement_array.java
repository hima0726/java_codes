package javafs;

public class find_maxelement_array{
    public static void main(String[] args) {
        int[] numbers = {10, 25, 89, 45, 100, 67, 99}; // Example array

        int max = numbers[0]; // Assume the first element is the max

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if a larger value is found
            }
        }

        System.out.println("Maximum element in the array is: " + max);
    }
}