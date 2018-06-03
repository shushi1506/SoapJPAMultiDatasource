package com.soap.demo.qltb.model;

import javax.persistence.*;

/**
 * @author anhbt 5/17/2018
 * com.soap.demo.qltb.model
 */
@Entity
@Table(name = "DM_DON_VI_CUNGCAP", schema = "QLTB", catalog = "")
public class DmDonViCungcapEntity {
    private long id;
    private String maDonVi;
    private String tenDonVi;
    private String diaChi;
    private String sdt;
    private String moTa;
    private Long nguoiTao;
    private Long ngayTao;
    private Long nguoiCapNhat;
    private Long ngayCapNhat;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "MA_DON_VI")
    public String getMaDonVi() {
        return maDonVi;
    }

    public void setMaDonVi(String maDonVi) {
        this.maDonVi = maDonVi;
    }

    @Basic
    @Column(name = "TEN_DON_VI")
    public String getTenDonVi() {
        return tenDonVi;
    }

    public void setTenDonVi(String tenDonVi) {
        this.tenDonVi = tenDonVi;
    }

    @Basic
    @Column(name = "DIA_CHI")
    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Basic
    @Column(name = "SDT")
    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
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
    @Column(name = "NGUOI_TAO")
    public Long getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(Long nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    @Basic
    @Column(name = "NGAY_TAO")
    public Long getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Long ngayTao) {
        this.ngayTao = ngayTao;
    }

    @Basic
    @Column(name = "NGUOI_CAP_NHAT")
    public Long getNguoiCapNhat() {
        return nguoiCapNhat;
    }

    public void setNguoiCapNhat(Long nguoiCapNhat) {
        this.nguoiCapNhat = nguoiCapNhat;
    }

    @Basic
    @Column(name = "NGAY_CAP_NHAT")
    public Long getNgayCapNhat() {
        return ngayCapNhat;
    }

    public void setNgayCapNhat(Long ngayCapNhat) {
        this.ngayCapNhat = ngayCapNhat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmDonViCungcapEntity that = (DmDonViCungcapEntity) o;

        if (id != that.id) return false;
        if (maDonVi != null ? !maDonVi.equals(that.maDonVi) : that.maDonVi != null) return false;
        if (tenDonVi != null ? !tenDonVi.equals(that.tenDonVi) : that.tenDonVi != null) return false;
        if (diaChi != null ? !diaChi.equals(that.diaChi) : that.diaChi != null) return false;
        if (sdt != null ? !sdt.equals(that.sdt) : that.sdt != null) return false;
        if (moTa != null ? !moTa.equals(that.moTa) : that.moTa != null) return false;
        if (nguoiTao != null ? !nguoiTao.equals(that.nguoiTao) : that.nguoiTao != null) return false;
        if (ngayTao != null ? !ngayTao.equals(that.ngayTao) : that.ngayTao != null) return false;
        if (nguoiCapNhat != null ? !nguoiCapNhat.equals(that.nguoiCapNhat) : that.nguoiCapNhat != null) return false;
        if (ngayCapNhat != null ? !ngayCapNhat.equals(that.ngayCapNhat) : that.ngayCapNhat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (maDonVi != null ? maDonVi.hashCode() : 0);
        result = 31 * result + (tenDonVi != null ? tenDonVi.hashCode() : 0);
        result = 31 * result + (diaChi != null ? diaChi.hashCode() : 0);
        result = 31 * result + (sdt != null ? sdt.hashCode() : 0);
        result = 31 * result + (moTa != null ? moTa.hashCode() : 0);
        result = 31 * result + (nguoiTao != null ? nguoiTao.hashCode() : 0);
        result = 31 * result + (ngayTao != null ? ngayTao.hashCode() : 0);
        result = 31 * result + (nguoiCapNhat != null ? nguoiCapNhat.hashCode() : 0);
        result = 31 * result + (ngayCapNhat != null ? ngayCapNhat.hashCode() : 0);
        return result;
    }
}
