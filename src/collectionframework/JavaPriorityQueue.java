package collectionframework;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class JavaPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> queue= new PriorityQueue();

        // Adding values to Queue
        queue.add(3);
        queue.add(6);
        queue.add(7);
        queue.add(90);
        queue.add(321);
        queue.add(764);
        queue.add(33454);
        queue.add(3455);
        queue.add(4545);


        System.out.println(queue);
        // First in First OUT (remove operation)
        queue.remove();
        System.out.println(queue);

        // specific values gets removed
        queue.remove(90);
        System.out.println(queue);

        // poll() retrieves the first element and removes it
        queue.poll();
        System.out.println(queue);

        // peek() only retrieves the first element
        System.out.println(queue.peek());
        System.out.println(queue);


        //Traversing a queue
        for (int m:queue
             ) {
            System.out.println(m);
        }
        System.out.println("********** ************ **********");
        //Using Iterator
        Iterator iterator=queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("***** ******* *********");

/*        Queue<Movies> moviesQueue= new PriorityQueue<Movies>();

        Movies mv1= new Movies(1, "Harry Potter", 7.1);
        Movies mv2= new Movies(2, "Baby Driver", 7.8);
        Movies mv3= new Movies(3, "Frozen", 7.4);



        moviesQueue.add(mv1);
        moviesQueue.add(mv2);
        moviesQueue.add(mv3);

        for (Movies m:moviesQueue
             ) {
            System.out.println(m.id+ "   "+ m.name+ "     "+m.ratings);
        }*/
    }
}
