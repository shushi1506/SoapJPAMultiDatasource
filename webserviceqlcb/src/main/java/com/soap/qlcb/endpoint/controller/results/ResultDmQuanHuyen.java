package com.soap.qlcb.endpoint.controller.results;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * @author anhbt 5/17/2018
 * com.soap.demo.qlcb.model
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ResultDmQuanHuyen {
    private String maQuanHuyen;
    private String tenQuanHuyen;
    private String tenTinhThanh;

    public ResultDmQuanHuyen(String maQuanHuyen, String tenQuanHuyen, String tenTinhThanh) {
        this.maQuanHuyen = maQuanHuyen;
        this.tenQuanHuyen = tenQuanHuyen;
        this.tenTinhThanh = tenTinhThanh;
    }

    public String getMaQuanHuyen() {
        return maQuanHuyen;
    }

    public void setMaQuanHuyen(String maQuanHuyen) {
        this.maQuanHuyen = maQuanHuyen;
    }

    public String getTenQuanHuyen() {
        return tenQuanHuyen;
    }

    public void setTenQuanHuyen(String tenQuanHuyen) {
        this.tenQuanHuyen = tenQuanHuyen;
    }

    public String getTenTinhThanh() {
        return tenTinhThanh;
    }

    public void setTenTinhThanh(String tenTinhThanh) {
        this.tenTinhThanh = tenTinhThanh;
    }
}
