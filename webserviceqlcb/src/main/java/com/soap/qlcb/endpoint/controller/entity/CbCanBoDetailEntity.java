package com.soap.qlcb.endpoint.controller.entity;

import javax.persistence.*;
import java.sql.Time;

/**
 * @author anhbt 5/28/2018
 * com.soap.qlcb.endpoint.controller.entity
 */
@Entity
@Table(name = "CB_CAN_BO_DETAIL", schema = "QLTB", catalog = "")
public class CbCanBoDetailEntity {
    private long id;
    private Long canBoId;
    private Long donViId;
    private Long phongBanId;
    private Long chuyenMonId;
    private Long chucDanhId;
    private Long chucVuId;
    private Long chucVuKiemNhiemId;
    private Long tinhThanhId;
    private Long quanHuyenId;
    private Long xaPhuongId;
    private String noiOHienNay;
    private String dienThoai;
    private Long danTocId;
    private Long tonGiaoId;
    private Long thanhPhanGdId;
    private String ngheNghiepTruocTuyen;
    private Time ngayDuocTuyen;
    private String coQuan;
    private Time ngayVaoCqHienTai;
    private Time ngayThamGiaCm;
    private Time ngayVaoDang;
    private Time ngayChinhThucDang;
    private String ngayThamGiaCtxh;
    private Time ngayNhapNgu;
    private Time ngayXuatNgu;
    private String quanHam;
    private Long trinhDoVanHoaId;
    private Long hocHamViId;
    private Long lyLuanChinhTriId;
    private Long trinhDoNgoaiNguId;
    private String congTacChinh;
    private Long ngachCongChucId;
    private Long bacLuongId;
    private Time tuNgayBacLuong;
    private String danhHieuDuocPhong;
    private String soTruongCongTac;
    private String congViecLamLauNhat;
    private String tinhTrangSucKhoe;
    private String chieuCao;
    private String canNang;
    private String nhomMau;
    private String soCmnd;
    private Long thuongBinhLoaiId;
    private Long giaDinhLietSi;
    private String dacDiemLichSuA;
    private String dacDiemLichSuB;
    private String quanHeNuocNgoaiA;
    private String quanHeNuocNgoaiB;
    private Long gdLuong;
    private Long gdNguonKhac;
    private String gdNhaOCapThue;
    private Long gdNhaOCapThueDt;
    private String gdNhaOMua;
    private String gdNhaOMuaDt;
    private Long gdDatOCap;
    private Long gdDatOMua;
    private Long gdDatSanXuat;
    private Time lastUpdate;
    private String soBaoHiem;
    private Time ngayCapSoBh;
    private String noiCapSoBh;
    private String tkNganHang;
    private String nganHang;
    private Time ngayBienChe;
    private String noiSinh;
    private String capUyHienTai;
    private String capUyKiem;
    private Long gdTongDienTich;
    private Long heSoNgachBac;
    private Long pcTnvk;
    private Long pcCv;
    private Long pcTn;
    private Long hsBaoLuu;
    private String soPhieuKcb;
    private String noiDangKyKcb;
    private Long tinHocId;
    private Long qlNhaNuocId;
    private Long tinhThanhNsId;
    private Long quanHuyenNsId;
    private Long xaPhuongNsId;
    private String noiDkHktt;
    private Long doiTuongChinhSachId;
    private Time ngayThamGiaCongTac;
    private Time ngayDongBhxh;
    private Time ngayVaoNganhTc;
    private Long chucVuQuyHoachId;
    private Time ngayQuyHoach;
    private Long capQuyHoachId;
    private Time ngayCapCmnd;
    private String nhanXetDanhGia;
    private String khenThuong;
    private String kyLuat;
    private Long daCoSoBhxh;
    private Long daTraSoBhxh;
    private Time ngayTraSoBhxh;
    private Long phanTramHuongLuong;
    private Long quocGiaId;
    private String noiCapCmnd;
    private String dienThoaiCoDinh;
    private String quyetDinhTdHd;
    private String soTheBhyt;
    private String tinhThanhQq;
    private String quanHuyenQq;
    private String xaPhuongQq;
    private String tinhThanhNs;
    private String quanHuyenNs;
    private String xaPhuongNs;
    private Long chuyenNganhId;
    private Long loaiNgayTuyenDung;
    private String ngayDuocTuyenThangNam;
    private Long loaiNgayHuongLuong;
    private String ngayHuongLuongThangNam;
    private Long loaiNgayNhapNgu;
    private String ngayNhapNguThangNam;
    private Long loaiNgayXuatNgu;
    private String ngayXuatNguThangNam;
    private Long chungChiDanToc;
    private Long tinhThanhQqId;
    private Long quanHuyenQqId;
    private Long xaPhuongQqId;
    private String chucVuTruocTuyen;
    private String lyDoKbn;
    private Time ngayThangKbn;
    private Long viTriVlamId;
    private Long lamCmnvu;
    private Long chungChiKtt;
    private Long bnQh;
    private Long pheDuyet;
    private Time ngayBoNhiem;
    private Time ngayBoNhiemLai;
    private Long namTotNghiep;
    private String truongDaoTao;
    private Long luongHd;
    private Long dmViTriViecLamId;
    private String email;
    private Time ngayNhanChucVuHt;
    private Long tinhTrangHonNhan;
    private String thanhPhanGiaDinhId;
    private String dtCoQuan;
    private String emailCoQuan;
    private String diaChiLamViec;
    private String maStCaNhan;
    private String vanbangCc;
    private Long heDaoTaoId;
    private Long hsVuotKhung;
    private Time ngayNhanNgach;
    private String maNgach;
    private String xepLoaiTotNghiep;
    private Long quocGiaCapBang;
    private Long chucVuDangId;
    private Long phuCapDang;
    private Long namBaoLuuNgayPhep;

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
    @Column(name = "CHUYEN_MON_ID")
    public Long getChuyenMonId() {
        return chuyenMonId;
    }

    public void setChuyenMonId(Long chuyenMonId) {
        this.chuyenMonId = chuyenMonId;
    }

    @Basic
    @Column(name = "CHUC_DANH_ID")
    public Long getChucDanhId() {
        return chucDanhId;
    }

