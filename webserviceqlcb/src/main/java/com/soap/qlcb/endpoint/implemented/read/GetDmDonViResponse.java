package com.soap.qlcb.endpoint.implemented.read;



import com.soap.qlcb.DefinedConfig;
import com.soap.qlcb.endpoint.controller.results.ResultDmDonVi;
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
public class GetDmDonViResponse extends BasicResponse {
    @XmlElement(name = "dmDonVi",namespace = DefinedConfig.NAME_SPACE)
    private List<ResultDmDonVi> list=new ArrayList<>();

    public List<ResultDmDonVi> getList() {
        return list;
    }

    public void setList(List<ResultDmDonVi> list) {
        this.list = list;
    }
}
