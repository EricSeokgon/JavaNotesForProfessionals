package chapter16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Convertformatted {

    /**
     * Parses the date using the given format.
     *
     * @param formattedDate the formatted date string
     * @param dateFormat    the date format which was used to create the string.
     * @return the date
     */
    public static Date parseDate(String formattedDate, String dateFormat) {
        Date date = null;
        SimpleDateFormat objDf = new SimpleDateFormat(dateFormat);
        try {
            date = objDf.parse(formattedDate);
        } catch (ParseException e) {
// Do what ever needs to be done with exception.
        }
        return date;
    }
}


