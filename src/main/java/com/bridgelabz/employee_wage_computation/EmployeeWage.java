package com.bridgelabz.employee_wage_computation;

public class EmployeeWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int empWagePerHr = 20;
    public static final int numOfWorkingDays = 20;
    public static final int maximumHrsInMonth = 100;

    public void employeeWage() {
        int empHrs;
        int totalEmployeeHrs = 0;
        int totalWorkingDays = 0;
        int totalEmployeeWage = 0;
        while (totalEmployeeHrs < maximumHrsInMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            {
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) {
                    case IS_FULL_TIME:
                        System.out.println("Employee is present");
                        empHrs = 8;
                        break;
                    case IS_PART_TIME:
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

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation program");

        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.employeeWage();
    }
}