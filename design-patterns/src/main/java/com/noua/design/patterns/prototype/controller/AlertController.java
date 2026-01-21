package com.noua.design.patterns.prototype.controller;

import com.noua.design.patterns.prototype.domain.Alert;
import com.noua.design.patterns.prototype.dto.AlertRequest;
import com.noua.design.patterns.prototype.service.AlertService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alerts")
@RequiredArgsConstructor
public class AlertController {

    private final AlertService alertService;

    @PostMapping
    public Alert createAlert(@RequestBody AlertRequest request) {
        return alertService.createAlert(
                request.title(),
                request.message(),
                request.recipient()
        );
    }

    @PostMapping("/critical")
    public Alert createCritical(@RequestBody AlertRequest request) {
        return alertService.createCriticalAlert(
                request.title(),
                request.message(),
                request.recipient()
        );
    }
}
