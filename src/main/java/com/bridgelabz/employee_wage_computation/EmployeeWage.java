package com.bridgelabz.employee_wage_computation;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation program");
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int empHrs;
        int empWagePerHr = 20;
        int dailyWage = 0;
        int numOfWorkingDays = 20;
        int monthlyWage = 0;

        for (int day = 0; day < numOfWorkingDays; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case 1:
                    System.out.println("Employee is present");
                    empHrs = 8;
                    break;
                case 2:
                    System.out.println("Employee half time present");
                    empHrs = 4;
                    break;
                default:
                    System.out.println("Employee is absent");
                    empHrs = 0;
            }
            dailyWage = empHrs * empWagePerHr;
            System.out.println("Daily employee wage is " + dailyWage);
            monthlyWage = dailyWage + monthlyWage;
        }
        System.out.println("Employee monthly wage " + monthlyWage);
    }
}