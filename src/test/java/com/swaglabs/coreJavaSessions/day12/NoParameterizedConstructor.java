package day12;

public class NoParameterizedConstructor {

    int x;

    //constructor without parameter
    NoParameterizedConstructor() {
        //initialize the variable
        x=10;

    }

    public static void main(String[] args) {
        NoParameterizedConstructor obj = new NoParameterizedConstructor();
        System.out.println(obj.x); //print the value of x

    }
}
