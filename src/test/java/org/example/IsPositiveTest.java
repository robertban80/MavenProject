package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IsPositiveTest {

    @BeforeAll
    public static void beforeAllMethod(){
        System.out.println("Before All!");
    }
    @BeforeEach
    public void beforeEachMethod(){
        System.out.println("Before Each!");
    }
    @Test
    public void checkIsPositiveTrue(){
        IsPositive number = new IsPositive();
        boolean result = number.IsPositive(5);
        Assertions.assertTrue(result);
    }
    @Disabled ("Sarim peste acest test")  //asa sarim peste executarea unui test!
    @Test
    public void checkIsPositiveFalse(){
        IsPositive number = new IsPositive();
        boolean result = number.IsPositive(-1);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 13, 17, 256, Integer.MAX_VALUE})
    public void checkIsPositiveTrueParametrized(int number){
        IsPositive result = new IsPositive();
        Assertions.assertTrue(result.IsPositive(number));
    }

    @ParameterizedTest
    @ValueSource(ints ={-55, -44, -33,- 22, -11 , -Integer.MIN_VALUE})
    public void checkIsPositiveFalseParametrized(int number){
        IsPositive result = new IsPositive();
        Assertions.assertFalse(result.IsPositive(number));
    }

    @AfterEach
    public void afterEachMethod(){
        System.out.println("After Each!");
    }

    @AfterAll
    public static void afterAllMethod(){
        System.out.println("After All!");
    }

}
