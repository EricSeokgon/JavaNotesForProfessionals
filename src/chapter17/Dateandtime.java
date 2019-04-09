package chapter17;

import java.time.*;

public class Dateandtime {
    public static void main(String[] args) {
        /*LocalDateTime dateTime = LocalDateTime.of(2016, Month.JULY, 27, 8, 0);
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime parsed = LocalDateTime.parse("2016-07-27T07:00:00");*/

        /*ZoneId zoneId = ZoneId.of("UTC+2");
        ZonedDateTime dateTime = ZonedDateTime.of(2016, Month.JULY, 27, 7, 0, 0, 235, zoneId);
        LocalDate localDate = null;
        LocalTime localTime = null;
        ZonedDateTime composition = ZonedDateTime.of(localDate, localTime, zoneId);
        ZonedDateTime now = ZonedDateTime.now(); // Default time zone
        ZonedDateTime parsed = ZonedDateTime.parse("2016-07-27T07:00:00+01:00[Europe/Stockholm]");*/

        /*ZoneOffset zoneOffset = ZoneOffset.ofHours(2);
        OffsetDateTime dateTime = OffsetDateTime.of(2016, 7, 27, 7, 0, 0, 235, zoneOffset);
        OffsetDateTime composition = OffsetDateTime.of(localDate, localTime, zoneOffset);
        OffsetDateTime now = OffsetDateTime.now(); // Offset taken from the default ZoneId
        OffsetDateTime parsed = OffsetDateTime.parse("2016-07-27T07:00:00+02:00");*/

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        LocalDateTime anHourFromNow = LocalDateTime.now().plusHours(1);
        Long daysBetween = java.time.temporal.ChronoUnit.DAYS.between(LocalDate.now(),
                LocalDate.now().plusDays(3)); // 3
        Duration duration = Duration.between(Instant.now(),
                ZonedDateTime.parse("2016-07-27T07:00:00+01:00[Europe/Stockholm]"));
    }
}
