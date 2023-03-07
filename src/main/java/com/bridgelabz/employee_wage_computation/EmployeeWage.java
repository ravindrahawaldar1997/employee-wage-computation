package com.bridgelabz.employee_wage_computation;

import java.util.ArrayList;
import java.util.List;

public class EmployeeWage implements IComputeEmpWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    private int numOfCompany = 0;
   private List<CompanyEmpWage> companyEmpWageArrayList;

    public EmployeeWage() {
        companyEmpWageArrayList = new ArrayList<>();
    }
    public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        CompanyEmpWage companyWage = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
        companyEmpWageArrayList.add(companyWage);
    }

    public void computeEmpWage() {
        for (int i = 0; i < companyEmpWageArrayList.size(); i++) {
            CompanyEmpWage companyWage = companyEmpWageArrayList.get(i);
            companyWage.setTotalEmpWage(this.computeEmpWage(companyWage));
            System.out.println(companyWage);
        }
    }

    private int computeEmpWage(CompanyEmpWage companyEmpWage) {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
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
        return totalEmpHrs * companyEmpWage.empRatePerHour;
    }

    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.addCompanyEmpWage("jio", 20, 10, 40);
        employeeWage.addCompanyEmpWage("TCS", 30, 20, 80);
        employeeWage.computeEmpWage();
    }
}
