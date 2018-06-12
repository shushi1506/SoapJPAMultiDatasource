package com.soap.demo.endpoint.implemented.basic.create;

import com.soap.demo.endpoint.implemented.basic.BasicRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * @author anhbt 6/12/2018
 * com.soap.demo.endpoint.implemented.basic.create
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CreateTokenRequest extends BasicRequest {
    @XmlAttribute(name = "token")
    private String token;
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
