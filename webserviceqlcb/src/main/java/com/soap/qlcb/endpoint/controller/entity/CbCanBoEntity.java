package com.soap.qlcb.endpoint.controller.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import java.util.Date;

/**
 * @author anhbt 5/17/2018
 * com.soap.demo.qlcb.model
 */
@Entity
@Table(name = "CB_CAN_BO", schema = "QLTB", catalog = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class CbCanBoEntity {
    private long id;
    private String soHieuCongChuc;
    private String hoTen;
    private String tenGoiKhac;
    private Long gioiTinh;
    private Date ngaySinh;
    private Long donViId;
    private Long phongBanId;
    private Long chucVuId;
//    private Date lastUpdate;
    private String ghiChu;
    private Long trangThai;
    private String anh;
    private Long doiTuongCb;
    private Date ngaySinhHsDang;

    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
//    @SequenceGenerator(sequenceName = "CB_CAN_BO_SEQ", allocationSize = 1, name = "generator")
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "SO_HIEU_CONG_CHUC")
    public String getSoHieuCongChuc() {
        return soHieuCongChuc;
    }

    public void setSoHieuCongChuc(String soHieuCongChuc) {
        this.soHieuCongChuc = soHieuCongChuc;
    }

    @Basic
    @Column(name = "HO_TEN")
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Basic
    @Column(name = "TEN_GOI_KHAC")
    public String getTenGoiKhac() {
        return tenGoiKhac;
    }

    public void setTenGoiKhac(String tenGoiKhac) {
        this.tenGoiKhac = tenGoiKhac;
    }

    @Basic
    @Column(name = "GIOI_TINH")
    public Long getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Long gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Basic
    @Column(name = "NGAY_SINH")
    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
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
    @Column(name = "PHONG_BAN_ID")
    public Long getPhongBanId() {
        return phongBanId;
    }

    public void setPhongBanId(Long phongBanId) {
        this.phongBanId = phongBanId;
    }

    @Basic
    @Column(name = "CHUC_VU_ID")
    public Long getChucVuId() {
        return chucVuId;
    }

    public void setChucVuId(Long chucVuId) {
        this.chucVuId = chucVuId;
    }

//    @Basic
//    @Column(name = "LAST_UPDATE")
//    public Date getLastUpdate() {
//        return lastUpdate;
//    }
//
//    public void setLastUpdate(Date lastUpdate) {
//        this.lastUpdate = lastUpdate;
//    }

    @Basic
    @Column(name = "GHI_CHU")
    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
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
    @Column(name = "ANH")
    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    @Basic
    @Column(name = "DOI_TUONG_CB")
    public Long getDoiTuongCb() {
        return doiTuongCb;
    }

    public void setDoiTuongCb(Long doiTuongCb) {
        this.doiTuongCb = doiTuongCb;
    }

    @Basic
    @Column(name = "NGAY_SINH_HS_DANG")
    public Date getNgaySinhHsDang() {
        return ngaySinhHsDang;
    }

    public void setNgaySinhHsDang(Date ngaySinhHsDang) {
        this.ngaySinhHsDang = ngaySinhHsDang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CbCanBoEntity that = (CbCanBoEntity) o;

        if (id != that.id) return false;
        if (soHieuCongChuc != null ? !soHieuCongChuc.equals(that.soHieuCongChuc) : that.soHieuCongChuc != null)
            return false;
        if (hoTen != null ? !hoTen.equals(that.hoTen) : that.hoTen != null) return false;
        if (tenGoiKhac != null ? !tenGoiKhac.equals(that.tenGoiKhac) : that.tenGoiKhac != null) return false;
        if (gioiTinh != null ? !gioiTinh.equals(that.gioiTinh) : that.gioiTinh != null) return false;
        if (ngaySinh != null ? !ngaySinh.equals(that.ngaySinh) : that.ngaySinh != null) return false;
        if (donViId != null ? !donViId.equals(that.donViId) : that.donViId != null) return false;
        if (phongBanId != null ? !phongBanId.equals(that.phongBanId) : that.phongBanId != null) return false;
        if (chucVuId != null ? !chucVuId.equals(that.chucVuId) : that.chucVuId != null) return false;
//        if (lastUpdate != null ? !lastUpdate.equals(that.lastUpdate) : that.lastUpdate != null) return false;
        if (ghiChu != null ? !ghiChu.equals(that.ghiChu) : that.ghiChu != null) return false;
        if (trangThai != null ? !trangThai.equals(that.trangThai) : that.trangThai != null) return false;
        if (anh != null ? !anh.equals(that.anh) : that.anh != null) return false;
        if (doiTuongCb != null ? !doiTuongCb.equals(that.doiTuongCb) : that.doiTuongCb != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (soHieuCongChuc != null ? soHieuCongChuc.hashCode() : 0);
        result = 31 * result + (hoTen != null ? hoTen.hashCode() : 0);
        result = 31 * result + (tenGoiKhac != null ? tenGoiKhac.hashCode() : 0);
        result = 31 * result + (gioiTinh != null ? gioiTinh.hashCode() : 0);
        result = 31 * result + (ngaySinh != null ? ngaySinh.hashCode() : 0);
        result = 31 * result + (donViId != null ? donViId.hashCode() : 0);
        result = 31 * result + (phongBanId != null ? phongBanId.hashCode() : 0);
        result = 31 * result + (chucVuId != null ? chucVuId.hashCode() : 0);
//        result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
        result = 31 * result + (ghiChu != null ? ghiChu.hashCode() : 0);
        result = 31 * result + (trangThai != null ? trangThai.hashCode() : 0);
        result = 31 * result + (anh != null ? anh.hashCode() : 0);
        result = 31 * result + (doiTuongCb != null ? doiTuongCb.hashCode() : 0);
        return result;
    }
}
