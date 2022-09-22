package com.bridgelabz;

public class EmployeeWages {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wages program.");
        int checkAttendance= (int) Math.floor(Math.random()*10)%2;
        if(checkAttendance==0)
            System.out.println("Employee is present.");
        else
            System.out.println("Employee is absent");
    }
}
