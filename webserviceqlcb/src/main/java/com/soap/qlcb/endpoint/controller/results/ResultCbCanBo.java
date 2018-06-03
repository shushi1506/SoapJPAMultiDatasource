package com.soap.qlcb.endpoint.controller.results;

/**
 * @author anhbt 5/17/2018
 * com.soap.demo.qlcb.model
 */
public class ResultCbCanBo {
    private long id;
    private String soHieuCongChuc;
    private String hoTen;
    private Long gioiTinh;
    private String tenDonVi;
    private String tenChucVu;
    private Long trangThai;
    private String email;
    private String maDonVi;
    private String maChucVu;
    private Long idDonVi;
    private String maPhongBan;
    private String tenPhongBan;

    public ResultCbCanBo() {
    }

    public ResultCbCanBo(long id, String soHieuCongChuc, String hoTen, Long gioiTinh, String tenDonVi, String tenChucVu, Long trangThai, String email, String maDonVi, String maChucVu, Long idDonVi,String maPhongBan,String tenPhongBan) {
        this.id = id;
        this.soHieuCongChuc = soHieuCongChuc;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.tenDonVi = tenDonVi;
        this.tenChucVu = tenChucVu;
        this.trangThai = trangThai;
        this.email = email;
        this.maDonVi = maDonVi;
        this.maChucVu = maChucVu;
        this.idDonVi = idDonVi;
        this.maPhongBan=maPhongBan;
        this.tenPhongBan=tenPhongBan;
    }

    public String getMaDonVi() {
        return maDonVi;
    }

    public void setMaDonVi(String maDonVi) {
        this.maDonVi = maDonVi;
    }

    public String getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(String maChucVu) {
        this.maChucVu = maChucVu;
    }

    public Long getIdDonVi() {
        return idDonVi;
    }

    public void setIdDonVi(Long idDonVi) {
        this.idDonVi = idDonVi;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSoHieuCongChuc() {
        return soHieuCongChuc;
    }

    public void setSoHieuCongChuc(String soHieuCongChuc) {
        this.soHieuCongChuc = soHieuCongChuc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Long getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Long gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTenDonVi() {
        return tenDonVi;
    }

    public void setTenDonVi(String tenDonVi) {
        this.tenDonVi = tenDonVi;
    }

    public String getTenChucVu() {
        return tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
    }

    public Long getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Long trangThai) {
        this.trangThai = trangThai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMaPhongBan() {
        return maPhongBan;
    }

    public void setMaPhongBan(String maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    @Override
    public String toString() {
        return "ResultCbCanBo{" +
                "soHieuCongChuc='" + soHieuCongChuc + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", tenDonVi='" + tenDonVi + '\'' +
                ", tenChucVu='" + tenChucVu + '\'' +
                ", trangThai=" + trangThai +
                ", email='" + email + '\'' +
                '}';
    }
}
