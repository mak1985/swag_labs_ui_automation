package day27;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        //Create linkedList
        LinkedList <String> cars = new LinkedList<>();
        cars.add("Maruti");
        cars.add("Honda");
        cars.add("Hyundai");

        System.out.println("Before addFirst method implementation" + cars);

        //addFirst()
        cars.addFirst("BMW");
        System.out.println("After using AddFirst()" + cars);

        //addLast()
        cars.addLast("Jeep");
        System.out.println("After using addLast()" + cars);

        //removeFirst()
        cars.removeFirst();
        System.out.println("After using removeFirst: " + cars); //[Maruti, Honda, Hyundai, Jeep]

        //removeLast()
        cars.removeLast();
        System.out.println("After using removeLast: " + cars); //[Maruti, Honda, Hyundai]

        //getFirst() & getLast()
        System.out.println("getFirst method: " + cars.getFirst());//Maruti
        System.out.println("getLast method : " + cars.getLast() ); //Hyundai

        //push method - stack operations
        cars.add("Maruti");
        cars.add("Honda");
        cars.add("BMW");
        System.out.println("Before using push method " + cars); //[Maruti, Honda, Hyundai, Maruti, Honda, BMW]

        //push method
        cars.push("Damage Car");
        System.out.println("After using push method : "+ cars); //[Damage Car, Maruti, Honda, Hyundai, Maruti, Honda, BMW]

        //pop method
        System.out.println("pop method: "+ cars.pop()); //Damage Car
        System.out.println(cars); //[Maruti, Honda, Hyundai, Maruti, Honda, BMW]

        //peek method
        System.out.println("peek method: " +cars.peek());//[Maruti

        //peekfirst & peekLast
        System.out.println(cars.peekFirst());//Maruti
        System.out.println(cars.peekLast());//BMW

        //for each loop
        for (Object e: cars) {
            System.out.println(e);
        }
        System.out.println("***************************************************");
        for (int i = 0; i <cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("***************************************************");
        Iterator it = cars.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());

        }
    }
}
