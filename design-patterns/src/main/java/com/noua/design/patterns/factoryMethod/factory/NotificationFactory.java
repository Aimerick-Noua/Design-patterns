package com.noua.design.patterns.factoryMethod.factory;

import com.noua.design.patterns.factoryMethod.service.NotificationSender;

public interface NotificationFactory {
    NotificationSender createNotificationSender();
}
