package com.noua.design.patterns.factoryMethod.factory.factoryImpl;

import com.noua.design.patterns.factoryMethod.domain.PaymentType;
import com.noua.design.patterns.factoryMethod.factory.PaymentGatewayFactory;
import com.noua.design.patterns.factoryMethod.service.PaymentGateway;
import com.noua.design.patterns.factoryMethod.service.serviceImpl.PaypalPayment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component("paypalFactory")
public class PaypalPaymentFactory implements PaymentGatewayFactory {

    private final PaypalPayment paypalPayment;
    /**
     * @return
     */
    @Override
    public PaymentGateway createPaymentGateway() {
        return paypalPayment;
    }

    /**
     * @return
     */
    @Override
    public PaymentType getType() {
        return PaymentType.PAYPAL;
    }
}
