package com.soap.demo.endpoint.implemented.basic.create;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * @author anhbt 5/27/2018
 * com.soap.demo.endpoint.implemented.basic.create
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CreateDmTinhThanhResponse {
    private String errorMessage;
    private String errorCode;
    private boolean status;
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public CreateDmTinhThanhResponse() {
    }

    public CreateDmTinhThanhResponse(String errorMessage, String errorCode, boolean status) {
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
        this.status = status;
    }
}
