package com.soap.qlcb.endpoint.implemented.read;


import com.soap.qlcb.endpoint.implemented.BasicRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * @author anhbt 5/17/2018
 * com.soap.demo.endpoint.implemented.basic.read
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class GetCbCanBoRequest extends BasicRequest{
    private long idDonVi;

    public GetCbCanBoRequest() {
    }

    public long getIdDonVi() {
        return idDonVi;
    }

    public void setIdDonVi(long idDonVi) {
        this.idDonVi = idDonVi;
    }
}
