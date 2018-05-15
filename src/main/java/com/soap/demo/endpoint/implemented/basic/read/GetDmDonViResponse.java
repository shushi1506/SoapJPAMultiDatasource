package com.soap.demo.endpoint.implemented.basic.read;

import com.soap.demo.DefinedConfig;
import com.soap.demo.endpoint.implemented.basic.BasicResponse;
import com.soap.demo.endpoint.implemented.basic.model.DanhMucDonViQltb;

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
    @XmlElement(name = "dmDonVis",namespace = DefinedConfig.NAME_SPACE)
    private List<DanhMucDonViQltb> list=new ArrayList<>();

    public List<DanhMucDonViQltb> getList() {
        return list;
    }

    public void setList(List<DanhMucDonViQltb> list) {
        this.list = list;
    }
}
