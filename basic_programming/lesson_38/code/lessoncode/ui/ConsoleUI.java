package ui;

import entity.Task;
import lotto.service.UserInput;
import service.TaskService;

import java.util.Scanner;

public class ConsoleUI {

    private TaskService taskService = new TaskService();
    private Scanner scanner = new Scanner(System.in);
    UserInput userInput = new UserInput();

    public void execute(){
        while (true){

            try {
                System.out.println("Task menu:");
                System.out.println("1. Create task");
                System.out.println("2. Find task by id");
                System.out.println("3. Find task by name");
                System.out.println("4. Find all");
                System.out.println("5. Exit");
                int userInput = scanner.nextInt();
                switch (userInput){
                    case 1:
                        long newId = createTask();
                        System.out.println("Create success! New record index = " + newId);
                        break;
                    case 2:
                        Task findedTask = findTaskById();
                        if (findedTask != null) {
                            System.out.println("Find record: " + findedTask);
                        } else {
                            System.out.println("Record not found!");
                        }
                        break;
                    case 3:
                        findedTask = findTaskByName();
                        if (findedTask != null) {
                            System.out.println("Find record: " + findedTask);
                        } else {
                            System.out.println("Record not found!");
                        }
                        break;
                    case 4:
                        System.out.println(taskService.findAll());
                        break;
                    case 5:
                        return;
                }
            } catch (Exception e){
                System.out.println("Error! Please try again!");
                e.printStackTrace();
            }
        }
    }

    private long createTask(){
        String taskName = userInput.uiText("Enter task name:");
        String taskDescription = userInput.uiText("Enter task description:");

        Long newId = taskService.saveTask(taskName,taskDescription);

        return newId;
    }

    private Task findTaskById() {
        int id = userInput.uiInt("Enter task id: ");
        Task findedTask = taskService.findTaskById((long) id);
        return findedTask;
    }

    private Task findTaskByName() {
        String taskName = userInput.uiText("Enter task name: ");
        Task findedTask = taskService.findTaskByName(taskName);
        return findedTask;
    }


}
