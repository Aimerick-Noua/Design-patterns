package com.noua.design.patterns.factoryMethod.factory.factoryImpl;

import com.noua.design.patterns.factoryMethod.domain.PaymentType;
import com.noua.design.patterns.factoryMethod.factory.PaymentGatewayFactory;
import com.noua.design.patterns.factoryMethod.service.PaymentGateway;
import com.noua.design.patterns.factoryMethod.service.serviceImpl.StripePayment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component("stripeFactory")
public class StripePaymentFactory implements PaymentGatewayFactory {

    private final StripePayment stripePayment;
    /**
     * @return
     */
    @Override
    public PaymentGateway createPaymentGateway() {
        return stripePayment;
    }

    /**
     * @return
     */
    @Override
    public PaymentType getType() {
        return PaymentType.STRIPE;
    }
}
