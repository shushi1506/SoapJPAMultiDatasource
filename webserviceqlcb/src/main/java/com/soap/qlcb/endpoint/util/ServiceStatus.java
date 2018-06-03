package com.soap.qlcb.endpoint.util;

/**
 * @author anhbt 5/31/2018
 * com.soap.qlcb.endpoint.util
 */
public class ServiceStatus {
    private String errorMessage;
    private String errorCode;
    private boolean status;

    public ServiceStatus() {
    }

    public ServiceStatus(String errorMessage, String errorCode, boolean status) {
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
        this.status = status;
    }

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
}
