package javafs;

import java.util.*;

public class SortedSetExample2 {
    public static void main(String[] args) {
        SortedSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);

        System.out.println("SortedSet: " + numbers);             // [5, 10, 15, 20]
        System.out.println("First: " + numbers.first());         // 5
        System.out.println("Last: " + numbers.last());           // 20
        System.out.println("HeadSet(15): " + numbers.headSet(15)); // [5, 10]
        System.out.println("TailSet(10): " + numbers.tailSet(10)); // [10, 15, 20]
        System.out.println("SubSet(5, 20): " + numbers.subSet(5, 20)); // [5, 10, 15]
    }
}