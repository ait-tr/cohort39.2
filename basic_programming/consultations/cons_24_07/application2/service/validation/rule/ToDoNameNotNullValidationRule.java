package application2.service.validation.rule;

import application2.core.dto.ToDoDto;
import application2.service.exception.ValidationException;
import application2.service.validation.ValidationRule;

 public class ToDoNameNotNullValidationRule implements ValidationRule {
        @Override
        public void validate(ToDoDto request) {
            if (request.getName() == null || request.getName().isEmpty()) {
                throw new ValidationException("ToDo name must not be null or empty");
            }
        }
    }
