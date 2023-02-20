package net.flix;

public enum Genre {
    COMEDY("Comedy"),
    WESTERN("Western"),
    MYSTERY("Mystery"),
    SCI_FI("Science Fiction"),
    ACTION("Action"),
    ROMANCE("Romance"),
    DRAMA("Drama"),
    HORROR("Horror");

    //-------------------------------------------------
    //everything under this line is regular class
    // definition namely, fields, constructors, methods
    private final String display;
    //constructor called only from inside (8 times, from those listed above)
    Genre(String display) {  //displayed string text in toString method
        this.display = display;
//        System.out.println("net.flix.Genre ctor called");
    }

    //getter method with no setter
    public String getDisplay() { //often the get prefix is omitted when there is no setter
        return display;
    }

    public String toString() {
        return getDisplay();
    }

}