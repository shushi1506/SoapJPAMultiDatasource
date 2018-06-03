package com.soap.qlcb.endpoint.implemented.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * @author anhbt 5/10/2018
 * com.soap.demo.endpoint.implemented.basic.model
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class DanhMucChucVu {
    private String maChucVu;
    private String tenChucVu;
    private String hsPhuCap;
    private String capTruong;

    public String getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(String maChucVu) {
        this.maChucVu = maChucVu;
    }

    public String getTenChucVu() {
        return tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
    }

    public String getHsPhuCap() {
        return hsPhuCap;
    }

    public void setHsPhuCap(String hsPhuCap) {
        this.hsPhuCap = hsPhuCap;
    }

    public String getCapTruong() {
        return capTruong;
    }

    public void setCapTruong(String capTruong) {
        this.capTruong = capTruong;
    }
}
