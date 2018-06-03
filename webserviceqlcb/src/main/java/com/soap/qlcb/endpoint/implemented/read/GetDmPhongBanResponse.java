package com.soap.qlcb.endpoint.implemented.read;



import com.soap.qlcb.DefinedConfig;
import com.soap.qlcb.endpoint.controller.results.ResultDmPhongBan;
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
public class GetDmPhongBanResponse extends BasicResponse {
    @XmlElement(name = "dmPhongBan", namespace = DefinedConfig.NAME_SPACE)
    private List<ResultDmPhongBan> listDm = new ArrayList<>();

    public GetDmPhongBanResponse() {
    }

    public List<ResultDmPhongBan> getListDm() {
        return listDm;
    }

    public void setListDm(List<ResultDmPhongBan> listDm) {
        this.listDm = listDm;
    }
}
