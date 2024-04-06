package com.swaglabs.coreJavaSessions.day19;

public class UnauthorizedUser {
    public static void main(String[] args) {
        day19.EmployeeData obj = new day19.EmployeeData();
        System.out.println(obj.getAadharNumber());
        System.out.println(obj.getEmpMobileNumber());
        System.out.println(obj.getEmpName());
    }
}
