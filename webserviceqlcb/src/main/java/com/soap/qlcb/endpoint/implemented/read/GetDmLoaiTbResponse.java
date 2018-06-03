package com.soap.qlcb.endpoint.implemented.read;



import com.soap.qlcb.endpoint.implemented.BasicResponse;
import com.soap.qlcb.endpoint.implemented.model.DmLoaiTb;

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
public class GetDmLoaiTbResponse extends BasicResponse {
    @XmlElement(name = "dmLoaiTb")
    private List<DmLoaiTb>listDm=new ArrayList<>();

    public List<DmLoaiTb> getListDm() {
        return listDm;
    }

    public void setListDm(List<DmLoaiTb> listDm) {
        this.listDm = listDm;
    }
}
