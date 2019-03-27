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
    }
}
