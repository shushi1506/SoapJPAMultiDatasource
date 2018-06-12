package com.soap.demo.endpoint.implemented.basic.create;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * @author anhbt 6/11/2018
 * com.soap.demo.endpoint.implemented.basic.create
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CreatePdfBarcodeQrResponse {
    private String message;
    private boolean status;
    private String qrData;

    public CreatePdfBarcodeQrResponse() {
    }

    public CreatePdfBarcodeQrResponse(String message, boolean status, String qrData) {
        this.message = message;
        this.status = status;
        this.qrData = qrData;
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

    public String getQrData() {
        return qrData;
    }

    public void setQrData(String qrData) {
        this.qrData = qrData;
    }
}
