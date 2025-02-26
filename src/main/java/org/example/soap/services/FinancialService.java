package org.example.soap.services;


import org.example.soap.models.FinancialRequest;
import org.example.soap.models.FinancialResponse;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FinancialService {

    private static final Map<String, String> MTI_RESPONSES = new HashMap<>();

    static {
        MTI_RESPONSES.put("1200", "1210");
    }

    public FinancialResponse processFinancialRequest(FinancialRequest request) {
        String responseMti = MTI_RESPONSES.getOrDefault(request.getMti(), "Unknown");

        FinancialResponse response = new FinancialResponse();
//        response.setRequestMti(request.getMti());
        response.setResponseMti(responseMti);
        response.setDescription("Processed Financial MTI: " + request.getMti());

        return response;
    }
}

