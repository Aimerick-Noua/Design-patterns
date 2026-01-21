package com.noua.design.patterns.prototype.config;


import com.noua.design.patterns.prototype.domain.Alert;
import com.noua.design.patterns.prototype.enumeration.AlertPriority;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlertPrototypeConfig {

    @Bean
    public Alert defaultAlertPrototypeValues(){
        return Alert.builder()
                .realTime(true)
                .priority(AlertPriority.MEDIUM)
                .build();
    }
}
