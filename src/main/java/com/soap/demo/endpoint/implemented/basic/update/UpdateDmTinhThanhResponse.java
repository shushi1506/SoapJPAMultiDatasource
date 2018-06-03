package com.soap.demo.endpoint.implemented.basic.update;

import com.soap.demo.DefinedConfig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author anhbt 5/27/2018
 * com.soap.demo.endpoint.implemented.basic.update
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class UpdateDmTinhThanhResponse {
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

    public UpdateDmTinhThanhResponse(String errorMessage, String errorCode, boolean status) {
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
        this.status = status;
    }

    public UpdateDmTinhThanhResponse() {
    }
}
