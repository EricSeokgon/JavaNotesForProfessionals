package chapter16;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertingDate {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy"); //pattern is specified here
        System.out.println(dateFormat.format(today)); //25-Feb-16

        dateFormat.applyPattern("dd-MM-yyyy");
        System.out.println(dateFormat.format(today)); //25-02-2016
        dateFormat.applyPattern("dd-MM-yyyy HH:mm:ss E");
        System.out.println(dateFormat.format(today)); //25-02-2016 06:14:33 Thu
    }
}
