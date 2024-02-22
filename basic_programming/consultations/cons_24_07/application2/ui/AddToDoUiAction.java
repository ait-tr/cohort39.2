package application2.ui;

import application2.core.dto.AddToDoRequest;
import application2.service.AddToDoService;
import lotto.service.UserInput;

public class AddToDoUiAction implements UIAction {

    private final AddToDoService service;

    UserInput userInput = new UserInput();

    public AddToDoUiAction(AddToDoService service) {
        this.service = service;
    }


    @Override
    public void execute() {
        String name = userInput.uiText("Enter task name: ");
        String description = userInput.uiText("Enter task description: ");

        var request = new AddToDoRequest(name, description);
        var response = service.add(request);

        System.out.println("Received response: " + response);

    }

    @Override
    public String getActionName() {
        return "Add ToDo";
    }
}
