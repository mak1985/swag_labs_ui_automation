package day27;

import java.util.LinkedList;

public class linkedListDemo {
    public static void main(String[] args) {
        //Declare linkedlist

        //collection1
        LinkedList<String> list = new LinkedList<>();
        list.add("John");
        list.add("Paul");
        list.add("Sam");
        System.out.println(list); //[John, Paul, Sam]
        list.add(1, "Rocky");

        //collection2
        LinkedList <String> list2 = new LinkedList<>();
        list2.add("Tom");
        list2.add("Harry");
        list2.add("Peter");

        //Add collection list2 to the end of collection list
        list.addAll(list2);
        System.out.println("After adding collection2 to collection1" + list); //After adding collection2 to collection1[John, Rocky, Paul, Sam, Tom, Harry, Peter]

        //Remove method
        list.remove("John");
        System.out.println("After removing John from collection" + list); //[Rocky, Paul, Sam, Tom, Harry, Peter]

        list.remove(2);
        System.out.println("After removing Sam from collection" + list);//[Rocky, Paul, Tom, Harry, Peter]

        //RemoveAll method - remove collection2 from collection1
        list.removeAll(list2);

        System.out.println("After removing collection 2 from collection1" + list);//Rocky, Paul

        //get
        System.out.println("Element at 1st position is:" + list.get(1));

        //set method
        list.set(0, "Makhan");
        System.out.println("After replacing with other element:"+ list);


    }
}
