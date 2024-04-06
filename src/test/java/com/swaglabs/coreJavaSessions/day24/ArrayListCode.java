package day24;

import java.util.ArrayList;

public class ArrayListCode {
    public static void main(String[] args) {

        /**
         * Declare ArrayList - Approach 1
         *
         */

        ArrayList obj = new ArrayList(); //Homo + Hetro

        /**
         * Declare ArrayList - Approach 2
         */
        ArrayList <String> obj1 = new ArrayList<>(); //Homo


        //Adding data to ArrayList
        obj.add("Java");
        obj.add(100);
        obj.add('M');
        obj.add(true);
        obj.add(12.4);

        //print
        System.out.println(obj);//[Java, 100, M, true, 12.4]

        //size of collection of ArrayList
        System.out.println(obj.size());//5

        //remove ele
        obj.remove(1);//[Java, M, true, 12.4]

        //print
        System.out.println(obj);


        //get method
        System.out.println(obj.get(0));//Java

        //set method
        obj.set(0, "Ruby");
        System.out.println(obj); //[Ruby, M, true, 12.4]

        obj.add(0, "Java");
        System.out.println(obj); //Java, Ruby, M, true, 12.4

        //contains() - To search element in arraylist
        System.out.println(obj.contains("Java")); //true false

        //isEmpty() -
        System.out.println(obj.isEmpty());

        //clear()
        obj.clear();
        System.out.println(obj); //[ ]


        System.out.println(obj.size()); //


    }
}
