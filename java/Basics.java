class Student{ //Class- blueprint of an object
    int age; 
    String name;
}
public class Basics{
public static void main(String[] args){
    Student s1= new Student(); //object of class Student
    Student s2= new Student();
    s1.age=22;
    s1.name="Shravani Anil Patil"; 
    s2.age=23;
    s2.name="Krishna"; //state of object s2
    System.out.println("Name of student 1 is "+s1.name+" and age is "+s1.age);
    System.out.println("Name of student 2 is "+s2.name+" and age is "+s2.age);
}
}