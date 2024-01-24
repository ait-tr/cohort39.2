package shoppinglist.ui;

import shoppinglist.dto.ProductDto;
import shoppinglist.dto.ResponseForClientAddProduct;
import shoppinglist.dto.ResponseForClientForDelete;
import shoppinglist.service.ProductService;

import java.util.Scanner;

public class DeleteProductMenu implements MenuCommand{

    private final ProductService service;

    public DeleteProductMenu(ProductService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter product id for delete:");
        Integer idFroDelete = scanner.nextInt();

        ResponseForClientForDelete deleteResult = service.deleteById(idFroDelete);
        System.out.println(deleteResult);

    }

    @Override
    public String getMenuName() {
        return "Delete product";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
