package day15;

class A {   //parent class

    int a;

    void display() {
        System.out.println("Class A : + a");
    }

    void display1() {
        System.out.println("Class A : + a");
    }

    void display2() {
        System.out.println("Class A : + a");
    }
}

class B extends A {
    int b;

    void print() {
        System.out.println("Class B: " + b);
    }
}

public class SingleLevelInheritance {

    public static void main(String[] args) {
//        A objA = new A();
//        objA.a = 20; //Class A
//        objA.display(); // Class A
//
//        B objB = new B();
//        objB.print(); ////Class B
//        objB.b = 30; //Class B
//
//        objB.display();
//        objB.display1();
//        objB.display2();
//
//        objA.display();
//        objA.display1();
//        objA.display2();
//
//        objB.a = 30;

        B objB = new B();
        objB.a = 10;
        objB.b = 20;
        objB.print();
        objB.display1();
        objB.display2();


    }

}
