package com.soap.demo.endpoint.implemented.basic.read;

import com.soap.demo.endpoint.implemented.basic.BasicResponse;
import com.soap.demo.qltb.model.AuthItem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author anhbt 5/26/2018
 * com.soap.demo.endpoint.implemented.basic.read
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class GetAuthenItemRespone extends BasicResponse {
    @XmlElement(name = "listAuth")
    List<AuthItem> list=new ArrayList<>();

    public List<AuthItem> getList() {
        return list;
    }

    public void setList(List<AuthItem> list) {
        this.list = list;
    }
}
