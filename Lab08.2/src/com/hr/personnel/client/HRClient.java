/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new Employee("Jason", LocalDate.of(1990, 8, 24)));
        dept.addEmployee(new Employee("Julie", LocalDate.of(2000, 2, 2)));
        dept.addEmployee(new SalariedEmployee("Jessica", LocalDate.of(2020, 07, 14), 9500000.50));
        dept.addEmployee(new HourlyEmployee("Jerry", LocalDate.of(2022, 12, 13), 50.3, 70));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();
    }
}