package application2.service.validation.rule;
import application2.core.dto.ToDoDto;
import application2.service.exception.ValidationException;
import application2.service.validation.ValidationRule;

public class ToDoNameMaxLengthValidationRule implements ValidationRule {
    private static final int MAX_LENGTH = 20;

    @Override
    public void validate(ToDoDto request) {
        if (request.getName().length() > MAX_LENGTH) {
            throw new ValidationException("ToDo name length must be less than or equal to " + MAX_LENGTH);
        }
    }

}
