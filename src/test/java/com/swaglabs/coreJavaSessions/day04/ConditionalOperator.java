package day04;

public class ConditionalOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

//        int result = (x > y) ? x : y;
//        System.out.println("Maximum value: " + result);

        int minimum = x < y ? x :y;
        System.out.println(minimum);
    }
}
