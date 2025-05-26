package javafs;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements (add to top)
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek top element (without removing)
        System.out.println("Top: " + stack.peek()); // 30

        // Pop element (remove from top)
        System.out.println("Popped: " + stack.pop()); // 30

        // Check if stack is empty
        System.out.println("Is empty? " + stack.isEmpty());

        // Search for an element
        System.out.println("Position of 10: " + stack.search(10)); // 2
    }
}