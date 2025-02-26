package org.example.soap.services;

import jakarta.xml.bind.annotation.XmlRootElement;
import org.example.soap.models.AuthRequest;
import org.example.soap.models.AuthResponse;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@XmlRootElement(name = "AuthService", namespace = "http://example.com/soap/auth")
public class AuthService {

    private static final Map<String, String> MTI_RESPONSES = new HashMap<>();

    static {
        MTI_RESPONSES.put("1100", "1110");
//        MTI_RESPONSES.put("0100", "0110");
    }

    public AuthResponse processAuthRequest(AuthRequest request) {
        String responseMti = MTI_RESPONSES.getOrDefault(request.getMti(), "Unknown");

        AuthResponse response = new AuthResponse();
//        response.setRequestMti(request.getMti());
        response.setResponseMti(responseMti);
        response.setDescription("Processed Authorization MTI: " + request.getMti());

        return response;
    }
}
