package com.soap.qlcb.endpoint.implemented.delete;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author anhbt 5/31/2018
 * com.soap.qlcb.endpoint.implemented.delete
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class DeleteDongBoDmCanBoRequest {
    @XmlElement(name = "idCanBo")
    private long idCanBo;

    public long getId() {
        return idCanBo;
    }

    public void setId(long id) {
        this.idCanBo = id;
    }
}
