package com.noua.design.patterns.factoryMethod.factory.factoryImpl;

import com.noua.design.patterns.factoryMethod.factory.NotificationFactory;
import com.noua.design.patterns.factoryMethod.service.NotificationSender;
import com.noua.design.patterns.factoryMethod.service.serviceImpl.EmailNotificationSender;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
public class EmailNotificationFactory implements NotificationFactory {

    private final EmailNotificationSender emailNotificationSender;
    /**
     * @return
     */
    @Override
    public NotificationSender createNotificationSender() {
        return emailNotificationSender;
    }
}
