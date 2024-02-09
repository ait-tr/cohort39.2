package userException;

public class ValidationService {

    /*
    проверка на:
    - продукт name не null
    - длина названия продукта меньше 3 символов
    - цена на null
    - цена продукта меньше либо равна 0
     */

    public String validate(Product product){
        if (product.getName() == null) {
            return "Product name is null";
        }  if (product.getName().equals("")) {
            return "Product name is empty";
        }
        if (product.getName().length() < 3) {
            return "Product name length less than 3";
        }
        if (product.getPrice() == null) {
            return "Product price is null";
        }
        if (product.getPrice() <= 0) {
            return "Product price less than 0";
        }
        return "Ok";
    }
}
