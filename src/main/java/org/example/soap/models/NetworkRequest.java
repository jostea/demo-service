package org.example.soap.models;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NetworkRequest", namespace = "http://example.com/soap/network")
@XmlAccessorType(XmlAccessType.FIELD)
public class NetworkRequest {

    @XmlElement(name = "mti", required = true)
    private String mti;

    public String getMti() {
        return mti;
    }

    public void setMti(String mti) {
        this.mti = mti;
    }
}
