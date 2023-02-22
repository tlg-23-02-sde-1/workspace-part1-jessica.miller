package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.InvalidBrandException;
import com.entertainment.Television;

class TelevisionClient {

    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances have been created");
        System.out.println();
//----------------------------------------------------------------//

        try {
            Television tv1 = new Television("Samsung", Television.MAX_VOLUME);
            tv1.turnOn();
            tv1.turnOff();
//---------------------------------------------------------------//
            Television tv2 = new Television();
            tv2.setSetBrand("Toshiba");
            tv2.setSetVolume(-1);

            tv2.turnOn();
            tv2.turnOff();

//----------------------------------------------------------------//
            //tv3 takes default values of null and 0
            Television tv3 = new Television("LG", 45, DisplayType.OLED);

            tv3.turnOn();
            tv3.turnOff();
//----------------------------------------------------------------//

            System.out.println(tv1); //toString automatic
            System.out.println(tv2);
            System.out.println(tv3);
        } catch (InvalidBrandException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println(Television.getInstanceCount() + " instances");
    }


}