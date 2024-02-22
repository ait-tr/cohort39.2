package application2.service.validation.rule;


import application2.core.dto.ToDoDto;
import application2.service.exception.ValidationException;
import application2.service.validation.ValidationRule;

public class ToDoDescriptionMaxLengthValidationRule implements ValidationRule {
    private static final int MAX_LENGTH = 30;

    @Override
    public void validate(ToDoDto request) {
        if (request.getDescription().length() > MAX_LENGTH) {
            throw new ValidationException("ToDo description length must be less than or equal to " + MAX_LENGTH);
        }
    }
}