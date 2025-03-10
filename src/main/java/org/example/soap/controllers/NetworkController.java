package org.example.soap.controllers;

import org.example.soap.models.NetworkResponse;
import org.example.soap.models.NetworkRequest;
import org.example.soap.services.FinancialService;
import org.example.soap.services.NetworkService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class NetworkController {

    private static final String NAMESPACE_URI = "http://example.com/soap/network";
    private final NetworkService networkService;

    public NetworkController(NetworkService networkService) {
        this.networkService = networkService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "NetworkRequest")
    @ResponsePayload
    public NetworkResponse processNetwork(@RequestPayload NetworkRequest request) {
        return networkService.processNetworkRequest(request);
    }
}
