package Practice_Java;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello");
String name="hima";
int age=23;
double grade=7.3f;
char gender='f';
boolean isStudent=true;
System.out.println("name : "+name);
System.out.println("age : "+age);
System.out.println("grade : "+grade);
System.out.println("gender : "+gender);
System.out.println("boolean : "+isStudent);

//With scanner

Scanner n=new Scanner(System.in);
System.out.println("enter name : ");
String name1=n.nextLine();


Scanner a=new Scanner(System.in);
System.out.println("enter age : ");
int age1=a.nextInt();


Scanner g=new Scanner(System.in);
System.out.println("enter grade : ");
double grade1=g.nextDouble();


Scanner c=new Scanner(System.in);
System.out.println("enter gender : ");
char gender1=c.next().charAt(0);


Scanner b=new Scanner(System.in);
System.out.println("is a student : ");
String s1=b.nextLine();

b.close();
n.close();
a.close();
g.close();
c.close();
}

}
