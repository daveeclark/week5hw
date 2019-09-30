package com.week5.week5;

//Create a Commissioned Employee Class that also inherits form the Employee class but has two unique instance variables:
//        (1) grossSales (2) commissionRate
//        It should override the employee paycheck() method by multiplying the commissionRate by the grossSales

public class CommissionedEmployee extends Employee {
    protected int grossSales;
    protected double commissionRate;

    public CommissionedEmployee(String firstName, String lastName,
                                int employeeID, int grossSales,
                                double commissionRate, int bonus) {
        super(firstName, lastName, employeeID, bonus);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public int getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double payCheck(int grossSales, double commissionRate) {
        return grossSales * commissionRate + bonus;
    }

    public String printEmployeeFullName(){
        return firstName + " " + lastName;
    }
}
