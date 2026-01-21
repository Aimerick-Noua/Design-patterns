package com.noua.design.patterns.factoryMethod.factory.factoryImpl;

import com.noua.design.patterns.factoryMethod.factory.NotificationFactory;
import com.noua.design.patterns.factoryMethod.service.NotificationSender;
import com.noua.design.patterns.factoryMethod.service.serviceImpl.InAppNotificationSender;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
public class InAppNotificationFactory implements NotificationFactory {

    private final InAppNotificationSender inAppNotificationSender;
    /**
     * @return
     */
    @Override
    public NotificationSender createNotificationSender() {
        return inAppNotificationSender;
    }
}
