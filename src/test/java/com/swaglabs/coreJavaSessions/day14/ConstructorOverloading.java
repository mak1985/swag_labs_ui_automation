package day14;

public class ConstructorOverloading {

    ConstructorOverloading(int x) {
        System.out.println(x);
    }

    ConstructorOverloading(double x) {
        System.out.println(x);
    }

    ConstructorOverloading(double x, double y) {
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading(10);
        ConstructorOverloading obj2 = new ConstructorOverloading(10.0);
        ConstructorOverloading obj3 = new ConstructorOverloading(10.0, 20.0);
    }

}
