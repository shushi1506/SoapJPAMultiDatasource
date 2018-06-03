package com.soap.qlcb.endpoint.controller.entity;

import javax.persistence.*;

/**
 * @author anhbt 5/29/2018
 * com.soap.qlcb.endpoint.controller.entity
 */
//@NamedStoredProcedureQueries({
//        @NamedStoredProcedureQuery(name = "myProc",
//                procedureName = "dm_don_vi_qltb_select",
////                resultClasses = DmDonViEntityResult.class,
//                resultSetMappings = "groupDetailsMapping",
//                parameters = {
//                        @StoredProcedureParameter( mode = ParameterMode.REF_CURSOR, type = void.class) })
//})

//@Entity

public class DmDonViEntityResult  {
    private long id;
    private String maDonVi;
    private String tenTiengViet;
    private Long tinhThanhId;
    private String diaChi;
    private Long donviChaId;
    private Long capDonVi;


    public DmDonViEntityResult(long id, String maDonVi, String tenTiengViet,Long tinhThanhId,String diaChi,Long donviChaId,Long capDonVi) {
        this.id = id;
        this.maDonVi = maDonVi;
        this.tenTiengViet = tenTiengViet;
        this.tinhThanhId = tinhThanhId;
        this.diaChi = diaChi;
        this.donviChaId = donviChaId;
        this.capDonVi = capDonVi;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
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
        return "DmDonViEntityResult{" +
                "id=" + id +
                ", maDonVi='" + maDonVi + '\'' +
                ", tenTiengViet='" + tenTiengViet + '\'' +
                ", tinhThanhId=" + tinhThanhId +
                ", diaChi='" + diaChi + '\'' +
                ", donviChaId=" + donviChaId +
                ", capDonVi='" + capDonVi + '\'' +
                '}';
    }
}
