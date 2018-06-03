package com.soap.qlcb.endpoint.controller.results;


import javax.persistence.Column;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;


/**
 * @author anhbt 5/28/2018
 * com.soap.qlcb.endpoint.controller.results
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ResultDmDonViSort {
    @Column(name = "id")
    private long id;
    @Column(name = "ma_don_vi")
    private String maDonVi;
    @Column(name = "ten_tieng_viet")
    private String tenTiengViet;
    @Column(name = "tinh_thanh_id")
    private Long tinhThanhId;
    @Column(name = "dia_chi")
    private String diaChi;
    @Column(name = "donvi_cha_id")
    private Long donviChaId;
    @Column(name = "cap_don_vi")
    private Long capDonVi;
    @Column(name = "loai_hinh_don_vi")
    private Long loaiHinhDonVi;

    public ResultDmDonViSort() {
    }

    public ResultDmDonViSort(long id, String maDonVi, String tenTiengViet, Long tinhThanhId, String diaChi, Long donViChaId, Long capDonVi,Long loaiHinhDonVi) {
        this.id = id;
        this.maDonVi = maDonVi;
        this.tenTiengViet = tenTiengViet;
        this.tinhThanhId = tinhThanhId;
        this.diaChi = diaChi;
        this.donviChaId = donViChaId;
        this.capDonVi = capDonVi;
        this.loaiHinhDonVi=loaiHinhDonVi;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMaDonVi() {
        return maDonVi;
    }

    public void setMaDonVi(String maDonVi) {
        this.maDonVi = maDonVi;
    }

    public String getTenTiengViet() {
        return tenTiengViet;
    }

    public void setTenTiengViet(String tenTiengViet) {
        this.tenTiengViet = tenTiengViet;
    }

    public Long getTinhThanhId() {
        return tinhThanhId;
    }

    public void setTinhThanhId(Long tinhThanhId) {
        this.tinhThanhId = tinhThanhId;
    }

//    public String getTenTinhThanh() {
//        return tenTinhThanh;
//    }
//
//    public void setTenTinhThanh(String tenTinhThanh) {
//        this.tenTinhThanh = tenTinhThanh;
//    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Long getDonViChaId() {
        return donviChaId;
    }

    public void setDonViChaId(Long donViChaId) {
        this.donviChaId = donViChaId;
    }

    public Long getCapDonVi() {
        return capDonVi;
    }

    public void setCapDonVi(Long capDonVi) {
        this.capDonVi = capDonVi;
    }

    public Long getDonviChaId() {
        return donviChaId;
    }

    public void setDonviChaId(Long donviChaId) {
        this.donviChaId = donviChaId;
    }

    @Override
    public String toString() {
        return "ResultDmDonViSort{" +
                "id=" + id +
                ", maDonVi='" + maDonVi + '\'' +
                ", tenTiengViet='" + tenTiengViet + '\'' +
                ", tinhThanhId=" + tinhThanhId +
                ", diaChi='" + diaChi + '\'' +
                ", donviChaId=" + donviChaId +
                ", capDonVi=" + capDonVi +
                '}';
    }
}
