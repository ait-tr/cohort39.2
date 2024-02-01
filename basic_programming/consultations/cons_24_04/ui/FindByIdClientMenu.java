package ui;

import dto.Response;
import entity.Client;
import lotto.service.UserInput;
import service.ClientService;
import shoppinglist.service.ProductService;

public class FindByIdClientMenu implements MenuCommand {

    private final ClientService service;

    public FindByIdClientMenu(ClientService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        UserInput userInput = new UserInput();
        int idSearch = userInput.uiInt("Please enter client id: ");

       Response<Client> response = service.findById(idSearch);
        if (response.getMessage().equals("Ok")) {
            System.out.println(response.getData());
        } else {
            System.out.println(response.getMessage());
        }
    }

    @Override
    public String getMenuName() {
        return "Find client by ID";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
