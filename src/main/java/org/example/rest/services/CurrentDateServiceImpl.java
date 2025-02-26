package org.example.rest.services;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CurrentDateServiceImpl implements CurrentDateService {

    @Override
    public LocalDateTime getCurrentDateTime() {
        // returns the current local date/time from the system clock
        return LocalDateTime.now();
    }
}

