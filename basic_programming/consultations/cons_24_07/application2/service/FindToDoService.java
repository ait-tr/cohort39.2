package application2.service;

import application2.core.dto.Response;
import application2.core.dto.ToDoDto;
import application2.core.entity.ToDoEntity;
import application2.repository.ToDoRepository;
import application2.service.util.Converter;
import application2.service.validation.CoreError;

import java.util.ArrayList;
import java.util.List;

public class FindToDoService {
    private final ToDoRepository repository;

    public FindToDoService(ToDoRepository repository) {
        this.repository = repository;
    }

    public Response<List<ToDoDto>> findAll() {
        List<ToDoDto> dtos = new ArrayList<>();
        List<CoreError> errors = new ArrayList<>();
        List<ToDoEntity> entities = repository.findAll();

        if (entities.isEmpty()) {
            errors.add(new CoreError("ToDo database is empty!"));
        } else {
            for (ToDoEntity entity : entities) {
                dtos.add(Converter.converterFromEntityToDto(entity));
            }
        }
        return new Response<>(dtos, errors);
    }
}
