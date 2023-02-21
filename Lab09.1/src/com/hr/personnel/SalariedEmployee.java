package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double salary;

    //constructor
    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

//    @Override
//    public void moveTo() {
//
//    }

    //business method
    @Override
    public void pay() {
        System.out.println(getName() + " is paid salary " + getSalary());
    }

    public void takeVacation() {
        System.out.println(getName() + " is on vacation.");
    }

    public void payTaxes() {
        System.out.println(getName() + SALARIED_TAX_RATE * getSalary());
    }

    //Accessor methods

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //to string
    @Override
    public String toString() {
        return super.toString() + " Salary: " + getSalary() + "\n";
    }
}