
/**
 * DayDisplay class definition.
 *
 * @author Mike Mulder
 * @version 1.0
 */
public class DayDisplay
{
    // Constants
    public static final int NUMBER_OF_DAYS_IN_WEEK = 7;
    public static final int SUNDAY                 = 0;
    public static final int MONDAY                 = 1;
    public static final int TUESDAY                = 2;
    public static final int WEDNESDAY              = 3;
    public static final int THURSDAY               = 4;
    public static final int FRIDAY                 = 5;
    public static final int SATURDAY               = 6;

    public static final String SUNDAY_STRING       = "Sunday";
    public static final String MONDAY_STRING       = "Monday";
    public static final String TUESDAY_STRING      = "Tuesday";
    public static final String WEDNESDAY_STRING    = "Wednesday";
    public static final String THURSDAY_STRING     = "Thursday";
    public static final String FRIDAY_STRING       = "Friday";
    public static final String SATURDAY_STRING     = "Saturday";

    private NumberDisplay dayNumber;
    
    public DayDisplay(int theDayNumber){

        if(theDayNumber>=0 && theDayNumber<=6){
            dayNumber = new NumberDisplay(NUMBER_OF_DAYS_IN_WEEK);
            dayNumber.setValue(theDayNumber);
        }
        else {
            System.out.println("Error");
            throw new IllegalArgumentException("Error in the number");
        }
    }

    public DayDisplay(String nameOfTheDay){
    
        if(nameOfTheDay!=null){
            dayNumber = new NumberDisplay(NUMBER_OF_DAYS_IN_WEEK);
            
            if(nameOfTheDay.equalsIgnoreCase(SUNDAY_STRING)){
                dayNumber.setValue(SUNDAY);
            }
            else if(nameOfTheDay.equalsIgnoreCase(MONDAY_STRING)){
                dayNumber.setValue(MONDAY);
            }
            else if(nameOfTheDay.equalsIgnoreCase(TUESDAY_STRING)){
                dayNumber.setValue(TUESDAY);
            }
            else if(nameOfTheDay.equalsIgnoreCase(WEDNESDAY_STRING)){
                dayNumber.setValue(WEDNESDAY);
            }
            else if(nameOfTheDay.equalsIgnoreCase(THURSDAY_STRING)){
                dayNumber.setValue(THURSDAY);
            }
            else if(nameOfTheDay.equalsIgnoreCase(FRIDAY_STRING)){
                dayNumber.setValue(FRIDAY);
            }
            else if(nameOfTheDay.equalsIgnoreCase(SATURDAY_STRING)){
                dayNumber.setValue(SATURDAY);
            }
            else{
                throw new IllegalArgumentException("invalid day name");
            }
            throw new IllegalArgumentException("day cannot be empty");
        }
        
    }
    
    public DayDisplay(NumberDisplay theDay){
        dayNumber = theDay;
    }
    
    public String getDayOfTheWeek(){
        switch(dayNumber.getValue()){
        case SUNDAY:
            return SUNDAY_STRING;
        case MONDAY:
            return MONDAY_STRING;
        case TUESDAY:
            return TUESDAY_STRING;
        case WEDNESDAY:
            return WEDNESDAY_STRING;
        case THURSDAY:
            return THURSDAY_STRING;
        case FRIDAY:
            return FRIDAY_STRING;
        case SATURDAY:
            return SATURDAY_STRING;
        default:
            throw new IllegalArgumentException("WRONG");
        }
    }
    
    public void incrementDay(){
        dayNumber.increment();
    }
    
    public String getWhatDayIsTomorrow(){
        switch(dayNumber.getValue()){
        case SUNDAY:
            return MONDAY_STRING;
        case MONDAY:
            return TUESDAY_STRING;
        case TUESDAY:
            return WEDNESDAY_STRING;
        case WEDNESDAY:
            return THURSDAY_STRING;
        case THURSDAY:
            return FRIDAY_STRING;
        case FRIDAY:
            return SATURDAY_STRING;
        case SATURDAY:
            return SUNDAY_STRING;
        default:
            throw new IllegalArgumentException("WRONG");
        }
    }
    
    public void printDetails(){
        System.out.println("Today is day " + dayNumber.getValue() + " which is " + getDayOfTheWeek());
    }
}
