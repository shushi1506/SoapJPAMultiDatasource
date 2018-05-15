package com.soap.demo.endpoint.implemented.basic.read;

import com.soap.demo.DefinedConfig;
import com.soap.demo.endpoint.implemented.basic.BasicResponse;
import com.soap.demo.endpoint.implemented.basic.model.DanhMucQuanHuyen;

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
public class GetDmQuanHuyenResponse extends BasicResponse{
    @XmlElement(name = "dmQuanHuyens", namespace = DefinedConfig.NAME_SPACE)
    private List<DanhMucQuanHuyen> listDm =new ArrayList<>();

    public List<DanhMucQuanHuyen> getListDm() {
        return listDm;
    }

    public void setListDm(List<DanhMucQuanHuyen> listDm) {
        this.listDm = listDm;
    }
}
