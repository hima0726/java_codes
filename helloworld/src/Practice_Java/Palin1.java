package Practice_Java;

import java.util.Scanner;


public class Palin1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a string: ");
		String name=sc.next();
		sc.close();
				
		// TODO Auto-generated method stub
String reverse="";
for(int i=name.length()-1; i>=0; i--) {
	reverse+=name.charAt(i);
	
}
if (name.equals(reverse)) {
	System.out.println("Palin");
}
else {
	System.out.println("Palin");
}
	}

}
