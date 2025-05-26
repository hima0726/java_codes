package javafs;

public class Array_Index {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};

        System.out.println(numbers[2]);  // ✅ Valid: prints 30
        System.out.println(numbers[3]);  // ❌ Invalid: index 4 doesn't exist
    }
}

