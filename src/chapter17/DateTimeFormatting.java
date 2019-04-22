package chapter17;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {
    public static void main(String[] args) {
        //Parsing
        String pattern = "d-MM-yyyy HH:mm";
        DateTimeFormatter dtF1 = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime ldp1 = LocalDateTime.parse("2014-03-25T01:30"), //Default format
                ldp2 = LocalDateTime.parse("15-05-2016 13:55", dtF1); //Custom format
        System.out.println(ldp1 + "\n" + ldp2); //Will be printed in Default format
        //Formatting
        DateTimeFormatter dtF2 = DateTimeFormatter.ofPattern("EEE d, MMMM, yyyy HH:mm");
        DateTimeFormatter dtF3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime ldtf1 = LocalDateTime.now();
        System.out.println(ldtf1.format(dtF2) + "\n" + ldtf1.format(dtF3));
    }
}
