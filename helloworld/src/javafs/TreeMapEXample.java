package javafs;

import java.util.TreeMap;

public class TreeMapEXample
{
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(30, "Apple");
        map.put(10, "Banana");
        map.put(20, "Cherry");
        map.put(40, "Date");

        System.out.println("Sorted TreeMap: " + map);
        System.out.println("First Key: " + map.firstKey());       // 10
        System.out.println("Last Key: " + map.lastKey());         // 40
        System.out.println("SubMap (10-30): " + map.subMap(10, 30)); // 10 to 29
    }
}