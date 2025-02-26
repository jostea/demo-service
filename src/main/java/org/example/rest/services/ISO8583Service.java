package org.example.rest.services;


import org.example.rest.models.Mti;
import org.example.rest.models.MtiResponse;
import org.springframework.stereotype.Service;

@Service
public class ISO8583Service {
    public MtiResponse getMtiResponse(String requestCode) {
        return Mti.fromRequestCode(requestCode)
                .map(mti -> new MtiResponse(mti.getResponseCode(), mti.getDescription()))
                .orElseGet(() -> new MtiResponse("Unknown", "Unknown MTI code: " + requestCode));
    }
}
