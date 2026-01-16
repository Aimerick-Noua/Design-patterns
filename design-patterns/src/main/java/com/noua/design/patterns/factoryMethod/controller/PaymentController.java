package com.noua.design.patterns.factoryMethod.controller;

import com.noua.design.patterns.factoryMethod.domain.NotificationType;
import com.noua.design.patterns.factoryMethod.domain.PaymentType;
import com.noua.design.patterns.factoryMethod.factory.PaymentGatewayFactoryProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/payments")
public class PaymentController {

    private final PaymentGatewayFactoryProvider provider;

    @PostMapping("/{type}")
    public String payment(@PathVariable PaymentType type, @RequestParam BigDecimal amount){
        provider.getPaymentGatewayFactory(type).createPaymentGateway().pay(amount);

        return String.format("Payment successful for type %s for amount %s", type,amount);
    }


}
