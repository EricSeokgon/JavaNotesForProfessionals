package chapter20;

public class BigInteger {

    String decimalString = "-1";
    BigInteger valueFromDecimalString = new BigInteger(decimalString);

    int intValue = Integer.MIN_VALUE; // negative
    BigInteger valueFromInt = BigInteger.valueOf(intValue);

    private static BigInteger valueOf(int intValue) {
    }

    public BigInteger(String decimalString) {

    }
}
