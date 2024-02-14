package appV2.repository;

import appV2.entity.Task;

import java.util.*;

public class TaskInMemoryRepository {

    private int taskId;

    private List<Task> tasks = new ArrayList<>();

    public Task add(Task newTask){
        newTask.setId(++taskId);
        tasks.add(newTask);
        return newTask;
    }

    public Optional<Task> findById(Integer id) {
        for (Task task : tasks) {
            if (task.getId().equals(id)) {
                return Optional.of(task);
            }
        }
        return Optional.empty();
    }

    public Optional<Task> findByTaskName(String taskName) {
        for ( Task task : tasks) {
            if (task.getName().equals(taskName)) {
                return Optional.of(task);
            }
        }
        return Optional.empty();

    }

    public List<Task> findAll(){return tasks;}
}
