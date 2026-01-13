package com.noua.design.patterns.factoryMethod.factory;

import com.noua.design.patterns.factoryMethod.domain.NotificationType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class NotificationFactoryProvider {

    private final Map<String,NotificationFactory> factories;

    public NotificationFactory getFactory(NotificationType type){
        return switch (type){
            case IN_APP -> factories.get("InAppFactory");
            case SMS -> factories.get("SmsFactory");
            case EMAIL -> factories.get("EmailFactory");
            case WHATSAPP -> factories.get("WhatsappFactory");
        };
    }
}
