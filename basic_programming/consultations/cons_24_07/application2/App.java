package application2;

import application2.repository.ArrayListRepository;
import application2.repository.ToDoRepository;
import application2.service.AddToDoService;
import application2.service.FindToDoByIdService;
import application2.service.FindToDoService;
import application2.service.validation.ValidationRule;
import application2.service.validation.ValidationService;
import application2.service.validation.rule.*;
import application2.ui.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // создаем наш репозиторий
        ToDoRepository repository = new ArrayListRepository();

        // создаем правила валидации
        // запишем их в коллекцию для передачи в сервис

        ArrayList<ValidationRule> validationRules = new ArrayList<>();
        validationRules.add(new ToDoNameNullValidationRule());
        validationRules.add(new ToDoNameMinLengthValidationRule());
        validationRules.add(new ToDoNameMaxLengthValidationRule());
        validationRules.add(new ToDoDescriptionNullValidationRule());
        validationRules.add(new ToDoDescriptionMaxLengthValidationRule());

        // создаем ValidationService куда передаем список правил

        ValidationService validationService = new ValidationService(validationRules);

        AddToDoService addToDoService = new AddToDoService(repository, validationService);
        FindToDoService findToDoService = new FindToDoService(repository);
        FindToDoByIdService findToDoByIdService = new FindToDoByIdService(repository);


        AddToDoUiAction addToDoUiAction = new AddToDoUiAction(addToDoService);
        FindToDoUiAction findToDoUiAction = new FindToDoUiAction(findToDoService);
        FindToDoByIdUiAction findToDoByIdUiAction = new FindToDoByIdUiAction(findToDoByIdService);

        ExitUiAction exitUiAction = new ExitUiAction();

        List<UIAction> actions = new ArrayList<>();
        actions.add(addToDoUiAction);
        actions.add(findToDoUiAction);
        actions.add(findToDoByIdUiAction);
        actions.add(exitUiAction);

        UIMenu menu = new UIMenu(actions);

        menu.startUI();

    }
}
