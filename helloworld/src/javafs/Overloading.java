package javafs;


class parameter {
    void display(int a) {
        System.out.println("One parameter: " + a);
    }

    void display(int a, int b) {
        System.out.println("Two parameters: " + a + ", " + b);
    }
    public class Overloading{
    public static void main(String[] args) {
    	parameter obj = new parameter();
        obj.display(10);
        obj.display(10, 20);
    }
}
}

