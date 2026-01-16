package com.noua.design.patterns.factoryMethod.service.serviceImpl;

import com.noua.design.patterns.factoryMethod.service.PaymentGateway;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CryptoPayment implements PaymentGateway {
    /**
     * @param amount
     */
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Crypto payment processes successfully for amount: "+amount);
    }
}
