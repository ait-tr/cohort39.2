package application2.ui;

import application2.service.FindToDoService;

public class FindToDoUiAction implements UIAction {

    private final FindToDoService service;

    public FindToDoUiAction(FindToDoService service) {
        this.service = service;
    }


    @Override
    public void execute() {
       var response = service.findAll();

        System.out.println("Received response: " + response);

    }

    @Override
    public String getActionName() {
        return "Find All ToDo";
    }
}
