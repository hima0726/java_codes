package javafs;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();

        map.put(10, "Apple");
        map.put(20, "Banana");
        map.put(30, "Cherry");
        map.put(40, "Date");

        System.out.println("Original Map: " + map);
        System.out.println("Lower key than 25: " + map.lowerKey(25));   // 20
        System.out.println("Floor key of 30: " + map.floorKey(30));     // 30
        System.out.println("Ceiling key of 25: " + map.ceilingKey(25)); // 30
        System.out.println("Higher key than 30: " + map.higherKey(30)); // 40

        System.out.println("Descending Map: " + map.descendingMap());

        System.out.println("Poll First Entry: " + map.pollFirstEntry()); // Removes and returns first entry
        System.out.println("Map after poll: " + map);
    }
}