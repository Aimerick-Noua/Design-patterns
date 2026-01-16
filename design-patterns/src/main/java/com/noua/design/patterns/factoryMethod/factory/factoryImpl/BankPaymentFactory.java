package com.noua.design.patterns.factoryMethod.factory.factoryImpl;

import com.noua.design.patterns.factoryMethod.domain.PaymentType;
import com.noua.design.patterns.factoryMethod.factory.PaymentGatewayFactory;
import com.noua.design.patterns.factoryMethod.service.PaymentGateway;
import com.noua.design.patterns.factoryMethod.service.serviceImpl.BankPayment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component("bankFactory")
public class BankPaymentFactory implements PaymentGatewayFactory {

    private final BankPayment bankPayment;
    /**
     * @return
     */
    @Override
    public PaymentGateway createPaymentGateway() {
        return bankPayment;
    }

    /**
     * @return
     */
    @Override
    public PaymentType getType() {
        return PaymentType.BANK;
    }
}
