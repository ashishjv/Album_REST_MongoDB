package com.example.album_REST_MongoDB.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomValidator implements ConstraintValidator<ValidateCustom, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(!s.isEmpty() && s.matches("[a-z0-9]+")){
            return true;
        }
        return false;
    }
}
