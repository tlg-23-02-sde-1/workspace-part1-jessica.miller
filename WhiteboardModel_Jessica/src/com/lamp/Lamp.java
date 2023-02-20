package com.lamp;

class Lamp {
    String brand;
    int luminosity = 60; //watts
    String material;
    int height = 85;
    private Bulb lightBulb = Bulb.CFL;

    //Add static range for validation then create a com.lamp.LampValidationTest class 2/14
    public static final int MIN_DIM = 10;
    public static final int MAX_DIM = 90;

    public static final String[] VALID_BULBS = {"Incandescent", "Halogen", "Fluorescent", "CFL", "LED"};
    public static final String[] VALID_BRANDS = {"MARSET", "GOLDEN", "GUPPA", "FABBIAN"};


    //Constructor method----------------------------------
    public Lamp() {

    }

    public Lamp(String brand, int luminosity) {
        setBrand(brand);
        setLuminosity(luminosity);
    }

    public Lamp(String brand, int luminosity, int height, String material) {
        this(brand, luminosity); //delegate to ctor above
        setMaterial(material);
        setHeight(height);
    }

    public Lamp(String brand, int luminosity, Bulb lightBulb) {
        this(brand, luminosity);
        setLightBulb(lightBulb);
    }

    //Business orientated methods-----------------------------//

    void turnOn() {
        System.out.println("Switching on your " + brand + " of " + luminosity + " watts");
        System.out.println("Your lamp is " + height + " inches tall");

    }

    void turnOff() {
        System.out.println("Turning off the " + brand + " made of " + material);

    }

    void dim() {
        System.out.println("Dimming " + luminosity + " watts");
        System.out.println();
    }


    //Getters and Setters-----------------------------------


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getLuminosity() {
        return luminosity;
    }

    public void setLuminosity(int luminosity) {
        if (MIN_DIM <= luminosity && luminosity <= MAX_DIM){
            this.luminosity = luminosity;
        } else {
            System.out.printf("Dim percentage invalid. Must be between %s and %s", MIN_DIM, MAX_DIM);
        }
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Bulb getLightBulb() {
        return lightBulb;
    }

    public void setLightBulb(Bulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    //toString method-----------------------------------------------

    public String toString() {
        return String.format("com.lamp.Lamp: brand= %s \n Luminosity= %s \n material= %s \n height= %s \n bulb= %s", getBrand(),getLuminosity(), getMaterial(), getHeight(), getLightBulb());
    }
}
