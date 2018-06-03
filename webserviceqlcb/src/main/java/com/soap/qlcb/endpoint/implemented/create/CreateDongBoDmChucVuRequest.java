package com.soap.qlcb.endpoint.implemented.create;

import com.soap.qlcb.endpoint.controller.entity.DmChucVuEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author anhbt 6/1/2018
 * com.soap.qlcb.endpoint.implemented.create
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CreateDongBoDmChucVuRequest {
    @XmlElement
    List<DmChucVuEntity> dmChucVuEntities;

    public List<DmChucVuEntity> getDmChucVuEntities() {
        if(this.dmChucVuEntities ==null)
            return new ArrayList<>();
        return dmChucVuEntities;
    }

    public void setDmChucVuEntities(List<DmChucVuEntity> dmChucVuEntities) {
        this.dmChucVuEntities = dmChucVuEntities;
    }
}
