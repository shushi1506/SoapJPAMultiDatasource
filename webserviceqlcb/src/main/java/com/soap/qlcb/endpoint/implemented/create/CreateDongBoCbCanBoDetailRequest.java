package com.soap.qlcb.endpoint.implemented.create;

import com.soap.qlcb.endpoint.controller.entity.CbCanBoDetailEntity;
import com.soap.qlcb.endpoint.controller.results.ResultCbCanBoDetail;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * @author anhbt 6/2/2018
 * com.soap.qlcb.endpoint.implemented.create
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CreateDongBoCbCanBoDetailRequest {
    @XmlElement
    List<ResultCbCanBoDetail> resultCbCanBoDetailList;

    public List<ResultCbCanBoDetail> getResultCbCanBoDetailList() {
        return resultCbCanBoDetailList;
    }

    public void setResultCbCanBoDetailList(List<ResultCbCanBoDetail> resultCbCanBoDetailList) {
        this.resultCbCanBoDetailList = resultCbCanBoDetailList;
    }
}
