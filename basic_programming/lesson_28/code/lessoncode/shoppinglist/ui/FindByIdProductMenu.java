package shoppinglist.ui;

import shoppinglist.dto.ResponseForClientFindAllProducts;
import shoppinglist.dto.ResponseForClientFindByIdProduct;
import shoppinglist.service.ProductService;
import shoppinglist.service.util.UserInput;

import java.util.Scanner;

public class FindByIdProductMenu implements MenuCommand{

    private final ProductService service;

    public FindByIdProductMenu(ProductService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        Integer idForSearch = UserInput.getInt("Please enter product id for search:");

        ResponseForClientFindByIdProduct findByIdResult = service.findById(idForSearch);
        System.out.println(findByIdResult);

    }

    @Override
    public String getMenuName() {
        return "Find product by ID";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
