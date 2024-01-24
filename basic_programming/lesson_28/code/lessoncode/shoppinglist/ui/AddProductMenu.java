package shoppinglist.ui;

import shoppinglist.dto.ProductDto;
import shoppinglist.dto.ResponseForClientAddProduct;
import shoppinglist.service.ProductService;
import shoppinglist.service.util.UserInput;

import java.util.Scanner;

public class AddProductMenu implements MenuCommand{

    private final ProductService service;

    public AddProductMenu(ProductService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        String name = UserInput.getText("Please enter product name:");
        String description = UserInput.getText("Please enter product description:");
        Double price = UserInput.getDouble("Please enter product price:");

        ProductDto productDto = new ProductDto(name, price, description);

        ResponseForClientAddProduct addResult = service.addNewProduct(productDto);
        System.out.println(addResult);

    }

    @Override
    public String getMenuName() {
        return "Add new product";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
