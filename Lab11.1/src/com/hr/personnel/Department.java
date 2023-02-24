/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The Department class manages employees.
 *
 * Properties:
 *   String name
 *   String location
 *   Employee[] employees  the Employees in this department.
 *   int currentIndex      internal counter for number of employees in the department.
 *
 * Methods (excluding get/set methods):
 *   void listEmployees()  print info on all employees in the department.
 *   void workEmployees()  make all employees in the department work.
 *   String toString()     self-explanatory.
 */
public class Department {
    // fields
    private String name;
    private String location;
    private final Collection<Employee> employees = new ArrayList<>();


    // constructors
    public Department() {
        super(); //IS always there even if you leave it out
    }

    public Department(String name, String location) {
        super(); //always there
        setName(name);
        setLocation(location);
    }

    // business methods
    public void listEmployees() {
        // Note: we don't use for-each here because we only want to access the array where employees were added.
        // Question: what is in the array for indices where no Employee was added?  null!
        for (Employee emp : employees) {
            System.out.println(emp);  // toString() automatically called
        }
    }

    public void workEmployees() {
        for (Employee emp : employees) {
            emp.work();
        }
    }

    public void payEmployees() {
        for (Employee emp : employees) {
            emp.pay();
        }
    }

    /*TOPIC INSTANCEOF KEYWORD EXAMPLE
    * Forced vacation. That is for all employees that take vacation.
    * Make them take vacation. How can we find out what exact type we have here???
    * Istanceof is an IS-A check
    * */
    public void holidayBreak() {
        for (Employee emp : employees) {
            //First, we ask employee if they are salaried or hourly
            if (emp instanceof SalariedEmployee) {
                //downcast and method call all in one
                //((SalariedEmployee) employees[i]).takeVacation();


                //downcast the employee reference to specific type SalariedEmployee
                SalariedEmployee semp = (SalariedEmployee) emp;
                //then we can salariedEmployee specific methods (take vacation())
                semp.takeVacation();
            }

        }
    }

    // helper method to add an Employee to the array
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }



    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //to string
    @Override
    public String toString() {
        return "Department: name=" + getName() + ", location=" + getLocation();
    }
}