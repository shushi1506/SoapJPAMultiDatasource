package com.soap.qlcb.endpoint.controller.results;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * @author anhbt 5/17/2018
 * com.soap.demo.qlcb.model
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ResultDmQuanHuyen {
    private Long id;
    private String maQuanHuyen;
    private String tenQuanHuyen;
    private String tenTinhThanh;
    private String loaiHuyen;
    private String maCha;

    public ResultDmQuanHuyen(Long id, String maQuanHuyen, String tenQuanHuyen, String tenTinhThanh, String loaiHuyen,String maCha) {
        this.id = id;
        this.maQuanHuyen = maQuanHuyen;
        this.tenQuanHuyen = tenQuanHuyen;
        this.tenTinhThanh = tenTinhThanh;
        this.loaiHuyen = loaiHuyen;
        this.maCha=maCha;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoaiHuyen() {
        return loaiHuyen;
    }

    public void setLoaiHuyen(String loaiHuyen) {
        this.loaiHuyen = loaiHuyen;
    }

    public String getMaCha() {
        return maCha;
    }

    public void setMaCha(String maCha) {
        this.maCha = maCha;
    }
}
