package com.noua.design.patterns.factoryMethod.factory.factoryImpl;

import com.noua.design.patterns.factoryMethod.factory.NotificationFactory;
import com.noua.design.patterns.factoryMethod.service.NotificationSender;
import com.noua.design.patterns.factoryMethod.service.serviceImpl.WhatsappNotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component("WhatsappFactory")
@RequiredArgsConstructor
public class WhatsappNotificationFactory implements NotificationFactory {

    private final WhatsappNotificationService whatsappNotificationService;
    /**
     * @return
     */
    @Override
    public NotificationSender createNotificationSender() {
        return whatsappNotificationService;
    }
}
