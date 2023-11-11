package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaArrayList {
    public static void main(String[] args) {
        // Creating an array list with specific object type
        ArrayList<Integer> list1= new ArrayList();

        // adding object to a list -- without specifying an index
        list1.add(9);
        list1.add(10);
        list1.add(11);
        list1.add(12);

        // adding object to a list --  specifying an index
        list1.add(2,87);

        // change a value at a specific index
        list1.set(4,56);

        //Delete a specific value
        list1.remove(3);

        System.out.println(list1);
        System.out.println(list1.size());

        //traverse through the list using for loop
        for (int i = 0; i <list1.size() ; i++) {
            System.out.println(list1.get(i));
        }
        System.out.println("__________________________________________________");
        // Traversing using for each loop
        for (int a:list1) {
            System.out.println(a);
        }

        System.out.println("_____________________________________________________");
        // Traverse the list through iterator
        Iterator iterator= list1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List<Movies> list = new ArrayList<Movies>();

        Movies mv1= new Movies(1, "Fight Club", 8.5);
        Movies mv2= new Movies(2, "IP Man", 8.0);
        Movies mv3= new Movies(3, "Lake House", 9.0);

        list.add(mv1);
        list.add(mv2);
        list.add(mv3);

        System.out.println("****************** ******************** ****************");

        //Traverse through the objects
        for (Movies m: list) {
            System.out.println(m.id+ " " + m.name+ " "+ m.ratings );
        }
    }
}
