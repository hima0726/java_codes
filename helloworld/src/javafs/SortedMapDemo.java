package javafs;

import java.util.*;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<String, Integer> map = new TreeMap<>();

        map.put("Banana", 3);
        map.put("Apple", 1);
        map.put("Cherry", 2);

        System.out.println("SortedMap: " + map);  // {Apple=1, Banana=3, Cherry=2}
        System.out.println("First Key: " + map.firstKey());  // Apple
        System.out.println("Last Key: " + map.lastKey());    // Cherry
        System.out.println("Head Map: " + map.headMap("Cherry"));  // {Apple=1, Banana=3}
        System.out.println("Tail Map: " + map.tailMap("Banana"));  // {Banana=3, Cherry=2}
        System.out.println("Sub Map: " + map.subMap("Apple", "Cherry"));  // {Apple=1, Banana=3}
        System.out.println("Comparator: " + map.comparator());  // null (natural ordering)
    }
}