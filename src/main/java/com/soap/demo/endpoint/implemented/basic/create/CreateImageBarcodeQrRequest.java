package com.soap.demo.endpoint.implemented.basic.create;

import com.soap.demo.endpoint.implemented.basic.BasicRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * @author anhbt 6/11/2018
 * com.soap.demo.endpoint.implemented.basic.create
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CreateImageBarcodeQrRequest extends BasicRequest {
    private String id;
    private String data;

    public CreateImageBarcodeQrRequest() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
