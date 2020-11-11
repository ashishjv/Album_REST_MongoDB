package com.example.album_REST_MongoDB.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = CustomValidator.class)
@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValidateCustom {
    String message() default "createdBy can contain only lower case alphabets or digits";
    //String regexp() default ".*";

    Class<?>[] groups() default{};
    Class<? extends Payload>[] payload() default {};
}
