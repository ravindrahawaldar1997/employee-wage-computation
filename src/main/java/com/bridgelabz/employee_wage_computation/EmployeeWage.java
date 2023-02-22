package com.bridgelabz.employee_wage_computation;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation program");
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int empHrsFullTime = 8;
        int empHrsPartTime = 4;
        int empWagePerHr = 20;
        int dailyWage = 0;

        int empCheck = (int) Math.floor(Math.random() * 10) % 3;

        switch (empCheck) {
            case 1:
                System.out.println("Employee is present");
                dailyWage = empHrsFullTime * empWagePerHr;
                break;
            case 2:
                System.out.println("Employee half time present");
                dailyWage = empHrsPartTime * empWagePerHr;
                break;
            default:
                System.out.println("Employee is absent");

        }
        System.out.println("Daily employee wage is " + dailyWage);
    }
}
