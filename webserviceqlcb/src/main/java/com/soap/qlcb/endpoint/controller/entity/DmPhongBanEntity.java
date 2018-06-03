package com.soap.qlcb.endpoint.controller.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.sql.Time;

/**
 * @author anhbt 5/15/2018
 * com.soap.demo.qlcb.model
 */
@Entity
@Table(name = "DM_PHONG_BAN", schema = "QLTB", catalog = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class DmPhongBanEntity {
    private long id;
    private String maPhongBan;
    private String tenPhongBan;
    private Long truongPhong;
    private Long phoPhong;
    private String moTa;
    private Long donViId;
    private Long soLuongCanBo;
    private Long laBanGd;

    @Id
    @Column(name = "ID")
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generatorDmPb")
//    @SequenceGenerator(sequenceName = "DM_PHONG_BAN_SEQ", allocationSize = 1, name = "generatorDmPb")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "MA_PHONG_BAN")
    public String getMaPhongBan() {
        return maPhongBan;
    }

    public void setMaPhongBan(String maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    @Basic
    @Column(name = "TEN_PHONG_BAN")
    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    @Basic
    @Column(name = "TRUONG_PHONG")
    public Long getTruongPhong() {
        return truongPhong;
    }

    public void setTruongPhong(Long truongPhong) {
        this.truongPhong = truongPhong;
    }

    @Basic
    @Column(name = "PHO_PHONG")
    public Long getPhoPhong() {
        return phoPhong;
    }

    public void setPhoPhong(Long phoPhong) {
        this.phoPhong = phoPhong;
    }

    @Basic
    @Column(name = "MO_TA")
    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Basic
    @Column(name = "DON_VI_ID")
    public Long getDonViId() {
        return donViId;
    }

    public void setDonViId(Long donViId) {
        this.donViId = donViId;
    }

    @Basic
    @Column(name = "SO_LUONG_CAN_BO")
    public Long getSoLuongCanBo() {
        return soLuongCanBo;
    }

    public void setSoLuongCanBo(Long soLuongCanBo) {
        this.soLuongCanBo = soLuongCanBo;
    }

    @Basic
    @Column(name = "LA_BAN_GD")
    public Long getLaBanGd() {
        return laBanGd;
    }

    public void setLaBanGd(Long laBanGd) {
        this.laBanGd = laBanGd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmPhongBanEntity that = (DmPhongBanEntity) o;

        if (id != that.id) return false;
        if (maPhongBan != null ? !maPhongBan.equals(that.maPhongBan) : that.maPhongBan != null) return false;
        if (tenPhongBan != null ? !tenPhongBan.equals(that.tenPhongBan) : that.tenPhongBan != null) return false;
        if (truongPhong != null ? !truongPhong.equals(that.truongPhong) : that.truongPhong != null) return false;
        if (phoPhong != null ? !phoPhong.equals(that.phoPhong) : that.phoPhong != null) return false;
        if (moTa != null ? !moTa.equals(that.moTa) : that.moTa != null) return false;
        if (donViId != null ? !donViId.equals(that.donViId) : that.donViId != null) return false;
        if (soLuongCanBo != null ? !soLuongCanBo.equals(that.soLuongCanBo) : that.soLuongCanBo != null) return false;
        if (laBanGd != null ? !laBanGd.equals(that.laBanGd) : that.laBanGd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (maPhongBan != null ? maPhongBan.hashCode() : 0);
        result = 31 * result + (tenPhongBan != null ? tenPhongBan.hashCode() : 0);
        result = 31 * result + (truongPhong != null ? truongPhong.hashCode() : 0);
        result = 31 * result + (phoPhong != null ? phoPhong.hashCode() : 0);
        result = 31 * result + (moTa != null ? moTa.hashCode() : 0);
        result = 31 * result + (donViId != null ? donViId.hashCode() : 0);
        result = 31 * result + (soLuongCanBo != null ? soLuongCanBo.hashCode() : 0);
        result = 31 * result + (laBanGd != null ? laBanGd.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DmPhongBanEntity{" +
                "id=" + id +
                ", maPhongBan='" + maPhongBan + '\'' +
                ", tenPhongBan='" + tenPhongBan + '\'' +
                ", truongPhong=" + truongPhong +
                ", phoPhong=" + phoPhong +
                ", moTa='" + moTa + '\'' +
                ", donViId=" + donViId +
                ", soLuongCanBo=" + soLuongCanBo +
                ", laBanGd=" + laBanGd +
                '}';
    }
}
