package edu.snooze;

/*
* System or "business class" to model the workings of an alarm clock.
* */
class AlarmClock {
    //attributes or properties ( Fields or instance variables in Java) class definition only
   private int snoozeInterval = 5; //default value when client doesn't specify one
   private int repeat = 10; //number of times it goes off
    private int minInterval = 1;
    private int maxInterval = 20;

    //constructors----------------------------------------//
    public AlarmClock() {
        //sync time
    }

    public AlarmClock(int snoozeInterval) {
        this();
        setSnoozeInterval(snoozeInterval);
    }

    public AlarmClock(int snoozeInterval, int repeat) {
        this(snoozeInterval);
        setRepeat(repeat);
    }

   public void snooze() {
        System.out.println("Snoozing for " + getSnoozeInterval() + " minutes.");
    }

    //accessor methods - provide controlled access to the objects internal private data
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    //data constraint: must be [1-20] (inclusive)
    //todo: implement a data constraint of [1-20]
    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= 1 && snoozeInterval <= 20) {
            this.snoozeInterval = snoozeInterval;
        }
        else {
            System.out.println("Invalid snooze interval: " + snoozeInterval + " must be between " + minInterval + " and " + maxInterval);
        }
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    //--------------To String-----------------------//
    public String toString() {
       return "edu.snooze.AlarmClock: snoozeInterval = " + getSnoozeInterval();
    }
}