
import java.util.Scanner;
 
public class StoreHourDisplay
{    public static void main(String[] args)
    {
        Days date;
        String input = "";
        Scanner sca = new Scanner(System.in);
        
        
        
        for (Days day : Days.values())
            System.out.print(day + " ");
        
        System.out.print(" pick a day now: ");
        input = sca.nextLine().toUpperCase();
        
        try 
        {
            date = Days.valueOf(input);
            
            System.out.println(date  +" Operating hours are " + date.times);
        }
        catch(Exception e)
        {
            if (input.isEmpty())
                System.out.println("No input");
            else
                System.out.println("Error:" + e);
        }
        if (input.length() > 3)
            input = input.substring(0, 3);
        
       
    }

    public enum Days {
         MON("8am - 9pm"), 
         TUE("6am - 10pm"), 
         WED("7am - 10pm"),
          THU("12om - 6pm"),
           FRI("8am - 9pm"), 
           SAT("9am - 12am"), 
           SUN("6am - 4pm");
        private String times;
        
        private Days(String t)
        {
            times = t;
        }
    }
}