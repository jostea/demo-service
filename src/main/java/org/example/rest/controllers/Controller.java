package org.example.rest.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/hello")
    public String sayHello() {
        logger.info("Saying Hello");
        return "Hello from Spring Boot!";
    }
}
