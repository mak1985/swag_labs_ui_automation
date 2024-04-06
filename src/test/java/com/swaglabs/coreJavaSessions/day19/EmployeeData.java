package day19;

public class EmployeeData {

    private int aadharNumber;
    private String empName;
    private int empMobileNumber;
    private String empLocation;

    public static void main(String[] args) {
        EmployeeData obj = new EmployeeData();

        obj.setAadharNumber(1457545828);
        //obj.setEmpMobileNumber(983334667);
        obj.setEmpName("Tom Peter");

        System.out.println("Read aadhar number: " + obj.getAadharNumber());
        System.out.println("Read emp name: " + obj.getEmpName());
        System.out.println("Read emp mobile number" + obj.getEmpMobileNumber());
    }

    public String getEmpLocation() {
        return empLocation;
    }

    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }

    public int getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(int aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpMobileNumber() {
        return empMobileNumber;
    }

    public void setEmpMobileNumber(int empMobileNumber) {
        this.empMobileNumber = empMobileNumber;
    }
}
