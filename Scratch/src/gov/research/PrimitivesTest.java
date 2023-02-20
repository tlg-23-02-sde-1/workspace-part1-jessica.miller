package gov.research;

class PrimitivesTest {

    public static void main(String[] args) {

        int age = 32;
        System.out.println("The age is: " + age);
        System.out.println();

        long population = 7000_000_000L;
        System.out.println("The population is: " + population);
        System.out.println();

        double height = 136.45;
        System.out.println("My height is: " + height);
        System.out.println();

        boolean isTall = true;
        System.out.println("I am tall? " + isTall);
        System.out.println();

        char grade = 'B';
        System.out.println("I got a " + grade + " on the test.");
        System.out.println();

        String word = "belly";
        System.out.println("My favorite word is \"belly\".");
        System.out.println();

        int i = 18;
        System.out.println(i);
        System.out.println();

        int j = i;
        System.out.println(j);
        System.out.println();

        i++; //i is 19....j is 18
        System.out.println(i);
        System.out.println(j);

        int n = 3;
        System.out.println(n++);
        System.out.println(n);

    }

}