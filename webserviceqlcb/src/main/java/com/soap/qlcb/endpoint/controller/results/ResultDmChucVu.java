package com.soap.qlcb.endpoint.controller.results;

/**
 * @author anhbt 5/17/2018
 * com.soap.demo.qlcb.model
 */
public class ResultDmChucVu {
    private String maChucVu;
    private String tenChucVu;
    private Double hsPhuCap;
    private Double capTruong;

    public ResultDmChucVu(String maChucVu, String tenChucVu, Double hsPhuCap, Double capTruong) {
        this.maChucVu = maChucVu;
        this.tenChucVu = tenChucVu;
        this.hsPhuCap = hsPhuCap;
        this.capTruong = capTruong;
    }

    public String getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(String maChucVu) {
        this.maChucVu = maChucVu;
    }

    public String getTenChucVu() {
        return tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
    }

    public Double getHsPhuCap() {
        return hsPhuCap;
    }

    public void setHsPhuCap(Double hsPhuCap) {
        this.hsPhuCap = hsPhuCap;
    }

    public Double getCapTruong() {
        return capTruong;
    }

    public void setCapTruong(Double capTruong) {
        this.capTruong = capTruong;
    }
}
