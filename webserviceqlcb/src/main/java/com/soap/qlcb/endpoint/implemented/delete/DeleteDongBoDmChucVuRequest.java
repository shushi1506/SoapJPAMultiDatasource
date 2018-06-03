package com.soap.qlcb.endpoint.implemented.delete;

/**
 * @author anhbt 6/1/2018
 * com.soap.qlcb.endpoint.implemented.delete
 */

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class DeleteDongBoDmChucVuRequest {
    @XmlElement(name = "idChucVu")
    private long idChucVu;

    public long getId() {
        return idChucVu;
    }

    public void setId(long id) {
        this.idChucVu = id;
    }
}
