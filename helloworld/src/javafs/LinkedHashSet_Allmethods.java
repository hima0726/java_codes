package javafs;

import java.util.*;

public class LinkedHashSet_Allmethods {
    public static void main(String[] args) {

        // Create a LinkedHashSet
        LinkedHashSet<String> fruits = new LinkedHashSet<>();

        // 1. add(E e)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Apple"); // Duplicate, won't be added

        System.out.println("Initial LinkedHashSet: " + fruits);

        // 2. size()
        System.out.println("Size: " + fruits.size());

        // 3. contains(Object o)
        System.out.println("Contains 'Banana'? " + fruits.contains("Banana"));
        System.out.println("Contains 'Mango'? " + fruits.contains("Mango"));

        // 4. remove(Object o)
        fruits.remove("Date");
        System.out.println("After removing 'Date': " + fruits);

        // 5. isEmpty()
        System.out.println("Is the set empty? " + fruits.isEmpty());

        // 6. iterator()
        System.out.print("Iterating using iterator: ");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 7. for-each loop
        System.out.print("Iterating using for-each: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 8. addAll(Collection<? extends E> c)
        LinkedHashSet<String> tropicalFruits = new LinkedHashSet<>();
        tropicalFruits.add("Mango");
        tropicalFruits.add("Pine_apple");
        fruits.addAll(tropicalFruits);
        System.out.println("After addAll(): " + fruits);

        // 9. containsAll(Collection<?> c)
        System.out.println("Contains all tropical fruits? " + fruits.containsAll(tropicalFruits));

        // 10. removeAll(Collection<?> c)
        fruits.removeAll(tropicalFruits);
        System.out.println("After removeAll(): " + fruits);

        // 11. retainAll(Collection<?> c)
        fruits.add("Grape");
        fruits.add("Mango");
        fruits.retainAll(Collections.singleton("Mango"));
       // fruits.retainAll(Collections.singleton("Grape"));
        System.out.println("After retainAll(' '): " + fruits);

        // 12. clear()
        fruits.clear();
        System.out.println("After clear(): " + fruits);
        System.out.println("Is empty after clear? " + fruits.isEmpty());
    }
}