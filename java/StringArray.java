public class StringArray {
    public static void main(String args []){
        //  String 
        String name1 = "Shravani Patil"; // String literal

        // String cannot be changed after creation
        String name2 = new String("Shravani Patil");

        // Common String methods
        System.out.println(name1.length());
        System.out.println(name1.toUpperCase());
        System.out.println(name1.charAt(4));
        System.out.println(name1.toLowerCase());
        System.out.println(name1 == name2); // false, because they are different objects in memory
        System.out.println(name1.equals(name2));

        // Substring
        System.out.println(name1.substring(3));
        System.out.println(name1.substring(1,4)); // from index 1 to 3

        // # Array
        int [] marks = new int[6]; //define an array of size 6 with default values 0
        int [] marks2 = {80, 95, 86, 90, 98, 89}; // intialize
        System.out.println(marks2[0]);
        System.out.println(marks2[1]);
        System.out.println((marks2.length));
    }
}