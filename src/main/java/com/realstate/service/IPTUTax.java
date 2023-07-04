package com.realstate.service;

import java.math.BigDecimal;

public interface IPTUTax {
    default BigDecimal calculateIPTU(BigDecimal valueProperty, BigDecimal valueTax) {
        return valueProperty.multiply(valueTax);
    }
}
