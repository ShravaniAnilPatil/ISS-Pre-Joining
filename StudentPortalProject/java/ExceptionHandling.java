public class ExceptionHandling {
    static void checkAge(int age){
            if(age<18){
                throw new ArithmeticException("Age must be 18 or above");
            } else {
                System.out.println("Age is valid");
            }
        }
        
    public static void main(String[] args) {
        try {
            System.out.println("Result: " + 10/0);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Try-Catch block completed");
        }
        checkAge(16);
        
    }
}
