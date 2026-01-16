package com.noua.design.patterns.factoryMethod.service;

import java.math.BigDecimal;

public interface PaymentGateway {
    void pay(BigDecimal amount);
}
