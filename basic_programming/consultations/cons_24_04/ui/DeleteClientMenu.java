package ui;

import dto.Response;
import entity.Client;
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

        Response< Boolean> response = service.delete(service.createClient());
        if (response.equals("Ok")) {
            System.out.println(response.getData());
        } else {
            System.out.println(response.getMessage());
        }
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
