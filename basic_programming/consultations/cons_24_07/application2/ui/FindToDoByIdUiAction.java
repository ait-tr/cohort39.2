package application2.ui;

import application2.service.FindToDoByIdService;
import lotto.service.UserInput;

public class FindToDoByIdUiAction implements UIAction {

    private final FindToDoByIdService service;
    UserInput userInput = new UserInput();

    public FindToDoByIdUiAction(FindToDoByIdService service) {
        this.service = service;
    }


    @Override
    public void execute() {
       Integer searchId = userInput.uiInt("Please enter ID for search: ");
       var response = service.findById(searchId);

        System.out.println("Received response: " + response);

    }

    @Override
    public String getActionName() {
        return "Find ToDo by ID";
    }
}
