package com.edu.eci.health.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String getHealth() {
        return "API working OK!";
    }

    @GetMapping("/check")
    public String checkAPI() {
        return "<h1>The API is working ok!</h1>";
    }

}