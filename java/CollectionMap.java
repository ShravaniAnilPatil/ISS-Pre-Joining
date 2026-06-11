import java.util.*;

public class CollectionMap {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(1,"Shravani"); // put()
        map.put(2,"Siddhi");
        map.put(3,"Riya");

        System.out.println("Value for key 2: " + map.get(2)); // get()
        System.out.println("Has key 1? " + map.containsKey(1)); // containsKey()
        System.out.println("Contains value Riya: " + map.containsValue("Riya")); // containsValue()

        System.out.println("Size: " + map.size()); // size()

        map.remove(3); // remove()
        System.out.println("Updated Map:" + map);

        System.out.println("Traversing Map:"); // Traversal
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}