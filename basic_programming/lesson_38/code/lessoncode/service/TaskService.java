package service;

import entity.Task;
import repository.TaskInMemoryRepository;

import java.util.Map;
import java.util.Optional;

public class TaskService {

    private TaskInMemoryRepository repository = new TaskInMemoryRepository();

    public Long saveTask(String taskName, String taskDescription){
        Task newTask = new Task(taskName, taskDescription);
        repository.insert(newTask);
        return newTask.getId();
    }

    public Task findTaskById(Long id){
        Optional<Task> taskOpt = repository.findById(id);
        if (taskOpt.isPresent()) {
            return taskOpt.get();
        } else {
            return null;
        }
    }
    public Task findTaskByName(String taskName){
        Optional<Task> taskOpt = repository.findByTaskName(taskName);
        if (taskOpt.isPresent()) {
            return taskOpt.get();
        } else {
            return null;
        }
    }
    public Map<Long, Task> findAll(){
        return repository.findAll();
    }


}
