package com.soap.demo.endpoint.implemented.basic.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * @author anhbt 5/10/2018
 * com.soap.demo.endpoint.implemented.basic.model
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class DmNhomTB {
    private String maNhomTb;
    private String tenNhomTb;
    private String moTa;
    private String nguoiTao;
    private String ngayTao;
    private String nguoiCapNhat;
    private String ngayCapNhat;

    public String getMaNhomTb() {
        return maNhomTb;
    }

    public void setMaNhomTb(String maNhomTb) {
        this.maNhomTb = maNhomTb;
    }

    public String getTenNhomTb() {
        return tenNhomTb;
    }

    public void setTenNhomTb(String tenNhomTb) {
        this.tenNhomTb = tenNhomTb;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getNguoiCapNhat() {
        return nguoiCapNhat;
    }

    public void setNguoiCapNhat(String nguoiCapNhat) {
        this.nguoiCapNhat = nguoiCapNhat;
    }

    public String getNgayCapNhat() {
        return ngayCapNhat;
    }

    public void setNgayCapNhat(String ngayCapNhat) {
        this.ngayCapNhat = ngayCapNhat;
    }
}
