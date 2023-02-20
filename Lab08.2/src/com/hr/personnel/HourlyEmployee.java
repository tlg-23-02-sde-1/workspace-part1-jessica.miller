package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double rate;
    private double hours;

    //constructor
    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate); //delegate to superclass ctor for name, hireDate
        //registerIn401k
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);
        setRate(rate);
        setHours(hours);
    }

    //business method
    @Override
    public void pay() {
        System.out.println(getName() + " is paid hourly " + getRate() + " " + getHours());
    }

    //Accessor methods

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    //to string

    @Override
    public String toString() {
        return super.toString() + " Rate: " + getRate() + " Hours: " + getHours() + "\n";
    }
}