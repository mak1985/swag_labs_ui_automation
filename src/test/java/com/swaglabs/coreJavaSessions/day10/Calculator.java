package day10;

public class Calculator {
    /**
     * Syntax of method: modifier returntype methodname(Parameter/NoParameter)
     */

    //create a static method
    static void printMessage() // will return nothing
    {
        System.out.println("Welcome to coding world-static method");
    }

    //Non-static method
    void printMessage1() {
        System.out.println("Welcome to coding world - non-static method");
    }

    //method to sum two numbers - parameterized method
    static void sum(int a, int b) {
        System.out.println("Sum of a & b is :" + (a + b));
    }

    static int sum1(int a, int b) {
        return (a + b);
    }


    static int minimum(int a, int b) //parameterized method
    {
        if (a < b) //If a is smaller than b
            return a;
        else
            return b;

    }

    public static void main(String[] args) {
        //Calling static methods without creating an object
        printMessage();

        Calculator calc = new Calculator();
        calc.printMessage1(); //Creates an object to call non-static method

        sum(10, 20); // 10 & 20 as arguments passed to sum method


        System.out.println(sum1(10, 5));
        //int result = sum1(10,5);
        System.out.println(minimum(4, 8)); // calling from main method


    }
}
