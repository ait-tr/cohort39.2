package application2.service;


import application2.core.dto.Response;
import application2.core.dto.ToDoDto;
import application2.core.entity.ToDoEntity;
import application2.repository.ToDoRepository;
import application2.service.exception.ValidationException;
import application2.service.util.Converter;
import application2.service.validation.CoreError;

import java.util.ArrayList;
import java.util.List;

public class FindToDoByIdService {
    private final ToDoRepository toDoRepository;

    public FindToDoByIdService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public Response<ToDoDto> findById(Integer id) {
        return toDoRepository.findById(id)
                .map(entity -> {
                    ToDoDto dto = Converter.converterFromEntityToDto(entity);
                    return new Response<>(dto, new ArrayList<>());
                })
                .orElseGet(() -> {
                    List<CoreError> errors = new ArrayList<>();
                    errors.add(new CoreError("ToDo with id " + id + " is not found!"));
                    return new Response<>(null, errors);
                });
    }
}
