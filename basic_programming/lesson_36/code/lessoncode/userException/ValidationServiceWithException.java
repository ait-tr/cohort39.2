package userException;

public class ValidationServiceWithException {

    /*
    проверка на:
    - продукт name не null
    - длина названия продукта меньше 3 символов
    - цена на null
    - цена продукта меньше либо равна 0
     */

    public void validate(Product product){
        if (product.getName() == null) {
            throw new ProductValidationException("Product name is null");
        }

        if (product.getName().equals("")) {
            throw new ProductValidationException( "Product name is empty");
        }

        if (product.getName().length() < 3) {
            throw new ProductValidationException( "Product name length less than 3");
        }

        if (product.getPrice() == null) {
            throw new ProductValidationException( "Product price is null");
        }

        if (product.getPrice() <= 0) {
            throw new ProductValidationException( "Product price less than 0");
        }

    }
}
