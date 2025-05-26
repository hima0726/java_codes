package helloworld;

public class GreatestThreenum {
	public static void main(String[] args) {
		int a=10,b=5,c=6;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greatest number");
			}else {
				System.out.println("c is greatest number");
			}
		}else {
			if(b>c)
			{
				System.out.println("b is greatest number");
			}else {
				System.out.println("c is greatest number");
			}
		}
    }
}
