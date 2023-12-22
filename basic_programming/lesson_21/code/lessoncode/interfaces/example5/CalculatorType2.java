package interfaces.example5;

public class CalculatorType2 implements Calculator{
    @Override
    public Integer sum(Integer x, Integer y) {
        printData(x,y);
        return x + y;
    }

    @Override
    public Integer sub(Integer x, Integer y) {
        printData(x,y);
        return x - y;
    }

    @Override
    public Integer pow(Integer x, Integer y) {
        Integer resultPow = 1;
        for (int i = 0; i < y; i++) {
           resultPow = resultPow * x;
        }
        return resultPow;
    }

    @Override
    public Integer factorial(Integer number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    /*

    1ый вызов метода factorial - входной параметр : 3
        должен вернуть 3 * результат от метода factorial ( 2 ) - результат от второго вызова =  2 поэтому общий результат работы метода возвращается 3 * 2 * 1 = 6

         2ой вызов метода factorial - входной параметр : 2
        должен вернуть 2 * результат от метода factorial ( 1 )  - результат от третьего вызова = 1  поэтому из второго вызова возвращается 2 * 1

             3ий вызов метода factorial - входной параметр : 1
        должен вернуть 1


     */

    private void printData(Integer x, Integer y) {
        System.out.println("Полученные от пользователя значения:");
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }
}
