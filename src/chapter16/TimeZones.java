package chapter16;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeZones {
    public static void main(String[] args) {
        Date date = new Date();
        //print default time zone
        System.out.println(TimeZone.getDefault().getDisplayName());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //note: time zone not in format!
//print date in the original time zone
                System.out.println(sdf.format(date));
//current time in London
        sdf.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        System.out.println(sdf.format(date));
    }
}
