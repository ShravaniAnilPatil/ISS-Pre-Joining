class Student{
    int age; //instance variable
    String name; //instance variable
    static char division= 'A'; //static variable
}

public class Variable {
    public static void main(String[] args) {
        int a = 10; //integer variable and local variable
        String name = "John"; // String variable
        double pi = 3.14; //double variable
        boolean isTrue = true; //boolean variable
        float f = 3.14f; //float variable
        char grade = 'A'; //char variable

        System.out.println("Value of a: " + a);
        System.out.println("Name: " + name);
        System.out.println("Value of pi: " + pi);
        System.out.println("isTrue: " + isTrue);
        System.out.println("Value of f: " + f);
        System.out.println("Grade: " + grade);
        Student s1 = new Student();
        System.out.println("Student division: " + Student.division); //accessing static variable using class name
    }
}
