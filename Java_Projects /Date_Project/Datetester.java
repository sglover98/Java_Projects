import java.util.Scanner;

public class Datetester{ 
        public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Date dt = new Date(9, 05, 1998);
        
        System.out.println("Enter The Month");
        int month = input.nextInt();
        dt.setMonth(month);
        
        System.out.println("Enter the Date");
        int day = input.nextInt();
        dt.setDay(day);
        
        System.out.println("enter the Year");
        int year = input.nextInt();
        dt.setYear(year);
        dt.display();

        
                
        }
}       
        
        