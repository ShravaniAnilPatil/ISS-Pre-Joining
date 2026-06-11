class Student{ //Class- blueprint of an object
    int age; 
    String name; //string in java
    int[] marks; //array to store marks of student
}
public class Basics{
public static void main(String[] args){
    Student s1= new Student(); //object of class Student
    Student s2= new Student();
    s1.age=22;
    s1.name="Shravani Anil Patil"; 
    s1.marks=new int[]{85,90,78};
    s2.age=23;
    s2.name="Krishna"; //state of object s2
    s2.marks=new int[]{88,92,80};
    System.out.println("Name of student 1 is "+s1.name+" and age is "+s1.age);
    System.out.println("Name of student 2 is "+s2.name+" and age is "+s2.age);
    System.out.println("Marks of student 1 are: "+java.util.Arrays.toString(s1.marks));
    System.out.println("Marks of student 2 are: "+java.util.Arrays.toString(s2.marks));
}
}