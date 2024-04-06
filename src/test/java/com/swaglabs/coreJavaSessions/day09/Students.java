package day09;

import day08.StringOperations;

public class Students {
    int roll; //data member(also instance variable)
    String name; //data member(also instance variable)
    double marks;
    boolean IsAvailTransport;

    char test;

    Students(){

    }

    public static void main(String[] args) {

        /**
         * Create an object
         */

        Students obj1 = new Students();

        System.out.println(obj1.roll); //0
        System.out.println(obj1.name); //null
        System.out.println(obj1.marks);
        System.out.println(obj1.IsAvailTransport);
        System.out.println(obj1.test);


    }
}
