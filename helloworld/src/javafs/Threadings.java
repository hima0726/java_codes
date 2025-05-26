package javafs;

class about extends Thread {
    public void run() {
        for (int i = 2; i <= 9; i++) {
            System.out.println("from2: " + i);
        }
    }
}

class in extends Thread {
    public void run() {
        for (int i = 25; i >= 20; i--) {
            System.out.println("upto20: " + i);
        }
    }
}


public class Threadings {

	public static void main(String[] args) {
		about t1 = new about();
		in  t2 = new in ();

        t1.start(); // Starts Thread 1
        t2.start(); // Starts Thread 2


	}

}
