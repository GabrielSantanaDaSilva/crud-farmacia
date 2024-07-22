package com.generation.farmacia.util;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Constraint(validatedBy = ValidarPreco.class)
public @interface ValidaPreco {
    String message() default "O preço deve ser maior que zero";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}