package appV1.repository;

import appV1.entity.Task;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TaskInMemoryRepository {

    private Long taskId = 0L;
    private Map<Long, Task> tasks = new HashMap<>();

    public Task insert(Task newTask){
        newTask.setId(++taskId);
        tasks.put(taskId, newTask);
        return newTask;
    }

    public Optional<Task> findById(Long id) {
        return Optional.ofNullable(tasks.get(id));
    }

    public Optional<Task> findByTaskName(String taskName) {
        for (Map.Entry<Long, Task> entry : tasks.entrySet()) {
            if (entry.getValue().getName().equals(taskName)) {
                return Optional.of(entry.getValue());
            }
        }

        return Optional.empty();

    }

    public Map<Long, Task> findAll(){return tasks;}
}
