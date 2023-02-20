package com.lamp;

class LampValidationTest {
    public static void main(String[] args) {
        Lamp lmp = new Lamp();
        lmp.setLuminosity(60);
        System.out.println("Luminosity: " + lmp.getLuminosity());

        lmp.setLuminosity(100);
        System.out.println("Luminosity: " + lmp.getLuminosity());

        lmp.setLuminosity(0);
        System.out.println("Luminosity: " + lmp.getLuminosity());

        lmp.setLuminosity(90);
        System.out.println("Luminosity: " + lmp.getLuminosity());
    }
}