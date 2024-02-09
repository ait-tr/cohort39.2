package userException;

import java.util.ArrayList;
import java.util.List;

public class ValidationServiceWithException {

    /*
    проверка на:
    - продукт name не null
    - длина названия продукта меньше 3 символов
    - цена на null
    - цена продукта меньше либо равна 0
     */

    public void validate(Product product){

        List<String> errors = new ArrayList<>();

        if (product.getName() == null) {
            errors.add("Product name is null");
        }

        if (product.getName().equals("")) {
            errors.add( "Product name is empty");
        }

        if (product.getName().length() < 3) {
            errors.add( "Product name length less than 3");
        }

        if (product.getPrice() == null) {
            errors.add( "Product price is null");
        }

        if (product.getPrice() <= 0) {
            errors.add( "Product price less than 0");
        }

        if (!errors.isEmpty()) {
            String errorMessage = errors.stream()
                    .reduce((finalMessage, currentMessage) -> (finalMessage + "\n" + currentMessage))
                    .get();
            throw new ProductValidationException(errorMessage);
        }

    }
}
