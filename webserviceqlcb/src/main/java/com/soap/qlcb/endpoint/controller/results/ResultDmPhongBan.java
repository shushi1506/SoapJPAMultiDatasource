package com.soap.qlcb.endpoint.controller.results;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.io.Serializable;

/**
 * @author anhbt 5/16/2018
 * com.soap.demo.qlcb.model
 */
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class ResultDmPhongBan implements Serializable {
    @Id
    private long id;
    private Long donViId;
    private String tenDonVi;
    private String maPhongBan;
    private String tenPhongBan;
    private String truongPhong;
    private String phoPhong;
    private Integer soLuongCanBo;

    public ResultDmPhongBan() {
    }

    public ResultDmPhongBan(long id,Long donViId, String tenDonVi, String maPhongBan, String tenPhongBan, String truongPhong, String phoPhong, Integer soLuongCanBo) {
        this.id=id;
        this.donViId=donViId;
        this.tenDonVi = tenDonVi;
        this.maPhongBan = maPhongBan;
        this.tenPhongBan = tenPhongBan;
        this.truongPhong = truongPhong;
        this.phoPhong = phoPhong;
        this.soLuongCanBo = soLuongCanBo;
    }

    @Override
    public String toString() {
        return "ResultDmPhongBan{" +
                ", maPhongBan='" + maPhongBan + '\'' +
                ", tenPhongBan='" + tenPhongBan + '\'' +
                ", truongPhong=" + truongPhong +
                ", phoPhong=" + phoPhong +
                ", soLuongCanBo=" + soLuongCanBo +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getDonViId() {
        return donViId;
    }

    public void setDonViId(Long donViId) {
        this.donViId = donViId;
    }

    public String getTenDonVi() {
        return tenDonVi;
    }

    public void setTenDonVi(String tenDonVi) {
        this.tenDonVi = tenDonVi;
    }

    public String getMaPhongBan() {
        return maPhongBan;
    }

    public void setMaPhongBan(String maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public String getTruongPhong() {
        return truongPhong;
    }

    public void setTruongPhong(String truongPhong) {
        this.truongPhong = truongPhong;
    }

    public String getPhoPhong() {
        return phoPhong;
    }

    public void setPhoPhong(String phoPhong) {
        this.phoPhong = phoPhong;
    }

    public Integer getSoLuongCanBo() {
        return soLuongCanBo;
    }

    public void setSoLuongCanBo(Integer soLuongCanBo) {
        this.soLuongCanBo = soLuongCanBo;
    }
}
