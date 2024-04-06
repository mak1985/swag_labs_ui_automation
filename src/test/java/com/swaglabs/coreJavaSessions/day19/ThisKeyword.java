package day19;

public class ThisKeyword {

    private int x; //instance variable

    public ThisKeyword(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword(10);
        obj.show();//
    }

    public void show() {
        int x = 21; //local variable
        System.out.println(this.x);
    }
}
