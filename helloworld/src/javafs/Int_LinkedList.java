package javafs;

import java.util.LinkedList;

public class Int_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Float> height=new LinkedList<>();
height.add(5.7f);
height.add(5.4f);
height.add(6.0f);
height.add(4.7f);
height.add(4.9f);

System.out.println(height);
System.out.println(height.getFirst());
System.out.println(height.getLast());
System.out.println(height.get(4));
System.out.println(height.removeFirst());
System.out.println("List: ");

for (int i=0; i<height.size(); i++) {
	System.out.println(height.get(i));
}

System.out.println(height.size());
System.out.println(height.contains(5.4f));
height.clear();
System.out.println(height.isEmpty());
	}

}
