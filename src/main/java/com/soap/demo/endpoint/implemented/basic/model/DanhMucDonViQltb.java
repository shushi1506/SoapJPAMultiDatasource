package com.soap.demo.endpoint.implemented.basic.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * @author anhbt 5/10/2018
 * com.soap.demo.endpoint.implemented.basic.model
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class DanhMucDonViQltb {
    private String maDonVi;
    private String tenDonVi;
    private String tinhThanh;
    private String diaChi;
    private String loaiHinh;
    private String loaiHinhDonVi;

    public String getMaDonVi() {
        return maDonVi;
    }

    public void setMaDonVi(String maDonVi) {
        this.maDonVi = maDonVi;
    }

    public String getTenDonVi() {
        return tenDonVi;
    }

    public void setTenDonVi(String tenDonVi) {
        this.tenDonVi = tenDonVi;
    }

    public String getTinhThanh() {
        return tinhThanh;
    }

    public void setTinhThanh(String tinhThanh) {
        this.tinhThanh = tinhThanh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiHinh() {
        return loaiHinh;
    }

    public void setLoaiHinh(String loaiHinh) {
        this.loaiHinh = loaiHinh;
    }

    public String getLoaiHinhDonVi() {
        return loaiHinhDonVi;
    }

    public void setLoaiHinhDonVi(String loaiHinhDonVi) {
        this.loaiHinhDonVi = loaiHinhDonVi;
    }
}
