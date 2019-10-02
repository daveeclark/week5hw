package com.week5.week5;

public class week5weekendhw {

    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee ("David", "Clark", 234, 1000, 50);
        System.out.println("The Salaried Employee earned " + salariedEmployee.payCheck(2000));
        System.out.println("Salaried Employee got a ***BONUS*** of " + salariedEmployee.bonusAlert(50) + " and now earns " + salariedEmployee.payCheck(20000)
        + ". Congratulations to " + salariedEmployee.printEmployeeFullName());

        CommissionedEmployee commissionedEmployee = new CommissionedEmployee("David", "Clark", 234,1000, 4, 0);
        System.out.println("The Commissioned Employee earned " + commissionedEmployee.payCheck(165500, .15));

        BasePlusEmployee basePlusEmployee = new BasePlusEmployee("David", "Clark", 234, 166500,.15, 60000, 0);
        System.out.println("The Base Plus Commission Employee earned " + basePlusEmployee.payCheck(65025));
    }
}
