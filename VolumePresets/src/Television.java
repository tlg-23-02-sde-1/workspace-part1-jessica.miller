class Television {

    //Attributes or properties are called fields or instance variables
    private String brand; // brand name
    private int volume; //current volume
    private DisplayType display = DisplayType.LED;

    private boolean isMuted;
    private int oldVolume;


    //CLASS (static) VARIABLES - shared among all instances
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    private static int instanceCount = 0;

    //Constructor method
    public Television() {
        instanceCount++; // increment instance count
    }

    public Television(String brand) {
        this();
        setSetBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand); //delegate to ctor above
        setSetVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    //Business orientated methods//-----------------------------//
    public void turnOn() {
        //with using this. you are specifying the object. It is optional
        boolean isConnected = this.verifyInternetConnection();
        System.out.println("Turning on your " + brand + " TV volume " + volume);
    }

    public void turnOff() {
        System.out.println("Shutting down...goodbye");
    }

    public void mute() {
        if (!isMuted()) { //not currently muted
            oldVolume = getVolume();
            setSetVolume(0);
            isMuted = true;
        } else { //executes when muted
            setSetVolume(oldVolume);
            isMuted = true;
        }
    }


    //GETTERS AND SETTERS (for each method) 1 getter 1 setter
    public boolean isMuted() {
        return isMuted;
    }

    public String getSetBrand() {
        return brand;
    }

    public void setSetBrand(String brand) {
        switch (brand) {
            case "Samsung":
            case "LG":
            case "Sony":
            case "Toshiba":
                this.brand = brand;
                break;
            default:
                System.out.println("Invalid brand: " + brand + ", valid brands are Samsung, LG, sony, toshiba");
        }
    }
//        this.brand = brand;


    public int getVolume() {
        return volume;
    }
    public void setSetVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
        } else {
//            System.out.println("Invalid volume " + volume + " must be between " +
//            Television.MIN_VOLUME + " and " + Television.MAX_VOLUME);
            System.out.printf("Invalid volume: %s, valid range is %s-%s", volume, MIN_VOLUME, MAX_VOLUME);
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    //-----------------TO string method override--------------------//
    public String toString() {
//        String volumeString = isMuted() ? "<is"
        return String.format("Television: brand = %s, volume = %s, display=%s\n", getSetBrand(), getVolume(), getDisplay());
//        return "Television: brand = " + getSetBrand() + ", volume= " + getVolume() + ", display= " + display;
    }

    //---------------Private method cohesion---------------//
    private boolean verifyInternetConnection() {
        return true; //fake implementation
    }

}