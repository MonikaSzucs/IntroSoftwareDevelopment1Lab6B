
/**
 * Write a description of class HistoricalMoment here.
 *
 * @author Monika Szucs
 * @version October 21, 2018
 */
public class HistoricalMoment
{
    // instance variables - replace the example below with your own
    private String eventName;
    private ClockDisplay timeOfEvent;

    /**
     * Constructor for objects of class HistoricalMoment
     */
    public HistoricalMoment()
    {
        eventName="untitled event";
        timeOfEvent=new ClockDisplay(ClockDisplay.MIDNIGHT_HOUR,ClockDisplay.MINUTE_ZERO);
    }
    
    /**
     * Constructor for objects of class HistoricalMoment
     * @param nameOfTheEvent takes in a string value of the event
     */
    public HistoricalMoment(String nameOfTheEvent)
    {
        if((nameOfTheEvent==null)||(nameOfTheEvent.equals(""))){
            eventName="untitled event";
            timeOfEvent=new ClockDisplay(ClockDisplay.MIDNIGHT_HOUR,ClockDisplay.MINUTE_ZERO);
        }
        else
        {
            eventName=nameOfTheEvent;
            timeOfEvent=new ClockDisplay(ClockDisplay.MIDNIGHT_HOUR,ClockDisplay.MINUTE_ZERO);
        }
    }
    
    /**
     * Constructor for objects of class HistoricalMoment
     * @param nameOfTheEvent takes in a string value of the event
     * @param theTime takes the time from the ClockDisplay
     */
    public HistoricalMoment(String nameOfTheEvent, ClockDisplay theTime)
    {
        if((nameOfTheEvent==null)||(nameOfTheEvent.equals("")))
        {
            eventName="untitled event";
            throw new IllegalArgumentException("illegal event name");
        }
        else
        {
            eventName=nameOfTheEvent;
            timeOfEvent=theTime;
        }
    }
    
    
    /**
     * A method adds one minute to the timeOfEvent.
     */
    public void addMinuteToTimeOfEvent(){
        timeOfEvent.timeTick();
    }
    
    /**
     * A method that calls ClockDisplay instance variable's getTime() method and which prints details in certian formats.
     */
    public void printDetails()
    {
        //getTime();
        System.out.println("At " + timeOfEvent.getTime() + ", " + eventName);
        
    }
    
}
