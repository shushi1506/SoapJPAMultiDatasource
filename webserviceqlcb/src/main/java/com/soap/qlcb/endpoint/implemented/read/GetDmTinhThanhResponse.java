package com.soap.qlcb.endpoint.implemented.read;


import com.soap.qlcb.DefinedConfig;
import com.soap.qlcb.endpoint.controller.entity.DmTinhThanh;
import com.soap.qlcb.endpoint.implemented.BasicResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author anhbt 5/9/2018
 * com.soap.demo.endpoint.implemented.basic.read
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class GetDmTinhThanhResponse extends BasicResponse {
    @XmlElement(name ="dmTinhThanh",namespace = DefinedConfig.NAME_SPACE)
    private List<DmTinhThanh> listDm=new ArrayList<>();

    public List<DmTinhThanh> getListDm() {
        return listDm;
    }

    public void setListDm(List<DmTinhThanh> listDm) {
        this.listDm = listDm;
    }
}
