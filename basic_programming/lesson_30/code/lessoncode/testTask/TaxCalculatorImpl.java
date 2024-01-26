package testTask;

public class TaxCalculatorImpl implements TaxCalculator{
    @Override
    public double calculateTax(double income) {
        double taxAmount;

        if (income <= 20000){
            taxAmount = income * 0.25;
        } else {
            taxAmount = 20000 * 0.25 + (income - 20000) * 0.40;
        }

        return taxAmount;
    }
}
