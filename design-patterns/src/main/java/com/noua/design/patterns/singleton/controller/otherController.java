package com.noua.design.patterns.singleton.controller;

import com.noua.design.patterns.singleton.service.LoggerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/singleton/other")
@RestController
public class otherController {
     LoggerService logger;

     @Autowired
    public otherController(LoggerService logger) {
        this.logger = logger;
    }

    @PostMapping("/log/{message}")
    public String log(@PathVariable String message) {
        logger.log("User logged: "+message);
        return "Logged: "+message;
    }


    @GetMapping("/logs")
    public List<String> getAllLogs(){
        return logger.getLogs();
    }


}
