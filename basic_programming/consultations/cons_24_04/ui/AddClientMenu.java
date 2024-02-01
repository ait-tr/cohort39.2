package ui;

import entity.Client;
import service.ClientService;
import shoppinglist.dto.ProductDto;
import shoppinglist.dto.ResponseForClientAddProduct;
import shoppinglist.service.ProductService;
import shoppinglist.service.util.UserInput;

public class AddClientMenu implements MenuCommand {

    private final ClientService service;

    public AddClientMenu(ClientService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        service.add(service.createClient());

    }

    @Override
    public String getMenuName() {
        return "Add new client";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
