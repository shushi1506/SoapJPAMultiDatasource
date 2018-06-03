package com.soap.qlcb.endpoint.implemented.create;

import com.soap.qlcb.endpoint.controller.entity.CbCanBoEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author anhbt 5/31/2018
 * com.soap.qlcb.endpoint.implemented.create
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CreateDongBoDmCanBoRequest {
    @XmlElement
    List<CbCanBoEntity>cbCanBoEntityList;

    public List<CbCanBoEntity> getCbCanBoEntityList() {
        if(this.cbCanBoEntityList==null)
            return new ArrayList<>();
        return cbCanBoEntityList;
    }

    public void setCbCanBoEntityList(List<CbCanBoEntity> cbCanBoEntityList) {
        this.cbCanBoEntityList = cbCanBoEntityList;
    }
}
