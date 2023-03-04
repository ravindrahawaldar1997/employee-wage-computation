package com.bridgelabz.employee_wage_computation;

public class EmployeeWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;

    public EmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.maxHoursPerMonth = maxHoursPerMonth;
        this.numOfWorkingDays = numOfWorkingDays;
    }

    public void employeeWage() {
        int empHrs, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day : " + totalWorkingDays + " Emp Hr " + empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHour;
    }

    @Override
    public String toString() {
        return "Total Emp Wage For Company: " + company + " is: " + totalEmpWage;
    }

    public static void main(String[] args) {
        EmployeeWage jio = new EmployeeWage("jio", 20, 20, 100);
        jio.employeeWage();
        System.out.println(jio);
        EmployeeWage airtel = new EmployeeWage("airtel", 15, 18, 80);
        airtel.employeeWage();
        System.out.println(airtel);
    }

}