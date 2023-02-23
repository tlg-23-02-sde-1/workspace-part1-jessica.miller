package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS

    //Option 4: Try-catch then throw a different one
    //We are nesting the underlying cause exception into a higher level, HR-oriented exception
    public void goToWork() throws WorkException {
        Car c = new Car("TKE123", "Toyota", "Matrix");
        c.start();
        try {
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work", e);
        }
        finally {
            c.stop(); //IMPORTANT to stop() the Car, no matter what
        }
    }

/*Option 3:
*   Try-Catch respond in some way, then rethrow...
* */
    /*public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("TKE123", "Toyota", "Matrix");
        c.start();
        try {
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            //Email city counsel to complain
            System.out.println("email sent to counsel");
            throw e;
        }
        finally {
            c.stop(); //IMPORTANT to stop() the Car, no matter what
        }
    }*/


    /*
    * Option 2: Punt, Don't handle the exception at all
    * Note: A try-finally can be used for the regualr finally reasons.
    * */


    /*
    public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("TKE123", "Toyota", "Matrix");
            c.start();
        try {
            c.moveTo("West Seattle");
        } finally {
            c.stop(); //IMPORTANT to stop() the Car, no matter what
        }
    }
    */

    /*
    * option 1: Try-catch-finally and handle any thrown exception
    * */
    /*
    public void goToWork() {
        Car c = new Car("TKE123", "Toyota", "Matrix");
        try {
            c.start();
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            System.out.println(e.getMessage());
        }
        finally {
            c.stop(); //IMPORTANT to stop() the Car, no matter what
        }
    }
    */

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}