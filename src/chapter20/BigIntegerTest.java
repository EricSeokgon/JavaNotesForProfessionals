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

        BigInteger one = BigInteger.valueOf(1);
        BigInteger two = BigInteger.valueOf(2);
        if(one.equals(two)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }


        BigInteger reallyBig = BigInteger.valueOf(1);
        if(BigInteger.ONE.equals(reallyBig)){
        //code when they are equal.
        }

        BigInteger reallyBig1 = BigInteger.valueOf(100);
        if(reallyBig.compareTo(reallyBig1) == 0){
        //code when both are equal.
        }
        else if(reallyBig.compareTo(reallyBig1) == 1){
        //code when reallyBig is greater than reallyBig1.
        }
        else if(reallyBig.compareTo(reallyBig1) == -1){
        //code when reallyBig is less than reallyBig1.

        }
    }

}
