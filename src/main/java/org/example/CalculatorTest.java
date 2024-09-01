package org.example;

import static org.assertj.core.api.Assertions.*;


public class CalculatorTest {

    public static void main(String[] args) {
        assertThat(Calculator.calculateDiscount(100, 20)).isEqualTo(80);
        assertThat(Calculator.calculateDiscount(1, 20)).isEqualTo(1);
        assertThat(Calculator.calculateDiscount(100, 100)).isEqualTo(0);

        assertThatThrownBy(() -> Calculator.calculateDiscount(-100,20))
                .isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> Calculator.calculateDiscount(100,-10))
                .isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> Calculator.calculateDiscount(100,200))
                .isInstanceOf(ArithmeticException.class);
    }



}
