package com.soap.qlcb.endpoint.implemented.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * @author anhbt 5/10/2018
 * com.soap.demo.endpoint.implemented.basic.model
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class DmLoaiTb {
    private String maLoaiTb;
    private String tenLoaiTb;
    private String tenNhomTb;

    public String getMaLoaiTb() {
        return maLoaiTb;
    }

    public void setMaLoaiTb(String maLoaiTb) {
        this.maLoaiTb = maLoaiTb;
    }

    public String getTenLoaiTb() {
        return tenLoaiTb;
    }

    public void setTenLoaiTb(String tenLoaiTb) {
        this.tenLoaiTb = tenLoaiTb;
    }

    public String getTenNhomTb() {
        return tenNhomTb;
    }

    public void setTenNhomTb(String tenNhomTb) {
        this.tenNhomTb = tenNhomTb;
    }
}
