package com.noua.design.patterns.factoryMethod.service.serviceImpl;

import com.noua.design.patterns.factoryMethod.service.NotificationSender;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationSender implements NotificationSender {
    /**
     * @param to
     * @param message
     */
    @Override
    public void sendNotification(String to, String message) {
        System.out.println("Sending email notification to " + to + ": " + message);
    }
}
