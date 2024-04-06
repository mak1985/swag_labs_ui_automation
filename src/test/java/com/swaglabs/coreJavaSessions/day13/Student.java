package day13;

public class Student {

    //class level variables
    int roll; //non-static
    String studentName;

    //static variable
    static String collegeName = "Jai Hind College";

    //Parameterized constructor
    Student(int rollno, String stuName){
        roll = rollno;
        studentName = stuName;
    }

    void display() {
        System.out.println(studentName + roll + collegeName);
    }

    //static method to change the value of college name
    static void changeValue() {
        collegeName = "Holy Cross College";
    }

    public static void main(String[] args) {
        Student obj = new Student(1, "Tom");
        Student obj2 = new Student(2, "Harry");

        obj.display(); //1, Tom  Jai Hind College
        obj2.display();//2, Harry  Jai Hind College

        changeValue(); //Holy Cross College
        System.out.println("After changed the college name");

        obj.display();//1, Tom  Holy Cross College
        obj2.display();
    }
}
