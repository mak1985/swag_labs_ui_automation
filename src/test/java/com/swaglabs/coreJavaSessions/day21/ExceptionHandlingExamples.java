package day21;

public class ExceptionHandlingExamples {
    public static void main(String[] args) {

        /**
         * NumberFormatException
         */


        try {
            String s = "Test";
            int number = Integer.parseInt(s);
            System.out.println(number);
        }
        catch (Exception e) {
            System.out.println("Exception handled");
        }
        finally {
            System.out.println("Optional block but will execute always");
        }
    }
}
