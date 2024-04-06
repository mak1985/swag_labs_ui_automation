package day23;

class A extends Thread {

    public void run() { //pre-defined function in Thread class

        for (int i = 1; i <= 5; i++) {
            System.out.println("Class day23.A" + i);
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Class day23.B" + i);
        }
    }
}


public class MultiThreadingExample {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        a1.run();
        b1.run();
    }
}
