package test;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();


        int xTestValue = 20;
        int yTestValue = 10;

        int expectedResult = 30;
        int actualResult = calculator.sum(xTestValue, yTestValue);

        printTestResult("Test method 'sum'", expectedResult, actualResult);


        expectedResult = 10;
        actualResult = calculator.sub(xTestValue, yTestValue);

        printTestResult("Test method 'sub'", expectedResult, actualResult);


        expectedResult = 200;
        actualResult = calculator.multi(xTestValue, yTestValue);

        printTestResult("Test method 'multi'", expectedResult, actualResult);

        expectedResult = 2;
        actualResult = calculator.div(xTestValue, yTestValue);

        printTestResult("Test method 'div'", expectedResult, actualResult);




    }

    private static void printTestResult(String message, double expectedResult, double actualResult){
        if (expectedResult == actualResult) {
            System.out.println(message + " is OK!");
        } else {
            System.out.println(message + " is FAIL!");
            System.out.println("Expected result: " + expectedResult + ", but received : " + actualResult);
        }
    }
}
