package day22;



public class ThrowsKeyword {

    static void checkMyAge(int age) throws ArithmeticException, IndexOutOfBoundsException, NullPointerException, NumberFormatException {
        if (age<18) {
            throw new ArithmeticException("Access Denied");

        }
        else {
            System.out.println("Access Granted...");
        }
    }

    public static void main(String[] args)  {

        try {
            checkMyAge(17);
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println("Test is done");
    }
}
