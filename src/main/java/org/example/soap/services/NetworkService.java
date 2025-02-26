package org.example.soap.services;

import org.example.soap.models.NetworkRequest;
import org.example.soap.models.NetworkResponse;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class NetworkService {

    private static final Map<String, String> MTI_RESPONSES = new HashMap<>();

    static {
        MTI_RESPONSES.put("1800", "1810");
    }

    public NetworkResponse processNetworkRequest(NetworkRequest request) {
        String responseMti = MTI_RESPONSES.getOrDefault(request.getMti(), "Unknown");

        NetworkResponse response = new NetworkResponse();
//        response.setRequestMti(request.getMti());
        response.setResponseMti(responseMti);
        response.setDescription("Processed Network MTI: " + request.getMti());

        return response;
    }
}
