package com.noua.design.patterns.factoryMethod.factory;

import com.noua.design.patterns.factoryMethod.domain.PaymentType;
import com.noua.design.patterns.factoryMethod.service.PaymentGateway;

public interface PaymentGatewayFactory {
    PaymentGateway createPaymentGateway();
    PaymentType getType();
}
