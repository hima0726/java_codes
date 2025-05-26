package helloworld;

import java.util.*;

public class NavigableSetExample {
    public static void main(String[] args) {
        NavigableSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original Set: " + numbers);
        System.out.println("Lower than 30: " + numbers.lower(30));     // 20
        System.out.println("Floor of 30: " + numbers.floor(30));       // 30
        System.out.println("Ceiling of 25: " + numbers.ceiling(25));   // 30
        System.out.println("Higher than 30: " + numbers.higher(30));   // 40

        System.out.println("Descending Set: " + numbers.descendingSet());

        System.out.println("Poll First: " + numbers.pollFirst());      // 10 removed
        System.out.println("Poll Last: " + numbers.pollLast());        // 50 removed
        System.out.println("After polling: " + numbers);
    }
}