package javafs;
final class Human
{
final int legs=4;
 final void makesound()
{
System.out.println("animal makes a sound");	
}
}
public class Final_method {
	public static void main(String[] args) {
		Human obj=new Human();
		System.out.println("Legs:"+obj.legs);
		obj.makesound();
	}
}