package com.realstate.service;

import java.math.BigDecimal;

public interface IPTUImmobile {
     default BigDecimal calculation(BigDecimal valueImmobile){
        return valueImmobile.multiply(BigDecimal.valueOf(0.4));
    }
}
