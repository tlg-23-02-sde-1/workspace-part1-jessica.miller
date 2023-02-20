package gov.research;

import java.util.Arrays;

class ArraysTest {
    public static void main(String[] args) {
        int[] ages = new int[2];
        ages[0] = 56;
        ages[1] = 49;
        System.out.println(ages); //to string automatically called
        System.out.println(Arrays.toString(ages));
    }
}