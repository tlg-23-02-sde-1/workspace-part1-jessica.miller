package gov.abacus;

/*
* This is an all static class, a class definition with nothing but static methods.
*  These are called from the client as Calculator.methodName().*/

class Calculator {
    /*
    * Returns the arithmetic mean (average) of the supplied integers.
    *   mean()
    */
    public static double average(int first, int... rest) { //2, 6, 6, 5
        double result = 0.0;

        double sum = 0.0;
        for (int value : rest) {
            sum += value;
        }
        result = sum / (rest.length + 1);
        return result;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public boolean isEven(int value) {
        return value % 2 == 0;
    }

    /*
    * Returns a random integer between 1 and 14 (inclusive).
    *
    * HINT: see a class called math in Java API
    * Look for a helpful method here to get you started
    * NOTE: these methods in the Math class are all static.
    * Math.methodName()
    * */

    public int randomInt() {
        //declare the return value (as a local variable)
        return randomInt(1, 14);
    }

    public int randomInt(int max) {
        return randomInt(1, max);
    }

    //method overloading
    //returns a random int between min and max inclusive
    public int randomInt(int min, int max) {
        int result = 0;
        double rand = Math.random();
        double scaled = (rand * (max-min + 1)) + min;

        result = (int) scaled; //truncate the decimal portion

        return result;
    }
}