package com.course.spring_framework.core;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class EventValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Event.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Event event = (Event) target;
        if (event.getTitle() == null) {
            errors.rejectValue("title", "notempty", "Empty is now allowed");
        }
    }
}
