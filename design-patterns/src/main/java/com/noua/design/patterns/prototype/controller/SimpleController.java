package com.noua.design.patterns.prototype.controller;

import com.noua.design.patterns.prototype.service.LoggerPrototypeService;
 import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/api/prototype")
@RequiredArgsConstructor
@RestController
@Component("simplePrototypeController")
public class SimpleController {
    private final LoggerPrototypeService logger;

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
