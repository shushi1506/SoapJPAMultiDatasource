package com.soap.qlcb.endpoint.implemented.create;

import com.soap.qlcb.DefinedConfig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author anhbt 6/2/2018
 * com.soap.qlcb.endpoint.implemented.create
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CreateDongBoCbCanBoDetailResponse {
    @XmlElement(name = "errorCode", namespace = DefinedConfig.NAME_SPACE)
    private String errorCode;
    @XmlElement(name = "errorMessage", namespace = DefinedConfig.NAME_SPACE)
    private String errorMessage;
    @XmlElement(name = "status", namespace = DefinedConfig.NAME_SPACE)
    private boolean status;

    public CreateDongBoCbCanBoDetailResponse() {
    }

    public CreateDongBoCbCanBoDetailResponse(String errorCode, String errorMessage, boolean status) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.status = status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
