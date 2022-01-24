
public class Date {
    private int m;
    private int d;
    private int y;

    public Date ( int month, int day, int year) {
        this.m = month;
        this.d = day;
        this.y = year;

    }
    //method to year

    public void setYear(int year){
        this.y = year;
    }

    //method to get month

    public void setMonth(int month){
        this.m = month;
    }

    // method to ger day
    public void setDay(int day){
        this.d = day;
    }

    //start retreving 

    public int getYear(){
        return y;
    }
    public int getMonth(){
        return m;
    }public int getDay(){
        return d;
    }

    //display

    public void display(){
        System.out.printf( "%d", getMonth(), getDay() , getYear());
    }
}



