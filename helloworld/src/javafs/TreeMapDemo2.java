package javafs;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");
        map.put(40, "D");

        System.out.println("Lower than 25: " + map.lowerKey(25));        // 20
        System.out.println("Ceiling of 25: " + map.ceilingKey(25));      // 30
        System.out.println("Descending Map: " + map.descendingMap());    // {40=D, 30=C, 20=B, 10=A}
        
        Map.Entry<Integer, String> entry = map.pollFirstEntry(); // removes 10=A
        System.out.println("Polled Entry: " + entry);
        System.out.println("Remaining Map: " + map);
    }
}