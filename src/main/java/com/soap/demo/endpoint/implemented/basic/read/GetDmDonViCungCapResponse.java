package com.soap.demo.endpoint.implemented.basic.read;

import com.soap.demo.endpoint.implemented.basic.BasicResponse;
import com.soap.demo.endpoint.implemented.basic.model.DmDonViCungCap;

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
    private List<DmDonViCungCap>listDm=new ArrayList<>();

    public List<DmDonViCungCap> getListDm() {
        return listDm;
    }

    public void setListDm(List<DmDonViCungCap> listDm) {
        this.listDm = listDm;
    }
}
