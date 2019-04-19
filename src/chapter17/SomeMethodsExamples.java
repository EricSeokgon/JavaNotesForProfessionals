package chapter17;

import java.time.*;
import java.util.TimeZone;

public class SomeMethodsExamples {
    public static void checkLocalDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local Date time using static now() method ::: >>> " + localDateTime);
        LocalDateTime ldt1 = LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get("AET")));
        System.out.println("LOCAL TIME USING now(ZoneId zoneId) method ::: >>>>" + ldt1);
        LocalDateTime ldt2 = LocalDateTime.now(Clock.system(ZoneId.of(ZoneId.SHORT_IDS.get("PST"))));
        System.out.println("Local TIME USING now(Clock.system(ZoneId.of())) ::: >>>> " + ldt2);
        System.out.println("Following is a static map in ZoneId class which has mapping of short timezone names to their Actual timezone names");
        System.out.println(ZoneId.SHORT_IDS);
    }

    /**
     * This has the methods of the class {@link LocalDate}
     */
    public static void checkLocalDate() {
        LocalDate localDate = LocalDate.now();
        System.out.println("Gives date without Time using now() method. >> " + localDate);
        LocalDate localDate2 = LocalDate.now(ZoneId.of(ZoneId.SHORT_IDS.get("ECT")));
        System.out.println("now() is overridden to take ZoneID as parametere using this we can get the same date under different timezones. >> " + localDate2);
    }

    /**
     * This has the methods of abstract class {@link Clock}. Clock can be used
     * for time which has time with {@link TimeZone
     * }.
     */
    public static void checkClock() {
        Clock clock = Clock.systemUTC();
        // Represents time according to ISO 8601
        System.out.println("Time using Clock class : " + clock.instant());
    }

    /**
     * This has the {@link Instant} class methods.
     */
    public static void checkInstant() {
        Instant instant = Instant.now();
        System.out.println("Instant using now() method :: " + instant);
        Instant ins1 = Instant.now(Clock.systemUTC());
        System.out.println("Instants using now(Clock clock) :: " + ins1);
    }

    /**
     * This class checks the methods of the {@link Duration} class.
     */
    public static void checkDuration() {
// toString() converts the duration to PTnHnMnS format according to ISO
// 8601 standard. If a field is zero its ignored.
// P is the duration designator (historically called "period") placed at
// the start of the duration representation.
// Y is the year designator that follows the value for the number of
// years.
// M is the month designator that follows the value for the number of
// months.
// W is the week designator that follows the value for the number of
// weeks.
// D is the day designator that follows the value for the number of
// days.
// T is the time designator that precedes the time components of the
// representation.
// H is the hour designator that follows the value for the number of
// hours.
// M is the minute designator that follows the value for the number of
// minutes.
// S is the second designator that follows the value for the number of
// seconds.
        System.out.println(Duration.ofDays(2));
    }

    /**
     * Shows Local time without date. It doesn't store or represenet a date and
     * time. Instead its a representation of Time like clock on the wall.
     */
    public static void checkLocalTime() {
        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime :: " + localTime);
    }

    /**
     * A date time with Time zone details in ISO-8601 standards.
     */
    public static void checkZonedDateTime() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId
                .of(ZoneId.SHORT_IDS.get("CST")));
        System.out.println(zonedDateTime);
    }
}
