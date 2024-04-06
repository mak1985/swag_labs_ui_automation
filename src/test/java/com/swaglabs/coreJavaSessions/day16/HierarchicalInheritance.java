package day16;

class Parent{
    int a;

    void display(){
        System.out.println("Class Parent: "+ a);
    }
}

class Child1 extends Parent{
    int b;

    void displayChild1(){
        System.out.println("Class Child1: "+ b);
    }
}

class Child2 extends Parent{
    int c;

    void displayChild2(){
        System.out.println("Class Child2: "+ c);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.a = 10;
        c1.b = 20;

        c1.display();
        c1.displayChild1();

        Child2 c2 = new Child2();
        c2.a = 15;
        c2.c = 20;

        c2.display();
        c2.displayChild2();
    }
}
