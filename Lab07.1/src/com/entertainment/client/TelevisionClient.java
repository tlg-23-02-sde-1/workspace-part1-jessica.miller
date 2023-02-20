package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

class TelevisionClient {

    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances have been created");
        System.out.println();
//----------------------------------------------------------------//

        Television tv1 = new Television("samsung", Television.MAX_VOLUME);
//        tv1.setSetBrand("samsung");
//        tv1.setSetVolume(32);

        tv1.turnOn();
        tv1.turnOff();
//---------------------------------------------------------------//
        Television tv2 = new Television();
        tv2.setSetBrand("toshiba");
        tv2.setSetVolume(45);

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

        System.out.println(Television.getInstanceCount() + " instances");
    }


}