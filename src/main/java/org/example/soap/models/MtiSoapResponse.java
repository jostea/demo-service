package org.example.soap.models;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MtiSoapResponse", namespace = "http://example.com/soap")
@XmlAccessorType(XmlAccessType.FIELD)
public class MtiSoapResponse {

    @XmlElement(name = "requestMti", required = true)
    private String requestMti;

    @XmlElement(name = "responseMti", required = true)
    private String responseMti;

    @XmlElement(name = "description", required = true)
    private String description;

    public String getRequestMti() {
        return requestMti;
    }

    public void setRequestMti(String requestMti) {
        this.requestMti = requestMti;
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
