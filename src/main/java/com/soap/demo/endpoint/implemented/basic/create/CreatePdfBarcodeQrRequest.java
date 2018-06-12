package com.soap.demo.endpoint.implemented.basic.create;

import com.soap.demo.endpoint.implemented.basic.BasicRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.List;

/**
 * @author anhbt 6/11/2018
 * com.soap.demo.endpoint.implemented.basic.create
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CreatePdfBarcodeQrRequest extends BasicRequest {
    private List<String>codes;

    public CreatePdfBarcodeQrRequest() {
    }

    public CreatePdfBarcodeQrRequest(List<String> codes) {
        this.codes = codes;
    }

    public List<String> getCodes() {
        return codes;
    }

    public void setCodes(List<String> codes) {
        this.codes = codes;
    }
}
