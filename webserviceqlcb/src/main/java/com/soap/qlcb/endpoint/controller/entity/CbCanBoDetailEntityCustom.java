package com.soap.qlcb.endpoint.controller.entity;

import javax.persistence.*;

/**
 * @author anhbt 6/2/2018
 * com.soap.qlcb.endpoint.controller.entity
 */
@Entity
@Table(name = "CB_CAN_BO_DETAIL", schema = "QLTB", catalog = "")
public class CbCanBoDetailEntityCustom {
    private long id;
    private Long canBoId;
    private Long donViId;
    private Long phongBanId;
    private Long chucVuId;
    private String emailCoQuan;
    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CAN_BO_ID")
    public Long getCanBoId() {
        return canBoId;
    }

    public void setCanBoId(Long canBoId) {
        this.canBoId = canBoId;
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

    @Basic
    @Column(name = "EMAIL_CO_QUAN")
    public String getEmailCoQuan() {
        return emailCoQuan;
    }

    public void setEmailCoQuan(String emailCoQuan) {
        this.emailCoQuan = emailCoQuan;
    }
}
