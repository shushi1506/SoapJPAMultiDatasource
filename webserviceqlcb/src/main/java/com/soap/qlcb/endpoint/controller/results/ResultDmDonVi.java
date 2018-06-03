package com.soap.qlcb.endpoint.controller.results;

import com.soap.qlcb.endpoint.controller.entity.DmDonViEntity;

import javax.persistence.Entity;
import javax.persistence.EntityResult;
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
public class ResultDmDonVi implements Serializable {
    @Id
    private long id;
    private String maDonVi;
    private String tenTiengViet;
    private String tenTiengAnh;
    private Long tinhThanhId;
    private String tenTinhThanh;
    private String diaChi;
    private Long donviChaId;
    private Long capDonVi;
    private String giamDoc;
    private String phoGiamDoc;
    private Integer nhanVien;

    public ResultDmDonVi() {
    }

    public ResultDmDonVi(long id, String maDonVi, String tenTiengViet, String tenTiengAnh, Long tinhThanhId, String tenTinhThanh, String diaChi, Long donviChaId,Long capDonVi, String giamDoc, String phoGiamDoc, Integer nhanVien) {
        this.id = id;
        this.maDonVi = maDonVi;
        this.tenTiengViet = tenTiengViet;
        this.tenTiengAnh = tenTiengAnh;
        this.tinhThanhId = tinhThanhId;
        this.tenTinhThanh = tenTinhThanh;
        this.diaChi = diaChi;
        this.donviChaId = donviChaId;
        this.capDonVi=capDonVi;
        this.giamDoc = giamDoc;
        this.phoGiamDoc = phoGiamDoc;
        this.nhanVien = nhanVien;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenTiengViet() {
        return tenTiengViet;
    }

    public void setTenTiengViet(String tenTiengViet) {
        this.tenTiengViet = tenTiengViet;
    }

    public String getTenTiengAnh() {
        return tenTiengAnh;
    }

    public void setTenTiengAnh(String tenTiengAnh) {
        this.tenTiengAnh = tenTiengAnh;
    }

    public Long getTinhThanhId() {
        return tinhThanhId;
    }

    public void setTinhThanhId(Long tinhThanhId) {
        this.tinhThanhId = tinhThanhId;
    }

    public String getTenTinhThanh() {
        return tenTinhThanh;
    }

    public void setTenTinhThanh(String tenTinhThanh) {
        this.tenTinhThanh = tenTinhThanh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaDonVi() {
        return maDonVi;
    }

    public void setMaDonVi(String maDonVi) {
        this.maDonVi = maDonVi;
    }

    public String getGiamDoc() {
        return giamDoc;
    }

    public void setGiamDoc(String giamDoc) {
        this.giamDoc = giamDoc;
    }

    public String getPhoGiamDoc() {
        return phoGiamDoc;
    }

    public void setPhoGiamDoc(String phoGiamDoc) {
        this.phoGiamDoc = phoGiamDoc;
    }

    public Integer getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(Integer nhanVien) {
        this.nhanVien = nhanVien;
    }

    public Long getDonviChaId() {
        return donviChaId;
    }

    public void setDonviChaId(Long donviChaId) {
        this.donviChaId = donviChaId;
    }

    public Long getCapDonVi() {
        return capDonVi;
    }

    public void setCapDonVi(Long capDonVi) {
        this.capDonVi = capDonVi;
    }

    @Override
    public String toString() {
        return "ResultDmDonVi{" +
                "id=" + id +
                ", maDonVi='" + maDonVi + '\'' +
                ", tenTiengViet='" + tenTiengViet + '\'' +
                ", tenTiengAnh='" + tenTiengAnh + '\'' +
                ", tinhThanhId=" + tinhThanhId +
                ", tenTinhThanh='" + tenTinhThanh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", donviChaId=" + donviChaId +
                ", giamDoc=" + giamDoc +
                ", phoGiamDoc=" + phoGiamDoc +
                ", nhanVien=" + nhanVien +
                '}';
    }
}
