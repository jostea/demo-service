package org.example.soap.models;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MtiSoapRequest", namespace = "http://example.com/soap")
@XmlAccessorType(XmlAccessType.FIELD)
public class MtiSoapRequest {

    @XmlElement(name = "mti", required = true)
    private String mti;

    public String getMti() {
        return mti;
    }

    public void setMti(String mti) {
        this.mti = mti;
    }
}
