package com.lamp;

class LampClient {

    public static void main(String[] args) {
        Lamp lm1 = new Lamp();
        lm1.brand = "Marset";
        lm1.luminosity = 100;
        lm1.height = 36;
        lm1.material = "bronze";

        lm1.turnOn();
        lm1.turnOff();
        lm1.dim();

        Lamp lm2 = new Lamp("Grupa", 65, 36, "nickel");
        lm2.turnOn();
        lm2.turnOff();
        lm2.dim();

        Lamp lm3 = new Lamp("Fabbian", 75, Bulb.FLUORESCENT);
        lm3.turnOn();
        lm3.turnOff();
        lm3.dim();

        Lamp lm4 = new Lamp("Fabbian", 75);
        lm3.turnOn();
        lm3.turnOff();
        lm3.dim();

        System.out.println(lm1);
        System.out.println(lm2);
        System.out.println(lm3);
        System.out.println(lm4);
    }


}