package interfaces.example5;

public class CalculatorType1 implements Calculator{
    @Override
    public Integer sum(Integer x, Integer y) {
        return x + y;
    }

    @Override
    public Integer sub(Integer x, Integer y) {
        return x - y;
    }

    @Override
    public Integer pow(Integer x, Integer y) {
        Integer resultPow = (int) Math.pow(x,y);
        return resultPow;
    }

    @Override
    public Integer factorial(Integer number) {
        Integer result = 1;
        for (int i = 2; i <= number; i++) {
            result  = result * i;
        }
        return result;
    }
}
