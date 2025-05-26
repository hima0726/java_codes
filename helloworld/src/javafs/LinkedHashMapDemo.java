package javafs;

import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);

        System.out.println("Get Banana: " + map.get("Banana"));
        System.out.println("Contains key 'Apple': " + map.containsKey("Apple"));
        System.out.println("Contains value 50: " + map.containsValue(50));
        System.out.println("Key Set: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entry Set: " + map.entrySet());

        map.remove("Banana");
        System.out.println("After removing Banana: " + map);
    }
}