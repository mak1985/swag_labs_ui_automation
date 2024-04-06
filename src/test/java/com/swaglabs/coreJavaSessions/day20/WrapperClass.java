package day20;

public class WrapperClass {
    public static void main(String[] args) {
        int y = 10;
        String str = "2000";
        y = Integer.parseInt(str); //Object to primitive conversion
        System.out.println(y); //2000

        double d;
        String str1 = "3.14";
        d = Double.parseDouble(str1); //Object to primitive conversion
        System.out.println(d); //3.14

        //Primitive to Object conversion
        int i = 10;
        Integer b = Integer.valueOf(i);
        System.out.println(b);


    }
}
