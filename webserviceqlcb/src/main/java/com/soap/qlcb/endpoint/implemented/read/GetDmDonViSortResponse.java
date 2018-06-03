package com.soap.qlcb.endpoint.implemented.read;

import com.soap.qlcb.endpoint.controller.results.ResultDmDonViSort;
import com.soap.qlcb.endpoint.implemented.BasicResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author anhbt 5/28/2018
 * com.soap.qlcb.endpoint.implemented.read
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class GetDmDonViSortResponse extends BasicResponse {
    @XmlElement(name = "dmDonVi")
    List<ResultDmDonViSort>list=new ArrayList<>();

    public List<ResultDmDonViSort> getList() {
        return list;
    }

    public void setList(List<ResultDmDonViSort> list) {
        this.list = list;
    }
}
