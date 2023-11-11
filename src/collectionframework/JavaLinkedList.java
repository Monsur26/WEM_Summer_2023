package collectionframework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JavaLinkedList {
    public static void main(String[] args) {


        LinkedList<String> list = new LinkedList();

        // Adding value
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");

        list.remove(1);

        System.out.println(list);
        System.out.println(list.size() + "\n");


        list.addFirst("Zero");
        list.addLast("nTH");

        System.out.println(list);

        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());

        System.out.println(list);


        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("********* ************ **********");

        Iterator iterator= list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("******** ********** **********");
        List<Movies> moviesList= new LinkedList<>();

        Movies mv1= new Movies(1, "Titanic", 8.5);
        Movies mv2= new Movies(2,"Nothing Hill",8.0);
        Movies mv3= new Movies(3, "Avengers ", 7.5 );

        moviesList.add(mv1);
        moviesList.add(mv2);
        moviesList.add(mv3);

        for (Movies m:moviesList
             ) {
            System.out.println(m.id + "    "+m.name+ "            "+ m.ratings );
        }
    }
}
