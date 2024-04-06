package day09;

public class Students1 {
    /**
     * Creating an object and storing date - using reference variable
     */
    //instance variables
    String schoolName;
    int fees;

    //method to display information
     void displayInfo(){
        System.out.println(schoolName);
        System.out.println(fees);
    }

    static void play(){
        System.out.println("Test");
    }

    public static void main(String[] args) {
        Students1 student1 = new Students1(); //Created an Object

        //initialize object/store data to the object student1
        student1.fees = 10000;
        student1.schoolName="Holy Cross";

        // Print info of student1
        student1.displayInfo();
        Students1.play();

    }
}
