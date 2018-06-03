package com.soap.qlcb.endpoint.implemented.read;


import com.soap.qlcb.DefinedConfig;
import com.soap.qlcb.endpoint.controller.results.ResultDmQuanHuyen;
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
public class GetDmQuanHuyenResponse extends BasicResponse {
    @XmlElement(name = "dmQuanHuyen", namespace = DefinedConfig.NAME_SPACE)
    private List<ResultDmQuanHuyen> listDm =new ArrayList<>();

    public List<ResultDmQuanHuyen> getListDm() {
        return listDm;
    }

    public void setListDm(List<ResultDmQuanHuyen> listDm) {
        this.listDm = listDm;
    }
}
