package ui;

import lotto.service.UserInput;
import service.ClientService;
import shoppinglist.dto.ResponseForClientFindAllProducts;
import shoppinglist.service.ProductService;

public class FindClientByNameMenu implements MenuCommand {

    private final ClientService service;

    public FindClientByNameMenu(ClientService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        UserInput userInput = new UserInput();
        String nameSearch = userInput.uiText("Please enter client name: ");

        service.findByName(nameSearch);

    }

    @Override
    public String getMenuName() {
        return "Find client by name";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
