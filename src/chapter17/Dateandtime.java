package chapter17;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Dateandtime {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2016, Month.JULY, 27, 8, 0);
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime parsed = LocalDateTime.parse("2016-07-27T07:00:00");

        ZoneId zoneId = ZoneId.of("UTC+2");
        ZonedDateTime dateTime = ZonedDateTime.of(2016, Month.JULY, 27, 7, 0, 0, 235, zoneId);
        ZonedDateTime composition = ZonedDateTime.of(localDate, localTime, zoneId);
        ZonedDateTime now = ZonedDateTime.now(); // Default time zone
        ZonedDateTime parsed = ZonedDateTime.parse("2016-07-27T07:00:00+01:00[Europe/Stockholm]");
    }
}
