package org.example.soap.services.temp;

import org.example.soap.models.MtiSoapRequest;
import org.example.soap.models.MtiSoapResponse;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MtiSoapService {

    private static final Map<String, String> MTI_RESPONSES = new HashMap<>();

//    static {
//        MTI_RESPONSES.put("1100", "1110");
//        MTI_RESPONSES.put("0100", "0110");
//        MTI_RESPONSES.put("0200", "0210");
//        MTI_RESPONSES.put("0800", "0810");
//    }

    public MtiSoapResponse getMtiResponse(MtiSoapRequest request) {
        String responseMti = MTI_RESPONSES.getOrDefault(request.getMti(), "Unknown");

        MtiSoapResponse response = new MtiSoapResponse();
        response.setRequestMti(request.getMti());
        response.setResponseMti(responseMti);
        response.setDescription("Processed MTI: " + request.getMti());

        return response;
    }
}
