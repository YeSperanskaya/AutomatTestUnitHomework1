package org.example;

public class Calculator {
    public static int calculateDiscount(int sum, int procent) {
        if ((sum < 0) || (procent > 100) || (procent < 0)) {
            throw new ArithmeticException("Были введены некорректные данные");
        }
        return (Integer) (sum - (sum / 100 * procent));
    }
}
