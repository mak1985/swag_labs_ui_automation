package day28;

import java.util.HashSet;

public class HashSetCode2 {
    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(2);
        set1.add(4);
        set1.add(6);
        set1.add(8);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
//
//        //Union of two sets 1 & 2
//        set2.addAll(set1);
//        System.out.println("Union is: " +set2); //[0, 1, 2, 3, 4, 5, 6, 8]
//
//
//        //common elements from both the collections
//        set2.retainAll(set1);
//        System.out.println("Intersection is:  " + set2); // [0, 2, 4, 6, 8]
//
        //difference of set 1 and set2
        set1.removeAll(set2);
        System.out.println(set1);

    }
}
