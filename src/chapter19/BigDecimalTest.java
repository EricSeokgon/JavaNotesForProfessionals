package chapter19;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal a = BigDecimal.valueOf(10L); //Returns cached Object reference
        BigDecimal b = new BigDecimal(10L); //Does not return cached Object reference
        BigDecimal a1 = BigDecimal.valueOf(20L); //Does not return cached Object reference
        BigDecimal b1 = new BigDecimal(20L); //Does not return cached Object reference
        BigDecimal a2 = BigDecimal.valueOf(15.15); //Preferred way to convert a double (or float)
        BigDecimal b2 = new BigDecimal(15.15); //Return unpredictable result
    }
}
