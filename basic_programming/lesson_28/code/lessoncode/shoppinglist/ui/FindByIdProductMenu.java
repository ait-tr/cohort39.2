package shoppinglist.ui;

import shoppinglist.dto.ResponseForClientFindAllProducts;
import shoppinglist.dto.ResponseForClientFindByIdProduct;
import shoppinglist.service.ProductService;

import java.util.Scanner;

public class FindByIdProductMenu implements MenuCommand{

    private final ProductService service;

    public FindByIdProductMenu(ProductService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter product id for search:");
        Integer idForSearch = scanner.nextInt();

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
