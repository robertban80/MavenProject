package org.example;

import org.junit.jupiter.api.*;

import java.util.SortedMap;

public class CalculatorTest {

    @BeforeAll
    public static void inainteDeToateMethod(){
        System.out.println("Before All - Se executa inainte de toate metodele!!!");
    }
    @BeforeEach
    public void inainteDeFiecareMethod(){
        System.out.println("Before Each - Se executa inainte de fiecare metoda!!!");
    }


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

    @AfterEach
    public void dupaFiecareMethod(){
        System.out.println("After Each - Se executa dupa fiecare metoda!!! ");
    }

    @AfterAll
    public static void dupaToateMethod(){
        System.out.println("After All - Se executa dupa ce se executa toate metodele!!!");
    }
}
