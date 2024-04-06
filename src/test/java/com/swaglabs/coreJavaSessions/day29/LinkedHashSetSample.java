package day29;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetSample {
    public static void main(String[] args) {

        //Create an object of LinkedHashSet
        LinkedHashSet <Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(4);
        linkedHashSet.add(5);
        linkedHashSet.add(50);
        linkedHashSet.add(null);
        linkedHashSet.add(50);

        System.out.println(linkedHashSet); //Insertion order maintained in LinkedHashSet

        //LinkedHashSet linkedHashSet1 = new LinkedHashSet();

        HashSet hashSet = new HashSet();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(50);
        hashSet.add(null);


        System.out.println(hashSet); //Insertion order NOT maintained in HashSet

    }
}
