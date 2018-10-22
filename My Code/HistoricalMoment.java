
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
        timeOfEvent=new ClockDisplay(MIDNIGHT_HOUR,MINUTE_ZERO);
    }
    
    /**
     * Constructor for objects of class HistoricalMoment
     * @param nameOfTheEvent takes in a string value of the event
     */
    public HistoricalMoment(String nameOfTheEvent)
    {
        if((nameOfTheEvent==null)||(nameOfTheEvent.equals(""))){
            eventName="untited event";
            timeOfEvent=new ClockDisplay(MIDNIGHT_HOUR,MINUTE_ZERO);
        }
        else
        {
            eventName=nameOfTheEvent;
            timeOfEvent=new ClockDisplay(MIDNIGHT_HOUR,MINUTE_ZERO);
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
        timeOfEvents =  minutes.timeTick();
    }
    
    /**
     * A method that calls ClockDisplay instance variable's getTime() method and which prints details in certian formats.
     */
    public void printDetails()
    {
        //getTime();
        System.out.print("At " + hours.getValue() + ":" + minutes.getValue() + " " + EVENING_SUFFIX + ", Titanic hit an iceberg!");
    }
    
}
