package javafs;


import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		
		LinkedList<String> animals1=new LinkedList<>();
		
		animals1.add("Dog");
		animals1.add("cat");
		animals1.add("Rabbit");
		animals1.addFirst("Lion");
		animals1.addLast("Elephant");
		
		System.out.println("LinkedList:"+animals1);
		System.out.println("First element:"+animals1.getFirst());
		System.out.println("last element:"+animals1.getLast());
		System.out.println("element at index 3 element:"+animals1.get(3));
		System.out.println("remove first element:"+animals1.removeFirst());
		System.out.println("iterating through linked list");
		
		for (int i = 0; i < animals1.size(); i++) {
		    System.out.println(animals1.get(i));
		}


		
		System.out.println("size:"+animals1.size());
		System.out.println("rabbit is in list "+animals1.contains("Rabbit"));
		animals1.clear();
		System.out.println("is empty:"+animals1.isEmpty());
		
		

	}

}