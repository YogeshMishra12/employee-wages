package com.bridgelabz;

public class EmployeeWages {
    public static void main(String[] args) {
        System.out.println("Program to calculate employee wages using switch cases.");
        int ratePerHour=20;
        int partTimeHour=4,fullTimeHour=8,dailyWages;
        int checkAttendance= (int) Math.floor(Math.random()*10)%3;
        switch(checkAttendance)
        {
            case 1:
                dailyWages=ratePerHour*fullTimeHour;
                System.out.println("Daily wages of full time employee: " + dailyWages);
                break;
            case 2:
                dailyWages=ratePerHour*partTimeHour;
                System.out.println("Daily wages of part time employee: " + dailyWages);
                break;
            default:
                System.out.println("Employee is absent.");
        }
    }
}
