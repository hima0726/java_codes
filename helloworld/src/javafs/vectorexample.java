package javafs;

import java.util.Vector;

public class vectorexample {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Insert at index
        fruits.add(1, "Mango");

        // Access element
        System.out.println("First fruit: " + fruits.get(0));

        // Remove element
        fruits.remove("Banana");

        // Size of vector
        System.out.println("Size: " + fruits.size());

        // Iterate
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
    
}