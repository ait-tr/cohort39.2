package ui;

import service.ClientService;
import shoppinglist.dto.ResponseForClientForDelete;
import shoppinglist.service.ProductService;
import shoppinglist.service.util.UserInput;

public class DeleteClientMenu implements MenuCommand {

    private final ClientService service;

    public DeleteClientMenu(ClientService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        service.delete(service.createClient());
    }

    @Override
    public String getMenuName() {
        return "Delete client";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
