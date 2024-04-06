package day06;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 1; i <=5; i++) {
            if (i==3)
                continue; //skip the below immediate line of code
            System.out.println(i); //1, 2, 4, 5
        }
    }
}
