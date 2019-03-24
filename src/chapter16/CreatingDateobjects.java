package chapter16;

import java.util.Calendar;
import java.util.Date;

public class CreatingDateobjects {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(90, Calendar.DECEMBER, 11);
        Date myBirthDate = calendar.getTime();
        System.out.println(myBirthDate); // Mon Dec 31 00:00:00 IST 1990

        calendar.set(90, Calendar.DECEMBER, 11, 8, 32, 35);
        Date myBirthDatenTime = calendar.getTime();
        System.out.println(myBirthDatenTime); // Mon Dec 31 08:32:35 IST 1990
    }
}
