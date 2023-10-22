package demo;

import java.util.Calendar;
import java.util.Date;

public class DateAndCalender {
    public static void main(String[] args) {
        Date currentDate= new Date();
        System.out.println("The current date is : "+ currentDate);

        Calendar calendar=Calendar.getInstance();
        System.out.println("Current time :" +calendar.getTime());
    }
}
