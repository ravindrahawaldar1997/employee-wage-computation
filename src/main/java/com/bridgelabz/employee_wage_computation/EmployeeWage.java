package com.bridgelabz.employee_wage_computation;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation program");
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int empHrs;
        int empWagePerHr = 20;
        int numOfWorkingDays = 20;
        int maximumHrsInMonth = 100;
        int totalEmployeeHrs = 0;
        int totalWorkingDays = 0;
        int totalEmployeeWage = 0;
        while (totalEmployeeHrs < maximumHrsInMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            {

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
                totalEmployeeHrs = empHrs + totalEmployeeHrs;
            }
            totalEmployeeWage = totalEmployeeHrs * empWagePerHr;
            System.out.println("Day: " + totalWorkingDays + " empHrs: " + empHrs);

        }
        System.out.println("Total employee wage " + totalEmployeeWage);
    }
}