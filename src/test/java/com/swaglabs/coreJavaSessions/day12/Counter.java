package day12;

public class Counter {

    //class variables

    //int count = 0; // non-static member variable

    static int count = 0;

    Counter() {
        count++; //incre by 1
        System.out.println(count);
    }


    public static void main(String[] args) {
        Counter obj = new Counter();
//        System.out.println(obj.count);

    }
}
