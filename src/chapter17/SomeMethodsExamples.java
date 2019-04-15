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
}
