package chapter9;

public class Literals {
    public static void main(String[] args) {
        int i1 = 123456;
        int i2 = 123_456;
        System.out.println(i1 == i2); //true

        byte color = 1_2_3;
        short yearsAAnnoDomini = 2_019;
        int socialSecurtyNumber = 999_99_9999;
        long creditCardNumber = 1234_5678_9012_3456L;
        float piFoutDecimals = 3.14_15F;
        double piTenDecimals = 3.14_15_92_65_35;
    }
}
