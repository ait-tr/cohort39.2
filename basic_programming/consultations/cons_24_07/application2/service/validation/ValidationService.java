package application2.service.validation;


import application2.core.dto.ToDoDto;
import application2.service.exception.ValidationException;

import java.util.ArrayList;
import java.util.List;

public class ValidationService {

    private final List<ValidationRule> validationRules;

    public ValidationService(List<ValidationRule> validationRules) {
        this.validationRules = validationRules;
    }

    public List<CoreError> validate(ToDoDto request) {
        List<CoreError> errors = new ArrayList<>();
        for (ValidationRule rule : validationRules) {
            try {
                rule.validate(request);
            } catch (ValidationException e) {
                errors.add(new CoreError(e.getMessage()));
            }
        }
        return errors;
    }
}
