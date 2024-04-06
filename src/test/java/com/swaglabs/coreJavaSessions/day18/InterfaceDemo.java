package day18;

interface ShowName{
   void showName(String name); //methods are abstract by default and public(modifier)

}

interface ShowAge extends ShowName{
    void showAge(int age);
}



public class InterfaceDemo implements ShowAge {
    public void showName(String name) {
        System.out.println("name is: "+ name);
    }


    public void showAge(int age) {
        System.out.println("name is: "+ age);
    }


    public static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();
        obj.showName("John");
        obj.showAge(20);
    }

}
