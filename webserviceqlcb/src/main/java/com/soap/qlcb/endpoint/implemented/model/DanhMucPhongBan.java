package com.soap.qlcb.endpoint.implemented.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

/**
 * @author anhbt 5/9/2018
 * com.soap.demo.endpoint.implemented.basic.model
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmPhongBan")
public class DanhMucPhongBan {
    protected Integer id;
    protected String maPhongBan;
    protected String tenPhongBan;
    protected Integer truongPhong;
    @XmlElement(name = "phoPhong",nillable = true)
    protected Integer phoPhong;
    protected String moTa;
    protected Date lastUpdate;
    protected Integer donViId;
    protected Integer soLuongCanBo;
    protected Integer laBanGd;

    public DanhMucPhongBan() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getTruongPhong() {
        return truongPhong;
    }

    public void setTruongPhong(Integer truongPhong) {
        this.truongPhong = truongPhong;
    }

    public Integer getPhoPhong() {
        return phoPhong;
    }

    public void setPhoPhong(Integer phoPhong) {
        this.phoPhong = phoPhong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Integer getDonViId() {
        return donViId;
    }

    public void setDonViId(Integer donViId) {
        this.donViId = donViId;
    }

    public Integer getSoLuongCanBo() {
        return soLuongCanBo;
    }

    public void setSoLuongCanBo(Integer soLuongCanBo) {
        this.soLuongCanBo = soLuongCanBo;
    }

    public Integer getLaBanGd() {
        return laBanGd;
    }

    public void setLaBanGd(Integer laBanGd) {
        this.laBanGd = laBanGd;
    }
}
