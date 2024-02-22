package application.service;


import application.core.dto.ToDoDto;
import application.repository.ToDoRepository;
import application.service.exception.ValidationException;
import application.service.util.Converter;

public class FindToDoByIdService {
    private final ToDoRepository toDoRepository;

    public FindToDoByIdService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public ToDoDto findById(Integer id) {
        return toDoRepository.findById(id)
                .map(Converter::converterFromEntityToDto)
                .orElseThrow(() -> new ValidationException("ToDo with id " + id + " is not found!"));
    }

}
