package com.bridgelabz;

public class EmployeeWages {
    public static void main(String[] args) {
        System.out.println("Program to add part time employee.");
        int ratePerHour=20;
        int partTimeHour=4,dailyWages;
        int checkAttendance= (int) Math.floor(Math.random()*10)%2;
        if(checkAttendance==0)
        {
            dailyWages=ratePerHour*partTimeHour;
            System.out.println("Daily wages of part time employee: " + dailyWages);
        }
        else
            System.out.println("Employee is absent");
    }
}
