package gov.abacus;

class CalculatorClient {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double sum = calc.add(3.1, 5.1);
        System.out.println("The sum is: " + sum);

        System.out.println("The difference is: " + calc.subtract(5, 2));
        System.out.println("10 is even? " + calc.isEven(10));
        System.out.println();

        int winner = calc.randomInt();
        System.out.println("The winner is: " + winner);

//        double average = Calculator.average();
    }
}