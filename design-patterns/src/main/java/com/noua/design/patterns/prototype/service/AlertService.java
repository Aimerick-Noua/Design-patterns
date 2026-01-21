package com.noua.design.patterns.prototype.service;

import com.noua.design.patterns.prototype.domain.Alert;
import com.noua.design.patterns.prototype.enumeration.AlertPriority;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlertService {

    private final Alert defaultAlertPrototypeValues;

    public Alert createAlert(String title, String message, String recipient) {
        Alert alert = defaultAlertPrototypeValues.copy();
        alert.setTitle(title);
        alert.setMessage(message);
        alert.setRecipient(recipient);
        return alert;
    }


    public Alert createCriticalAlert(String title, String message, String recipient) {
        Alert alert = defaultAlertPrototypeValues.copy();
        alert.setTitle(title);
        alert.setMessage(message);
        alert.setRecipient(recipient);
        alert.setPriority(AlertPriority.CRITICAL);
        return alert;
    }
}
