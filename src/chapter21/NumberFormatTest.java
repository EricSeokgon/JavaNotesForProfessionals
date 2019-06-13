package chapter21;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "IN");
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        numberFormat.format(10000000.99);

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        currencyFormat.format(10340.999);

        NumberFormat percentageFormat = NumberFormat.getPercentInstance(locale);
        percentageFormat.format(10929.999);

    }

}
