package day14;

public class MethodOverloading {

    void add(int a, int b) {
        System.out.println("1st method " + (a+b));
    }

    void add(double a, double b) {
        System.out.println("2nd method " + (a+b));
    }

    void add (int a, double b) {
        System.out.println("3rd method " + (a+b));
    }

    void add(int a, int b, int c){
        System.out.println("4th method " + (a+b+c));
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.add(10, 20);
        obj.add(10, 20.0);
        obj.add(10.0, 20.0);
        obj.add(10, 20, 30);
    }

}
