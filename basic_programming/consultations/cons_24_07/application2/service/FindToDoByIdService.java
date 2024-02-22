package application2.service;


import application2.core.dto.Response;
import application2.core.dto.ToDoDto;
import application2.core.entity.ToDoEntity;
import application2.repository.ToDoRepository;
import application2.service.exception.ValidationException;
import application2.service.util.Converter;

import java.util.ArrayList;

public class FindToDoByIdService {
    private final ToDoRepository toDoRepository;

    public FindToDoByIdService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public Response<ToDoDto> findById(Integer id) {
        ToDoEntity entity = toDoRepository.findById(id)
                .orElseThrow(() -> new ValidationException("ToDo with id " + id + " is not found!"));

        ToDoDto dto = Converter.converterFromEntityToDto(entity);
        return new Response<>(dto, new ArrayList<>());
    }
}
