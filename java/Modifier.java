class College{
   private int age; 
   public String name;
   protected int marks;
   int rollNo; 
}
class Division extends College{
    void show(){
        System.out.println("Name: "+name); //accessible
        System.out.println("Marks: "+marks); //accessible
        System.out.println("Roll No: "+rollNo); //accessible
        //System.out.println("Age: "+age); //not accessible due to private access modifier
    }
}
public class Modifier {
    public static void main(String[] args) {
        Division d1 = new Division();
        d1.name = "A"; 
        d1.marks = 85; 
        d1.rollNo = 101; 
        //d1.age = 20; //not accessible due to private access modifier
        d1.show();
    }
}
