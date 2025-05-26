package javafs;
class Animal1
{
String sound="Generic Animal Sound";
 void makeSound1() {
	 System.out.println("Animal makes sound");
 }
}
class puppy extends Animal1
{
String sound="Bark";
void makeSound1()
{
super.makeSound1();
System.out.println("Animal makes:" +super.sound);
System.out.println("Dog makes:" +sound);
}
}
public class Super_method {
	public static void main(String[] args) {
		puppy d1=new puppy();
		d1.makeSound1();
	}
}