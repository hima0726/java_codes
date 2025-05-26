package javafs;

import java.util.HashMap;

public class HashMapForeachLamda {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        // Using forEach() and lambda expression
        System.out.println("Using forEach and lambda:");
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}