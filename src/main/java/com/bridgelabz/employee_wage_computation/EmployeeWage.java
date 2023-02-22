package com.bridgelabz.employee_wage_computation;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation program");
        int IS_FULL_TIME = 1;
        int empHrs = 8;
        int empWagePerHr = 20;
        int dailyWage = 0;

        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is present");
            dailyWage = empHrs * empWagePerHr;
        } else {
            System.out.println("Employee is absent");
        }
        System.out.println("Daily employee wage is " + dailyWage);
    }
}
