package userException;

import lotto.service.UserInput;

import java.util.InputMismatchException;


public class ShopListApp {
    public static void main(String[] args) {

        ValidationServiceWithException validationService = new ValidationServiceWithException();
        ProductService service = new ProductService(validationService);
        UserInput ui = new UserInput();

        while (true) {
            try {

                String name = ui.uiText("Enter product name: ");
                Double price = ui.uiDouble("Enter product price: ");

                Product product = new Product(name, price);
                service.add(product);
            } catch (NumberFormatException e) {
                System.out.println("Incorrect number entered");
            } catch (InputMismatchException e){
                System.out.println("Incorrect input type entered");
            } catch (ProductValidationException e) {
                System.out.println("Validation failed");
                System.out.println(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
