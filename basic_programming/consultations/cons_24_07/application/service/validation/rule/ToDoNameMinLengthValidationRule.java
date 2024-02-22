package application.service.validation.rule;

import appV2.service.validation.ValidationException;
import application.core.dto.AddToDoRequest;
import application.service.validation.ValidationRule;

public class ToDoNameMinLengthValidationRule implements ValidationRule {
    @Override
    public void validate(AddToDoRequest request) {
        if (request.getName().length() < 5) {
           throw new ValidationException("ToDo name length must be greater that 5 but actual name length is " + request.getName().length());
        }
    }
}
