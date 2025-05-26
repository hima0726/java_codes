package javafs;

import java.util.LinkedHashSet;

public class Linked_hashset {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Banana"); // Duplicate

        System.out.println(set);
    }
}