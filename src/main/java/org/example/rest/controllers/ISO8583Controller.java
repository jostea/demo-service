package org.example.rest.controllers;

import org.example.rest.models.MtiRequest;
import org.example.rest.models.MtiResponse;
import org.example.rest.services.ISO8583Service;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/iso8583")
public class ISO8583Controller {

    private final ISO8583Service iso8583Service;

    public ISO8583Controller(ISO8583Service iso8583Service) {
        this.iso8583Service = iso8583Service;
    }

    @PostMapping(value = "/mti", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MtiResponse> getMtiDescription(@RequestBody MtiRequest request) {
        MtiResponse response = iso8583Service.getMtiResponse(request.getMti());
        return ResponseEntity.ok(response);
    }
}
