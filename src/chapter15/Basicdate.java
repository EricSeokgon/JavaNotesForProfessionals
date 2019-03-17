package chapter15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Basicdate {
    public static void main(String[] args) {
        // define the format to use
        String formatString = "yyyy/MM/dd hh:mm.ss";
// get a current date object
        Date date = Calendar.getInstance().getTime();
// create the formatter
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatString);
// format the date
        String formattedDate = simpleDateFormat.format(date);
// print it
        System.out.println(formattedDate);
// single-line version of all above code
        System.out.println(new SimpleDateFormat("yyyy/MM/dd hh:mm.ss ").format(Calendar.getInstance().getTime()));
    }
}
