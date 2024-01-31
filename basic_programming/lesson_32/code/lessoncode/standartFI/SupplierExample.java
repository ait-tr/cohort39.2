package standartFI;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        Supplier<Double> myRandomValue = () -> {
            Double result = Math.random() * 56.75;
            result = Math.pow(result,3);
            return result;
         };

        System.out.println(myRandomValue.get());
    }
}
