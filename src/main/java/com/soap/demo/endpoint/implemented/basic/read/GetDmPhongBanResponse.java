package com.soap.demo.endpoint.implemented.basic.read;

import com.soap.demo.DefinedConfig;
import com.soap.demo.endpoint.implemented.basic.BasicResponse;
import com.soap.demo.endpoint.implemented.basic.model.DanhMucPhongBan;

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
public class GetDmPhongBanResponse extends BasicResponse{
    @XmlElement(name = "dmPhongBans", namespace = DefinedConfig.NAME_SPACE)
    private List<DanhMucPhongBan> listDm = new ArrayList<>();

    public GetDmPhongBanResponse() {
    }

    public List<DanhMucPhongBan> getListDm() {
        return listDm;
    }

    public void setListDm(List<DanhMucPhongBan> listDm) {
        this.listDm = listDm;
    }
}
