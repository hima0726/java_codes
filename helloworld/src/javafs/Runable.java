package javafs;
class MyRunnable implements Runnable{
	public void run() {
		System.out.println("Runnable..");
	}
}

public class Runable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable obj=new MyRunnable();
		Thread t=new Thread(obj);
		t.start();
	}

}
