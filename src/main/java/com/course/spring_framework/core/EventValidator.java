package com.course.spring_framework.core;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class EventValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Event.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // defaultMessage는 errorCode로 메세지를 찾지 못했을 때 사용되는 기본 메세지
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "notempty", "Empty is now allowed");
    }
}
