package application2.service;

import application2.core.dto.Response;
import application2.core.dto.ToDoDto;
import application2.core.entity.ToDoEntity;
import application2.repository.ToDoRepository;
import application2.service.util.Converter;
import application2.service.validation.CoreError;
import application2.service.validation.ValidationService;

import java.util.ArrayList;
import java.util.List;

public class AddToDoService {
    private final ToDoRepository repository;
    private final ValidationService validationService;

    public AddToDoService(ToDoRepository repository, ValidationService validationService) {
        this.repository = repository;
        this.validationService = validationService;
    }

    public Response<Integer> add(ToDoDto dto) {
        List<CoreError> validationErrors = validationService.validate(dto);
        if (!validationErrors.isEmpty()) {
            return new Response<>(null, validationErrors);
        }

        ToDoEntity entity = Converter.convertFromDtoToEntity(dto);
        ToDoEntity savedEntity = repository.save(entity);
        return new Response<>(savedEntity.getId(), new ArrayList<>());
    }
}
