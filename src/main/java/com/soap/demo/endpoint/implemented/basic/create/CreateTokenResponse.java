package com.soap.demo.endpoint.implemented.basic.create;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * @author anhbt 6/12/2018
 * com.soap.demo.endpoint.implemented.basic.create
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CreateTokenResponse {
    private String message;
    private boolean status;
    private String token;

    public CreateTokenResponse() {
    }

    public CreateTokenResponse(String message, boolean status, String token) {
        this.message = message;
        this.status = status;
        this.token = token;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
