package com.realstate.service;

import java.math.BigDecimal;

public interface IPTUGround {
    default BigDecimal calculationIptuGround(BigDecimal valueGround){
        return valueGround.multiply(BigDecimal.valueOf(0.2));
    }
}
