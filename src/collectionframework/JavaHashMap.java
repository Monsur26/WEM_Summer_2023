package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {
    public static void main(String[] args) {
        // Everything is defined in terms of key value <K, V>

        Map<Integer, String> map= new HashMap();

        map.put(100,"Basic Java");
        map.put(200,"Object Oriented Programming");
        map.put(300,"DSA and Problem Solving");
        map.put(400,"Advanced Programming");
        map.put(500,"Capstone Project");

        System.out.println(map.get(200));
        // removes value in terms of key
        map.remove(500);

        // Replace value
        map.replace(100, "Basic Java", "Core Java");



        Map<String, String> map2= new HashMap();

        map2.put("Action Movie", "IP Man");
        map2.put("Comedy Movie", "Rush Hour");
        map2.put("Romantic Movie", "Fools Rush In");

        System.out.println(map2.get("Action Movie"));
        
        
        // Traversing through a map
        for (Map.Entry m:map.entrySet()
             ) {
            System.out.println(m.getKey() + " "+ m.getValue() );
        }
    }
}
