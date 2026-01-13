package com.noua.design.patterns.factoryMethod.service.serviceImpl;

import com.noua.design.patterns.factoryMethod.service.NotificationSender;
import org.springframework.stereotype.Component;

@Component
public class InAppNotificationSender implements NotificationSender {
    @Override
    public void sendNotification(String to, String message) {
        System.out.println("Sending in-app notification to " + to + ": " + message);
    }
}
