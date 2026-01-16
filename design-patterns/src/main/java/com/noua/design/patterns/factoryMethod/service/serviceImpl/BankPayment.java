package com.noua.design.patterns.factoryMethod.service.serviceImpl;

import com.noua.design.patterns.factoryMethod.service.PaymentGateway;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BankPayment implements PaymentGateway {
    /**
     * @param amount
     */
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Bank payment of processed successfully : amount "+amount);
    }
}
