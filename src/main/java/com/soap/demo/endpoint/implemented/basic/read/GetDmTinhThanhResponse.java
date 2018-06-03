package com.soap.demo.endpoint.implemented.basic.read;

import com.soap.demo.endpoint.implemented.basic.BasicResponse;
import com.soap.demo.qltb.model.DmTinhThanhEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.ArrayList;
import java.util.List;

/**
 * @author anhbt 5/26/2018
 * com.soap.demo.endpoint.implemented.basic.read
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class GetDmTinhThanhResponse extends BasicResponse {
    private List<DmTinhThanhEntity>listTt=new ArrayList<>();

    public List<DmTinhThanhEntity> getListTt() {
        return listTt;
    }

    public void setListTt(List<DmTinhThanhEntity> listTt) {
        this.listTt = listTt;
    }
}
