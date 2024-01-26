package testTask;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaxCalculatorImplTest {

    TaxCalculatorImpl taxCalculator = new TaxCalculatorImpl();


    @Test
    public void calculateTaxLessOrEqual20000() {

        double income = 100;
        double expectedTax = 25;
        double actualTax = taxCalculator.calculateTax(income);

        assertEquals(expectedTax, actualTax,0.0);

    }

    @Test
    public void calculateTaxMore20000() {

        double income = 30000;
        double expectedTax = 9000;
        double actualTax = taxCalculator.calculateTax(income);

        assertEquals(expectedTax, actualTax,0.0);

    }
}