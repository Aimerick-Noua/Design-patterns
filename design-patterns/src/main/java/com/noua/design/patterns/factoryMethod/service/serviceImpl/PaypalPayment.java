package com.noua.design.patterns.factoryMethod.service.serviceImpl;

import com.noua.design.patterns.factoryMethod.service.PaymentGateway;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class PaypalPayment implements PaymentGateway {
    /**
     * @param amount
     */
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Paypal payment processed successfully: amount "+amount);
    }
}
