package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class JavaHashSet {
    public static void main(String[] args) {


        HashSet<Integer> set= new HashSet<>();

        // Maintains no insertion order
        set.add(34);
        set.add(343);
        set.add(43543);
        set.add(42);
        set.add(36);
        set.add(null);

        System.out.println(set); //[34,343, 43543, 42,36]

        set.remove(42);
        System.out.println(set);

        // Does not hold any duplicate values
        set.add(868);
        set.add(868);
        set.add(868);
        set.add(868);
        System.out.println(set);

        System.out.println("*** ******");

        // Traverse with Iterator

        Iterator iterator= set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        HashSet<Movies> moviesHashSet= new HashSet<>();

        Movies mv1= new Movies(1, "Titanic", 8.5);
        Movies mv2= new Movies(2,"Nothing Hill",8.0);
        Movies mv3= new Movies(3, "Avengers ", 7.5 );

        moviesHashSet.add(mv1);
        moviesHashSet.add(mv2);
        moviesHashSet.add(mv3);

        for (Movies m:moviesHashSet
             ) {
            System.out.println(m.id+ "  "+m.name+ "  "+ m.ratings);
        }

    }
}
