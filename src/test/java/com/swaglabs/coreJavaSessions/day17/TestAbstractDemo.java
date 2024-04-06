package day17;


abstract class BikeClass {
    //constructor
    BikeClass() {
        System.out.println("Bike Class created..");
    }

    //create static method
    static void stop() {

    }

    //create abstract method
    abstract void run();

    //create non-abstract method
    void start() {
        System.out.println("Bike started");
    }
}

class Tvs extends BikeClass {

    void run() {
        System.out.println("TVS child class run method implementation");
    }
}

class Honda extends BikeClass {

    void run() {
        System.out.println("Honda child class run method implementation");
    }
}

class Yamaha extends BikeClass {


    @Override
    void run() {
        System.out.println("Yamaha child class run method implementation");
    }
}


public class TestAbstractDemo {
    public static void main(String[] args) {
        BikeClass obj = new Tvs();
        obj.start(); //Non-static method of Bike class
        obj.run(); //abstract method
        BikeClass.stop(); //static method

        BikeClass obj1 = new Honda();
        obj1.start();
        obj1.run();
        BikeClass.stop();

        BikeClass obj2 = new Yamaha();
        obj2.start();
        obj2.run();
        BikeClass.stop();

    }
}
