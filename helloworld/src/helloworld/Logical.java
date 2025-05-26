package helloworld;

public class Logical {
    public static void main(String[] args) {
		int a=5,b=5,c=20;
		boolean result;
		result=(a==b)&&(c>b);
		System.out.println("(a==b)&&(c>b) " +result);
		result=(a==b)&&(c<b);
		System.out.println("(a==b)&&(c<b) " +result);
		result=(a==b)||(c>b);
		System.out.println("(a==b)||(c>b) " +result);
		result=(a==b)||(c<b);
		System.out.println("(a==b)||(c<b) " +result);
		result=!(a==b);
		System.out.println("!(a==b) "+result);
		result=!(a!=b);
		System.out.println("!(a!=b) "+result);
    }
}
