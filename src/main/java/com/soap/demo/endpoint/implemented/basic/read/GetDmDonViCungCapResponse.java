package com.soap.demo.endpoint.implemented.basic.read;

import com.soap.demo.endpoint.implemented.basic.BasicResponse;
import com.soap.demo.qltb.model.DmDonViCungcapEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author anhbt 5/10/2018
 * com.soap.demo.endpoint.implemented.basic.read
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class GetDmDonViCungCapResponse extends BasicResponse{
    @XmlElement(name = "dmDonViCungCaps")
    private List<DmDonViCungcapEntity>listDm=new ArrayList<>();

    public List<DmDonViCungcapEntity> getListDm() {
        return listDm;
    }

    public void setListDm(List<DmDonViCungcapEntity> listDm) {
        this.listDm = listDm;
    }
}
