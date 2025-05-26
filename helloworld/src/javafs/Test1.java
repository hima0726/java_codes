package javafs;
class Student {
    String name;
    int age;
    char grade;
    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Hima";
        s1.age = 23;
        s1.grade = 'A';
        s1.displayDetails();

        Student s2 = new Student();
        s2.name = "Bindu";
        s2.age = 24;
        s2.grade = 'B';
        s2.displayDetails();
    }
}

