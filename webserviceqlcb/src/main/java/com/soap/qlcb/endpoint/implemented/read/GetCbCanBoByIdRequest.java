package com.soap.qlcb.endpoint.implemented.read;

import com.soap.qlcb.endpoint.implemented.BasicRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * @author anhbt 5/30/2018
 * com.soap.qlcb.endpoint.implemented.read
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class GetCbCanBoByIdRequest extends BasicRequest {
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
