package com.noua.design.patterns.factoryMethod.service.serviceImpl;

import com.noua.design.patterns.factoryMethod.service.NotificationSender;
import org.springframework.stereotype.Component;

@Component
public class WhatsappNotificationService implements NotificationSender {
    /**
     * @param to
     * @param message
     */
    @Override
    public void sendNotification(String to, String message) {
        System.out.println("Sending whatsapp notification to " + to + ": " + message);
    }
}
