
import java.util.*;

public class CollectionSet {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        // add()
        set.add("Dog");
        set.add("Cat");
        set.add("Rabbit"); // Duplicate

        System.out.println("After add(): " + set);
        System.out.println(set.contains("Rabbit")); // contains()

        System.out.println("Size: " + set.size());
        set.remove("Dog");
        System.out.println("After remove(): " + set);

        System.out.println("Traversing Set:"); // Traversal
        for(String lang : set){
            System.out.println(lang);
        }

        System.out.println("Is Empty? " + set.isEmpty()); // isEmpty()
       
    }
}