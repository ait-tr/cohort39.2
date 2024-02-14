package appV2.service;

import appV2.dto.ClientResponse;
import appV2.dto.ClientRequest;
import appV2.entity.Task;
import appV2.repository.InMemoryRepository;
import appV2.service.validation.ValidationRequest;


public class TaskServiceAddOrUpdate {

    private final InMemoryRepository repository;
    private final ValidationRequest validationRequest;

    public TaskServiceAddOrUpdate(InMemoryRepository repository, ValidationRequest validationRequest) {
        this.repository = repository;
        this.validationRequest = validationRequest;
    }

    public ClientResponse<Integer> add(ClientRequest request){
        boolean checkResult = validationRequest.checkRequestAdd(request);

        Task taskForAdd = new Task(request.getName(), request.getDescription());

        repository.add(taskForAdd);

        if (taskForAdd.getId() > 0) {
            return new ClientResponse<>(200, taskForAdd.getId(),"Добавление новой задачи прошло успешно!");
        } else {
            return new ClientResponse<>(400, 0, "Новая задача не добавлена!");
        }
    }




}
