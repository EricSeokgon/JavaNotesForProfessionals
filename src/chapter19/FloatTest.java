package chapter19;

import java.math.BigDecimal;

public class FloatTest {
    public static void main(String[] args) {
        float accountBalance = 10000.00f;
        System.out.println("Operations using float:");
        System.out.println("1000 operations for 1.99");
        for (int i = 0; i < 1000; i++) {
            accountBalance -= 1.99f;
        }
        System.out.println(String.format("Account balance after float operations: %f",
                accountBalance));
        BigDecimal accountBalanceTwo = new BigDecimal("10000.00");
        System.out.println("Operations using BigDecimal:");
        System.out.println("1000 operations for 1.99");
        BigDecimal operation = new BigDecimal("1.99");
        for (int i = 0; i < 1000; i++) {
            accountBalanceTwo = accountBalanceTwo.subtract(operation);
        }
        System.out.println(String.format("Account balance after BigDecimal operations: %f",
                accountBalanceTwo));
    }
}
