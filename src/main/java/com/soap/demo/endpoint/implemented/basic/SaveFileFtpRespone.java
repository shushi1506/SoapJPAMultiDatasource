package com.soap.demo.endpoint.implemented.basic;

import com.soap.demo.endpoint.core.Utils.UploadFileSuccess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.List;

/**
 * @author anhbt 5/22/2018
 * com.soap.demo.endpoint.implemented.basic
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class SaveFileFtpRespone {
    private String message;
    private String errorCode;
    private List<UploadFileSuccess> successList;
    public SaveFileFtpRespone() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public List<UploadFileSuccess> getSuccessList() {
        return successList;
    }

    public void setSuccessList(List<UploadFileSuccess> successList) {
        this.successList = successList;
    }
}
