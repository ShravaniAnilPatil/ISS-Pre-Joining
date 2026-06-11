import java.util.*;

public class CollectionList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Mango");
        list.add("Guava");
        list.add("Kiwi");

        System.out.println(list);

        System.out.println("Element at index 1: " + list.get(1)); // get()

        list.set(1, "Apple"); // set()
        System.out.println("After set(): " + list);

        System.out.println("Contains Mango? " + list.contains("Mango")); // contains()

        System.out.println("Size: " + list.size()); // size()

        list.clear(); // clear()
        System.out.println("After clear(): " + list); 
    }
}