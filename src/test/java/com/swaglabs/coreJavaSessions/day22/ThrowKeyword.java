package day22;

public class ThrowKeyword {

    static void checkMyAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access Denied");
        } else {
            System.out.println("Access Granted");
        }


    }

    public static void main(String[] args) {
        checkMyAge(19);
        System.out.println("Rest of the codes");
    }
}
