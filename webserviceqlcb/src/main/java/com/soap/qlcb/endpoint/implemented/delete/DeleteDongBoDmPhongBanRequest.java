package com.soap.qlcb.endpoint.implemented.delete;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author anhbt 6/2/2018
 * com.soap.qlcb.endpoint.implemented.delete
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class DeleteDongBoDmPhongBanRequest {
    @XmlElement(name = "idPhongBan")
    private long idPhongBan;

    public long getId() {
        return idPhongBan;
    }

    public void setId(long id) {
        this.idPhongBan = id;
    }
}
