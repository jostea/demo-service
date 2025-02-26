package org.example.soap.controllers.temp;

import org.example.soap.models.MtiSoapRequest;
import org.example.soap.models.MtiSoapResponse;
import org.example.soap.services.temp.MtiSoapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ISO8583ESOAPEndpoint {

    private static final String NAMESPACE_URI = "http://example.com/soap";
    private final MtiSoapService mtiSoapService;

    @Autowired
    public ISO8583ESOAPEndpoint(MtiSoapService mtiSoapService) {
        this.mtiSoapService = mtiSoapService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "MtiSoapRequest")
    @ResponsePayload
    public MtiSoapResponse processMti(@RequestPayload MtiSoapRequest request) {
        return mtiSoapService.getMtiResponse(request);
    }
}
