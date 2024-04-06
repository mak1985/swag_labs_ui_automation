package day12;

public class ParameterizedConstructor {

    String car;
    int yearBuilt;

    //constructor with parameters
    ParameterizedConstructor(String carName, int yr){
        //initialize attributes
        car = carName;
        yearBuilt = yr;

    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor("HondaCity", 2020);
        System.out.println(obj.car + " " +obj.yearBuilt);

    }
}
