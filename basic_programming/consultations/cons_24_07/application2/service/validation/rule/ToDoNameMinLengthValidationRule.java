package application2.service.validation.rule;

import application2.core.dto.ToDoDto;
import application2.service.exception.ValidationException;
import application2.service.validation.ValidationRule;

public class ToDoNameMinLengthValidationRule implements ValidationRule {
    private static final int MIN_LENGTH = 5;

    @Override
    public void validate(ToDoDto request) {
        if (request.getName().length() < MIN_LENGTH) {
            throw new ValidationException("ToDo name length must be greater than or equal to " + MIN_LENGTH);
        }
    }
}
