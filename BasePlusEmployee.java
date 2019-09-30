package com.week5.week5;

//Finally create a BasePlusEmployee Class that extends the CommisionedEmployee
// class and it should have a unique instance variable called baseSalary
//        Also It should override the employee paycheck() method by multiplying
//        the commisionRate by the grossSales then add the baseSalary to it```

public class BasePlusEmployee extends CommissionedEmployee {
    protected int baseSalary;

    public BasePlusEmployee(String firstName, String lastName, int employeeID,
                            int grossSales, double commissionRate,
                            int baseSalary, int bonus) {
        super(firstName, lastName, employeeID, grossSales, commissionRate, bonus);
        this.baseSalary = baseSalary;
    }

    public double payCheck(int baseSalary) {
        return grossSales * commissionRate + baseSalary + bonus;
    }

    public String printEmployeeFullName(){
        return firstName + " " + lastName;
    }
}
