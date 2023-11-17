package testing;

public class TempTest {
    public static void main(String[] args) {
        TempConverter tempConverter = new TempConverter();

        double tempSource = 100;
        double expectedResult = 212;
        double actualResult = tempConverter.converterFromCelsiusToFahrenheit(tempSource);

        if (expectedResult == actualResult) {
            System.out.println("Test #1 passed!");
        } else {
            System.out.println("Test #1 FAILED!!!");
            System.out.println("Expected result " + expectedResult +
                    " ,but received " + actualResult);
        }

    }
}
