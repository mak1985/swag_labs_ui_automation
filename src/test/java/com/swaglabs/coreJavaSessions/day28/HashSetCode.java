package day28;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCode {
    public static void main(String[] args) {
        //Declare HashSet
        HashSet <Integer> numbers = new HashSet<>();

        /**
         * Syntax
         * HashSet <AnyDataType> obj = new HashSet<>();
         */

        HashSet hs = new HashSet<>();

        //insert element
        hs.add("Apple Phone");
        hs.add("Nokia Phone");
        hs.add("Samsung Phone");
        hs.add("Test1");
        hs.add("Test2");
        hs.add("Test3");
        hs.add("Test4");
        hs.add(null);

        System.out.println(hs);
        hs.remove("Apple Phone");
        System.out.println(hs); //[Test1, Apple Phone, Nokia Phone, Samsung Phone, Test4, Test3, Test2]


        System.out.println("************************");

        //Read element of HashSet
        for(Object e: hs) {
            System.out.println(e);
        }

        System.out.println("************************");
        //Iterator
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
