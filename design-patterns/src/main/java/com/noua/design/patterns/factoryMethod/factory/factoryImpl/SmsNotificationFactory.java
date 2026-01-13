package com.noua.design.patterns.factoryMethod.factory.factoryImpl;

import com.noua.design.patterns.factoryMethod.factory.NotificationFactory;
import com.noua.design.patterns.factoryMethod.service.NotificationSender;
import com.noua.design.patterns.factoryMethod.service.serviceImpl.SmsNotificationSender;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component("SmsFactory")
public class SmsNotificationFactory implements NotificationFactory {

    private final SmsNotificationSender smsNotificationSender;
    /**
     * @return
     */
    @Override
    public NotificationSender createNotificationSender() {
        return smsNotificationSender;
    }
}
