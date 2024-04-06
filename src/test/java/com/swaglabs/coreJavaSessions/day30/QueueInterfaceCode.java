package day30;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueInterfaceCode {
    public static void main(String[] args) {
        //Create priority queue
        PriorityQueue queue = new PriorityQueue();

        queue.add(99);
        queue.add(20);
        queue.add(30);
        queue.add(40);


        System.out.println(queue); //[10, 20, 30, 40]

        //offer method
        queue.offer(60);
        System.out.println(queue);

        //clear
  //Access

        //System.out.println(queue.element()); //Exception

        //peek method
        //System.out.println(queue.peek());//null


        //queue.clear();

        //Remove methods - poll & remove
//        System.out.println(queue.remove());
//        System.out.println(queue);

//        queue.clear();

//        System.out.println(queue.poll()); //[20, 40, 30, 99, 60]
//        System.out.println(queue);

        //**************************************************************************
        /**
         * Read elements of PriorityQueue
         */
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("*******************for loop*************************");

        /*
        read elements using for each loop
         */
        for(Object e: queue) {
            System.out.println(e);
        }
    }
}
