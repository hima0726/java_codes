package javafs;

public class Multithread extends Thread {
	public void run(){
		System.out.println("Thread1: ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multithread mt= new Multithread();
		mt.start();

	}

}
