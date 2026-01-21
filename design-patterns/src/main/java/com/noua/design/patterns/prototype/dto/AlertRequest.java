package com.noua.design.patterns.prototype.dto;

public record AlertRequest(
        String title,
        String message,
        String recipient
) {}

