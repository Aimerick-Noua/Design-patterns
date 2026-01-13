package com.noua.design.patterns.singleton.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Scope("singleton")
@Component
public class LoggerService {
    private List<String> logs = new ArrayList<>();

    public void log (String message){
        String logEntry = LocalDateTime.now()+"-"+message;
        logs.add(logEntry);
        System.out.println(logEntry);
    }

    public List<String> getLogs(){
        return new ArrayList<>(logs);
    }

    public  void clearLogs(){
        logs.clear();
    }
}
