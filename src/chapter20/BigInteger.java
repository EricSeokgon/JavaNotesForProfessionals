package chapter20;

public class BigInteger {

    public BigInteger(String s) {

    }

    public static void main(String[] args) {
        BigInteger value1 = new BigInteger("10");
        BigInteger value2 = new BigInteger("10");
        BigInteger sum = value1.add(value2);
        System.out.println(sum);
    }

    private BigInteger add(BigInteger value2) {

        return value2;
    }


}
