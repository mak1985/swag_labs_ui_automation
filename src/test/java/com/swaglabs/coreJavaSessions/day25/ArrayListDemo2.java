package day25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        //Declare array list
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("S");
        obj.add("A");
        obj.add("M");

        //ArrayList obj3 = new ArrayList ();

        System.out.println(obj); //[S, A, M]

        //AddAll() - To add collection to different collection

        ArrayList<String> obj2 = new ArrayList<String>();
        obj2.add("Sam");

        obj2.addAll(obj);
        //obj.addAll(obj2);

        System.out.println("After adding col-1 into col-2" + obj2); // S, A, M, Sam

        //removeAll() - - To remove collection from different collection
        obj2.removeAll(obj);

        System.out.println("After removing col-1 from col-2" + obj2); //Sam
        System.out.println(obj); //[S, A, M]

        /**
         * How to use loop through elements of arrayList
         * 1. for loop
         * 2. for each loop(enhanced loop) (recommended)
         * 3. iterator
         */
        System.out.println("------------------------**********************---------------------------");

        for (int i = 0; i < obj.size(); i++) {
            System.out.println(obj.get(i));
        }

        System.out.println("------------------********for each loop(enhanced loop) (recommended)**************-----------------");

        for (String i : obj) {
            System.out.println(i);
        }

        System.out.println("------------------********iterator**************-----------------");

        Iterator it = obj.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        /**
         * How to sort arraylist using collections class
         */
        System.out.println("Before sorting :"+ obj); //[S, A, M]

        Collections.sort(obj);
        System.out.println("After sorting "+ obj); //[A, M, S]

        //sorting arraylist in reverse order
        Collections.sort(obj, Collections.reverseOrder());
        System.out.println("After reverse order sorting" + obj); //[S, M, A]

        //shuffle
        Collections.shuffle(obj);
        System.out.println("After shuffling" + obj);


        /**
         * How to create arrayList from array
         */
        //Create string array
        String cars[] = {"Honda", "BMW", "Fort"};

        ArrayList obj3 = new ArrayList(Arrays.asList(cars));
        System.out.println(obj3); //[Honda, BMW, Fort]
    }
}
