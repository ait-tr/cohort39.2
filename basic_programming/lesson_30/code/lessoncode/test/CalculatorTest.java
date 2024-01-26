package test;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    int x = 20;
    int y;

    @Test
    public void sum() {
        y = 10;
        int expectedResult = 30;
        int actualResult = calculator.sum(x,y);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void sub() {
        y = 20;
        int expectedResult = 0;
        int actualResult = calculator.sub(x,y);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void multi() {
        y = 15;
        int expectedResult = 300;
        int actualResult = calculator.multi(x,y);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void div() {
        y = 10;
        int expectedResult = 2;
        int actualResult = calculator.div(x,y);

        assertEquals(expectedResult, actualResult);
    }
}