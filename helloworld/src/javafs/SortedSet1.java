package javafs;

import java.util.*;

public class SortedSet1 {
	
    public static void main(String[] args) {
    	
        SortedSet<String> fruits = new TreeSet<>();
        
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple"); 
        fruits.add("Orange");
        fruits.add("Banana"); // Duplicate, will be ignored

        System.out.println("SortedSet: " + fruits);
        
    }
    
}