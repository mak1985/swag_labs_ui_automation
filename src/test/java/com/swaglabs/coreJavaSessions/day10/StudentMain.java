package com.swaglabs.coreJavaSessions.day10;

public class StudentMain {
    public static void main(String[] args) {

        //Create an object of Student2 class
        day10.Student2 obj1 = new day10.Student2();
        day10.Student2 obj2 = new day10.Student2();

        //initialize an object
        obj1.insertRecord("John", 1);
        obj2.insertRecord("Paul", 2);

        //print student info
        obj1.displayInfo();
        obj2.displayInfo();

    }
}
