
/**
 * Write a description of class HistoricalMoment here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
    
    public void addMinuteToTimeOfEvent(){
        timeTick();
    }
    
    public void printDetails()
    {
        getTime();
    }
    
}
