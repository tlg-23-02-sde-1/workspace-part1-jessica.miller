package edu.snooze;

/*
* Test class focused on validation testing
* We will do BVT (boundry value testing)
* Range [1-20] inclusive
* need to check on the boundries
*/
class AlarmClockValidationTest {
    //
    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();
        clock.setSnoozeInterval(1);
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(20);
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(0); // should see error message
        clock.setSnoozeInterval(21); // should see error message

        System.out.println("snoozeInterval: " + clock.getSnoozeInterval()); //should still be 20
    }
}