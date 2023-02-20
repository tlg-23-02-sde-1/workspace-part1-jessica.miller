package com.entertainment.client;

import com.entertainment.Television;

class TelevisionValidationTest {

    public static void main(String[] args) {
        Television tv = new Television();
        tv.setSetVolume(120);
        System.out.println("volume: " + tv.getVolume());

        tv.setSetVolume(0);
        System.out.println("volume: " + tv.getVolume());

        tv.setSetVolume(-1);
        System.out.println("volume: " + tv.getVolume());

        tv.setSetVolume(100);
        System.out.println("volume: " + tv.getVolume());

        tv.setSetBrand("Samsung");
        System.out.println("brand: " + tv.getSetBrand());

        tv.setSetBrand("LG");
        System.out.println("brand: " + tv.getSetBrand());

        tv.setSetBrand("Sony");
        System.out.println("brand: " + tv.getSetBrand());

        tv.setSetBrand("Toshiba");
        System.out.println("brand: " + tv.getSetBrand());

        tv.setSetBrand("Vizio");
        System.out.println("brand: " + tv.getSetBrand());

        System.out.println(tv);
    }
}