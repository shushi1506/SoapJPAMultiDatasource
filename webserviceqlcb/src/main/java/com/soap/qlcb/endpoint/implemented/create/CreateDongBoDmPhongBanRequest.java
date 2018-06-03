package com.soap.qlcb.endpoint.implemented.create;


import com.soap.qlcb.endpoint.controller.entity.DmPhongBanEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author anhbt 6/2/2018
 * com.soap.qlcb.endpoint.implemented.create
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CreateDongBoDmPhongBanRequest {
    @XmlElement
    List<DmPhongBanEntity> dmPhongBanEntities;

    public List<DmPhongBanEntity> getDmPhongBanEntities() {
        if(this.dmPhongBanEntities ==null)
            return new ArrayList<>();
        return dmPhongBanEntities;
    }

    public void setDmPhongBanEntities(List<DmPhongBanEntity> dmPhongBanEntities) {
        this.dmPhongBanEntities = dmPhongBanEntities;
    }
}