    public void setChucDanhId(Long chucDanhId) {
        this.chucDanhId = chucDanhId;
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
    @Column(name = "CHUC_VU_KIEM_NHIEM_ID")
    public Long getChucVuKiemNhiemId() {
        return chucVuKiemNhiemId;
    }

    public void setChucVuKiemNhiemId(Long chucVuKiemNhiemId) {
        this.chucVuKiemNhiemId = chucVuKiemNhiemId;
    }

    @Basic
    @Column(name = "TINH_THANH_ID")
    public Long getTinhThanhId() {
        return tinhThanhId;
    }

    public void setTinhThanhId(Long tinhThanhId) {
        this.tinhThanhId = tinhThanhId;
    }

    @Basic
    @Column(name = "QUAN_HUYEN_ID")
    public Long getQuanHuyenId() {
        return quanHuyenId;
    }

    public void setQuanHuyenId(Long quanHuyenId) {
        this.quanHuyenId = quanHuyenId;
    }

    @Basic
    @Column(name = "XA_PHUONG_ID")
    public Long getXaPhuongId() {
        return xaPhuongId;
    }

    public void setXaPhuongId(Long xaPhuongId) {
        this.xaPhuongId = xaPhuongId;
    }

    @Basic
    @Column(name = "NOI_O_HIEN_NAY")
    public String getNoiOHienNay() {
        return noiOHienNay;
    }

    public void setNoiOHienNay(String noiOHienNay) {
        this.noiOHienNay = noiOHienNay;
    }

    @Basic
    @Column(name = "DIEN_THOAI")
    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    @Basic
    @Column(name = "DAN_TOC_ID")
    public Long getDanTocId() {
        return danTocId;
    }

    public void setDanTocId(Long danTocId) {
        this.danTocId = danTocId;
    }

    @Basic
    @Column(name = "TON_GIAO_ID")
    public Long getTonGiaoId() {
        return tonGiaoId;
    }

    public void setTonGiaoId(Long tonGiaoId) {
        this.tonGiaoId = tonGiaoId;
    }

    @Basic
    @Column(name = "THANH_PHAN_GD_ID")
    public Long getThanhPhanGdId() {
        return thanhPhanGdId;
    }

    public void setThanhPhanGdId(Long thanhPhanGdId) {
        this.thanhPhanGdId = thanhPhanGdId;
    }

    @Basic
    @Column(name = "NGHE_NGHIEP_TRUOC_TUYEN")
    public String getNgheNghiepTruocTuyen() {
        return ngheNghiepTruocTuyen;
    }

    public void setNgheNghiepTruocTuyen(String ngheNghiepTruocTuyen) {
        this.ngheNghiepTruocTuyen = ngheNghiepTruocTuyen;
    }

    @Basic
    @Column(name = "NGAY_DUOC_TUYEN")
    public Time getNgayDuocTuyen() {
        return ngayDuocTuyen;
    }

    public void setNgayDuocTuyen(Time ngayDuocTuyen) {
        this.ngayDuocTuyen = ngayDuocTuyen;
    }

    @Basic
    @Column(name = "CO_QUAN")
    public String getCoQuan() {
        return coQuan;
    }

    public void setCoQuan(String coQuan) {
        this.coQuan = coQuan;
    }

    @Basic
    @Column(name = "NGAY_VAO_CQ_HIEN_TAI")
    public Time getNgayVaoCqHienTai() {
        return ngayVaoCqHienTai;
    }

    public void setNgayVaoCqHienTai(Time ngayVaoCqHienTai) {
        this.ngayVaoCqHienTai = ngayVaoCqHienTai;
    }

    @Basic
    @Column(name = "NGAY_THAM_GIA_CM")
    public Time getNgayThamGiaCm() {
        return ngayThamGiaCm;
    }

    public void setNgayThamGiaCm(Time ngayThamGiaCm) {
        this.ngayThamGiaCm = ngayThamGiaCm;
    }

    @Basic
    @Column(name = "NGAY_VAO_DANG")
    public Time getNgayVaoDang() {
        return ngayVaoDang;
    }

    public void setNgayVaoDang(Time ngayVaoDang) {
        this.ngayVaoDang = ngayVaoDang;
    }

    @Basic
    @Column(name = "NGAY_CHINH_THUC_DANG")
    public Time getNgayChinhThucDang() {
        return ngayChinhThucDang;
    }

    public void setNgayChinhThucDang(Time ngayChinhThucDang) {
        this.ngayChinhThucDang = ngayChinhThucDang;
    }

    @Basic
    @Column(name = "NGAY_THAM_GIA_CTXH")
    public String getNgayThamGiaCtxh() {
        return ngayThamGiaCtxh;
    }

    public void setNgayThamGiaCtxh(String ngayThamGiaCtxh) {
        this.ngayThamGiaCtxh = ngayThamGiaCtxh;
    }

    @Basic
    @Column(name = "NGAY_NHAP_NGU")
    public Time getNgayNhapNgu() {
        return ngayNhapNgu;
    }

    public void setNgayNhapNgu(Time ngayNhapNgu) {
        this.ngayNhapNgu = ngayNhapNgu;
    }

    @Basic
    @Column(name = "NGAY_XUAT_NGU")
    public Time getNgayXuatNgu() {
        return ngayXuatNgu;
    }

    public void setNgayXuatNgu(Time ngayXuatNgu) {
        this.ngayXuatNgu = ngayXuatNgu;
    }

    @Basic
    @Column(name = "QUAN_HAM")
    public String getQuanHam() {
        return quanHam;
    }

    public void setQuanHam(String quanHam) {
        this.quanHam = quanHam;
    }

    @Basic
    @Column(name = "TRINH_DO_VAN_HOA_ID")
    public Long getTrinhDoVanHoaId() {
        return trinhDoVanHoaId;
    }

    public void setTrinhDoVanHoaId(Long trinhDoVanHoaId) {
        this.trinhDoVanHoaId = trinhDoVanHoaId;
    }

    @Basic
    @Column(name = "HOC_HAM_VI_ID")
    public Long getHocHamViId() {
        return hocHamViId;
    }

    public void setHocHamViId(Long hocHamViId) {
        this.hocHamViId = hocHamViId;
    }

    @Basic
    @Column(name = "LY_LUAN_CHINH_TRI_ID")
    public Long getLyLuanChinhTriId() {
        return lyLuanChinhTriId;
    }

    public void setLyLuanChinhTriId(Long lyLuanChinhTriId) {
        this.lyLuanChinhTriId = lyLuanChinhTriId;
    }

    @Basic
    @Column(name = "TRINH_DO_NGOAI_NGU_ID")
    public Long getTrinhDoNgoaiNguId() {
        return trinhDoNgoaiNguId;
    }

    public void setTrinhDoNgoaiNguId(Long trinhDoNgoaiNguId) {
        this.trinhDoNgoaiNguId = trinhDoNgoaiNguId;
    }

    @Basic
    @Column(name = "CONG_TAC_CHINH")
    public String getCongTacChinh() {
        return congTacChinh;
    }

    public void setCongTacChinh(String congTacChinh) {
        this.congTacChinh = congTacChinh;
    }

    @Basic
    @Column(name = "NGACH_CONG_CHUC_ID")
    public Long getNgachCongChucId() {
        return ngachCongChucId;
    }

    public void setNgachCongChucId(Long ngachCongChucId) {
        this.ngachCongChucId = ngachCongChucId;
    }

    @Basic
    @Column(name = "BAC_LUONG_ID")
    public Long getBacLuongId() {
        return bacLuongId;
    }

    public void setBacLuongId(Long bacLuongId) {
        this.bacLuongId = bacLuongId;
    }

    @Basic
    @Column(name = "TU_NGAY_BAC_LUONG")
    public Time getTuNgayBacLuong() {
        return tuNgayBacLuong;
    }

    public void setTuNgayBacLuong(Time tuNgayBacLuong) {
        this.tuNgayBacLuong = tuNgayBacLuong;
    }

    @Basic
    @Column(name = "DANH_HIEU_DUOC_PHONG")
    public String getDanhHieuDuocPhong() {
        return danhHieuDuocPhong;
    }

    public void setDanhHieuDuocPhong(String danhHieuDuocPhong) {
        this.danhHieuDuocPhong = danhHieuDuocPhong;
    }

    @Basic
    @Column(name = "SO_TRUONG_CONG_TAC")
    public String getSoTruongCongTac() {
        return soTruongCongTac;
    }

    public void setSoTruongCongTac(String soTruongCongTac) {
        this.soTruongCongTac = soTruongCongTac;
    }

    @Basic
    @Column(name = "CONG_VIEC_LAM_LAU_NHAT")
    public String getCongViecLamLauNhat() {
        return congViecLamLauNhat;
    }

    public void setCongViecLamLauNhat(String congViecLamLauNhat) {
        this.congViecLamLauNhat = congViecLamLauNhat;
    }

    @Basic
    @Column(name = "TINH_TRANG_SUC_KHOE")
    public String getTinhTrangSucKhoe() {
        return tinhTrangSucKhoe;
    }

    public void setTinhTrangSucKhoe(String tinhTrangSucKhoe) {
        this.tinhTrangSucKhoe = tinhTrangSucKhoe;
    }

    @Basic
    @Column(name = "CHIEU_CAO")
    public String getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(String chieuCao) {
        this.chieuCao = chieuCao;
    }

    @Basic
    @Column(name = "CAN_NANG")
    public String getCanNang() {
        return canNang;
    }

    public void setCanNang(String canNang) {
        this.canNang = canNang;
    }

    @Basic
    @Column(name = "NHOM_MAU")
    public String getNhomMau() {
        return nhomMau;
    }

    public void setNhomMau(String nhomMau) {
        this.nhomMau = nhomMau;
    }

    @Basic
    @Column(name = "SO_CMND")
    public String getSoCmnd() {
        return soCmnd;
    }

    public void setSoCmnd(String soCmnd) {
        this.soCmnd = soCmnd;
    }

    @Basic
    @Column(name = "THUONG_BINH_LOAI_ID")
    public Long getThuongBinhLoaiId() {
        return thuongBinhLoaiId;
    }

    public void setThuongBinhLoaiId(Long thuongBinhLoaiId) {
        this.thuongBinhLoaiId = thuongBinhLoaiId;
    }

    @Basic
    @Column(name = "GIA_DINH_LIET_SI")
    public Long getGiaDinhLietSi() {
        return giaDinhLietSi;
    }

    public void setGiaDinhLietSi(Long giaDinhLietSi) {
        this.giaDinhLietSi = giaDinhLietSi;
    }

    @Basic
    @Column(name = "DAC_DIEM_LICH_SU_A")
    public String getDacDiemLichSuA() {
        return dacDiemLichSuA;
    }

    public void setDacDiemLichSuA(String dacDiemLichSuA) {
        this.dacDiemLichSuA = dacDiemLichSuA;
    }

    @Basic
    @Column(name = "DAC_DIEM_LICH_SU_B")
    public String getDacDiemLichSuB() {
        return dacDiemLichSuB;
    }

    public void setDacDiemLichSuB(String dacDiemLichSuB) {
        this.dacDiemLichSuB = dacDiemLichSuB;
    }

    @Basic
    @Column(name = "QUAN_HE_NUOC_NGOAI_A")
    public String getQuanHeNuocNgoaiA() {
        return quanHeNuocNgoaiA;
    }

    public void setQuanHeNuocNgoaiA(String quanHeNuocNgoaiA) {
        this.quanHeNuocNgoaiA = quanHeNuocNgoaiA;
    }

    @Basic
    @Column(name = "QUAN_HE_NUOC_NGOAI_B")
    public String getQuanHeNuocNgoaiB() {
        return quanHeNuocNgoaiB;
    }

    public void setQuanHeNuocNgoaiB(String quanHeNuocNgoaiB) {
        this.quanHeNuocNgoaiB = quanHeNuocNgoaiB;
    }

    @Basic
    @Column(name = "GD_LUONG")
    public Long getGdLuong() {
        return gdLuong;
    }

    public void setGdLuong(Long gdLuong) {
        this.gdLuong = gdLuong;
    }

    @Basic
    @Column(name = "GD_NGUON_KHAC")
    public Long getGdNguonKhac() {
        return gdNguonKhac;
    }

    public void setGdNguonKhac(Long gdNguonKhac) {
        this.gdNguonKhac = gdNguonKhac;
    }

    @Basic
    @Column(name = "GD_NHA_O_CAP_THUE")
    public String getGdNhaOCapThue() {
        return gdNhaOCapThue;
    }

    public void setGdNhaOCapThue(String gdNhaOCapThue) {
        this.gdNhaOCapThue = gdNhaOCapThue;
    }

    @Basic
    @Column(name = "GD_NHA_O_CAP_THUE_DT")
    public Long getGdNhaOCapThueDt() {
        return gdNhaOCapThueDt;
    }

    public void setGdNhaOCapThueDt(Long gdNhaOCapThueDt) {
        this.gdNhaOCapThueDt = gdNhaOCapThueDt;
    }

    @Basic
    @Column(name = "GD_NHA_O_MUA")
    public String getGdNhaOMua() {
        return gdNhaOMua;
    }

    public void setGdNhaOMua(String gdNhaOMua) {
        this.gdNhaOMua = gdNhaOMua;
    }

    @Basic
    @Column(name = "GD_NHA_O_MUA_DT")
    public String getGdNhaOMuaDt() {
        return gdNhaOMuaDt;
    }

    public void setGdNhaOMuaDt(String gdNhaOMuaDt) {
        this.gdNhaOMuaDt = gdNhaOMuaDt;
    }

    @Basic
    @Column(name = "GD_DAT_O_CAP")
    public Long getGdDatOCap() {
        return gdDatOCap;
    }

    public void setGdDatOCap(Long gdDatOCap) {
        this.gdDatOCap = gdDatOCap;
    }

    @Basic
    @Column(name = "GD_DAT_O_MUA")
    public Long getGdDatOMua() {
        return gdDatOMua;
    }

    public void setGdDatOMua(Long gdDatOMua) {
        this.gdDatOMua = gdDatOMua;
    }

    @Basic
    @Column(name = "GD_DAT_SAN_XUAT")
    public Long getGdDatSanXuat() {
        return gdDatSanXuat;
    }

    public void setGdDatSanXuat(Long gdDatSanXuat) {
        this.gdDatSanXuat = gdDatSanXuat;
    }

    @Basic
    @Column(name = "LAST_UPDATE")
    public Time getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Time lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Basic
    @Column(name = "SO_BAO_HIEM")
    public String getSoBaoHiem() {
        return soBaoHiem;
    }

    public void setSoBaoHiem(String soBaoHiem) {
        this.soBaoHiem = soBaoHiem;
    }

    @Basic
    @Column(name = "NGAY_CAP_SO_BH")
    public Time getNgayCapSoBh() {
        return ngayCapSoBh;
    }

    public void setNgayCapSoBh(Time ngayCapSoBh) {
        this.ngayCapSoBh = ngayCapSoBh;
    }

    @Basic
    @Column(name = "NOI_CAP_SO_BH")
    public String getNoiCapSoBh() {
        return noiCapSoBh;
    }

    public void setNoiCapSoBh(String noiCapSoBh) {
        this.noiCapSoBh = noiCapSoBh;
    }

    @Basic
    @Column(name = "TK_NGAN_HANG")
    public String getTkNganHang() {
        return tkNganHang;
    }

    public void setTkNganHang(String tkNganHang) {
        this.tkNganHang = tkNganHang;
    }

    @Basic
    @Column(name = "NGAN_HANG")
    public String getNganHang() {
        return nganHang;
    }

    public void setNganHang(String nganHang) {
        this.nganHang = nganHang;
    }

    @Basic
    @Column(name = "NGAY_BIEN_CHE")
    public Time getNgayBienChe() {
        return ngayBienChe;
    }

    public void setNgayBienChe(Time ngayBienChe) {
        this.ngayBienChe = ngayBienChe;
    }

    @Basic
    @Column(name = "NOI_SINH")
    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    @Basic
    @Column(name = "CAP_UY_HIEN_TAI")
    public String getCapUyHienTai() {
        return capUyHienTai;
    }

    public void setCapUyHienTai(String capUyHienTai) {
        this.capUyHienTai = capUyHienTai;
    }

    @Basic
    @Column(name = "CAP_UY_KIEM")
    public String getCapUyKiem() {
        return capUyKiem;
    }

    public void setCapUyKiem(String capUyKiem) {
        this.capUyKiem = capUyKiem;
    }

    @Basic
    @Column(name = "GD_TONG_DIEN_TICH")
    public Long getGdTongDienTich() {
        return gdTongDienTich;
    }

    public void setGdTongDienTich(Long gdTongDienTich) {
        this.gdTongDienTich = gdTongDienTich;
    }

    @Basic
    @Column(name = "HE_SO_NGACH_BAC")
    public Long getHeSoNgachBac() {
        return heSoNgachBac;
    }

    public void setHeSoNgachBac(Long heSoNgachBac) {
        this.heSoNgachBac = heSoNgachBac;
    }

    @Basic
    @Column(name = "PC_TNVK")
    public Long getPcTnvk() {
        return pcTnvk;
    }

    public void setPcTnvk(Long pcTnvk) {
        this.pcTnvk = pcTnvk;
    }

    @Basic
    @Column(name = "PC_CV")
    public Long getPcCv() {
        return pcCv;
    }

    public void setPcCv(Long pcCv) {
        this.pcCv = pcCv;
    }

    @Basic
    @Column(name = "PC_TN")
    public Long getPcTn() {
        return pcTn;
    }

    public void setPcTn(Long pcTn) {
        this.pcTn = pcTn;
    }

    @Basic
    @Column(name = "HS_BAO_LUU")
    public Long getHsBaoLuu() {
        return hsBaoLuu;
    }

    public void setHsBaoLuu(Long hsBaoLuu) {
        this.hsBaoLuu = hsBaoLuu;
    }

    @Basic
    @Column(name = "SO_PHIEU_KCB")
    public String getSoPhieuKcb() {
        return soPhieuKcb;
    }

    public void setSoPhieuKcb(String soPhieuKcb) {
        this.soPhieuKcb = soPhieuKcb;
    }

    @Basic
    @Column(name = "NOI_DANG_KY_KCB")
    public String getNoiDangKyKcb() {
        return noiDangKyKcb;
    }

    public void setNoiDangKyKcb(String noiDangKyKcb) {
        this.noiDangKyKcb = noiDangKyKcb;
    }

    @Basic
    @Column(name = "TIN_HOC_ID")
    public Long getTinHocId() {
        return tinHocId;
    }

    public void setTinHocId(Long tinHocId) {
        this.tinHocId = tinHocId;
    }

    @Basic
    @Column(name = "QL_NHA_NUOC_ID")
    public Long getQlNhaNuocId() {
        return qlNhaNuocId;
    }

    public void setQlNhaNuocId(Long qlNhaNuocId) {
        this.qlNhaNuocId = qlNhaNuocId;
    }

    @Basic
    @Column(name = "TINH_THANH_NS_ID")
    public Long getTinhThanhNsId() {
        return tinhThanhNsId;
    }

    public void setTinhThanhNsId(Long tinhThanhNsId) {
        this.tinhThanhNsId = tinhThanhNsId;
    }

    @Basic
    @Column(name = "QUAN_HUYEN_NS_ID")
    public Long getQuanHuyenNsId() {
        return quanHuyenNsId;
    }

    public void setQuanHuyenNsId(Long quanHuyenNsId) {
        this.quanHuyenNsId = quanHuyenNsId;
    }

    @Basic
    @Column(name = "XA_PHUONG_NS_ID")
    public Long getXaPhuongNsId() {
        return xaPhuongNsId;
    }

    public void setXaPhuongNsId(Long xaPhuongNsId) {
        this.xaPhuongNsId = xaPhuongNsId;
    }

    @Basic
    @Column(name = "NOI_DK_HKTT")
    public String getNoiDkHktt() {
        return noiDkHktt;
    }

    public void setNoiDkHktt(String noiDkHktt) {
        this.noiDkHktt = noiDkHktt;
    }

    @Basic
    @Column(name = "DOI_TUONG_CHINH_SACH_ID")
    public Long getDoiTuongChinhSachId() {
        return doiTuongChinhSachId;
    }

    public void setDoiTuongChinhSachId(Long doiTuongChinhSachId) {
        this.doiTuongChinhSachId = doiTuongChinhSachId;
    }

    @Basic
    @Column(name = "NGAY_THAM_GIA_CONG_TAC")
    public Time getNgayThamGiaCongTac() {
        return ngayThamGiaCongTac;
    }

    public void setNgayThamGiaCongTac(Time ngayThamGiaCongTac) {
        this.ngayThamGiaCongTac = ngayThamGiaCongTac;
    }

    @Basic
    @Column(name = "NGAY_DONG_BHXH")
    public Time getNgayDongBhxh() {
        return ngayDongBhxh;
    }

    public void setNgayDongBhxh(Time ngayDongBhxh) {
        this.ngayDongBhxh = ngayDongBhxh;
    }

    @Basic
    @Column(name = "NGAY_VAO_NGANH_TC")
    public Time getNgayVaoNganhTc() {
        return ngayVaoNganhTc;
    }

    public void setNgayVaoNganhTc(Time ngayVaoNganhTc) {
        this.ngayVaoNganhTc = ngayVaoNganhTc;
    }

    @Basic
    @Column(name = "CHUC_VU_QUY_HOACH_ID")
    public Long getChucVuQuyHoachId() {
        return chucVuQuyHoachId;
    }

    public void setChucVuQuyHoachId(Long chucVuQuyHoachId) {
        this.chucVuQuyHoachId = chucVuQuyHoachId;
    }

    @Basic
    @Column(name = "NGAY_QUY_HOACH")
    public Time getNgayQuyHoach() {
        return ngayQuyHoach;
    }

    public void setNgayQuyHoach(Time ngayQuyHoach) {
        this.ngayQuyHoach = ngayQuyHoach;
    }

    @Basic
    @Column(name = "CAP_QUY_HOACH_ID")
    public Long getCapQuyHoachId() {
        return capQuyHoachId;
    }

    public void setCapQuyHoachId(Long capQuyHoachId) {
        this.capQuyHoachId = capQuyHoachId;
    }

    @Basic
    @Column(name = "NGAY_CAP_CMND")
    public Time getNgayCapCmnd() {
        return ngayCapCmnd;
    }

    public void setNgayCapCmnd(Time ngayCapCmnd) {
        this.ngayCapCmnd = ngayCapCmnd;
    }

    @Basic
    @Column(name = "NHAN_XET_DANH_GIA")
    public String getNhanXetDanhGia() {
        return nhanXetDanhGia;
    }

    public void setNhanXetDanhGia(String nhanXetDanhGia) {
        this.nhanXetDanhGia = nhanXetDanhGia;
    }

    @Basic
    @Column(name = "KHEN_THUONG")
    public String getKhenThuong() {
        return khenThuong;
    }

    public void setKhenThuong(String khenThuong) {
        this.khenThuong = khenThuong;
    }

    @Basic
    @Column(name = "KY_LUAT")
    public String getKyLuat() {
        return kyLuat;
    }

    public void setKyLuat(String kyLuat) {
        this.kyLuat = kyLuat;
    }

    @Basic
    @Column(name = "DA_CO_SO_BHXH")
    public Long getDaCoSoBhxh() {
        return daCoSoBhxh;
    }

    public void setDaCoSoBhxh(Long daCoSoBhxh) {
        this.daCoSoBhxh = daCoSoBhxh;
    }

    @Basic
    @Column(name = "DA_TRA_SO_BHXH")
    public Long getDaTraSoBhxh() {
        return daTraSoBhxh;
    }

    public void setDaTraSoBhxh(Long daTraSoBhxh) {
        this.daTraSoBhxh = daTraSoBhxh;
    }

    @Basic
    @Column(name = "NGAY_TRA_SO_BHXH")
    public Time getNgayTraSoBhxh() {
        return ngayTraSoBhxh;
    }

    public void setNgayTraSoBhxh(Time ngayTraSoBhxh) {
        this.ngayTraSoBhxh = ngayTraSoBhxh;
    }

    @Basic
    @Column(name = "PHAN_TRAM_HUONG_LUONG")
    public Long getPhanTramHuongLuong() {
        return phanTramHuongLuong;
    }

    public void setPhanTramHuongLuong(Long phanTramHuongLuong) {
        this.phanTramHuongLuong = phanTramHuongLuong;
    }

    @Basic
    @Column(name = "QUOC_GIA_ID")
    public Long getQuocGiaId() {
        return quocGiaId;
    }

    public void setQuocGiaId(Long quocGiaId) {
        this.quocGiaId = quocGiaId;
    }

    @Basic
    @Column(name = "NOI_CAP_CMND")
    public String getNoiCapCmnd() {
        return noiCapCmnd;
    }

    public void setNoiCapCmnd(String noiCapCmnd) {
        this.noiCapCmnd = noiCapCmnd;
    }

    @Basic
    @Column(name = "DIEN_THOAI_CO_DINH")
    public String getDienThoaiCoDinh() {
        return dienThoaiCoDinh;
    }

    public void setDienThoaiCoDinh(String dienThoaiCoDinh) {
        this.dienThoaiCoDinh = dienThoaiCoDinh;
    }

    @Basic
    @Column(name = "QUYET_DINH_TD_HD")
    public String getQuyetDinhTdHd() {
        return quyetDinhTdHd;
    }

    public void setQuyetDinhTdHd(String quyetDinhTdHd) {
        this.quyetDinhTdHd = quyetDinhTdHd;
    }

    @Basic
    @Column(name = "SO_THE_BHYT")
    public String getSoTheBhyt() {
        return soTheBhyt;
    }

    public void setSoTheBhyt(String soTheBhyt) {
        this.soTheBhyt = soTheBhyt;
    }

    @Basic
    @Column(name = "TINH_THANH_QQ")
    public String getTinhThanhQq() {
        return tinhThanhQq;
    }

    public void setTinhThanhQq(String tinhThanhQq) {
        this.tinhThanhQq = tinhThanhQq;
    }

    @Basic
    @Column(name = "QUAN_HUYEN_QQ")
    public String getQuanHuyenQq() {
        return quanHuyenQq;
    }

    public void setQuanHuyenQq(String quanHuyenQq) {
        this.quanHuyenQq = quanHuyenQq;
    }

    @Basic
    @Column(name = "XA_PHUONG_QQ")
    public String getXaPhuongQq() {
        return xaPhuongQq;
    }

    public void setXaPhuongQq(String xaPhuongQq) {
        this.xaPhuongQq = xaPhuongQq;
    }

    @Basic
    @Column(name = "TINH_THANH_NS")
    public String getTinhThanhNs() {
        return tinhThanhNs;
    }

    public void setTinhThanhNs(String tinhThanhNs) {
        this.tinhThanhNs = tinhThanhNs;
    }

    @Basic
    @Column(name = "QUAN_HUYEN_NS")
    public String getQuanHuyenNs() {
        return quanHuyenNs;
    }

    public void setQuanHuyenNs(String quanHuyenNs) {
        this.quanHuyenNs = quanHuyenNs;
    }

    @Basic
    @Column(name = "XA_PHUONG_NS")
    public String getXaPhuongNs() {
        return xaPhuongNs;
    }

    public void setXaPhuongNs(String xaPhuongNs) {
        this.xaPhuongNs = xaPhuongNs;
    }

    @Basic
    @Column(name = "CHUYEN_NGANH_ID")
    public Long getChuyenNganhId() {
        return chuyenNganhId;
    }

    public void setChuyenNganhId(Long chuyenNganhId) {
        this.chuyenNganhId = chuyenNganhId;
    }

    @Basic
    @Column(name = "LOAI_NGAY_TUYEN_DUNG")
    public Long getLoaiNgayTuyenDung() {
        return loaiNgayTuyenDung;
    }

    public void setLoaiNgayTuyenDung(Long loaiNgayTuyenDung) {
        this.loaiNgayTuyenDung = loaiNgayTuyenDung;
    }

    @Basic
    @Column(name = "NGAY_DUOC_TUYEN_THANG_NAM")
    public String getNgayDuocTuyenThangNam() {
        return ngayDuocTuyenThangNam;
    }

    public void setNgayDuocTuyenThangNam(String ngayDuocTuyenThangNam) {
        this.ngayDuocTuyenThangNam = ngayDuocTuyenThangNam;
    }

    @Basic
    @Column(name = "LOAI_NGAY_HUONG_LUONG")
    public Long getLoaiNgayHuongLuong() {
        return loaiNgayHuongLuong;
    }

    public void setLoaiNgayHuongLuong(Long loaiNgayHuongLuong) {
        this.loaiNgayHuongLuong = loaiNgayHuongLuong;
    }

    @Basic
    @Column(name = "NGAY_HUONG_LUONG_THANG_NAM")
    public String getNgayHuongLuongThangNam() {
        return ngayHuongLuongThangNam;
    }

    public void setNgayHuongLuongThangNam(String ngayHuongLuongThangNam) {
        this.ngayHuongLuongThangNam = ngayHuongLuongThangNam;
    }

    @Basic
    @Column(name = "LOAI_NGAY_NHAP_NGU")
    public Long getLoaiNgayNhapNgu() {
        return loaiNgayNhapNgu;
    }

    public void setLoaiNgayNhapNgu(Long loaiNgayNhapNgu) {
        this.loaiNgayNhapNgu = loaiNgayNhapNgu;
    }

    @Basic
    @Column(name = "NGAY_NHAP_NGU_THANG_NAM")
    public String getNgayNhapNguThangNam() {
        return ngayNhapNguThangNam;
    }

    public void setNgayNhapNguThangNam(String ngayNhapNguThangNam) {
        this.ngayNhapNguThangNam = ngayNhapNguThangNam;
    }

    @Basic
    @Column(name = "LOAI_NGAY_XUAT_NGU")
    public Long getLoaiNgayXuatNgu() {
        return loaiNgayXuatNgu;
    }

    public void setLoaiNgayXuatNgu(Long loaiNgayXuatNgu) {
        this.loaiNgayXuatNgu = loaiNgayXuatNgu;
    }

    @Basic
    @Column(name = "NGAY_XUAT_NGU_THANG_NAM")
    public String getNgayXuatNguThangNam() {
        return ngayXuatNguThangNam;
    }

    public void setNgayXuatNguThangNam(String ngayXuatNguThangNam) {
        this.ngayXuatNguThangNam = ngayXuatNguThangNam;
    }

    @Basic
    @Column(name = "CHUNG_CHI_DAN_TOC")
    public Long getChungChiDanToc() {
        return chungChiDanToc;
    }

    public void setChungChiDanToc(Long chungChiDanToc) {
        this.chungChiDanToc = chungChiDanToc;
    }

    @Basic
    @Column(name = "TINH_THANH_QQ_ID")
    public Long getTinhThanhQqId() {
        return tinhThanhQqId;
    }

    public void setTinhThanhQqId(Long tinhThanhQqId) {
        this.tinhThanhQqId = tinhThanhQqId;
    }

    @Basic
    @Column(name = "QUAN_HUYEN_QQ_ID")
    public Long getQuanHuyenQqId() {
        return quanHuyenQqId;
    }

    public void setQuanHuyenQqId(Long quanHuyenQqId) {
        this.quanHuyenQqId = quanHuyenQqId;
    }

    @Basic
    @Column(name = "XA_PHUONG_QQ_ID")
    public Long getXaPhuongQqId() {
        return xaPhuongQqId;
    }

    public void setXaPhuongQqId(Long xaPhuongQqId) {
        this.xaPhuongQqId = xaPhuongQqId;
    }

    @Basic
    @Column(name = "CHUC_VU_TRUOC_TUYEN")
    public String getChucVuTruocTuyen() {
        return chucVuTruocTuyen;
    }

    public void setChucVuTruocTuyen(String chucVuTruocTuyen) {
        this.chucVuTruocTuyen = chucVuTruocTuyen;
    }

    @Basic
    @Column(name = "LY_DO_KBN")
    public String getLyDoKbn() {
        return lyDoKbn;
    }

    public void setLyDoKbn(String lyDoKbn) {
        this.lyDoKbn = lyDoKbn;
    }

    @Basic
    @Column(name = "NGAY_THANG_KBN")
    public Time getNgayThangKbn() {
        return ngayThangKbn;
    }

    public void setNgayThangKbn(Time ngayThangKbn) {
        this.ngayThangKbn = ngayThangKbn;
    }

    @Basic
    @Column(name = "VI_TRI_VLAM_ID")
    public Long getViTriVlamId() {
        return viTriVlamId;
    }

    public void setViTriVlamId(Long viTriVlamId) {
        this.viTriVlamId = viTriVlamId;
    }

    @Basic
    @Column(name = "LAM_CMNVU")
    public Long getLamCmnvu() {
        return lamCmnvu;
    }

    public void setLamCmnvu(Long lamCmnvu) {
        this.lamCmnvu = lamCmnvu;
    }

    @Basic
    @Column(name = "CHUNG_CHI_KTT")
    public Long getChungChiKtt() {
        return chungChiKtt;
    }

    public void setChungChiKtt(Long chungChiKtt) {
        this.chungChiKtt = chungChiKtt;
    }

    @Basic
    @Column(name = "BN_QH")
    public Long getBnQh() {
        return bnQh;
    }

    public void setBnQh(Long bnQh) {
        this.bnQh = bnQh;
    }

    @Basic
    @Column(name = "PHE_DUYET")
    public Long getPheDuyet() {
        return pheDuyet;
    }

    public void setPheDuyet(Long pheDuyet) {
        this.pheDuyet = pheDuyet;
    }

    @Basic
    @Column(name = "NGAY_BO_NHIEM")
    public Time getNgayBoNhiem() {
        return ngayBoNhiem;
    }

    public void setNgayBoNhiem(Time ngayBoNhiem) {
        this.ngayBoNhiem = ngayBoNhiem;
    }

    @Basic
    @Column(name = "NGAY_BO_NHIEM_LAI")
    public Time getNgayBoNhiemLai() {
        return ngayBoNhiemLai;
    }

    public void setNgayBoNhiemLai(Time ngayBoNhiemLai) {
        this.ngayBoNhiemLai = ngayBoNhiemLai;
    }

    @Basic
    @Column(name = "NAM_TOT_NGHIEP")
    public Long getNamTotNghiep() {
        return namTotNghiep;
    }

    public void setNamTotNghiep(Long namTotNghiep) {
        this.namTotNghiep = namTotNghiep;
    }

    @Basic
    @Column(name = "TRUONG_DAO_TAO")
    public String getTruongDaoTao() {
        return truongDaoTao;
    }

    public void setTruongDaoTao(String truongDaoTao) {
        this.truongDaoTao = truongDaoTao;
    }

    @Basic
    @Column(name = "LUONG_HD")
    public Long getLuongHd() {
        return luongHd;
    }

    public void setLuongHd(Long luongHd) {
        this.luongHd = luongHd;
    }

    @Basic
    @Column(name = "DM_VI_TRI_VIEC_LAM_ID")
    public Long getDmViTriViecLamId() {
        return dmViTriViecLamId;
    }

    public void setDmViTriViecLamId(Long dmViTriViecLamId) {
        this.dmViTriViecLamId = dmViTriViecLamId;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "NGAY_NHAN_CHUC_VU_HT")
    public Time getNgayNhanChucVuHt() {
        return ngayNhanChucVuHt;
    }

    public void setNgayNhanChucVuHt(Time ngayNhanChucVuHt) {
        this.ngayNhanChucVuHt = ngayNhanChucVuHt;
    }

    @Basic
    @Column(name = "TINH_TRANG_HON_NHAN")
    public Long getTinhTrangHonNhan() {
        return tinhTrangHonNhan;
    }

    public void setTinhTrangHonNhan(Long tinhTrangHonNhan) {
        this.tinhTrangHonNhan = tinhTrangHonNhan;
    }

    @Basic
    @Column(name = "THANH_PHAN_GIA_DINH_ID")
    public String getThanhPhanGiaDinhId() {
        return thanhPhanGiaDinhId;
    }

    public void setThanhPhanGiaDinhId(String thanhPhanGiaDinhId) {
        this.thanhPhanGiaDinhId = thanhPhanGiaDinhId;
    }

    @Basic
    @Column(name = "DT_CO_QUAN")
    public String getDtCoQuan() {
        return dtCoQuan;
    }

    public void setDtCoQuan(String dtCoQuan) {
        this.dtCoQuan = dtCoQuan;
    }

    @Basic
    @Column(name = "EMAIL_CO_QUAN")
    public String getEmailCoQuan() {
        return emailCoQuan;
    }

    public void setEmailCoQuan(String emailCoQuan) {
        this.emailCoQuan = emailCoQuan;
    }

    @Basic
    @Column(name = "DIA_CHI_LAM_VIEC")
    public String getDiaChiLamViec() {
        return diaChiLamViec;
    }

    public void setDiaChiLamViec(String diaChiLamViec) {
        this.diaChiLamViec = diaChiLamViec;
    }

    @Basic
    @Column(name = "MA_ST_CA_NHAN")
    public String getMaStCaNhan() {
        return maStCaNhan;
    }

    public void setMaStCaNhan(String maStCaNhan) {
        this.maStCaNhan = maStCaNhan;
    }

    @Basic
    @Column(name = "VANBANG_CC")
    public String getVanbangCc() {
        return vanbangCc;
    }

    public void setVanbangCc(String vanbangCc) {
        this.vanbangCc = vanbangCc;
    }

    @Basic
    @Column(name = "HE_DAO_TAO_ID")
    public Long getHeDaoTaoId() {
        return heDaoTaoId;
    }

    public void setHeDaoTaoId(Long heDaoTaoId) {
        this.heDaoTaoId = heDaoTaoId;
    }

    @Basic
    @Column(name = "HS_VUOT_KHUNG")
    public Long getHsVuotKhung() {
        return hsVuotKhung;
    }

    public void setHsVuotKhung(Long hsVuotKhung) {
        this.hsVuotKhung = hsVuotKhung;
    }

    @Basic
    @Column(name = "NGAY_NHAN_NGACH")
    public Time getNgayNhanNgach() {
        return ngayNhanNgach;
    }

    public void setNgayNhanNgach(Time ngayNhanNgach) {
        this.ngayNhanNgach = ngayNhanNgach;
    }

    @Basic
    @Column(name = "MA_NGACH")
    public String getMaNgach() {
        return maNgach;
    }

    public void setMaNgach(String maNgach) {
        this.maNgach = maNgach;
    }

    @Basic
    @Column(name = "XEP_LOAI_TOT_NGHIEP")
    public String getXepLoaiTotNghiep() {
        return xepLoaiTotNghiep;
    }

    public void setXepLoaiTotNghiep(String xepLoaiTotNghiep) {
        this.xepLoaiTotNghiep = xepLoaiTotNghiep;
    }

    @Basic
    @Column(name = "QUOC_GIA_CAP_BANG")
    public Long getQuocGiaCapBang() {
        return quocGiaCapBang;
    }

    public void setQuocGiaCapBang(Long quocGiaCapBang) {
        this.quocGiaCapBang = quocGiaCapBang;
    }

    @Basic
    @Column(name = "CHUC_VU_DANG_ID")
    public Long getChucVuDangId() {
        return chucVuDangId;
    }

    public void setChucVuDangId(Long chucVuDangId) {
        this.chucVuDangId = chucVuDangId;
    }

    @Basic
    @Column(name = "PHU_CAP_DANG")
    public Long getPhuCapDang() {
        return phuCapDang;
    }

    public void setPhuCapDang(Long phuCapDang) {
        this.phuCapDang = phuCapDang;
    }

    @Basic
    @Column(name = "NAM_BAO_LUU_NGAY_PHEP")
    public Long getNamBaoLuuNgayPhep() {
        return namBaoLuuNgayPhep;
    }

    public void setNamBaoLuuNgayPhep(Long namBaoLuuNgayPhep) {
        this.namBaoLuuNgayPhep = namBaoLuuNgayPhep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CbCanBoDetailEntity that = (CbCanBoDetailEntity) o;

        if (id != that.id) return false;
        if (canBoId != null ? !canBoId.equals(that.canBoId) : that.canBoId != null) return false;
        if (donViId != null ? !donViId.equals(that.donViId) : that.donViId != null) return false;
        if (phongBanId != null ? !phongBanId.equals(that.phongBanId) : that.phongBanId != null) return false;
        if (chuyenMonId != null ? !chuyenMonId.equals(that.chuyenMonId) : that.chuyenMonId != null) return false;
        if (chucDanhId != null ? !chucDanhId.equals(that.chucDanhId) : that.chucDanhId != null) return false;
        if (chucVuId != null ? !chucVuId.equals(that.chucVuId) : that.chucVuId != null) return false;
        if (chucVuKiemNhiemId != null ? !chucVuKiemNhiemId.equals(that.chucVuKiemNhiemId) : that.chucVuKiemNhiemId != null)
            return false;
        if (tinhThanhId != null ? !tinhThanhId.equals(that.tinhThanhId) : that.tinhThanhId != null) return false;
        if (quanHuyenId != null ? !quanHuyenId.equals(that.quanHuyenId) : that.quanHuyenId != null) return false;
        if (xaPhuongId != null ? !xaPhuongId.equals(that.xaPhuongId) : that.xaPhuongId != null) return false;
        if (noiOHienNay != null ? !noiOHienNay.equals(that.noiOHienNay) : that.noiOHienNay != null) return false;
        if (dienThoai != null ? !dienThoai.equals(that.dienThoai) : that.dienThoai != null) return false;
        if (danTocId != null ? !danTocId.equals(that.danTocId) : that.danTocId != null) return false;
        if (tonGiaoId != null ? !tonGiaoId.equals(that.tonGiaoId) : that.tonGiaoId != null) return false;
        if (thanhPhanGdId != null ? !thanhPhanGdId.equals(that.thanhPhanGdId) : that.thanhPhanGdId != null)
            return false;
        if (ngheNghiepTruocTuyen != null ? !ngheNghiepTruocTuyen.equals(that.ngheNghiepTruocTuyen) : that.ngheNghiepTruocTuyen != null)
            return false;
        if (ngayDuocTuyen != null ? !ngayDuocTuyen.equals(that.ngayDuocTuyen) : that.ngayDuocTuyen != null)
            return false;
        if (coQuan != null ? !coQuan.equals(that.coQuan) : that.coQuan != null) return false;
        if (ngayVaoCqHienTai != null ? !ngayVaoCqHienTai.equals(that.ngayVaoCqHienTai) : that.ngayVaoCqHienTai != null)
            return false;
        if (ngayThamGiaCm != null ? !ngayThamGiaCm.equals(that.ngayThamGiaCm) : that.ngayThamGiaCm != null)
            return false;
        if (ngayVaoDang != null ? !ngayVaoDang.equals(that.ngayVaoDang) : that.ngayVaoDang != null) return false;
        if (ngayChinhThucDang != null ? !ngayChinhThucDang.equals(that.ngayChinhThucDang) : that.ngayChinhThucDang != null)
            return false;
        if (ngayThamGiaCtxh != null ? !ngayThamGiaCtxh.equals(that.ngayThamGiaCtxh) : that.ngayThamGiaCtxh != null)
            return false;
        if (ngayNhapNgu != null ? !ngayNhapNgu.equals(that.ngayNhapNgu) : that.ngayNhapNgu != null) return false;
        if (ngayXuatNgu != null ? !ngayXuatNgu.equals(that.ngayXuatNgu) : that.ngayXuatNgu != null) return false;
        if (quanHam != null ? !quanHam.equals(that.quanHam) : that.quanHam != null) return false;
        if (trinhDoVanHoaId != null ? !trinhDoVanHoaId.equals(that.trinhDoVanHoaId) : that.trinhDoVanHoaId != null)
            return false;
        if (hocHamViId != null ? !hocHamViId.equals(that.hocHamViId) : that.hocHamViId != null) return false;
        if (lyLuanChinhTriId != null ? !lyLuanChinhTriId.equals(that.lyLuanChinhTriId) : that.lyLuanChinhTriId != null)
            return false;
        if (trinhDoNgoaiNguId != null ? !trinhDoNgoaiNguId.equals(that.trinhDoNgoaiNguId) : that.trinhDoNgoaiNguId != null)
            return false;
        if (congTacChinh != null ? !congTacChinh.equals(that.congTacChinh) : that.congTacChinh != null) return false;
        if (ngachCongChucId != null ? !ngachCongChucId.equals(that.ngachCongChucId) : that.ngachCongChucId != null)
            return false;
        if (bacLuongId != null ? !bacLuongId.equals(that.bacLuongId) : that.bacLuongId != null) return false;
        if (tuNgayBacLuong != null ? !tuNgayBacLuong.equals(that.tuNgayBacLuong) : that.tuNgayBacLuong != null)
            return false;
        if (danhHieuDuocPhong != null ? !danhHieuDuocPhong.equals(that.danhHieuDuocPhong) : that.danhHieuDuocPhong != null)
            return false;
        if (soTruongCongTac != null ? !soTruongCongTac.equals(that.soTruongCongTac) : that.soTruongCongTac != null)
            return false;
        if (congViecLamLauNhat != null ? !congViecLamLauNhat.equals(that.congViecLamLauNhat) : that.congViecLamLauNhat != null)
            return false;
        if (tinhTrangSucKhoe != null ? !tinhTrangSucKhoe.equals(that.tinhTrangSucKhoe) : that.tinhTrangSucKhoe != null)
            return false;
        if (chieuCao != null ? !chieuCao.equals(that.chieuCao) : that.chieuCao != null) return false;
        if (canNang != null ? !canNang.equals(that.canNang) : that.canNang != null) return false;
        if (nhomMau != null ? !nhomMau.equals(that.nhomMau) : that.nhomMau != null) return false;
        if (soCmnd != null ? !soCmnd.equals(that.soCmnd) : that.soCmnd != null) return false;
        if (thuongBinhLoaiId != null ? !thuongBinhLoaiId.equals(that.thuongBinhLoaiId) : that.thuongBinhLoaiId != null)
            return false;
        if (giaDinhLietSi != null ? !giaDinhLietSi.equals(that.giaDinhLietSi) : that.giaDinhLietSi != null)
            return false;
        if (dacDiemLichSuA != null ? !dacDiemLichSuA.equals(that.dacDiemLichSuA) : that.dacDiemLichSuA != null)
            return false;
        if (dacDiemLichSuB != null ? !dacDiemLichSuB.equals(that.dacDiemLichSuB) : that.dacDiemLichSuB != null)
            return false;
        if (quanHeNuocNgoaiA != null ? !quanHeNuocNgoaiA.equals(that.quanHeNuocNgoaiA) : that.quanHeNuocNgoaiA != null)
            return false;
        if (quanHeNuocNgoaiB != null ? !quanHeNuocNgoaiB.equals(that.quanHeNuocNgoaiB) : that.quanHeNuocNgoaiB != null)
            return false;
        if (gdLuong != null ? !gdLuong.equals(that.gdLuong) : that.gdLuong != null) return false;
        if (gdNguonKhac != null ? !gdNguonKhac.equals(that.gdNguonKhac) : that.gdNguonKhac != null) return false;
        if (gdNhaOCapThue != null ? !gdNhaOCapThue.equals(that.gdNhaOCapThue) : that.gdNhaOCapThue != null)
            return false;
        if (gdNhaOCapThueDt != null ? !gdNhaOCapThueDt.equals(that.gdNhaOCapThueDt) : that.gdNhaOCapThueDt != null)
            return false;
        if (gdNhaOMua != null ? !gdNhaOMua.equals(that.gdNhaOMua) : that.gdNhaOMua != null) return false;
        if (gdNhaOMuaDt != null ? !gdNhaOMuaDt.equals(that.gdNhaOMuaDt) : that.gdNhaOMuaDt != null) return false;
        if (gdDatOCap != null ? !gdDatOCap.equals(that.gdDatOCap) : that.gdDatOCap != null) return false;
        if (gdDatOMua != null ? !gdDatOMua.equals(that.gdDatOMua) : that.gdDatOMua != null) return false;
        if (gdDatSanXuat != null ? !gdDatSanXuat.equals(that.gdDatSanXuat) : that.gdDatSanXuat != null) return false;
        if (lastUpdate != null ? !lastUpdate.equals(that.lastUpdate) : that.lastUpdate != null) return false;
        if (soBaoHiem != null ? !soBaoHiem.equals(that.soBaoHiem) : that.soBaoHiem != null) return false;
        if (ngayCapSoBh != null ? !ngayCapSoBh.equals(that.ngayCapSoBh) : that.ngayCapSoBh != null) return false;
        if (noiCapSoBh != null ? !noiCapSoBh.equals(that.noiCapSoBh) : that.noiCapSoBh != null) return false;
        if (tkNganHang != null ? !tkNganHang.equals(that.tkNganHang) : that.tkNganHang != null) return false;
        if (nganHang != null ? !nganHang.equals(that.nganHang) : that.nganHang != null) return false;
        if (ngayBienChe != null ? !ngayBienChe.equals(that.ngayBienChe) : that.ngayBienChe != null) return false;
        if (noiSinh != null ? !noiSinh.equals(that.noiSinh) : that.noiSinh != null) return false;
        if (capUyHienTai != null ? !capUyHienTai.equals(that.capUyHienTai) : that.capUyHienTai != null) return false;
        if (capUyKiem != null ? !capUyKiem.equals(that.capUyKiem) : that.capUyKiem != null) return false;
        if (gdTongDienTich != null ? !gdTongDienTich.equals(that.gdTongDienTich) : that.gdTongDienTich != null)
            return false;
        if (heSoNgachBac != null ? !heSoNgachBac.equals(that.heSoNgachBac) : that.heSoNgachBac != null) return false;
        if (pcTnvk != null ? !pcTnvk.equals(that.pcTnvk) : that.pcTnvk != null) return false;
        if (pcCv != null ? !pcCv.equals(that.pcCv) : that.pcCv != null) return false;
        if (pcTn != null ? !pcTn.equals(that.pcTn) : that.pcTn != null) return false;
        if (hsBaoLuu != null ? !hsBaoLuu.equals(that.hsBaoLuu) : that.hsBaoLuu != null) return false;
        if (soPhieuKcb != null ? !soPhieuKcb.equals(that.soPhieuKcb) : that.soPhieuKcb != null) return false;
        if (noiDangKyKcb != null ? !noiDangKyKcb.equals(that.noiDangKyKcb) : that.noiDangKyKcb != null) return false;
        if (tinHocId != null ? !tinHocId.equals(that.tinHocId) : that.tinHocId != null) return false;
        if (qlNhaNuocId != null ? !qlNhaNuocId.equals(that.qlNhaNuocId) : that.qlNhaNuocId != null) return false;
        if (tinhThanhNsId != null ? !tinhThanhNsId.equals(that.tinhThanhNsId) : that.tinhThanhNsId != null)
            return false;
        if (quanHuyenNsId != null ? !quanHuyenNsId.equals(that.quanHuyenNsId) : that.quanHuyenNsId != null)
            return false;
        if (xaPhuongNsId != null ? !xaPhuongNsId.equals(that.xaPhuongNsId) : that.xaPhuongNsId != null) return false;
        if (noiDkHktt != null ? !noiDkHktt.equals(that.noiDkHktt) : that.noiDkHktt != null) return false;
        if (doiTuongChinhSachId != null ? !doiTuongChinhSachId.equals(that.doiTuongChinhSachId) : that.doiTuongChinhSachId != null)
            return false;
        if (ngayThamGiaCongTac != null ? !ngayThamGiaCongTac.equals(that.ngayThamGiaCongTac) : that.ngayThamGiaCongTac != null)
            return false;
        if (ngayDongBhxh != null ? !ngayDongBhxh.equals(that.ngayDongBhxh) : that.ngayDongBhxh != null) return false;
        if (ngayVaoNganhTc != null ? !ngayVaoNganhTc.equals(that.ngayVaoNganhTc) : that.ngayVaoNganhTc != null)
            return false;
        if (chucVuQuyHoachId != null ? !chucVuQuyHoachId.equals(that.chucVuQuyHoachId) : that.chucVuQuyHoachId != null)
            return false;
        if (ngayQuyHoach != null ? !ngayQuyHoach.equals(that.ngayQuyHoach) : that.ngayQuyHoach != null) return false;
        if (capQuyHoachId != null ? !capQuyHoachId.equals(that.capQuyHoachId) : that.capQuyHoachId != null)
            return false;
        if (ngayCapCmnd != null ? !ngayCapCmnd.equals(that.ngayCapCmnd) : that.ngayCapCmnd != null) return false;
        if (nhanXetDanhGia != null ? !nhanXetDanhGia.equals(that.nhanXetDanhGia) : that.nhanXetDanhGia != null)
            return false;
        if (khenThuong != null ? !khenThuong.equals(that.khenThuong) : that.khenThuong != null) return false;
        if (kyLuat != null ? !kyLuat.equals(that.kyLuat) : that.kyLuat != null) return false;
        if (daCoSoBhxh != null ? !daCoSoBhxh.equals(that.daCoSoBhxh) : that.daCoSoBhxh != null) return false;
        if (daTraSoBhxh != null ? !daTraSoBhxh.equals(that.daTraSoBhxh) : that.daTraSoBhxh != null) return false;
        if (ngayTraSoBhxh != null ? !ngayTraSoBhxh.equals(that.ngayTraSoBhxh) : that.ngayTraSoBhxh != null)
            return false;
        if (phanTramHuongLuong != null ? !phanTramHuongLuong.equals(that.phanTramHuongLuong) : that.phanTramHuongLuong != null)
            return false;
        if (quocGiaId != null ? !quocGiaId.equals(that.quocGiaId) : that.quocGiaId != null) return false;
        if (noiCapCmnd != null ? !noiCapCmnd.equals(that.noiCapCmnd) : that.noiCapCmnd != null) return false;
        if (dienThoaiCoDinh != null ? !dienThoaiCoDinh.equals(that.dienThoaiCoDinh) : that.dienThoaiCoDinh != null)
            return false;
        if (quyetDinhTdHd != null ? !quyetDinhTdHd.equals(that.quyetDinhTdHd) : that.quyetDinhTdHd != null)
            return false;
        if (soTheBhyt != null ? !soTheBhyt.equals(that.soTheBhyt) : that.soTheBhyt != null) return false;
        if (tinhThanhQq != null ? !tinhThanhQq.equals(that.tinhThanhQq) : that.tinhThanhQq != null) return false;
        if (quanHuyenQq != null ? !quanHuyenQq.equals(that.quanHuyenQq) : that.quanHuyenQq != null) return false;
        if (xaPhuongQq != null ? !xaPhuongQq.equals(that.xaPhuongQq) : that.xaPhuongQq != null) return false;
        if (tinhThanhNs != null ? !tinhThanhNs.equals(that.tinhThanhNs) : that.tinhThanhNs != null) return false;
        if (quanHuyenNs != null ? !quanHuyenNs.equals(that.quanHuyenNs) : that.quanHuyenNs != null) return false;
        if (xaPhuongNs != null ? !xaPhuongNs.equals(that.xaPhuongNs) : that.xaPhuongNs != null) return false;
        if (chuyenNganhId != null ? !chuyenNganhId.equals(that.chuyenNganhId) : that.chuyenNganhId != null)
            return false;
        if (loaiNgayTuyenDung != null ? !loaiNgayTuyenDung.equals(that.loaiNgayTuyenDung) : that.loaiNgayTuyenDung != null)
            return false;
        if (ngayDuocTuyenThangNam != null ? !ngayDuocTuyenThangNam.equals(that.ngayDuocTuyenThangNam) : that.ngayDuocTuyenThangNam != null)
            return false;
        if (loaiNgayHuongLuong != null ? !loaiNgayHuongLuong.equals(that.loaiNgayHuongLuong) : that.loaiNgayHuongLuong != null)
            return false;
        if (ngayHuongLuongThangNam != null ? !ngayHuongLuongThangNam.equals(that.ngayHuongLuongThangNam) : that.ngayHuongLuongThangNam != null)
            return false;
        if (loaiNgayNhapNgu != null ? !loaiNgayNhapNgu.equals(that.loaiNgayNhapNgu) : that.loaiNgayNhapNgu != null)
            return false;
        if (ngayNhapNguThangNam != null ? !ngayNhapNguThangNam.equals(that.ngayNhapNguThangNam) : that.ngayNhapNguThangNam != null)
            return false;
        if (loaiNgayXuatNgu != null ? !loaiNgayXuatNgu.equals(that.loaiNgayXuatNgu) : that.loaiNgayXuatNgu != null)
            return false;
        if (ngayXuatNguThangNam != null ? !ngayXuatNguThangNam.equals(that.ngayXuatNguThangNam) : that.ngayXuatNguThangNam != null)
            return false;
        if (chungChiDanToc != null ? !chungChiDanToc.equals(that.chungChiDanToc) : that.chungChiDanToc != null)
            return false;
        if (tinhThanhQqId != null ? !tinhThanhQqId.equals(that.tinhThanhQqId) : that.tinhThanhQqId != null)
            return false;
        if (quanHuyenQqId != null ? !quanHuyenQqId.equals(that.quanHuyenQqId) : that.quanHuyenQqId != null)
            return false;
        if (xaPhuongQqId != null ? !xaPhuongQqId.equals(that.xaPhuongQqId) : that.xaPhuongQqId != null) return false;
        if (chucVuTruocTuyen != null ? !chucVuTruocTuyen.equals(that.chucVuTruocTuyen) : that.chucVuTruocTuyen != null)
            return false;
        if (lyDoKbn != null ? !lyDoKbn.equals(that.lyDoKbn) : that.lyDoKbn != null) return false;
        if (ngayThangKbn != null ? !ngayThangKbn.equals(that.ngayThangKbn) : that.ngayThangKbn != null) return false;
        if (viTriVlamId != null ? !viTriVlamId.equals(that.viTriVlamId) : that.viTriVlamId != null) return false;
        if (lamCmnvu != null ? !lamCmnvu.equals(that.lamCmnvu) : that.lamCmnvu != null) return false;
        if (chungChiKtt != null ? !chungChiKtt.equals(that.chungChiKtt) : that.chungChiKtt != null) return false;
        if (bnQh != null ? !bnQh.equals(that.bnQh) : that.bnQh != null) return false;
        if (pheDuyet != null ? !pheDuyet.equals(that.pheDuyet) : that.pheDuyet != null) return false;
        if (ngayBoNhiem != null ? !ngayBoNhiem.equals(that.ngayBoNhiem) : that.ngayBoNhiem != null) return false;
        if (ngayBoNhiemLai != null ? !ngayBoNhiemLai.equals(that.ngayBoNhiemLai) : that.ngayBoNhiemLai != null)
            return false;
        if (namTotNghiep != null ? !namTotNghiep.equals(that.namTotNghiep) : that.namTotNghiep != null) return false;
        if (truongDaoTao != null ? !truongDaoTao.equals(that.truongDaoTao) : that.truongDaoTao != null) return false;
        if (luongHd != null ? !luongHd.equals(that.luongHd) : that.luongHd != null) return false;
        if (dmViTriViecLamId != null ? !dmViTriViecLamId.equals(that.dmViTriViecLamId) : that.dmViTriViecLamId != null)
            return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (ngayNhanChucVuHt != null ? !ngayNhanChucVuHt.equals(that.ngayNhanChucVuHt) : that.ngayNhanChucVuHt != null)
            return false;
        if (tinhTrangHonNhan != null ? !tinhTrangHonNhan.equals(that.tinhTrangHonNhan) : that.tinhTrangHonNhan != null)
            return false;
        if (thanhPhanGiaDinhId != null ? !thanhPhanGiaDinhId.equals(that.thanhPhanGiaDinhId) : that.thanhPhanGiaDinhId != null)
            return false;
        if (dtCoQuan != null ? !dtCoQuan.equals(that.dtCoQuan) : that.dtCoQuan != null) return false;
        if (emailCoQuan != null ? !emailCoQuan.equals(that.emailCoQuan) : that.emailCoQuan != null) return false;
        if (diaChiLamViec != null ? !diaChiLamViec.equals(that.diaChiLamViec) : that.diaChiLamViec != null)
            return false;
        if (maStCaNhan != null ? !maStCaNhan.equals(that.maStCaNhan) : that.maStCaNhan != null) return false;
        if (vanbangCc != null ? !vanbangCc.equals(that.vanbangCc) : that.vanbangCc != null) return false;
        if (heDaoTaoId != null ? !heDaoTaoId.equals(that.heDaoTaoId) : that.heDaoTaoId != null) return false;
        if (hsVuotKhung != null ? !hsVuotKhung.equals(that.hsVuotKhung) : that.hsVuotKhung != null) return false;
        if (ngayNhanNgach != null ? !ngayNhanNgach.equals(that.ngayNhanNgach) : that.ngayNhanNgach != null)
            return false;
        if (maNgach != null ? !maNgach.equals(that.maNgach) : that.maNgach != null) return false;
        if (xepLoaiTotNghiep != null ? !xepLoaiTotNghiep.equals(that.xepLoaiTotNghiep) : that.xepLoaiTotNghiep != null)
            return false;
        if (quocGiaCapBang != null ? !quocGiaCapBang.equals(that.quocGiaCapBang) : that.quocGiaCapBang != null)
            return false;
        if (chucVuDangId != null ? !chucVuDangId.equals(that.chucVuDangId) : that.chucVuDangId != null) return false;
        if (phuCapDang != null ? !phuCapDang.equals(that.phuCapDang) : that.phuCapDang != null) return false;
        if (namBaoLuuNgayPhep != null ? !namBaoLuuNgayPhep.equals(that.namBaoLuuNgayPhep) : that.namBaoLuuNgayPhep != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (canBoId != null ? canBoId.hashCode() : 0);
        result = 31 * result + (donViId != null ? donViId.hashCode() : 0);
        result = 31 * result + (phongBanId != null ? phongBanId.hashCode() : 0);
        result = 31 * result + (chuyenMonId != null ? chuyenMonId.hashCode() : 0);
        result = 31 * result + (chucDanhId != null ? chucDanhId.hashCode() : 0);
        result = 31 * result + (chucVuId != null ? chucVuId.hashCode() : 0);
        result = 31 * result + (chucVuKiemNhiemId != null ? chucVuKiemNhiemId.hashCode() : 0);
        result = 31 * result + (tinhThanhId != null ? tinhThanhId.hashCode() : 0);
        result = 31 * result + (quanHuyenId != null ? quanHuyenId.hashCode() : 0);
        result = 31 * result + (xaPhuongId != null ? xaPhuongId.hashCode() : 0);
        result = 31 * result + (noiOHienNay != null ? noiOHienNay.hashCode() : 0);
        result = 31 * result + (dienThoai != null ? dienThoai.hashCode() : 0);
        result = 31 * result + (danTocId != null ? danTocId.hashCode() : 0);
        result = 31 * result + (tonGiaoId != null ? tonGiaoId.hashCode() : 0);
        result = 31 * result + (thanhPhanGdId != null ? thanhPhanGdId.hashCode() : 0);
        result = 31 * result + (ngheNghiepTruocTuyen != null ? ngheNghiepTruocTuyen.hashCode() : 0);
        result = 31 * result + (ngayDuocTuyen != null ? ngayDuocTuyen.hashCode() : 0);
        result = 31 * result + (coQuan != null ? coQuan.hashCode() : 0);
        result = 31 * result + (ngayVaoCqHienTai != null ? ngayVaoCqHienTai.hashCode() : 0);
        result = 31 * result + (ngayThamGiaCm != null ? ngayThamGiaCm.hashCode() : 0);
        result = 31 * result + (ngayVaoDang != null ? ngayVaoDang.hashCode() : 0);
        result = 31 * result + (ngayChinhThucDang != null ? ngayChinhThucDang.hashCode() : 0);
        result = 31 * result + (ngayThamGiaCtxh != null ? ngayThamGiaCtxh.hashCode() : 0);
        result = 31 * result + (ngayNhapNgu != null ? ngayNhapNgu.hashCode() : 0);
        result = 31 * result + (ngayXuatNgu != null ? ngayXuatNgu.hashCode() : 0);
        result = 31 * result + (quanHam != null ? quanHam.hashCode() : 0);
        result = 31 * result + (trinhDoVanHoaId != null ? trinhDoVanHoaId.hashCode() : 0);
        result = 31 * result + (hocHamViId != null ? hocHamViId.hashCode() : 0);
        result = 31 * result + (lyLuanChinhTriId != null ? lyLuanChinhTriId.hashCode() : 0);
        result = 31 * result + (trinhDoNgoaiNguId != null ? trinhDoNgoaiNguId.hashCode() : 0);
        result = 31 * result + (congTacChinh != null ? congTacChinh.hashCode() : 0);
        result = 31 * result + (ngachCongChucId != null ? ngachCongChucId.hashCode() : 0);
        result = 31 * result + (bacLuongId != null ? bacLuongId.hashCode() : 0);
        result = 31 * result + (tuNgayBacLuong != null ? tuNgayBacLuong.hashCode() : 0);
        result = 31 * result + (danhHieuDuocPhong != null ? danhHieuDuocPhong.hashCode() : 0);
        result = 31 * result + (soTruongCongTac != null ? soTruongCongTac.hashCode() : 0);
        result = 31 * result + (congViecLamLauNhat != null ? congViecLamLauNhat.hashCode() : 0);
        result = 31 * result + (tinhTrangSucKhoe != null ? tinhTrangSucKhoe.hashCode() : 0);
        result = 31 * result + (chieuCao != null ? chieuCao.hashCode() : 0);
        result = 31 * result + (canNang != null ? canNang.hashCode() : 0);
        result = 31 * result + (nhomMau != null ? nhomMau.hashCode() : 0);
        result = 31 * result + (soCmnd != null ? soCmnd.hashCode() : 0);
        result = 31 * result + (thuongBinhLoaiId != null ? thuongBinhLoaiId.hashCode() : 0);
        result = 31 * result + (giaDinhLietSi != null ? giaDinhLietSi.hashCode() : 0);
        result = 31 * result + (dacDiemLichSuA != null ? dacDiemLichSuA.hashCode() : 0);
        result = 31 * result + (dacDiemLichSuB != null ? dacDiemLichSuB.hashCode() : 0);
        result = 31 * result + (quanHeNuocNgoaiA != null ? quanHeNuocNgoaiA.hashCode() : 0);
        result = 31 * result + (quanHeNuocNgoaiB != null ? quanHeNuocNgoaiB.hashCode() : 0);
        result = 31 * result + (gdLuong != null ? gdLuong.hashCode() : 0);
        result = 31 * result + (gdNguonKhac != null ? gdNguonKhac.hashCode() : 0);
        result = 31 * result + (gdNhaOCapThue != null ? gdNhaOCapThue.hashCode() : 0);
        result = 31 * result + (gdNhaOCapThueDt != null ? gdNhaOCapThueDt.hashCode() : 0);
        result = 31 * result + (gdNhaOMua != null ? gdNhaOMua.hashCode() : 0);
        result = 31 * result + (gdNhaOMuaDt != null ? gdNhaOMuaDt.hashCode() : 0);
        result = 31 * result + (gdDatOCap != null ? gdDatOCap.hashCode() : 0);
        result = 31 * result + (gdDatOMua != null ? gdDatOMua.hashCode() : 0);
        result = 31 * result + (gdDatSanXuat != null ? gdDatSanXuat.hashCode() : 0);
        result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
        result = 31 * result + (soBaoHiem != null ? soBaoHiem.hashCode() : 0);
        result = 31 * result + (ngayCapSoBh != null ? ngayCapSoBh.hashCode() : 0);
        result = 31 * result + (noiCapSoBh != null ? noiCapSoBh.hashCode() : 0);
        result = 31 * result + (tkNganHang != null ? tkNganHang.hashCode() : 0);
        result = 31 * result + (nganHang != null ? nganHang.hashCode() : 0);
        result = 31 * result + (ngayBienChe != null ? ngayBienChe.hashCode() : 0);
        result = 31 * result + (noiSinh != null ? noiSinh.hashCode() : 0);
        result = 31 * result + (capUyHienTai != null ? capUyHienTai.hashCode() : 0);
        result = 31 * result + (capUyKiem != null ? capUyKiem.hashCode() : 0);
        result = 31 * result + (gdTongDienTich != null ? gdTongDienTich.hashCode() : 0);
        result = 31 * result + (heSoNgachBac != null ? heSoNgachBac.hashCode() : 0);
        result = 31 * result + (pcTnvk != null ? pcTnvk.hashCode() : 0);
        result = 31 * result + (pcCv != null ? pcCv.hashCode() : 0);
        result = 31 * result + (pcTn != null ? pcTn.hashCode() : 0);
        result = 31 * result + (hsBaoLuu != null ? hsBaoLuu.hashCode() : 0);
        result = 31 * result + (soPhieuKcb != null ? soPhieuKcb.hashCode() : 0);
        result = 31 * result + (noiDangKyKcb != null ? noiDangKyKcb.hashCode() : 0);
        result = 31 * result + (tinHocId != null ? tinHocId.hashCode() : 0);
        result = 31 * result + (qlNhaNuocId != null ? qlNhaNuocId.hashCode() : 0);
        result = 31 * result + (tinhThanhNsId != null ? tinhThanhNsId.hashCode() : 0);
        result = 31 * result + (quanHuyenNsId != null ? quanHuyenNsId.hashCode() : 0);
        result = 31 * result + (xaPhuongNsId != null ? xaPhuongNsId.hashCode() : 0);
        result = 31 * result + (noiDkHktt != null ? noiDkHktt.hashCode() : 0);
        result = 31 * result + (doiTuongChinhSachId != null ? doiTuongChinhSachId.hashCode() : 0);
        result = 31 * result + (ngayThamGiaCongTac != null ? ngayThamGiaCongTac.hashCode() : 0);
        result = 31 * result + (ngayDongBhxh != null ? ngayDongBhxh.hashCode() : 0);
        result = 31 * result + (ngayVaoNganhTc != null ? ngayVaoNganhTc.hashCode() : 0);
        result = 31 * result + (chucVuQuyHoachId != null ? chucVuQuyHoachId.hashCode() : 0);
        result = 31 * result + (ngayQuyHoach != null ? ngayQuyHoach.hashCode() : 0);
        result = 31 * result + (capQuyHoachId != null ? capQuyHoachId.hashCode() : 0);
        result = 31 * result + (ngayCapCmnd != null ? ngayCapCmnd.hashCode() : 0);
        result = 31 * result + (nhanXetDanhGia != null ? nhanXetDanhGia.hashCode() : 0);
        result = 31 * result + (khenThuong != null ? khenThuong.hashCode() : 0);
        result = 31 * result + (kyLuat != null ? kyLuat.hashCode() : 0);
        result = 31 * result + (daCoSoBhxh != null ? daCoSoBhxh.hashCode() : 0);
        result = 31 * result + (daTraSoBhxh != null ? daTraSoBhxh.hashCode() : 0);
        result = 31 * result + (ngayTraSoBhxh != null ? ngayTraSoBhxh.hashCode() : 0);
        result = 31 * result + (phanTramHuongLuong != null ? phanTramHuongLuong.hashCode() : 0);
        result = 31 * result + (quocGiaId != null ? quocGiaId.hashCode() : 0);
        result = 31 * result + (noiCapCmnd != null ? noiCapCmnd.hashCode() : 0);
        result = 31 * result + (dienThoaiCoDinh != null ? dienThoaiCoDinh.hashCode() : 0);
        result = 31 * result + (quyetDinhTdHd != null ? quyetDinhTdHd.hashCode() : 0);
        result = 31 * result + (soTheBhyt != null ? soTheBhyt.hashCode() : 0);
        result = 31 * result + (tinhThanhQq != null ? tinhThanhQq.hashCode() : 0);
        result = 31 * result + (quanHuyenQq != null ? quanHuyenQq.hashCode() : 0);
        result = 31 * result + (xaPhuongQq != null ? xaPhuongQq.hashCode() : 0);
        result = 31 * result + (tinhThanhNs != null ? tinhThanhNs.hashCode() : 0);
        result = 31 * result + (quanHuyenNs != null ? quanHuyenNs.hashCode() : 0);
        result = 31 * result + (xaPhuongNs != null ? xaPhuongNs.hashCode() : 0);
        result = 31 * result + (chuyenNganhId != null ? chuyenNganhId.hashCode() : 0);
        result = 31 * result + (loaiNgayTuyenDung != null ? loaiNgayTuyenDung.hashCode() : 0);
        result = 31 * result + (ngayDuocTuyenThangNam != null ? ngayDuocTuyenThangNam.hashCode() : 0);
        result = 31 * result + (loaiNgayHuongLuong != null ? loaiNgayHuongLuong.hashCode() : 0);
        result = 31 * result + (ngayHuongLuongThangNam != null ? ngayHuongLuongThangNam.hashCode() : 0);
        result = 31 * result + (loaiNgayNhapNgu != null ? loaiNgayNhapNgu.hashCode() : 0);
        result = 31 * result + (ngayNhapNguThangNam != null ? ngayNhapNguThangNam.hashCode() : 0);
        result = 31 * result + (loaiNgayXuatNgu != null ? loaiNgayXuatNgu.hashCode() : 0);
        result = 31 * result + (ngayXuatNguThangNam != null ? ngayXuatNguThangNam.hashCode() : 0);
        result = 31 * result + (chungChiDanToc != null ? chungChiDanToc.hashCode() : 0);
        result = 31 * result + (tinhThanhQqId != null ? tinhThanhQqId.hashCode() : 0);
        result = 31 * result + (quanHuyenQqId != null ? quanHuyenQqId.hashCode() : 0);
        result = 31 * result + (xaPhuongQqId != null ? xaPhuongQqId.hashCode() : 0);
        result = 31 * result + (chucVuTruocTuyen != null ? chucVuTruocTuyen.hashCode() : 0);
        result = 31 * result + (lyDoKbn != null ? lyDoKbn.hashCode() : 0);
        result = 31 * result + (ngayThangKbn != null ? ngayThangKbn.hashCode() : 0);
        result = 31 * result + (viTriVlamId != null ? viTriVlamId.hashCode() : 0);
        result = 31 * result + (lamCmnvu != null ? lamCmnvu.hashCode() : 0);
        result = 31 * result + (chungChiKtt != null ? chungChiKtt.hashCode() : 0);
        result = 31 * result + (bnQh != null ? bnQh.hashCode() : 0);
        result = 31 * result + (pheDuyet != null ? pheDuyet.hashCode() : 0);
        result = 31 * result + (ngayBoNhiem != null ? ngayBoNhiem.hashCode() : 0);
        result = 31 * result + (ngayBoNhiemLai != null ? ngayBoNhiemLai.hashCode() : 0);
        result = 31 * result + (namTotNghiep != null ? namTotNghiep.hashCode() : 0);
        result = 31 * result + (truongDaoTao != null ? truongDaoTao.hashCode() : 0);
        result = 31 * result + (luongHd != null ? luongHd.hashCode() : 0);
        result = 31 * result + (dmViTriViecLamId != null ? dmViTriViecLamId.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (ngayNhanChucVuHt != null ? ngayNhanChucVuHt.hashCode() : 0);
        result = 31 * result + (tinhTrangHonNhan != null ? tinhTrangHonNhan.hashCode() : 0);
        result = 31 * result + (thanhPhanGiaDinhId != null ? thanhPhanGiaDinhId.hashCode() : 0);
        result = 31 * result + (dtCoQuan != null ? dtCoQuan.hashCode() : 0);
        result = 31 * result + (emailCoQuan != null ? emailCoQuan.hashCode() : 0);
        result = 31 * result + (diaChiLamViec != null ? diaChiLamViec.hashCode() : 0);
        result = 31 * result + (maStCaNhan != null ? maStCaNhan.hashCode() : 0);
        result = 31 * result + (vanbangCc != null ? vanbangCc.hashCode() : 0);
        result = 31 * result + (heDaoTaoId != null ? heDaoTaoId.hashCode() : 0);
        result = 31 * result + (hsVuotKhung != null ? hsVuotKhung.hashCode() : 0);
        result = 31 * result + (ngayNhanNgach != null ? ngayNhanNgach.hashCode() : 0);
        result = 31 * result + (maNgach != null ? maNgach.hashCode() : 0);
        result = 31 * result + (xepLoaiTotNghiep != null ? xepLoaiTotNghiep.hashCode() : 0);
        result = 31 * result + (quocGiaCapBang != null ? quocGiaCapBang.hashCode() : 0);
        result = 31 * result + (chucVuDangId != null ? chucVuDangId.hashCode() : 0);
        result = 31 * result + (phuCapDang != null ? phuCapDang.hashCode() : 0);
        result = 31 * result + (namBaoLuuNgayPhep != null ? namBaoLuuNgayPhep.hashCode() : 0);
        return result;
    }
}
