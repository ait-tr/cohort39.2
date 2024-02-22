package application2.repository;

import application2.core.entity.ToDoEntity;

import java.util.List;
import java.util.Optional;

public interface ToDoRepository {
    ToDoEntity save(ToDoEntity entity);

    List<ToDoEntity> findAll();

    Optional<ToDoEntity> findById(Integer id);

}
