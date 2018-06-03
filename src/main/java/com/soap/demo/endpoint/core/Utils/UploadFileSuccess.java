package com.soap.demo.endpoint.core.Utils;

/**
 * @author anhbt 5/23/2018
 * com.soap.demo.endpoint.core.Utils
 */
public class UploadFileSuccess {
//    private String fileName;
    private String link;
//    private boolean state;
//    private String errorCode;
//    private String errorMessage;

//    public String getFileName() {
//        return fileName;
//    }
//
//    public void setFileName(String fileName) {
//        this.fileName = fileName;
//    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

//    public boolean isState() {
//        return state;
//    }
//
//    public void setState(boolean state) {
//        this.state = state;
//    }
//
//    public String getErrorCode() {
//        return errorCode;
//    }
//
//    public void setErrorCode(String errorCode) {
//        this.errorCode = errorCode;
//    }
//
//    public String getErrorMessage() {
//        return errorMessage;
//    }
//
//    public void setErrorMessage(String errorMessage) {
//        this.errorMessage = errorMessage;
//    }

    public UploadFileSuccess( String link) {
//        this.fileName = fileName;
        this.link = link;
//        this.state = state;
//        this.errorCode = errorCode;
//        this.errorMessage = errorMessage;
    }
}
