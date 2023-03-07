package com.bridgelabz.employee_wage_computation;

public interface IComputeEmpWage {
    void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth);
    void computeEmpWage();
}
