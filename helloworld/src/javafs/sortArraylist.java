package javafs;

import java.util.ArrayList;
import java.util.Collections;

public class sortArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(3);

        Collections.sort(list); // Sorts in ascending order

        System.out.println("Sorted list: " + list);
    }
}