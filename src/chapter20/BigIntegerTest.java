package chapter20;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class BigIntegerTest {
    public static void main(String[] args) {
        BigInteger value1 = new BigInteger("10");
        BigInteger value2 = new BigInteger("10");

        BigInteger sum = value1.add(value2);
        System.out.println(sum);

        BigInteger sub = value1.subtract(value2);
        System.out.println(sub);

        BigInteger div = value1.divide(value2);
        System.out.println(div);

        BigInteger mul = value1.multiply(value2);
        System.out.println(mul);

        BigInteger power = value1.pow(3);
        System.out.println(power);

        System.out.println(value1.gcd(value2));

        System.out.println(value1.max(value2));

        System.out.println(value1.min(value2));

        BigInteger one = BigInteger.valueOf(1);
        BigInteger two = BigInteger.valueOf(2);
        if (one.equals(two)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }


        BigInteger reallyBig = BigInteger.valueOf(1);
        if (BigInteger.ONE.equals(reallyBig)) {
            //code when they are equal.
        }

        BigInteger reallyBig1 = BigInteger.valueOf(100);
        if (reallyBig.compareTo(reallyBig1) == 0) {
            //code when both are equal.
        } else if (reallyBig.compareTo(reallyBig1) == 1) {
            //code when reallyBig is greater than reallyBig1.
        } else if (reallyBig.compareTo(reallyBig1) == -1) {
            //code when reallyBig is less than reallyBig1.
        }

        BigInteger val1 = new BigInteger("10");
        BigInteger val2 = new BigInteger("9");
        val1.or(val2);
        val1.and(val2);
        val1.xor(val2);
        val1.shiftRight(1); // the argument be an Integer
        val1.shiftLeft(1); // here parameter should be Integer
        val1.not();
        val1.andNot(val2);

        String[] stringArray = {"foo", "bar", "baz"};
        List<String> stringList = Arrays.asList(stringArray);

    }
}
