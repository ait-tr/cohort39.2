package userException;

import java.util.Scanner;

public class ShopListApp {
    public static void main(String[] args) {

        ValidationService validationService = new ValidationService();
        ProductService service = new ProductService(validationService);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product name: ");
        String name = scanner.nextLine();

        System.out.println("Enter product price: ");
        Double price = scanner.nextDouble();

        Product product = new Product(name, price);
        service.add(product);

    }
}
