package application.service.validation.rule;

import application.service.exception.ValidationException;
import application.core.dto.AddToDoRequest;
import application.service.validation.ValidationRule;

public class ToDoDescriptionNullValidationRule implements ValidationRule {
    @Override
    public void validate(AddToDoRequest request) {
        if (request.getDescription() == null) {
           throw new ValidationException("ToDo description must not be null");
        }
    }
}
