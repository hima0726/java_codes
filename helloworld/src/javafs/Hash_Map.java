package javafs;

import java.util.HashMap;

public class Hash_Map {
    public static void main(String[] args) {
        // Creating a HashMap to store student names and their marks
        HashMap<String, Integer> studentMarks = new HashMap<>();
        
        // Adding key-value pairs to the HashMap
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 92);
        studentMarks.put("Charlie", 78);
        studentMarks.put("Alice", 90); // Overwrites the previous value for "Alice"
        
        // Printing the HashMap
        System.out.println("Student Marks: " + studentMarks); 
       
    }
}