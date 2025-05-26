package javafs;

import java.util.*;

public class Linked_Hashmap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        hashMap.put("A", 1);
        hashMap.put("C", 3);
        hashMap.put("B", 2);

        linkedHashMap.put("A", 1);
        linkedHashMap.put("C", 3);
        linkedHashMap.put("B", 2);

        System.out.println("HashMap: " + hashMap);
        System.out.println("LinkedHashMap: " + linkedHashMap);
    }
}
