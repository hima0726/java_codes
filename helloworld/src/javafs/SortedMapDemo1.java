package javafs;

import java.util.*;

public class SortedMapDemo1 {
    public static void main(String[] args) {
        // Create a Map (can be HashMap, TreeMap, LinkedHashMap, etc.)
        Map<String, Integer> map = new TreeMap<>();

        // put(K key, V value)
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        // size()
        System.out.println("Size of map: " + map.size());  // 3

        // isEmpty()
        System.out.println("Is map empty? " + map.isEmpty());  // false

        // containsKey(Object key)
        System.out.println("Contains key 'Banana'? " + map.containsKey("Banana"));  // true

        // containsValue(Object value)
        System.out.println("Contains value 30? " + map.containsValue(30));  // true

        // get(Object key)
        System.out.println("Value for 'Apple': " + map.get("Apple"));  // 10

        // remove(Object key)
        map.remove("Banana");
        System.out.println("After removing 'Banana': " + map);  // {Apple=10, Cherry=30}

        // putAll(Map<? extends K, ? extends V> m)
        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("Date", 40);
        anotherMap.put("Elderberry", 50);
        map.putAll(anotherMap);
        System.out.println("After putAll: " + map);  // Combined map

        // keySet()
        Set<String> keys = map.keySet();
        System.out.println("Keys: " + keys);  // [Apple, Cherry, Date, Elderberry]

        // values()
        Collection<Integer> values = map.values();
        System.out.println("Values: " + values);  // [10, 30, 40, 50]

        // entrySet()
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println("Entries:");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // clear()
        map.clear();
        System.out.println("After clear(), map: " + map);  // {}
    }
}