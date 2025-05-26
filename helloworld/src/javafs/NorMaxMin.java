package javafs;
class Normal extends Thread{
	public void run() {
		System.out.println("Print 1-10" + "(Priority: "+getPriority()+")");
		for (int i=1; i<=5; i++) {
			System.out.println("normal: " + i);
		}
	}
}
class Even extends Thread{
	public void run() {
		System.out.println("Even from 1-10");
		for (int i=1; i<=10; i++) {
			if (i%2==0) {
				System.out.println("even: " + i);	
			}
		}
	}
}
class Odd extends Thread{
	public void run() {
		System.out.println("Oddnum from 1-10");
		for (int i=1; i<=10; i++) {
			if (i%2!=0) {
				System.out.println("odd: " + i);	
			}
		}
	}
}
public class NorMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Normal t1=new Normal();
		Even t2=new Even();
		Odd t3=new Odd();
		
		t1.setName("Normal");
		t2.setName("Even");
		t3.setName("Odd");
		
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
