/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

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
        dept.addEmployee(new SalariedEmployee("Jason",   LocalDate.of(1990, 8, 24), 1500));
        dept.addEmployee(new HourlyEmployee("Julie",     LocalDate.of(2000, 2, 2), 27, 50));
        dept.addEmployee(new SalariedEmployee("Jessica", LocalDate.of(2020, 7, 14), 95000.50));
        dept.addEmployee(new HourlyEmployee("Jerry",     LocalDate.of(2022, 12, 13), 50.3, 70));
        dept.addEmployee(new Executive("James",          LocalDate.of(2023, 9, 1), 300000));


        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        //pay employees
        System.out.println("\nPay employees please:");
        dept.payEmployees();

        //holidaybreak
        System.out.println("\nHoliday Break!!!");
        dept.holidayBreak();


    }
}