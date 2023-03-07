package com.bridgelabz.employee_wage_computation;

public class CompanyEmpWage {
    public final String company;
    public final int empRatePerHour;
    public final int numOfWorkingDays;
    public final int maxHoursPerMonth;
    public int totalEmpWage;
    public int[] dailyWage = new int[31];
    public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }
    public void setTotalEmpWage(int totalEmpWage){
        this.totalEmpWage = totalEmpWage;
    }
    @Override
    public String toString(){
        return "Total Emp Wage for Company: "  +company+ " is: " +totalEmpWage;
    }
}
