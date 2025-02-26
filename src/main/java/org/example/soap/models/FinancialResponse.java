package org.example.soap.models;


import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "FinancialResponse", namespace = "http://example.com/soap/financial")
@XmlAccessorType(XmlAccessType.FIELD)
public class FinancialResponse {

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
