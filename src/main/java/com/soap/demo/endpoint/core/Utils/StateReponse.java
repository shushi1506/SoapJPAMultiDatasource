package com.soap.demo.endpoint.core.Utils;

/**
 * @author anhbt 5/23/2018
 * com.soap.demo.endpoint.core.Utils
 */
public class StateReponse {
    private String errorcode="-1";
    private String message="none";

    public StateReponse() {
    }

    public StateReponse(String errorcode, String message) {
        this.errorcode = errorcode;
        this.message = message;
    }

    public String getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(String errorcode) {
        this.errorcode = errorcode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
