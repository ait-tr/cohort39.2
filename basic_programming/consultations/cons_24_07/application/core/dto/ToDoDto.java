package application.core.dto;

public class ToDoDto {
    private String name;
    private String description;

    public ToDoDto(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
