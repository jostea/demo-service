package org.example.rest.models;

import lombok.Getter;
import lombok.Setter;


public class MtiResponse {

    private String responseMti;
    private String description;

    public MtiResponse(String responseMti, String description) {
        this.responseMti = responseMti;
        this.description = description;
    }

    public String getResponseMti() {
        return responseMti;
    }

    public void setResponseMti(String responseMti) {
        this.responseMti = responseMti;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}