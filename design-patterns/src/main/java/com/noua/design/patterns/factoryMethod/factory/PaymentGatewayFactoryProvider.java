package com.noua.design.patterns.factoryMethod.factory;

import com.noua.design.patterns.factoryMethod.domain.PaymentType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class PaymentGatewayFactoryProvider {

    private final Map<PaymentType, PaymentGatewayFactory> factories;

    public PaymentGatewayFactoryProvider(List<PaymentGatewayFactory> factoryList) {
        this.factories = factoryList.stream().collect(Collectors.toMap(PaymentGatewayFactory::getType, Function.identity()));
    }

    public PaymentGatewayFactory getPaymentGatewayFactory(PaymentType type) {
        return factories.get(type);
    }

}
