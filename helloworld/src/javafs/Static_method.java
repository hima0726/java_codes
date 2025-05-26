package javafs;
class Example
{
static int count=7;
static void display()
{
System.out.println("count is : "+count);	
}
}
public class Static_method {
    public static void main(String[] args) {
		Example.count++;
		Example.display();
    }
}