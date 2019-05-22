package chapter20;

public class BigInteger {

    public BigInteger(String s) {

    }

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
    }

    private BigInteger multiply(BigInteger value2) {
        return null;
    }

    private BigInteger divide(BigInteger value2) {
        return null;
    }

    private BigInteger subtract(BigInteger value2) {

        return value2;
    }

    private BigInteger add(BigInteger value2) {

        return value2;
    }


}
