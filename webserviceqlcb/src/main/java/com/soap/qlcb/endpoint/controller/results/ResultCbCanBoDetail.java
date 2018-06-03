package com.soap.qlcb.endpoint.controller.results;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.Date;

/**
 * @author anhbt 6/2/2018
 * com.soap.qlcb.endpoint.controller.results
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ResultCbCanBoDetail {
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
    private Date ngayDuocTuyen;
    private String coQuan;
    private Date ngayVaoCqHienTai;
    private Date ngayThamGiaCm;
    private Date ngayVaoDang;
    private Date ngayChinhThucDang;
    private String ngayThamGiaCtxh;
    private Date ngayNhapNgu;
    private Date ngayXuatNgu;
    private String quanHam;
    private Long trinhDoVanHoaId;
    private Long hocHamViId;
    private Long lyLuanChinhTriId;
    private Long trinhDoNgoaiNguId;
    private String congTacChinh;
    private Long ngachCongChucId;
    private Long bacLuongId;
    private Date tuNgayBacLuong;
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
    private Date lastUpdate;
    private String soBaoHiem;
    private Date ngayCapSoBh;
    private String noiCapSoBh;
    private String tkNganHang;
    private String nganHang;
    private Date ngayBienChe;
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
    private Date ngayThamGiaCongTac;
    private Date ngayDongBhxh;
    private Date ngayVaoNganhTc;
    private Long chucVuQuyHoachId;
    private Date ngayQuyHoach;
    private Long capQuyHoachId;
    private Date ngayCapCmnd;
    private String nhanXetDanhGia;
    private String khenThuong;
    private String kyLuat;
    private Long daCoSoBhxh;
    private Long daTraSoBhxh;
    private Date ngayTraSoBhxh;
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
    private Date ngayThangKbn;
    private Long viTriVlamId;
    private Long lamCmnvu;
    private Long chungChiKtt;
    private Long bnQh;
    private Long pheDuyet;
    private Date ngayBoNhiem;
    private Date ngayBoNhiemLai;
    private Long namTotNghiep;
    private String truongDaoTao;
    private Long luongHd;
    private Long dmViTriViecLamId;
    private String email;
    private Date ngayNhanChucVuHt;
    private Long tinhTrangHonNhan;
    private String thanhPhanGiaDinhId;
    private String dtCoQuan;
    private String emailCoQuan;
    private String diaChiLamViec;
    private String maStCaNhan;
    private String vanbangCc;
    private Long heDaoTaoId;
    private Long hsVuotKhung;
    private Date ngayNhanNgach;
    private String maNgach;
    private String xepLoaiTotNghiep;
    private Long quocGiaCapBang;
    private Long chucVuDangId;
    private Long phuCapDang;
    private Long namBaoLuuNgayPhep;

    public ResultCbCanBoDetail() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getCanBoId() {
        return canBoId;
    }

    public void setCanBoId(Long canBoId) {
        this.canBoId = canBoId;
    }

    public Long getDonViId() {
        return donViId;
    }

    public void setDonViId(Long donViId) {
        this.donViId = donViId;
    }

    public Long getPhongBanId() {
        return phongBanId;
    }

    public void setPhongBanId(Long phongBanId) {
        this.phongBanId = phongBanId;
    }

    public Long getChuyenMonId() {
        return chuyenMonId;
    }

    public void setChuyenMonId(Long chuyenMonId) {
        this.chuyenMonId = chuyenMonId;
    }

    public Long getChucDanhId() {
        return chucDanhId;
    }

    public void setChucDanhId(Long chucDanhId) {
        this.chucDanhId = chucDanhId;
    }

    public Long getChucVuId() {
        return chucVuId;
    }

    public void setChucVuId(Long chucVuId) {
        this.chucVuId = chucVuId;
    }

    public Long getChucVuKiemNhiemId() {
        return chucVuKiemNhiemId;
    }

    public void setChucVuKiemNhiemId(Long chucVuKiemNhiemId) {
        this.chucVuKiemNhiemId = chucVuKiemNhiemId;
    }

    public Long getTinhThanhId() {
        return tinhThanhId;
    }

    public void setTinhThanhId(Long tinhThanhId) {
        this.tinhThanhId = tinhThanhId;
    }

    public Long getQuanHuyenId() {
        return quanHuyenId;
    }

    public void setQuanHuyenId(Long quanHuyenId) {
        this.quanHuyenId = quanHuyenId;
    }

    public Long getXaPhuongId() {
        return xaPhuongId;
    }

    public void setXaPhuongId(Long xaPhuongId) {
        this.xaPhuongId = xaPhuongId;
    }

    public String getNoiOHienNay() {
        return noiOHienNay;
    }

    public void setNoiOHienNay(String noiOHienNay) {
        this.noiOHienNay = noiOHienNay;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public Long getDanTocId() {
        return danTocId;
    }

    public void setDanTocId(Long danTocId) {
        this.danTocId = danTocId;
    }

    public Long getTonGiaoId() {
        return tonGiaoId;
    }

    public void setTonGiaoId(Long tonGiaoId) {
        this.tonGiaoId = tonGiaoId;
    }

    public Long getThanhPhanGdId() {
        return thanhPhanGdId;
    }

    public void setThanhPhanGdId(Long thanhPhanGdId) {
        this.thanhPhanGdId = thanhPhanGdId;
    }

    public String getNgheNghiepTruocTuyen() {
        return ngheNghiepTruocTuyen;
    }

    public void setNgheNghiepTruocTuyen(String ngheNghiepTruocTuyen) {
        this.ngheNghiepTruocTuyen = ngheNghiepTruocTuyen;
    }

    public Date getNgayDuocTuyen() {
        return ngayDuocTuyen;
    }

    public void setNgayDuocTuyen(Date ngayDuocTuyen) {
        this.ngayDuocTuyen = ngayDuocTuyen;
    }

    public String getCoQuan() {
        return coQuan;
    }

    public void setCoQuan(String coQuan) {
        this.coQuan = coQuan;
    }

    public Date getNgayVaoCqHienTai() {
        return ngayVaoCqHienTai;
    }

    public void setNgayVaoCqHienTai(Date ngayVaoCqHienTai) {
        this.ngayVaoCqHienTai = ngayVaoCqHienTai;
    }

    public Date getNgayThamGiaCm() {
        return ngayThamGiaCm;
    }

    public void setNgayThamGiaCm(Date ngayThamGiaCm) {
        this.ngayThamGiaCm = ngayThamGiaCm;
    }

    public Date getNgayVaoDang() {
        return ngayVaoDang;
    }

    public void setNgayVaoDang(Date ngayVaoDang) {
        this.ngayVaoDang = ngayVaoDang;
    }

    public Date getNgayChinhThucDang() {
        return ngayChinhThucDang;
    }

    public void setNgayChinhThucDang(Date ngayChinhThucDang) {
        this.ngayChinhThucDang = ngayChinhThucDang;
    }

    public String getNgayThamGiaCtxh() {
        return ngayThamGiaCtxh;
    }

    public void setNgayThamGiaCtxh(String ngayThamGiaCtxh) {
        this.ngayThamGiaCtxh = ngayThamGiaCtxh;
    }

    public Date getNgayNhapNgu() {
        return ngayNhapNgu;
    }

    public void setNgayNhapNgu(Date ngayNhapNgu) {
        this.ngayNhapNgu = ngayNhapNgu;
    }

    public Date getNgayXuatNgu() {
        return ngayXuatNgu;
    }

    public void setNgayXuatNgu(Date ngayXuatNgu) {
        this.ngayXuatNgu = ngayXuatNgu;
    }

    public String getQuanHam() {
        return quanHam;
    }

    public void setQuanHam(String quanHam) {
        this.quanHam = quanHam;
    }

    public Long getTrinhDoVanHoaId() {
        return trinhDoVanHoaId;
    }

    public void setTrinhDoVanHoaId(Long trinhDoVanHoaId) {
        this.trinhDoVanHoaId = trinhDoVanHoaId;
    }

    public Long getHocHamViId() {
        return hocHamViId;
    }

    public void setHocHamViId(Long hocHamViId) {
        this.hocHamViId = hocHamViId;
    }

    public Long getLyLuanChinhTriId() {
        return lyLuanChinhTriId;
    }

    public void setLyLuanChinhTriId(Long lyLuanChinhTriId) {
        this.lyLuanChinhTriId = lyLuanChinhTriId;
    }

    public Long getTrinhDoNgoaiNguId() {
        return trinhDoNgoaiNguId;
    }

    public void setTrinhDoNgoaiNguId(Long trinhDoNgoaiNguId) {
        this.trinhDoNgoaiNguId = trinhDoNgoaiNguId;
    }

    public String getCongTacChinh() {
        return congTacChinh;
    }

    public void setCongTacChinh(String congTacChinh) {
        this.congTacChinh = congTacChinh;
    }

    public Long getNgachCongChucId() {
        return ngachCongChucId;
    }

    public void setNgachCongChucId(Long ngachCongChucId) {
        this.ngachCongChucId = ngachCongChucId;
    }

    public Long getBacLuongId() {
        return bacLuongId;
    }

    public void setBacLuongId(Long bacLuongId) {
        this.bacLuongId = bacLuongId;
    }

    public Date getTuNgayBacLuong() {
        return tuNgayBacLuong;
    }

    public void setTuNgayBacLuong(Date tuNgayBacLuong) {
        this.tuNgayBacLuong = tuNgayBacLuong;
    }

    public String getDanhHieuDuocPhong() {
        return danhHieuDuocPhong;
    }

    public void setDanhHieuDuocPhong(String danhHieuDuocPhong) {
        this.danhHieuDuocPhong = danhHieuDuocPhong;
    }

    public String getSoTruongCongTac() {
        return soTruongCongTac;
    }

    public void setSoTruongCongTac(String soTruongCongTac) {
        this.soTruongCongTac = soTruongCongTac;
    }

    public String getCongViecLamLauNhat() {
        return congViecLamLauNhat;
    }

    public void setCongViecLamLauNhat(String congViecLamLauNhat) {
        this.congViecLamLauNhat = congViecLamLauNhat;
    }

    public String getTinhTrangSucKhoe() {
        return tinhTrangSucKhoe;
    }

    public void setTinhTrangSucKhoe(String tinhTrangSucKhoe) {
        this.tinhTrangSucKhoe = tinhTrangSucKhoe;
    }

    public String getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(String chieuCao) {
        this.chieuCao = chieuCao;
    }

    public String getCanNang() {
        return canNang;
    }

    public void setCanNang(String canNang) {
        this.canNang = canNang;
    }

    public String getNhomMau() {
        return nhomMau;
    }

    public void setNhomMau(String nhomMau) {
        this.nhomMau = nhomMau;
    }

    public String getSoCmnd() {
        return soCmnd;
    }

    public void setSoCmnd(String soCmnd) {
        this.soCmnd = soCmnd;
    }

    public Long getThuongBinhLoaiId() {
        return thuongBinhLoaiId;
    }

    public void setThuongBinhLoaiId(Long thuongBinhLoaiId) {
        this.thuongBinhLoaiId = thuongBinhLoaiId;
    }

    public Long getGiaDinhLietSi() {
        return giaDinhLietSi;
    }

    public void setGiaDinhLietSi(Long giaDinhLietSi) {
        this.giaDinhLietSi = giaDinhLietSi;
    }

    public String getDacDiemLichSuA() {
        return dacDiemLichSuA;
    }

    public void setDacDiemLichSuA(String dacDiemLichSuA) {
        this.dacDiemLichSuA = dacDiemLichSuA;
    }

    public String getDacDiemLichSuB() {
        return dacDiemLichSuB;
    }

    public void setDacDiemLichSuB(String dacDiemLichSuB) {
        this.dacDiemLichSuB = dacDiemLichSuB;
    }

    public String getQuanHeNuocNgoaiA() {
        return quanHeNuocNgoaiA;
    }

    public void setQuanHeNuocNgoaiA(String quanHeNuocNgoaiA) {
        this.quanHeNuocNgoaiA = quanHeNuocNgoaiA;
    }

    public String getQuanHeNuocNgoaiB() {
        return quanHeNuocNgoaiB;
    }

    public void setQuanHeNuocNgoaiB(String quanHeNuocNgoaiB) {
        this.quanHeNuocNgoaiB = quanHeNuocNgoaiB;
    }

    public Long getGdLuong() {
        return gdLuong;
    }

    public void setGdLuong(Long gdLuong) {
        this.gdLuong = gdLuong;
    }

    public Long getGdNguonKhac() {
        return gdNguonKhac;
    }

    public void setGdNguonKhac(Long gdNguonKhac) {
        this.gdNguonKhac = gdNguonKhac;
    }

    public String getGdNhaOCapThue() {
        return gdNhaOCapThue;
    }

    public void setGdNhaOCapThue(String gdNhaOCapThue) {
        this.gdNhaOCapThue = gdNhaOCapThue;
    }

    public Long getGdNhaOCapThueDt() {
        return gdNhaOCapThueDt;
    }

    public void setGdNhaOCapThueDt(Long gdNhaOCapThueDt) {
        this.gdNhaOCapThueDt = gdNhaOCapThueDt;
    }

    public String getGdNhaOMua() {
        return gdNhaOMua;
    }

    public void setGdNhaOMua(String gdNhaOMua) {
        this.gdNhaOMua = gdNhaOMua;
    }

    public String getGdNhaOMuaDt() {
        return gdNhaOMuaDt;
    }

    public void setGdNhaOMuaDt(String gdNhaOMuaDt) {
        this.gdNhaOMuaDt = gdNhaOMuaDt;
    }

    public Long getGdDatOCap() {
        return gdDatOCap;
    }

    public void setGdDatOCap(Long gdDatOCap) {
        this.gdDatOCap = gdDatOCap;
    }

    public Long getGdDatOMua() {
        return gdDatOMua;
    }

    public void setGdDatOMua(Long gdDatOMua) {
        this.gdDatOMua = gdDatOMua;
    }

    public Long getGdDatSanXuat() {
        return gdDatSanXuat;
    }

    public void setGdDatSanXuat(Long gdDatSanXuat) {
        this.gdDatSanXuat = gdDatSanXuat;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getSoBaoHiem() {
        return soBaoHiem;
    }

    public void setSoBaoHiem(String soBaoHiem) {
        this.soBaoHiem = soBaoHiem;
    }

    public Date getNgayCapSoBh() {
        return ngayCapSoBh;
    }

    public void setNgayCapSoBh(Date ngayCapSoBh) {
        this.ngayCapSoBh = ngayCapSoBh;
    }

    public String getNoiCapSoBh() {
        return noiCapSoBh;
    }

    public void setNoiCapSoBh(String noiCapSoBh) {
        this.noiCapSoBh = noiCapSoBh;
    }

    public String getTkNganHang() {
        return tkNganHang;
    }

    public void setTkNganHang(String tkNganHang) {
        this.tkNganHang = tkNganHang;
    }

    public String getNganHang() {
        return nganHang;
    }

    public void setNganHang(String nganHang) {
        this.nganHang = nganHang;
    }

    public Date getNgayBienChe() {
        return ngayBienChe;
    }

    public void setNgayBienChe(Date ngayBienChe) {
        this.ngayBienChe = ngayBienChe;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public String getCapUyHienTai() {
        return capUyHienTai;
    }

    public void setCapUyHienTai(String capUyHienTai) {
        this.capUyHienTai = capUyHienTai;
    }

    public String getCapUyKiem() {
        return capUyKiem;
    }

    public void setCapUyKiem(String capUyKiem) {
        this.capUyKiem = capUyKiem;
    }

    public Long getGdTongDienTich() {
        return gdTongDienTich;
    }

    public void setGdTongDienTich(Long gdTongDienTich) {
        this.gdTongDienTich = gdTongDienTich;
    }

    public Long getHeSoNgachBac() {
        return heSoNgachBac;
    }

    public void setHeSoNgachBac(Long heSoNgachBac) {
        this.heSoNgachBac = heSoNgachBac;
    }

    public Long getPcTnvk() {
        return pcTnvk;
    }

    public void setPcTnvk(Long pcTnvk) {
        this.pcTnvk = pcTnvk;
    }

    public Long getPcCv() {
        return pcCv;
    }

    public void setPcCv(Long pcCv) {
        this.pcCv = pcCv;
    }

    public Long getPcTn() {
        return pcTn;
    }

    public void setPcTn(Long pcTn) {
        this.pcTn = pcTn;
    }

    public Long getHsBaoLuu() {
        return hsBaoLuu;
    }

    public void setHsBaoLuu(Long hsBaoLuu) {
        this.hsBaoLuu = hsBaoLuu;
    }

    public String getSoPhieuKcb() {
        return soPhieuKcb;
    }

    public void setSoPhieuKcb(String soPhieuKcb) {
        this.soPhieuKcb = soPhieuKcb;
    }

    public String getNoiDangKyKcb() {
        return noiDangKyKcb;
    }

    public void setNoiDangKyKcb(String noiDangKyKcb) {
        this.noiDangKyKcb = noiDangKyKcb;
    }

    public Long getTinHocId() {
        return tinHocId;
    }

    public void setTinHocId(Long tinHocId) {
        this.tinHocId = tinHocId;
    }

    public Long getQlNhaNuocId() {
        return qlNhaNuocId;
    }

    public void setQlNhaNuocId(Long qlNhaNuocId) {
        this.qlNhaNuocId = qlNhaNuocId;
    }

    public Long getTinhThanhNsId() {
        return tinhThanhNsId;
    }

    public void setTinhThanhNsId(Long tinhThanhNsId) {
        this.tinhThanhNsId = tinhThanhNsId;
    }

    public Long getQuanHuyenNsId() {
        return quanHuyenNsId;
    }

    public void setQuanHuyenNsId(Long quanHuyenNsId) {
        this.quanHuyenNsId = quanHuyenNsId;
    }

    public Long getXaPhuongNsId() {
        return xaPhuongNsId;
    }

    public void setXaPhuongNsId(Long xaPhuongNsId) {
        this.xaPhuongNsId = xaPhuongNsId;
    }

    public String getNoiDkHktt() {
        return noiDkHktt;
    }

    public void setNoiDkHktt(String noiDkHktt) {
        this.noiDkHktt = noiDkHktt;
    }

    public Long getDoiTuongChinhSachId() {
        return doiTuongChinhSachId;
    }

    public void setDoiTuongChinhSachId(Long doiTuongChinhSachId) {
        this.doiTuongChinhSachId = doiTuongChinhSachId;
    }

    public Date getNgayThamGiaCongTac() {
        return ngayThamGiaCongTac;
    }

    public void setNgayThamGiaCongTac(Date ngayThamGiaCongTac) {
        this.ngayThamGiaCongTac = ngayThamGiaCongTac;
    }

    public Date getNgayDongBhxh() {
        return ngayDongBhxh;
    }

    public void setNgayDongBhxh(Date ngayDongBhxh) {
        this.ngayDongBhxh = ngayDongBhxh;
    }

    public Date getNgayVaoNganhTc() {
        return ngayVaoNganhTc;
    }

    public void setNgayVaoNganhTc(Date ngayVaoNganhTc) {
        this.ngayVaoNganhTc = ngayVaoNganhTc;
    }

    public Long getChucVuQuyHoachId() {
        return chucVuQuyHoachId;
    }

    public void setChucVuQuyHoachId(Long chucVuQuyHoachId) {
        this.chucVuQuyHoachId = chucVuQuyHoachId;
    }

    public Date getNgayQuyHoach() {
        return ngayQuyHoach;
    }

    public void setNgayQuyHoach(Date ngayQuyHoach) {
        this.ngayQuyHoach = ngayQuyHoach;
    }

    public Long getCapQuyHoachId() {
        return capQuyHoachId;
    }

    public void setCapQuyHoachId(Long capQuyHoachId) {
        this.capQuyHoachId = capQuyHoachId;
    }

    public Date getNgayCapCmnd() {
        return ngayCapCmnd;
    }

    public void setNgayCapCmnd(Date ngayCapCmnd) {
        this.ngayCapCmnd = ngayCapCmnd;
    }

    public String getNhanXetDanhGia() {
        return nhanXetDanhGia;
    }

    public void setNhanXetDanhGia(String nhanXetDanhGia) {
        this.nhanXetDanhGia = nhanXetDanhGia;
    }

    public String getKhenThuong() {
        return khenThuong;
    }

    public void setKhenThuong(String khenThuong) {
        this.khenThuong = khenThuong;
    }

    public String getKyLuat() {
        return kyLuat;
    }

    public void setKyLuat(String kyLuat) {
        this.kyLuat = kyLuat;
    }

    public Long getDaCoSoBhxh() {
        return daCoSoBhxh;
    }

    public void setDaCoSoBhxh(Long daCoSoBhxh) {
        this.daCoSoBhxh = daCoSoBhxh;
    }

    public Long getDaTraSoBhxh() {
        return daTraSoBhxh;
    }

    public void setDaTraSoBhxh(Long daTraSoBhxh) {
        this.daTraSoBhxh = daTraSoBhxh;
    }

    public Date getNgayTraSoBhxh() {
        return ngayTraSoBhxh;
    }

    public void setNgayTraSoBhxh(Date ngayTraSoBhxh) {
        this.ngayTraSoBhxh = ngayTraSoBhxh;
    }

    public Long getPhanTramHuongLuong() {
        return phanTramHuongLuong;
    }

    public void setPhanTramHuongLuong(Long phanTramHuongLuong) {
        this.phanTramHuongLuong = phanTramHuongLuong;
    }

    public Long getQuocGiaId() {
        return quocGiaId;
    }

    public void setQuocGiaId(Long quocGiaId) {
        this.quocGiaId = quocGiaId;
    }

    public String getNoiCapCmnd() {
        return noiCapCmnd;
    }

    public void setNoiCapCmnd(String noiCapCmnd) {
        this.noiCapCmnd = noiCapCmnd;
    }

    public String getDienThoaiCoDinh() {
        return dienThoaiCoDinh;
    }

    public void setDienThoaiCoDinh(String dienThoaiCoDinh) {
        this.dienThoaiCoDinh = dienThoaiCoDinh;
    }

    public String getQuyetDinhTdHd() {
        return quyetDinhTdHd;
    }

    public void setQuyetDinhTdHd(String quyetDinhTdHd) {
        this.quyetDinhTdHd = quyetDinhTdHd;
    }

    public String getSoTheBhyt() {
        return soTheBhyt;
    }

    public void setSoTheBhyt(String soTheBhyt) {
        this.soTheBhyt = soTheBhyt;
    }

    public String getTinhThanhQq() {
        return tinhThanhQq;
    }

    public void setTinhThanhQq(String tinhThanhQq) {
        this.tinhThanhQq = tinhThanhQq;
    }

    public String getQuanHuyenQq() {
        return quanHuyenQq;
    }

    public void setQuanHuyenQq(String quanHuyenQq) {
        this.quanHuyenQq = quanHuyenQq;
    }

    public String getXaPhuongQq() {
        return xaPhuongQq;
    }

    public void setXaPhuongQq(String xaPhuongQq) {
        this.xaPhuongQq = xaPhuongQq;
    }

    public String getTinhThanhNs() {
        return tinhThanhNs;
    }

    public void setTinhThanhNs(String tinhThanhNs) {
        this.tinhThanhNs = tinhThanhNs;
    }

    public String getQuanHuyenNs() {
        return quanHuyenNs;
    }

    public void setQuanHuyenNs(String quanHuyenNs) {
        this.quanHuyenNs = quanHuyenNs;
    }

    public String getXaPhuongNs() {
        return xaPhuongNs;
    }

    public void setXaPhuongNs(String xaPhuongNs) {
        this.xaPhuongNs = xaPhuongNs;
    }

    public Long getChuyenNganhId() {
        return chuyenNganhId;
    }

    public void setChuyenNganhId(Long chuyenNganhId) {
        this.chuyenNganhId = chuyenNganhId;
    }

    public Long getLoaiNgayTuyenDung() {
        return loaiNgayTuyenDung;
    }

    public void setLoaiNgayTuyenDung(Long loaiNgayTuyenDung) {
        this.loaiNgayTuyenDung = loaiNgayTuyenDung;
    }

    public String getNgayDuocTuyenThangNam() {
        return ngayDuocTuyenThangNam;
    }

    public void setNgayDuocTuyenThangNam(String ngayDuocTuyenThangNam) {
        this.ngayDuocTuyenThangNam = ngayDuocTuyenThangNam;
    }

    public Long getLoaiNgayHuongLuong() {
        return loaiNgayHuongLuong;
    }

    public void setLoaiNgayHuongLuong(Long loaiNgayHuongLuong) {
        this.loaiNgayHuongLuong = loaiNgayHuongLuong;
    }

    public String getNgayHuongLuongThangNam() {
        return ngayHuongLuongThangNam;
    }

    public void setNgayHuongLuongThangNam(String ngayHuongLuongThangNam) {
        this.ngayHuongLuongThangNam = ngayHuongLuongThangNam;
    }

    public Long getLoaiNgayNhapNgu() {
        return loaiNgayNhapNgu;
    }

    public void setLoaiNgayNhapNgu(Long loaiNgayNhapNgu) {
        this.loaiNgayNhapNgu = loaiNgayNhapNgu;
    }

    public String getNgayNhapNguThangNam() {
        return ngayNhapNguThangNam;
    }

    public void setNgayNhapNguThangNam(String ngayNhapNguThangNam) {
        this.ngayNhapNguThangNam = ngayNhapNguThangNam;
    }

    public Long getLoaiNgayXuatNgu() {
        return loaiNgayXuatNgu;
    }

    public void setLoaiNgayXuatNgu(Long loaiNgayXuatNgu) {
        this.loaiNgayXuatNgu = loaiNgayXuatNgu;
    }

    public String getNgayXuatNguThangNam() {
        return ngayXuatNguThangNam;
    }

    public void setNgayXuatNguThangNam(String ngayXuatNguThangNam) {
        this.ngayXuatNguThangNam = ngayXuatNguThangNam;
    }

    public Long getChungChiDanToc() {
        return chungChiDanToc;
    }

    public void setChungChiDanToc(Long chungChiDanToc) {
        this.chungChiDanToc = chungChiDanToc;
    }

    public Long getTinhThanhQqId() {
        return tinhThanhQqId;
    }

    public void setTinhThanhQqId(Long tinhThanhQqId) {
        this.tinhThanhQqId = tinhThanhQqId;
    }

    public Long getQuanHuyenQqId() {
        return quanHuyenQqId;
    }

    public void setQuanHuyenQqId(Long quanHuyenQqId) {
        this.quanHuyenQqId = quanHuyenQqId;
    }

    public Long getXaPhuongQqId() {
        return xaPhuongQqId;
    }

    public void setXaPhuongQqId(Long xaPhuongQqId) {
        this.xaPhuongQqId = xaPhuongQqId;
    }

    public String getChucVuTruocTuyen() {
        return chucVuTruocTuyen;
    }

    public void setChucVuTruocTuyen(String chucVuTruocTuyen) {
        this.chucVuTruocTuyen = chucVuTruocTuyen;
    }

    public String getLyDoKbn() {
        return lyDoKbn;
    }

    public void setLyDoKbn(String lyDoKbn) {
        this.lyDoKbn = lyDoKbn;
    }

    public Date getNgayThangKbn() {
        return ngayThangKbn;
    }

    public void setNgayThangKbn(Date ngayThangKbn) {
        this.ngayThangKbn = ngayThangKbn;
    }

    public Long getViTriVlamId() {
        return viTriVlamId;
    }

    public void setViTriVlamId(Long viTriVlamId) {
        this.viTriVlamId = viTriVlamId;
    }

    public Long getLamCmnvu() {
        return lamCmnvu;
    }

    public void setLamCmnvu(Long lamCmnvu) {
        this.lamCmnvu = lamCmnvu;
    }

    public Long getChungChiKtt() {
        return chungChiKtt;
    }

    public void setChungChiKtt(Long chungChiKtt) {
        this.chungChiKtt = chungChiKtt;
    }

    public Long getBnQh() {
        return bnQh;
    }

    public void setBnQh(Long bnQh) {
        this.bnQh = bnQh;
    }

    public Long getPheDuyet() {
        return pheDuyet;
    }

    public void setPheDuyet(Long pheDuyet) {
        this.pheDuyet = pheDuyet;
    }

    public Date getNgayBoNhiem() {
        return ngayBoNhiem;
    }

    public void setNgayBoNhiem(Date ngayBoNhiem) {
        this.ngayBoNhiem = ngayBoNhiem;
    }

    public Date getNgayBoNhiemLai() {
        return ngayBoNhiemLai;
    }

    public void setNgayBoNhiemLai(Date ngayBoNhiemLai) {
        this.ngayBoNhiemLai = ngayBoNhiemLai;
    }

    public Long getNamTotNghiep() {
        return namTotNghiep;
    }

    public void setNamTotNghiep(Long namTotNghiep) {
        this.namTotNghiep = namTotNghiep;
    }

    public String getTruongDaoTao() {
        return truongDaoTao;
    }

    public void setTruongDaoTao(String truongDaoTao) {
        this.truongDaoTao = truongDaoTao;
    }

    public Long getLuongHd() {
        return luongHd;
    }

    public void setLuongHd(Long luongHd) {
        this.luongHd = luongHd;
    }

    public Long getDmViTriViecLamId() {
        return dmViTriViecLamId;
    }

    public void setDmViTriViecLamId(Long dmViTriViecLamId) {
        this.dmViTriViecLamId = dmViTriViecLamId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNgayNhanChucVuHt() {
        return ngayNhanChucVuHt;
    }

    public void setNgayNhanChucVuHt(Date ngayNhanChucVuHt) {
        this.ngayNhanChucVuHt = ngayNhanChucVuHt;
    }

    public Long getTinhTrangHonNhan() {
        return tinhTrangHonNhan;
    }

    public void setTinhTrangHonNhan(Long tinhTrangHonNhan) {
        this.tinhTrangHonNhan = tinhTrangHonNhan;
    }

    public String getThanhPhanGiaDinhId() {
        return thanhPhanGiaDinhId;
    }

    public void setThanhPhanGiaDinhId(String thanhPhanGiaDinhId) {
        this.thanhPhanGiaDinhId = thanhPhanGiaDinhId;
    }

    public String getDtCoQuan() {
        return dtCoQuan;
    }

    public void setDtCoQuan(String dtCoQuan) {
        this.dtCoQuan = dtCoQuan;
    }

    public String getEmailCoQuan() {
        return emailCoQuan;
    }

    public void setEmailCoQuan(String emailCoQuan) {
        this.emailCoQuan = emailCoQuan;
    }

    public String getDiaChiLamViec() {
        return diaChiLamViec;
    }

    public void setDiaChiLamViec(String diaChiLamViec) {
        this.diaChiLamViec = diaChiLamViec;
    }

    public String getMaStCaNhan() {
        return maStCaNhan;
    }

    public void setMaStCaNhan(String maStCaNhan) {
        this.maStCaNhan = maStCaNhan;
    }

    public String getVanbangCc() {
        return vanbangCc;
    }

    public void setVanbangCc(String vanbangCc) {
        this.vanbangCc = vanbangCc;
    }

    public Long getHeDaoTaoId() {
        return heDaoTaoId;
    }

    public void setHeDaoTaoId(Long heDaoTaoId) {
        this.heDaoTaoId = heDaoTaoId;
    }

    public Long getHsVuotKhung() {
        return hsVuotKhung;
    }

    public void setHsVuotKhung(Long hsVuotKhung) {
        this.hsVuotKhung = hsVuotKhung;
    }

    public Date getNgayNhanNgach() {
        return ngayNhanNgach;
    }

    public void setNgayNhanNgach(Date ngayNhanNgach) {
        this.ngayNhanNgach = ngayNhanNgach;
    }

    public String getMaNgach() {
        return maNgach;
    }

    public void setMaNgach(String maNgach) {
        this.maNgach = maNgach;
    }

    public String getXepLoaiTotNghiep() {
        return xepLoaiTotNghiep;
    }

    public void setXepLoaiTotNghiep(String xepLoaiTotNghiep) {
        this.xepLoaiTotNghiep = xepLoaiTotNghiep;
    }

    public Long getQuocGiaCapBang() {
        return quocGiaCapBang;
    }

    public void setQuocGiaCapBang(Long quocGiaCapBang) {
        this.quocGiaCapBang = quocGiaCapBang;
    }

    public Long getChucVuDangId() {
        return chucVuDangId;
    }

    public void setChucVuDangId(Long chucVuDangId) {
        this.chucVuDangId = chucVuDangId;
    }

    public Long getPhuCapDang() {
        return phuCapDang;
    }

    public void setPhuCapDang(Long phuCapDang) {
        this.phuCapDang = phuCapDang;
    }

    public Long getNamBaoLuuNgayPhep() {
        return namBaoLuuNgayPhep;
    }

    public void setNamBaoLuuNgayPhep(Long namBaoLuuNgayPhep) {
        this.namBaoLuuNgayPhep = namBaoLuuNgayPhep;
    }
}
