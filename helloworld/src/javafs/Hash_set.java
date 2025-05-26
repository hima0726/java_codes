package javafs;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_set{
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String>fruits = new HashSet<>();

        // 1. add() - Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Banana"); // Duplicate - won't be added

        System.out.println("HashSet after add(): " + fruits);

        // 2. contains() - Check if an element exists
        System.out.println("Contains 'Apple'? " + fruits.contains("Apple"));
        System.out.println("Contains 'Grapes'? " + fruits.contains("Grapes"));

        // 3. remove() - Remove an element
        fruits.remove("Banana");
        System.out.println("After remove('Banana'): " + fruits);

        // 4. size() - Get number of elements
        System.out.println("Size of HashSet: " + fruits.size());

        // 5. isEmpty() - Check if the set is empty
        System.out.println("Is HashSet empty? " + fruits.isEmpty());

        // 6. iterator() - Traverse the set
        System.out.println("Iterating using iterator():");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 7. clear() - Remove all elements
        fruits.clear();
        System.out.println("After clear(): " + fruits);

        // 8. isEmpty() again
        System.out.println("Is HashSet empty after clear()? " + fruits.isEmpty());
    }
}