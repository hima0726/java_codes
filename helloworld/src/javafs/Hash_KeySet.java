package javafs;

import java.util.HashMap;

public class Hash_KeySet {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("banana", 20);
        map.put("Cherry", 30);

        // Iterating over keys using keySet()
        System.out.println("Using keySet:");
        for (String key : map.keySet()) {
          System.out.println("Key: " + key + ", Value: " + map.get(key));
            // System.out.println(key+"");
            
        }
    }

}