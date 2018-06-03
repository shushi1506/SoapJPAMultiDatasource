package com.soap.qlcb.endpoint.controller.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.sql.Time;

/**
 * @author anhbt 5/17/2018
 * com.soap.demo.qlcb.model
 */
@Entity
@Table(name = "DM_CHUC_VU", schema = "QLTB", catalog = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class DmChucVuEntity {
    private long id;
    private String maChucVu;
    private String tenChucVu;
    private String moTa;
    private Double hsPhuCap;
    private Long sttCap;
    private Double capTruong;
    private Long hsPctn;
    private Long laLanhDao;
    private Long trangThai;
    private Long loaiBn;
    private String nhomChucVu;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "MA_CHUC_VU")
    public String getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(String maChucVu) {
        this.maChucVu = maChucVu;
    }

    @Basic
    @Column(name = "TEN_CHUC_VU")
    public String getTenChucVu() {
        return tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
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
    @Column(name = "HS_PHU_CAP")
    public Double getHsPhuCap() {
        return hsPhuCap;
    }

    public void setHsPhuCap(Double hsPhuCap) {
        this.hsPhuCap = hsPhuCap;
    }

    @Basic
    @Column(name = "STT_CAP")
    public Long getSttCap() {
        return sttCap;
    }

    public void setSttCap(Long sttCap) {
        this.sttCap = sttCap;
    }

    @Basic
    @Column(name = "CAP_TRUONG")
    public Double getCapTruong() {
        return capTruong;
    }

    public void setCapTruong(Double capTruong) {
        this.capTruong = capTruong;
    }

    @Basic
    @Column(name = "HS_PCTN")
    public Long getHsPctn() {
        return hsPctn;
    }

    public void setHsPctn(Long hsPctn) {
        this.hsPctn = hsPctn;
    }

    @Basic
    @Column(name = "LA_LANH_DAO")
    public Long getLaLanhDao() {
        return laLanhDao;
    }

    public void setLaLanhDao(Long laLanhDao) {
        this.laLanhDao = laLanhDao;
    }

    @Basic
    @Column(name = "TRANG_THAI")
    public Long getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Long trangThai) {
        this.trangThai = trangThai;
    }

    @Basic
    @Column(name = "LOAI_BN")
    public Long getLoaiBn() {
        return loaiBn;
    }

    public void setLoaiBn(Long loaiBn) {
        this.loaiBn = loaiBn;
    }

    @Basic
    @Column(name = "NHOM_CHUC_VU")
    public String getNhomChucVu() {
        return nhomChucVu;
    }

    public void setNhomChucVu(String nhomChucVu) {
        this.nhomChucVu = nhomChucVu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmChucVuEntity that = (DmChucVuEntity) o;

        if (id != that.id) return false;
        if (maChucVu != null ? !maChucVu.equals(that.maChucVu) : that.maChucVu != null) return false;
        if (tenChucVu != null ? !tenChucVu.equals(that.tenChucVu) : that.tenChucVu != null) return false;
        if (moTa != null ? !moTa.equals(that.moTa) : that.moTa != null) return false;
        if (hsPhuCap != null ? !hsPhuCap.equals(that.hsPhuCap) : that.hsPhuCap != null) return false;
        if (sttCap != null ? !sttCap.equals(that.sttCap) : that.sttCap != null) return false;
        if (capTruong != null ? !capTruong.equals(that.capTruong) : that.capTruong != null) return false;
        if (hsPctn != null ? !hsPctn.equals(that.hsPctn) : that.hsPctn != null) return false;
        if (laLanhDao != null ? !laLanhDao.equals(that.laLanhDao) : that.laLanhDao != null) return false;
        if (trangThai != null ? !trangThai.equals(that.trangThai) : that.trangThai != null) return false;
        if (loaiBn != null ? !loaiBn.equals(that.loaiBn) : that.loaiBn != null) return false;
        if (nhomChucVu != null ? !nhomChucVu.equals(that.nhomChucVu) : that.nhomChucVu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (maChucVu != null ? maChucVu.hashCode() : 0);
        result = 31 * result + (tenChucVu != null ? tenChucVu.hashCode() : 0);
        result = 31 * result + (moTa != null ? moTa.hashCode() : 0);
        result = 31 * result + (hsPhuCap != null ? hsPhuCap.hashCode() : 0);
        result = 31 * result + (sttCap != null ? sttCap.hashCode() : 0);
        result = 31 * result + (capTruong != null ? capTruong.hashCode() : 0);
        result = 31 * result + (hsPctn != null ? hsPctn.hashCode() : 0);
        result = 31 * result + (laLanhDao != null ? laLanhDao.hashCode() : 0);
        result = 31 * result + (trangThai != null ? trangThai.hashCode() : 0);
        result = 31 * result + (loaiBn != null ? loaiBn.hashCode() : 0);
        result = 31 * result + (nhomChucVu != null ? nhomChucVu.hashCode() : 0);
        return result;
    }
}
