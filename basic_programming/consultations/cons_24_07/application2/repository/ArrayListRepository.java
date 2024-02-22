package application2.repository;

import application2.core.entity.ToDoEntity;
import application2.service.exception.ValidationException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ArrayListRepository implements ToDoRepository {

    private Integer idSequence = 1;

    private List<ToDoEntity> database = new ArrayList<>();


    @Override
    public ToDoEntity save(ToDoEntity entity) {
        if (entity.getId() != null) {
            return update(entity);
        } else {
            ToDoEntity newToDo = new ToDoEntity(idSequence, entity.getName(), entity.getDescription());
            database.add(newToDo);
            idSequence++;
            return newToDo;
        }
    }

    private ToDoEntity update(ToDoEntity entity){
        for (int i = 0; i < database.size(); i++) {
            var existingEntity = database.get(i);
            if (existingEntity.getId().equals(entity.getId())) {
                database.set(i, entity);
                return entity;
            }
        }
        throw new ValidationException("Failed to update");
    }

    @Override
    public List<ToDoEntity> findAll() {
        return database;
    }

    @Override
    public Optional<ToDoEntity> findById(Integer id) {
        return database.stream()
                .filter(entity -> entity.getId().equals(id))
                .findFirst();
    }
}
