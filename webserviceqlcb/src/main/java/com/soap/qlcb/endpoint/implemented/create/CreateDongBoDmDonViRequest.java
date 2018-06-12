package com.soap.qlcb.endpoint.implemented.create;

import com.soap.qlcb.endpoint.controller.entity.DmDonViEntity;
import com.soap.qlcb.endpoint.controller.entity.DmDonViEntityFix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * @author anhbt 6/2/2018
 * com.soap.qlcb.endpoint.implemented.create
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CreateDongBoDmDonViRequest {
    @XmlElement
    private List<DmDonViEntityFix>dmDonViEntities;

    public List<DmDonViEntityFix> getDmDonViEntities() {
        return dmDonViEntities;
    }
    public void setDmDonViEntities(List<DmDonViEntityFix> dmDonViEntities) {
        this.dmDonViEntities = dmDonViEntities;
    }
}
