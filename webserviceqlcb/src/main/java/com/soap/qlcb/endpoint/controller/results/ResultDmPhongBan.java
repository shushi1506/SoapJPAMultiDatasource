package com.soap.qlcb.endpoint.controller.results;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * @author anhbt 5/16/2018
 * com.soap.demo.qlcb.model
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ResultDmPhongBan {
    private Long donViId;
    private String tenDonVi;
    private String maPhongBan;
    private String tenPhongBan;
    private Long truongPhong;
    private Long phoPhong;
    private Long soLuongCanBo;

    public ResultDmPhongBan(Long donViId,String tenDonVi, String maPhongBan, String tenPhongBan, Long truongPhong, Long phoPhong, Long soLuongCanBo) {
        this.donViId=donViId;
        this.tenDonVi = tenDonVi;
        this.maPhongBan = maPhongBan;
        this.tenPhongBan = tenPhongBan;
        this.truongPhong = truongPhong;
        this.phoPhong = phoPhong;
        this.soLuongCanBo = soLuongCanBo;
    }

    @Override
    public String toString() {
        return "ResultDmPhongBan{" +
                "tenDonVi='" + tenDonVi + '\'' +
                ", maPhongBan='" + maPhongBan + '\'' +
                ", tenPhongBan='" + tenPhongBan + '\'' +
                ", truongPhong=" + truongPhong +
                ", phoPhong=" + phoPhong +
                ", soLuongCanBo=" + soLuongCanBo +
                '}';
    }
}
