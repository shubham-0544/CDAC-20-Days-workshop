public class MyDate{

    private int day;
    private int month;
    private int year;

    public MyDate (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year =year;
    }

    public int getday() { 
        return day; }

    public int getmonth() { 
        return month; }

    public int getyear() {
        return year; }

    public void setday(int day) {
         this.day = day;}

    public void setmonth(int month) { 
        this.month = month; }

    public void setyear(int year) {
        this.year =year;
    }
    
    public int toint() {
        return "day: " + day + ", month : " +month + ",year :" +year;
    }
    }