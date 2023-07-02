package com.realstate.service;

import java.math.BigDecimal;

public interface SaleCommission {
    default BigDecimal comissionValue(BigDecimal valueProperty){
        return valueProperty.multiply(BigDecimal.valueOf(0.04));
    }
}
