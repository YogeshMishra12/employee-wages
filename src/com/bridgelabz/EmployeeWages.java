package com.bridgelabz;

public class EmployeeWages {
    public static void main(String[] args) {
        System.out.println("Program to calculate daily wages.");
        int ratePerHour=20;
        int workingHour=8,dailyWages;
        int checkAttendance= (int) Math.floor(Math.random()*10)%2;
        if(checkAttendance==0)
        {
            dailyWages=ratePerHour*workingHour;
            System.out.println("Daily wages of employee: " + dailyWages);
        }
        else
            System.out.println("Employee is absent");
    }
}
