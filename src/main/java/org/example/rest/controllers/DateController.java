package org.example.rest.controllers;


import org.example.rest.services.CurrentDateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class DateController {

    private final CurrentDateService currentDateService;

    public DateController(CurrentDateService currentDateService) {
        this.currentDateService = currentDateService;
    }

    @GetMapping("/current-date")
    public String getCurrentDate() {
        LocalDateTime currentDateTime = currentDateService.getCurrentDateTime();
        // Convert LocalDateTime to a string, e.g., ISO-8601 format
        return currentDateTime.toString();
    }
}

