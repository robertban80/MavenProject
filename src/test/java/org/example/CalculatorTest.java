package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void checkAddition(){
        Calculator calculator = new Calculator();
        double result = calculator.add(1, 22);
        Assertions.assertEquals(result, 23);
    }

    @Test
    public void checkMultiply(){
        Calculator calculator = new Calculator();
        double result = calculator.multiply(2, 2);
        Assertions.assertEquals(result, 4);
    }
}
