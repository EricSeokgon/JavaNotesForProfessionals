package chapter17;

import java.time.LocalDateTime;
import java.time.Month;

public class Dateandtime {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2016, Month.JULY, 27, 8, 0);
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime parsed = LocalDateTime.parse("2016-07-27T07:00:00");
    }
}
