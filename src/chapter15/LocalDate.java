package chapter15;


import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class LocalDate {
    public static void main(String[] args) {
        Date date = Date.from(Instant.now());
        ZoneId defaultZoneId = ZoneId.systemDefault();
// Date to LocalDateTime
        LocalDateTime localDateTime = date.toInstant().atZone(defaultZoneId).toLocalDateTime();
// LocalDateTime to Date
        Date out = Date.from(localDateTime.atZone(defaultZoneId).toInstant());
    }
}
