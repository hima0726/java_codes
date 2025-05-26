package javafs;

import java.util.HashMap;

public class HashMapValuesIteration {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        // Iterating over values using values()
        System.out.println("Using values:");
        for (Integer value : map.values()) {
            System.out.println("Value: " + value);
        }
    }
}