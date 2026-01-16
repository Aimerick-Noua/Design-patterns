package com.noua.design.patterns.factoryMethod.config;

import com.noua.design.patterns.factoryMethod.domain.PaymentType;
import com.noua.design.patterns.factoryMethod.factory.PaymentGatewayFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Configuration
public class FactoryConfig {

    @Bean
    public Map<PaymentType, PaymentGatewayFactory> paymentFactories(
            List<PaymentGatewayFactory> factories) {

        return factories.stream()
                .collect(Collectors.toMap(
                        PaymentGatewayFactory::getType,
                        Function.identity()
                ));
    }
}

