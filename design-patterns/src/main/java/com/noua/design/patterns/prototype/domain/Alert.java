package com.noua.design.patterns.prototype.domain;

import com.noua.design.patterns.prototype.enumeration.AlertPriority;
import com.noua.design.patterns.prototype.service.Prototype;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
public class Alert implements Prototype<Alert> {
    private String title;
    private String message;
    private String recipient;
    private boolean realTime;
    private AlertPriority priority;
    /**
     * @return
     */
    @Override
    public Alert copy() {
        return  Alert
                .builder()
                .title(title)
                .message(message)
                .recipient(recipient)
                .realTime(realTime)
                .priority(priority)
                .build();

    }
}
