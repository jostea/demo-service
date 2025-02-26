package org.example.soap.models;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "AuthRequest", namespace = "http://example.com/soap/auth")
@XmlAccessorType(XmlAccessType.FIELD)
public class AuthRequest {

    @XmlElement(name = "mti", required = true)
    private String mti;

    public String getMti() {
        return mti;
    }

    public void setMti(String mti) {
        this.mti = mti;
    }
}
