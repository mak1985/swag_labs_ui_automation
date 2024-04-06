package day03;

public class Operators {
    public static void main(String[] args) {

//        //Arithmetic Operators (+; -, *, %, /, ++ and --)
//
//        int a = 10;
//        int b = 20;
//
////        System.out.println(a+b); //30
////        System.out.println(a-b); //-10
////        System.out.println(a*b); //200
////        System.out.println(a/b);//0
////        System.out.println(a%b);//10
//
//        //Pre-Incremental operator ++ ( First increased then print the value
//        System.out.println(++a); //By default increase by +1 +10 = 11
//
//        //Post-Incremental operator ++ (First print then increase by 1
//        System.out.println(a++);//11
//        System.out.println(a); //12
//
//        //Pre-Decremental operator ++
//        System.out.println(--a); //11
//
//        //Post-Decremental operator
//        System.out.println(a--); //11
//        System.out.println(a); //10

        /**
         * Relational Operator (==; !=; >; <; >== <==)  a and b
         * The relation between two operands and returns the
         * boolean value either true or false results
         */
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println(a==b);//false
        System.out.println(a!=b);//true
        System.out.println(a>b);//false
        System.out.println(a<b);//true
        System.out.println(a>=b);//false
        System.out.println(a<=b);//true
        System.out.println(a==c);//false
        System.out.println(a + b + c);
    }
}
