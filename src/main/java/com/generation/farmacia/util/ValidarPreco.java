package com.generation.farmacia.util;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.math.BigDecimal;

public class ValidarPreco implements ConstraintValidator<ValidaPreco, BigDecimal> {

    @Override
    public boolean isValid(BigDecimal preco, ConstraintValidatorContext context) {
        return preco != null && preco.compareTo(BigDecimal.ZERO) > 0;
    }
}