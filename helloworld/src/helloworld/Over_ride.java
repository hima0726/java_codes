package helloworld;

class robot1
{
void dance()
{
System.out.println("Tilted to left");	
}
}
class robot2 extends robot1
{
void dance()
{
System.out.println("Tilted to right");	
}
}
public class Over_ride {
    public static void main(String[] args) {
    	//robot1 r1 = new robot1();
		//r1.dance();
		robot1 r2 = new robot2();
		r2.dance();
    }
}