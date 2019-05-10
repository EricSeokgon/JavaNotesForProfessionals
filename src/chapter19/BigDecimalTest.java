package chapter19;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalTest {
    public static void main(String[] args) {
        //BigDecimal.valueOf()
        BigDecimal a = BigDecimal.valueOf(10L); //Returns cached Object reference
        BigDecimal b = new BigDecimal(10L); //Does not return cached Object reference
        BigDecimal a1 = BigDecimal.valueOf(20L); //Does not return cached Object reference
        BigDecimal b1 = new BigDecimal(20L); //Does not return cached Object reference
        BigDecimal a2 = BigDecimal.valueOf(15.15); //Preferred way to convert a double (or float)
        BigDecimal b2 = new BigDecimal(15.15); //Return unpredictable result

        //Mathematical operations with BigDecimal
        BigDecimal a3 = new BigDecimal("5");
        BigDecimal b3 = new BigDecimal("7");

        //Equivalent to result = a + b
        BigDecimal result = a3.add(b3);
        System.out.println(result);

        //Equivalent to result = a - b
        BigDecimal result2 = a3.subtract(b3);
        System.out.println(result2);

        //Equivalent to result = a * b
        BigDecimal result3 = a3.multiply(b3);
        System.out.println(result3);

        MathContext returnRules = new MathContext(4, RoundingMode.HALF_DOWN);
        //Equivalent to result = a * b
        BigDecimal result4 = a3.multiply(b3, returnRules);
        System.out.println(result4);

        BigDecimal result5 = a3.divide(b3);
        System.out.println(result5);

        //Equivalent to result = a / b (Upto 10 Decimal places and Round HALF_UP)
        BigDecimal result6 = a3.divide(b3,10,RoundingMode.HALF_UP);
        System.out.println(result6);

        //Equivalent to result = a % b
        BigDecimal result7 = a3.remainder(b3);
        System.out.println(result7);

        //Equivalent to result = a^10
        BigDecimal result8 = a3.pow(10);
        System.out.println(result8);

        //Equivalent to result = MAX(a,b)
        BigDecimal result9 = a3.max(b3);
        System.out.println(result9);

        //Equivalent to result = MIN(a,b)
        BigDecimal result10 = a3.min(b3);
        System.out.println(result10);


    }
}
