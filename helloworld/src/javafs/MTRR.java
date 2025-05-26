package javafs;
class Mytype implements Runnable{
	public void run() {
		for(int i=2; i<=7; i++) {
			System.out.println("Thread: " +i);
		}
	}
}
class typetest implements Runnable{
	public void run() {
		for(int i=10; i>=5; i--) {
			System.out.println("Thread1: " +i);
		}
	}
}
public class MTRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mytype t1=new Mytype();
		Thread m1=new Thread(t1);
		typetest t2=new typetest();
		Thread m2=new Thread(t2);
		m1.start();
		m2.start();
	}

}
