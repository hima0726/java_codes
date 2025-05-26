package javafs;

class Rectangle {
    int length, width;
    int area() {
        return length * width;
    }
    int perimeter() {
        return 2 * (length + width);
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.width = 5;
        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());

        Rectangle r2 = new Rectangle();
        r2.length = 6;
        r2.width = 3;
        System.out.println("Area: " + r2.area());
        System.out.println("Perimeter: " + r2.perimeter());
    }
}

