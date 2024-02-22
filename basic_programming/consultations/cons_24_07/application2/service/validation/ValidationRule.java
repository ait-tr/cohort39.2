package application2.service.validation;

import application2.core.dto.ToDoDto;

public interface ValidationRule {
    void validate(ToDoDto request);
}
