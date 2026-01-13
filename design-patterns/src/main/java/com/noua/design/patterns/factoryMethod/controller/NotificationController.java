package com.noua.design.patterns.factoryMethod.controller;

import com.noua.design.patterns.factoryMethod.domain.NotificationType;
import com.noua.design.patterns.factoryMethod.factory.NotificationFactoryProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications")
@RequiredArgsConstructor
public class NotificationController {
    private final NotificationFactoryProvider factoryProvider;

    @PostMapping("/{type}")
    public String sendNotification(@PathVariable NotificationType type, @RequestParam String to, @RequestParam String message){
       factoryProvider.getFactory(type)
               .createNotificationSender()
               .sendNotification(to, message);

       return "Notification sent successfully via "+type;
    }
}
