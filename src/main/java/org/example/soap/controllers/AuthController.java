package org.example.soap.controllers;

import org.example.soap.models.AuthRequest;
import org.example.soap.models.AuthResponse;
import org.example.soap.services.AuthService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class AuthController {

    private static final String NAMESPACE_URI = "http://example.com/soap/auth";
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AuthRequest")
    @ResponsePayload
    public AuthResponse processAuth(@RequestPayload AuthRequest request) {
        return authService.processAuthRequest(request);
    }
}

