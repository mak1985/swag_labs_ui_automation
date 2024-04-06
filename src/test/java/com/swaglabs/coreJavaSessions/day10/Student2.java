package day10;

public class Student2 {

    //instance variables
    String name;
    int rollno;

    //method to insert record
    public void insertRecord(String studentName, int studentRollNumber) {

        name = studentName;


        rollno = studentRollNumber;
    }

    //method 2 to display information
    public void displayInfo() {
        System.out.println(name);
        System.out.println(rollno);
    }

}
