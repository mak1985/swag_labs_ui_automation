package day13;

public class StaticBlock {

    void m1(){
        System.out.println("This is a non static method");
    }

    public static void main(String[] args) {
        m2();
        StaticBlock s = new StaticBlock();
        s.m1();
        System.out.println("This is main method");

    }

    static {
        System.out.println("This is a static block"); //1st
    }

    static void m2(){
        System.out.println("This is a static method");
    }

}
