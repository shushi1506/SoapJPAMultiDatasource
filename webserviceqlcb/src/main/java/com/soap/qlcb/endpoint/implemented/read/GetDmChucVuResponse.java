package com.soap.qlcb.endpoint.implemented.read;



import com.soap.qlcb.endpoint.controller.results.ResultDmChucVu;
import com.soap.qlcb.endpoint.implemented.BasicResponse;

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
public class GetDmChucVuResponse extends BasicResponse {
    @XmlElement(name = "dmChucVu")
    List<ResultDmChucVu>listDm=new ArrayList<>();
    public GetDmChucVuResponse() {
    }

    public List<ResultDmChucVu> getListDm() {
        return listDm;
    }

    public void setListDm(List<ResultDmChucVu> listDm) {
        this.listDm = listDm;
    }
}
