package com.bridgelabz;

public class EmployeeWages {
    public static void main(String[] args) {
        System.out.println("Program to calculate monthly wages of employees.");
        int ratePerHour=20;
        int partTimeHour=4,fullTimeHour=8,totalWorkingDay=30, monthlyWages;
        int checkAttendance= (int) Math.floor(Math.random()*10)%3;
        switch(checkAttendance)
        {
            case 1:
                monthlyWages=ratePerHour*fullTimeHour*totalWorkingDay;
                System.out.println("Daily wages of full time employee: " + monthlyWages);
                break;
            case 2:
                monthlyWages=ratePerHour*partTimeHour*totalWorkingDay;
                System.out.println("Daily wages of part time employee: " + monthlyWages);
                break;
            default:
                System.out.println("Employee is absent.");
        }
    }
}
