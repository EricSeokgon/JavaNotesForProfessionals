package chapter17;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculateDifference {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2017, 5, 1);
        LocalDate d2 = LocalDate.of(2017, 5, 18);

        long days = ChronoUnit.DAYS.between(d1, d2);
        System.out.println( days );
    }

}
