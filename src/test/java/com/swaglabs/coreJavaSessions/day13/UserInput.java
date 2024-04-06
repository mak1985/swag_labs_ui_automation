package day13;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        System.out.println("Enter username, age, salary");

        //create an object of Scanner class
        Scanner obj = new Scanner(System.in);

        //String input for username
        String name = obj.nextLine();
        int age = obj.nextInt();
        double salary = obj.nextDouble();

        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("salary is: " + salary);

    }
}
