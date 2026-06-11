class Base{
 final int display(){ //final method
        return 1;
    }
}
final class Derived extends Base{
    //int display(){ //error: cannot override final method display in Base
    //    return 0;
    //}
}
// class subDerived extends Derived{ //error: cannot inherit from final class Derived
    
// }
public class Final {
    public static void main(String[] args) {
        final int a = 10; //final variable
        //a = 20; //error: cannot assign a value to final variable a
        System.out.println("Value of a: " + a);
    }
}
