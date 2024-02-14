package appV2;

import appV2.repository.InMemoryRepository;
import appV2.repository.TaskInMemoryRepository;
import appV2.service.TaskServiceAddOrUpdate;
import appV2.service.TaskServiceFind;
import appV2.service.validation.ValidationRequest;
import appV2.ui.UserInterface;

public class App {
    public static void main(String[] args) {

        InMemoryRepository repository = new TaskInMemoryRepository();
        ValidationRequest validationRequest = new ValidationRequest();

        TaskServiceAddOrUpdate taskServiceAddOrUpdate = new TaskServiceAddOrUpdate(repository, validationRequest);
        TaskServiceFind taskServiceFind = new TaskServiceFind(repository);

        UserInterface ui = new UserInterface(taskServiceAddOrUpdate, taskServiceFind);
        ui.menu();
    }
}
