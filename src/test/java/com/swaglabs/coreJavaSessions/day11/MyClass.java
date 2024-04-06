package day11;

public class MyClass {

    // Public method accessible from any other class
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    //Private variable accessible only within this class
    private int privateVariable = 10;

    //Private variable accessible only within this class
    private void privateMethod(){
        System.out.println("This is a private method");
    }

    //Default accessible within the same package
    void defaultMethod(){
        System.out.println("This is a default method");
    }
}
