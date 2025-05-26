package javafs;

import java.util.ArrayList;

public class Int_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> num = new ArrayList<>();
        
        num.add(56);
        num.add(43);
        num.add(87);
        num.add(91);
        
        System.out.println(num.get(1));
        
        System.out.println("List: ");
        for (int i=0; i<num.size(); i++) {
        	System.out.println(num.get(i));
        }
        
        num.remove(3);
        System.out.println(num);
        
       
        System.out.println(num.size());
        
        System.out.println(num.contains(72));
        
        num.clear();
        System.out.println(num.isEmpty());
        
	}

}
