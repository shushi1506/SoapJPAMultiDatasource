package com.soap.demo.qltb.model;

import javax.persistence.*;

/**
 * @author anhbt 5/17/2018
 * com.soap.demo.qltb.model
 */
@Entity
@Table(name = "DM_LOAI_THIET_BI", schema = "QLTB", catalog = "")
public class DmLoaiThietBiEntity {
    private long id;
    private String maLoaiTb;
    private String tenLoaiTb;
    private Integer nhomTbId;
    private String moTa;
    private Integer nguoiTao;
    private Integer ngayTao;
    private Integer nguoiCapNhat;
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
    @Column(name = "MA_LOAI_TB")
    public String getMaLoaiTb() {
        return maLoaiTb;
    }

    public void setMaLoaiTb(String maLoaiTb) {
        this.maLoaiTb = maLoaiTb;
    }

    @Basic
    @Column(name = "TEN_LOAI_TB")
    public String getTenLoaiTb() {
        return tenLoaiTb;
    }

    public void setTenLoaiTb(String tenLoaiTb) {
        this.tenLoaiTb = tenLoaiTb;
    }

    @Basic
    @Column(name = "NHOM_TB_ID")
    public Integer getNhomTbId() {
        return nhomTbId;
    }

    public void setNhomTbId(Integer nhomTbId) {
        this.nhomTbId = nhomTbId;
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
    public Integer getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(Integer nguoiTao) {
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
    public Integer getNguoiCapNhat() {
        return nguoiCapNhat;
    }

    public void setNguoiCapNhat(Integer nguoiCapNhat) {
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

        DmLoaiThietBiEntity that = (DmLoaiThietBiEntity) o;

        if (id != that.id) return false;
        if (maLoaiTb != null ? !maLoaiTb.equals(that.maLoaiTb) : that.maLoaiTb != null) return false;
        if (tenLoaiTb != null ? !tenLoaiTb.equals(that.tenLoaiTb) : that.tenLoaiTb != null) return false;
        if (nhomTbId != null ? !nhomTbId.equals(that.nhomTbId) : that.nhomTbId != null) return false;
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
        result = 31 * result + (maLoaiTb != null ? maLoaiTb.hashCode() : 0);
        result = 31 * result + (tenLoaiTb != null ? tenLoaiTb.hashCode() : 0);
        result = 31 * result + (nhomTbId != null ? nhomTbId.hashCode() : 0);
        result = 31 * result + (moTa != null ? moTa.hashCode() : 0);
        result = 31 * result + (nguoiTao != null ? nguoiTao.hashCode() : 0);
        result = 31 * result + (ngayTao != null ? ngayTao.hashCode() : 0);
        result = 31 * result + (nguoiCapNhat != null ? nguoiCapNhat.hashCode() : 0);
        result = 31 * result + (ngayCapNhat != null ? ngayCapNhat.hashCode() : 0);
        return result;
    }
}
