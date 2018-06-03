package com.soap.qlcb.endpoint.implemented.read;

import com.soap.qlcb.endpoint.controller.results.ResultCbCanBo;
import com.soap.qlcb.endpoint.implemented.BasicResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author anhbt 5/30/2018
 * com.soap.qlcb.endpoint.implemented.read
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class GetCbCanBoByIdResponse extends BasicResponse{
    @XmlElement(name = "canBo")
    ResultCbCanBo canBo;

    public ResultCbCanBo getCanBo() {
        return canBo;
    }

    public void setCanBo(ResultCbCanBo canBo) {
        this.canBo = canBo;
    }
}
