package day29;


import java.util.*;

public class CheckUnionOfTwoSets {
    public static void main(String[] args) {

        //Define two sets
        Set<Integer> set1 =  new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 =  new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);


        //Find the union of the sets
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        //Print the union set
        System.out.println("Union of set1 and sset2: "+ unionSet);

        set2.retainAll(set1);
        System.out.println(set2);
    }
}
