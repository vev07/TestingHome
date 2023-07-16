package Test1.Trees.src.summary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {
        int x = 5;
        int y = 10;
         int expectedResult = 15;
        Assertions.assertEquals(expectedResult, Calculator.sum(x,y), "test sum isn't Ok");
    }

    @Test
    void multiply() {
        int x = 5;
        int y = 10;
        int expectedResult = 50;
        Assertions.assertEquals(expectedResult, Calculator.multiply(x,y),"test multiply isn't Ok");
    }
    @Test
    void divided() {
        int x = 50;
        int y = 10;
        int expectedResult = 5;

        Assertions.assertEquals(expectedResult, Calculator.divided(x,y),"test divided isn't Ok");
    }
    @Test
    void divided2() {
        int x = 50;
        int y = 0;

        Assertions.assertThrows(ArithmeticException.class,  () -> Calculator.divided(x,y),"test divided2 assertThrows isn't Ok");

    }

}