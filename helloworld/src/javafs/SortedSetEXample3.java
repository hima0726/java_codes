package javafs;

import java.util.*;


public class SortedSetEXample3 {
    public static void main(String[] args) {
        // Create a SortedSet using TreeSet
        SortedSet<String> fruits = new TreeSet<>();

        // 1. add(E e)
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.println("Fruits (Sorted): " + fruits);

        // 2. remove(Object o)
        fruits.remove("Mango");
        System.out.println("After removing 'Mango': " + fruits);

        // 3. first()
        System.out.println("First (lowest) element: " + fruits.first());

        // 4. last()
        System.out.println("Last (highest) element: " + fruits.last());

        // 5. headSet(E toElement)
        System.out.println("headSet(\"Orange\"): " + fruits.headSet("Orange")); // Elements < Orange

        // 6. tailSet(E fromElement)
        System.out.println("tailSet(\"Grapes\"): " + fruits.tailSet("Grapes")); // Elements >= Grapes

        // 7. subSet(E from, E to)
        System.out.println("subSet(\"Banana\", \"Orange\"): " + fruits.subSet("Banana", "Orange"));

        // 8. size()
        System.out.println("Size of set: " + fruits.size());

        // 9. isEmpty()
        System.out.println("Is the set empty? " + fruits.isEmpty());

        // 10. contains(Object o)
        System.out.println("Does set contain 'Apple'? " + fruits.contains("Apple"));

        // 11. clear()
        fruits.clear();
        System.out.println("After clear(), is the set empty? " + fruits.isEmpty());
    }
}