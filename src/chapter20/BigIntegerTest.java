package chapter20;

import java.math.BigInteger;

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
    }

}
