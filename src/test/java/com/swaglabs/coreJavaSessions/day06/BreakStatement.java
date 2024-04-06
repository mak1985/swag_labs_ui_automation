package day06;

public class BreakStatement {
    public static void main(String[] args) {

        for (int i = 1; i <=5; i++) {
            if (i==3)
                break; //Exit from the loop
            System.out.println(i);
        }
    }
}
