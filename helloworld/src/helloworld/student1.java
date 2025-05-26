package helloworld;

public class student1 {
	String name;
	int marks;
	int age;
	void setdetails(String name,int marks,int age)
	{
		this.name=name;
		this.marks=marks;
		this.age=age;
	}
	void display() {
		System.out.println("name of the student:"+name);
		System.out.println("marks of the student:"+marks);
		System.out.println("age of the student:"+age);
	}

	public static void main(String[] args) {
		student1 s1=new student1();
		//s1.name="mohan";
		//s1.marks=90;
		//s1.age=24;
		s1.setdetails("vinay",90, 24);
		s1.display();
		student1 s2=new student1();
		s2.setdetails("himabindu",85, 25);
		s2.display();
		student1 s3=new student1();
		s3.setdetails("smanaswini",70, 20);
		s3.display();
		
	}

}