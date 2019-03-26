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
    }
}
