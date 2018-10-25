
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    /**
     * The Main entry to the Moment in Time
     * 
     * A new Moment in time has been created
     */
    public static void main(String[] args){
        ClockDisplay clockDisplay = new ClockDisplay(11,2);
        HistoricalMoment moment1 = new HistoricalMoment("March 2013 Equinox", clockDisplay);
        moment1.printDetails();
        moment1.addMinuteToTimeOfEvent();
        moment1.printDetails();
    }
}
