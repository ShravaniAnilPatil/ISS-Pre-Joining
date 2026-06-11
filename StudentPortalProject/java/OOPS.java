//Inheritance, Polymorphism, Encapsulation, Abstraction
class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
    @Override
    void eat(){ // run time polymorphism- Method overriding
        System.out.println("Dog is eating");
    }
}
class Maths{
    int add(int a, int b){ //compile time polymorphism- method overloading
        return a+b;
    }
    int add(int a, int b, int c ){
        return a+b+c;
    }
}
class Student{  //Encapsulation
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
abstract class Shape{ //Abstraction
    abstract void area();
}
class Square extends Shape{
    int side;
    Square(int side){
        this.side=side;
    }
    void area(){
        System.out.println("Area of square is: "+side*side);
    }
}
public class OOPS{
    public static void main(String[] args){
        Dog d1= new Dog();
        d1.eat(); 
        d1.bark(); 
        Maths m1= new Maths();
        System.out.println("Sum of 2 integers: "+m1.add(5,10));
        System.out.println("Sum of 3 integers: "+m1.add(5,10,15));
        Student s1= new Student();
        s1.setName("Shravani Anil Patil");
        System.out.println("Name of student is: "+s1.getName());
        Shape sh1= new Square(5);
        sh1.area();
    }
}