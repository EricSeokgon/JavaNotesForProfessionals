package chapter15;


import java.time.LocalDateTime;
import java.time.ZoneId;

public class LocalDate {
    public static void main(String[] args) {
// Create a default date time
        LocalDateTime lDateTime = LocalDateTime.now();
// Creates a date time from values
        lDateTime = LocalDateTime.of(2017, 12, 15, 11, 30);
// create a date time from string
        lDateTime = LocalDateTime.parse("2017-12-05T11:30:30");
// create a date time from zone
        LocalDateTime.now(ZoneId.systemDefault());
    }
}
