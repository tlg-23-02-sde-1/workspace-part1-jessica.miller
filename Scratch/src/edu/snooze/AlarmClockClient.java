package edu.snooze;

/*
* The application "main class" (class with the main method)
*Here, we will create a few instances of edu.snooze.AlarmClock and give them a basic test-drive
* */
class AlarmClockClient {
    //Entry point or starting point of every standalone java application
    // the application "starts here"
    public static void main(String[] args) {
        // create an instance of edu.snooze.AlarmClock (object) and set it's properties
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7);
        clock1.setRepeat(5);

        //call methods on it
        clock1.snooze();

        // create a second instance of edu.snooze.AlarmClock (object)
        AlarmClock clock2 = new AlarmClock(10);


        //call methods on it
        clock2.snooze();


        //create a third alarm clock object, but this time don't set its properties
        AlarmClock clock3 = new AlarmClock(10, 2);

        //call methods on it
        clock3.snooze();

        //show their two string methods in action
        System.out.println(clock1.toString());
        System.out.println(clock2.toString());
        System.out.println(clock3);
    }
}