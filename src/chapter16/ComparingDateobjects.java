package chapter16;

import java.util.Calendar;
import java.util.Date;

public class ComparingDateobjects {
    public static void main(String[] args) {
        //Use of Calendar and Date objects
        final Date today = new Date();
        final Calendar calendar = Calendar.getInstance();
        calendar.set(1990, Calendar.NOVEMBER, 1, 0, 0, 0);
        Date birthdate = calendar.getTime();
        final Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1990, Calendar.NOVEMBER, 1, 0, 0, 0);
        Date samebirthdate = calendar2.getTime();

        //Before example
        System.out.printf("Is %1$tF before %2$tF? %3$b%n", today, birthdate,
                Boolean.valueOf(today.before(birthdate)));
        System.out.printf("Is %1$tF before %1$tF? %3$b%n", today, today,
                Boolean.valueOf(today.before(today)));
        System.out.printf("Is %2$tF before %1$tF? %3$b%n", today, birthdate,
                Boolean.valueOf(birthdate.before(today)));

        //After example
        System.out.printf("Is %1$tF after %2$tF? %3$b%n", today, birthdate,
                Boolean.valueOf(today.after(birthdate)));
        System.out.printf("Is %1$tF after %1$tF? %3$b%n", today, birthdate,
                Boolean.valueOf(today.after(today)));
        System.out.printf("Is %2$tF after %1$tF? %3$b%n", today, birthdate,
                Boolean.valueOf(birthdate.after(today)));

        //Compare example
        System.out.printf("Compare %1$tF to %2$tF: %3$d%n", today, birthdate,
                Integer.valueOf(today.compareTo(birthdate)));
        System.out.printf("Compare %1$tF to %1$tF: %3$d%n", today, birthdate,
                Integer.valueOf(today.compareTo(today)));
        System.out.printf("Compare %2$tF to %1$tF: %3$d%n", today, birthdate,
                Integer.valueOf(birthdate.compareTo(today)));

        //Equal example
        System.out.printf("Is %1$tF equal to %2$tF? %3$b%n", today, birthdate,
                Boolean.valueOf(today.equals(birthdate)));
        System.out.printf("Is %1$tF equal to %2$tF? %3$b%n", birthdate, samebirthdate,
                Boolean.valueOf(birthdate.equals(samebirthdate)));
        System.out.printf("Because birthdate.getTime() -> %1$d is different from samebirthdate.getTime() -> %2$d,there are millisecondes!%n", Long.valueOf(birthdate.getTime()), Long.valueOf(samebirthdate.getTime()));
    }
}
