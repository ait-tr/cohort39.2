package application2.ui;

import application2.core.dto.Response;
import application2.core.dto.ToDoDto;
import application2.service.AddToDoService;
import application2.service.validation.ValidationService;
import lotto.service.UserInput;

import java.util.Scanner;

public class AddToDoUiAction implements UIAction {

    private final AddToDoService service;
    private final ValidationService validationService;

    UserInput userInput = new UserInput();


    public AddToDoUiAction(AddToDoService service, ValidationService validationService) {
        this.service = service;
        this.validationService = validationService;
    }

    @Override
    public void execute() {

        String name = userInput.uiText("Enter task name: ");

        String description = userInput.uiText("Enter task description: ");

        ToDoDto dto = new ToDoDto(name, description);
        Response<Integer> response = service.add(dto);

        if (response.getData() != null) {
            System.out.println("ToDo added successfully. ID: " + response.getData());
        } else {
            System.out.println("Failed to add ToDo:");
            response.getErrors().forEach(error -> System.out.println("Error: " + error.getMessage()));
        }
    }

    @Override
    public String getActionName() {
        return "Add ToDo";
    }
}
