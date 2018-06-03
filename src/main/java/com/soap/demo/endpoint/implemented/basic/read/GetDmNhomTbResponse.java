package com.soap.demo.endpoint.implemented.basic.read;

import com.soap.demo.endpoint.implemented.basic.BasicResponse;
import com.soap.demo.qltb.model.DmNhomTbEntity;

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
public class GetDmNhomTbResponse extends BasicResponse{
    @XmlElement(name = "dmNhomTBs")
    private List<DmNhomTbEntity>listDm=new ArrayList<>();

    public List<DmNhomTbEntity> getListDm() {
        return listDm;
    }

    public void setListDm(List<DmNhomTbEntity> listDm) {
        this.listDm = listDm;
    }
}
