package shoppinglist.ui;

import shoppinglist.dto.ProductDto;
import shoppinglist.dto.ResponseForClientAddProduct;
import shoppinglist.dto.ResponseForClientForDelete;
import shoppinglist.service.ProductService;
import shoppinglist.service.util.UserInput;

import java.util.Scanner;

public class DeleteProductMenu implements MenuCommand{

    private final ProductService service;

    public DeleteProductMenu(ProductService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        Integer idFroDelete = UserInput.getInt("Please enter product id for delete:");

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
