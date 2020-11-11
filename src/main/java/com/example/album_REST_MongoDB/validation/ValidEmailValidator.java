package com.example.album_REST_MongoDB.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidEmailValidator implements ConstraintValidator<ValidateEmail, String> {

    private String custRegex;

    @Override
    public void initialize(ValidateEmail constraintAnnotation) {
        custRegex = constraintAnnotation.custRegex();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s.matches(custRegex);
    }
}