package day08;

public class StringOperations {
    public static void main(String[] args) {

        String s = "hello Java World";
        String s1 = "";

        //charAt()
        System.out.println(s.charAt(6)); //J

        //length()
        System.out.println(s.length()); //10

        //toLowerCase()
        System.out.println(s.toLowerCase()); //hellojava

        //toUpperCase()
        System.out.println(s.toUpperCase()); //HELLOJAVA

        //replace()
        System.out.println(s.replace('l', 'L'));

        //indexOf()
        System.out.println(s.indexOf('l'));//8

        //subString()
        System.out.println(s.substring(1)); //ello Java

        //isEmpty()
        System.out.println(s1.isEmpty());

        //contains()

        s1 = "Do you know me?";
        System.out.println(s1.contains("me?"));

        //startWith()
        String name = "Welcome to Java Programming World! John";
        System.out.println(name.startsWith("Welcome to Java Programming World!"));

        //endWith()
        System.out.println(name.endsWith("John"));

        //equals()
        String b1 = "Welcome";
        String b2 = "WeLcome";

        System.out.println("Is b1 equals to b2?  :" + b1.equals(b2)); //false

        //equalsIgnoreCase()
        System.out.println(b1.equalsIgnoreCase(b2)); //true

        //concatenates()
        b1 = "Rocky";
        b2 = "Paul";
        System.out.println(b1 + b2);//RockyPaul
        System.out.println(b1.concat(b2)); //RockyPaul
        System.out.println(b1.concat("Paul"));//RockyPaul
    }
}
