
/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The 
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before 
 * midnight).
 * 
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */
public class ClockDisplay
{
    // static final instance variables
    public static final int     FIRST_MORNING_HOUR  = 0;
    public static final int     LAST_MORNING_HOUR   = 11;
    public static final int     FIRST_EVENING_HOUR  = 12;
    public static final int     LAST_EVENING_HOUR   = 23;
    public static final int     MINUTES_PER_HOUR    = 60;
    public static final String  MORNING_SUFFIX      = "a.m.";
    public static final String  EVENING_SUFFIX      = "p.m.";
    public static final int     MIDNIGHT_HOUR       = 0;
    public static final int     HOURS_PER_DAY       = 0;
    public static final int     MINUTE_ZERO         = 0;
    
    //instance variables
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;    // simulates the actual display

    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 00:00.
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplay(int hour, int minute)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
            // 0?
        }
        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }

    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
        int currHours;
        int currMinutes;
        String currSuffix;

        if(hours.getValue()==0){
            currHours=12;
            currSuffix = MORNING_SUFFIX;
        } else if(hours.getValue()>12){
            currHours=hours.getValue()-12;
            currSuffix = EVENING_SUFFIX;
        }else{
            currHours=hours.getValue();
            currSuffix = MORNING_SUFFIX;
        }

        if(minutes.getValue()<10){
            displayString = currHours + ":0"+ minutes.getValue() + " " + currSuffix;
            System.out.println(displayString);
        } else{
            displayString = currHours + ":"+ minutes.getValue() + " " + currSuffix + " ";
            System.out.println(displayString);
        }

    }
}
