package com.lamp;

import java.util.Arrays;

class LampClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            String usage = "Usage: com.lamp.Lamp <brand> <luminosity> <bulb>";
            String example = "Supported brands are Marset, Guppa, Fabbian, Golden";
            String note1 = "Supported brands are: " + Arrays.toString(Lamp.VALID_BRANDS);
            String note2 = String.format("Luminosity must be between %s and %s",Lamp.MIN_DIM, Lamp.MAX_DIM);
            String note3 = "Supported bulbs are: " + Arrays.toString(Lamp.VALID_BULBS);

            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            System.out.println(note3);
            return;  // early return from main(), application exits
        }



        System.out.println("You provided " + args.length + " arguments");

        //FIRST CONVERT STRING INPUTS TO PROPER TYPES
        String brand = args[0];
        int luminosity = Integer.parseInt(args[1]);
        Bulb lightBulb = Bulb.valueOf(args[2].toUpperCase());


        Lamp lmp = new Lamp(brand, luminosity, lightBulb);

        System.out.println("Congratulations on your order! Your com.lamp.Lamp is on it's way.");
        System.out.println(lmp);
    }
}