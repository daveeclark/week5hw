package com.week5.week5;

//Next Create a SalariedEmployee that inherits from the Employee class and has a unique instance variable called weeklySalary
//        It should override the employee paycheck() method by just returning the weeklySalary

public class SalariedEmployee extends Employee {
    protected int weeklySalary;

    public SalariedEmployee(String firstName, String lastName,
                            int employeeID, int weeklySalary, int bonus) {
        super(firstName, lastName, employeeID, bonus);
        this.weeklySalary = weeklySalary;
    }


    @Override
    public double payCheck(int weeklySalary) {
        return weeklySalary + bonus;
    }

    public String printEmployeeFullName(){
        return firstName + " " + lastName;
    }
}
