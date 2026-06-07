class Student{
    int age; 
    String name;
    Student(){ //default constructor 
        System.out.println("Constructor is called");
    }
    Student(int a, String n){ //parameterized constructor
        age=a;
        name=n;
        System.out.println("Parameterized constructor is called");
    }
}
public class Constructors {
    public static void main(String[] args){
        Student s1= new Student(); 
        s1.age=22;
        s1.name="Shravani Anil Patil"; 
        System.out.println("Name of student 1 is "+s1.name+" and age is "+s1.age);
        
        Student s2= new Student(23, "Krishna"); //parameterized constructor
        System.out.println("Name of student 2 is "+s2.name+" and age is "+s2.age);
    }
}