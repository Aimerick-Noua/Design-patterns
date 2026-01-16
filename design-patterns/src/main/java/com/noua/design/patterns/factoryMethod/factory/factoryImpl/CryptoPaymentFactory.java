package com.noua.design.patterns.factoryMethod.factory.factoryImpl;

import com.noua.design.patterns.factoryMethod.domain.PaymentType;
import com.noua.design.patterns.factoryMethod.factory.PaymentGatewayFactory;
import com.noua.design.patterns.factoryMethod.service.PaymentGateway;
import com.noua.design.patterns.factoryMethod.service.serviceImpl.CryptoPayment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component("cryptoFactory")
@RequiredArgsConstructor
public class CryptoPaymentFactory implements PaymentGatewayFactory {

    private final CryptoPayment cryptoPayment;
    /**
     * @return
     */
    @Override
    public PaymentGateway createPaymentGateway() {
        return cryptoPayment;
    }

    /**
     * @return
     */
    @Override
    public PaymentType getType() {
        return PaymentType.CRYPTO;
    }
}
