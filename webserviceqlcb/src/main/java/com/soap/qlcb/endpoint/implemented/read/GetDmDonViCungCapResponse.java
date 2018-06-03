package com.soap.qlcb.endpoint.implemented.read;



import com.soap.qlcb.endpoint.implemented.BasicResponse;
import com.soap.qlcb.endpoint.implemented.model.DmDonViCungCap;

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
public class GetDmDonViCungCapResponse extends BasicResponse {
    @XmlElement(name = "dmDonViCungCap")
    private List<DmDonViCungCap>listDm=new ArrayList<>();

    public List<DmDonViCungCap> getListDm() {
        return listDm;
    }

    public void setListDm(List<DmDonViCungCap> listDm) {
        this.listDm = listDm;
    }
}
