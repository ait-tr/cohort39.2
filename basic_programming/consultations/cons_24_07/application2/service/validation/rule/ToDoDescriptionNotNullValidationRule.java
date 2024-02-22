package application2.service.validation.rule;


import application2.core.dto.ToDoDto;
import application2.service.exception.ValidationException;
import application2.service.validation.ValidationRule;

public class ToDoDescriptionNotNullValidationRule implements ValidationRule {
    @Override
    public void validate(ToDoDto request) {
        if (request.getDescription() == null || request.getDescription().isEmpty()) {
            throw new ValidationException("ToDo description must not be null or empty");
        }
    }
}
