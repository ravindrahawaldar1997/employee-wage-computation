package com.bridgelabz.employee_wage_computation;

public class EmployeeWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    int empHrs;
    int totalEmployeeHrs = 0;
    int totalWorkingDays = 0;
    int totalEmployeeWage = 0;
    int numOfPresentFullDay = 0;
    int numOfPresentHalfDay = 0;
    int numOfAbsentDays = 0;


    public void employeeWage(int wagePerHr, int workingDays, int maxEmpHr, String companyName) {
        System.out.println("Employee wages for the company " + companyName + " is :- ");

        while (totalEmployeeHrs < maxEmpHr && totalWorkingDays < workingDays) {
            totalWorkingDays++;
            {
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) {
                    case IS_FULL_TIME:
                        empHrs = 8;
                        numOfPresentFullDay++;
                        break;
                    case IS_PART_TIME:
                        empHrs = 4;
                        numOfPresentHalfDay++;
                        break;
                    default:
                        numOfAbsentDays++;
                        empHrs = 0;
                }
                workingDays--;
                totalEmployeeHrs = empHrs + totalEmployeeHrs;
            }

        }
        System.out.println("Number of working days full day :- " + numOfPresentFullDay);
        System.out.println("Number of working days half day :- " + numOfPresentHalfDay);
        System.out.println("Number of Absent Days :- " + numOfAbsentDays);
        totalEmployeeWage = totalEmployeeHrs * wagePerHr;

        System.out.println("Total employee wage " + totalEmployeeWage);

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation program");

        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.employeeWage(10, 20, 100, "TCS");
        System.out.println("------------------------------------------------");
        employeeWage.employeeWage(20, 20, 80, "WIPRO");
    }
}