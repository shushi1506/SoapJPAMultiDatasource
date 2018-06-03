package com.soap.demo.qltb.model;

import javax.persistence.*;

/**
 * @author anhbt 5/17/2018
 * com.soap.demo.qltb.model
 */
@Entity
@Table(name = "DM_NHOM_TB", schema = "QLTB", catalog = "")
public class DmNhomTbEntity {
    private long id;
    private String maNhomTb;
    private String tenNhomTb;
    private String moTa;
    private Long nguoiTao;
    private Integer ngayTao;
    private Long nguoiCapNhat;
    private Integer ngayCapNhat;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "MA_NHOM_TB")
    public String getMaNhomTb() {
        return maNhomTb;
    }

    public void setMaNhomTb(String maNhomTb) {
        this.maNhomTb = maNhomTb;
    }

    @Basic
    @Column(name = "TEN_NHOM_TB")
    public String getTenNhomTb() {
        return tenNhomTb;
    }

    public void setTenNhomTb(String tenNhomTb) {
        this.tenNhomTb = tenNhomTb;
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
    public Integer getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Integer ngayTao) {
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
    public Integer getNgayCapNhat() {
        return ngayCapNhat;
    }

    public void setNgayCapNhat(Integer ngayCapNhat) {
        this.ngayCapNhat = ngayCapNhat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmNhomTbEntity that = (DmNhomTbEntity) o;

        if (id != that.id) return false;
        if (maNhomTb != null ? !maNhomTb.equals(that.maNhomTb) : that.maNhomTb != null) return false;
        if (tenNhomTb != null ? !tenNhomTb.equals(that.tenNhomTb) : that.tenNhomTb != null) return false;
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
        result = 31 * result + (maNhomTb != null ? maNhomTb.hashCode() : 0);
        result = 31 * result + (tenNhomTb != null ? tenNhomTb.hashCode() : 0);
        result = 31 * result + (moTa != null ? moTa.hashCode() : 0);
        result = 31 * result + (nguoiTao != null ? nguoiTao.hashCode() : 0);
        result = 31 * result + (ngayTao != null ? ngayTao.hashCode() : 0);
        result = 31 * result + (nguoiCapNhat != null ? nguoiCapNhat.hashCode() : 0);
        result = 31 * result + (ngayCapNhat != null ? ngayCapNhat.hashCode() : 0);
        return result;
    }
}
