package day15;


class GrandParent {
    int a;

    void display() {
        System.out.println("Class GrandParent: " + a);
    }
}

class Parent extends GrandParent {
    int b;

    void print() {
        System.out.println("Class Parent: " + b);
    }
}

class Child extends Parent {
    int c;

    void show() {
        System.out.println("Class Child:" + c);
    }
}


public class MultiLevelInheritance {
    public static void main(String[] args) {
        Child objC = new Child();
        objC.a = 10; //Class GrandParent
        objC.b = 20; //class Parent
        objC.c = 30; //class Child

        objC.display();//Class GrandParent
        objC.print();//class Parent
        objC.show(); //class Child
    }


}
