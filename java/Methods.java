class Student{ 
    int age; 
    String name;
    int marks;
    void display(){ 
        System.out.println("Name of student is "+name+" and age is "+age);
    }
    int result(int marks){ 
        if(marks>=35){
            return 1; //pass
        }
        else{
            return 0; //fail
        }
    }
}

public class Methods {
    public static void main(String[] args){
        Student s1= new Student();
        s1.age=22;
        s1.name="Shravani Anil Patil"; 
        s1.marks=85;
        s1.display();
        System.out.println("Result for student 1 is "+s1.result(s1.marks));
    }

}
