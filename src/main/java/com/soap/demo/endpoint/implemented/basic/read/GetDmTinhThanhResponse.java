package com.soap.demo.endpoint.implemented.basic.read;

import com.soap.demo.DefinedConfig;
import com.soap.demo.endpoint.implemented.basic.BasicResponse;
import com.soap.demo.endpoint.implemented.basic.model.DanhMucTinhThanh;
import com.soap.demo.qlcb.model.DmTinhThanh;

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
    @XmlElement(name ="dmTinhThanhs",namespace = DefinedConfig.NAME_SPACE)
    private List<DmTinhThanh> listDm=new ArrayList<>();

    public List<DmTinhThanh> getListDm() {
        return listDm;
    }

    public void setListDm(List<DmTinhThanh> listDm) {
        this.listDm = listDm;
    }
}
