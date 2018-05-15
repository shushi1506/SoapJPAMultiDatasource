package com.soap.demo.endpoint.implemented.basic.read;

import com.soap.demo.endpoint.implemented.basic.BasicResponse;
import com.soap.demo.endpoint.implemented.basic.model.DanhMucChucVu;

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
public class GetDmChucVuResponse extends BasicResponse{
    @XmlElement(name = "dmChucVus")
    List<DanhMucChucVu>listDm=new ArrayList<>();
    public GetDmChucVuResponse() {
    }

    public List<DanhMucChucVu> getListDm() {
        return listDm;
    }

    public void setListDm(List<DanhMucChucVu> listDm) {
        this.listDm = listDm;
    }
}
