package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

import java.util.Arrays;
/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 *
 * 1) Supported brands are Samsung, Sony, LG, Toshiba.
 * 2. Volume must be between 0 and 100
 * 3. Supported displays are LED, OLED, PLASMA, CRT, LCD
 */

/**
 * Intended usage (by human):
 *  $ java com.tv.com.entertainment.client.TelevisionClientArgs <brand> <volume> <display>
 * 
 * Example:
 *  $ java com.tv.com.entertainment.client.TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of com.tv.com.entertainment.Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs {
    //Model for whiteboard homework
    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            String usage = "Usage: java com.tv.com.entertainment.client.TelevisionClientArgs <brand> <volume> <display>";
            String example = "Supported brands are Samsung, Sony, LG, Toshiba";
            String note1 = "Supported brands are: " + Arrays.toString(Television.VALID_BRANDS);
            String note2 = String.format("Volume must be between %s and %s",Television.MIN_VOLUME, Television.MAX_VOLUME);
            String note3 = "Support displays are: " + Arrays.toString(DisplayType.values());


            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            System.out.println(note3);
            return;  // early return from main(), application exits
        }

        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
        System.out.println("You provided " + args.length + " arguments");

        //FIRST CONVERT STRING INPUTS TO PROPER TYPES
        String brand = args[0];
        int volume = Integer.parseInt(args[1]);
        DisplayType display = DisplayType.valueOf(args[2].toUpperCase());

        //now create an instance of com.tv.com.entertainment.Television of these converted inputs
        Television tv = new Television(brand, volume, display);

        System.out.println("Congratulations on your order! Your custom television is on it's way.");
        System.out.println(tv);
    }
}