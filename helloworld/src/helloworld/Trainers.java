package helloworld;

public class Trainers {
        String name;
		String Qualification;
		int exp;
		void display() {
			System.out.println("Hi my name: "+name);
			System.out.println("Qualification: "+Qualification);
			System.out.println("Exp: "+exp);
		}
		public static void main(String[] args) {
			Trainers t1=new Trainers();
			t1.name="Hima";
			t1.Qualification="CSE";
			t1.exp=2;
			t1.display();
		}
    }


