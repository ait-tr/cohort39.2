package ui;

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

       service.findById(idSearch);

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
