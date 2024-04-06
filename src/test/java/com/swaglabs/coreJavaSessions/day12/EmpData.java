package day12;

public class EmpData {

    String emp_name; //non-static variable/data member

    static String companyName = "abc";


    public static void main(String[] args) {
        EmpData emp1 = new EmpData();
        emp1.emp_name = "Rama";
        System.out.println(emp1.emp_name + " "+ companyName);
        System.out.println(companyName);

        EmpData emp2 = new EmpData();
        emp2.emp_name = "Ramesh";
        System.out.println(emp2.emp_name + " "+ companyName);

    }

}
