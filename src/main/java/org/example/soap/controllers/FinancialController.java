package org.example.soap.controllers;

import org.example.soap.models.FinancialResponse;
import org.example.soap.models.FinancialRequest;
import org.example.soap.services.FinancialService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class FinancialController {

    private static final String NAMESPACE_URI = "http://example.com/soap/financial";
    private final FinancialService financialService;

    public FinancialController(FinancialService financialService) {
        this.financialService = financialService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "FinancialRequest")
    @ResponsePayload
    public FinancialResponse processFinancial(@RequestPayload FinancialRequest request) {
        return financialService.processFinancialRequest(request);
    }
}
