package com.soap.qlcb.endpoint.core.service;


import com.soap.qlcb.endpoint.controller.results.ResultDmDonViSort;
import com.soap.qlcb.endpoint.core.drive.oracle.ConnectOracleServer;
import oracle.jdbc.OracleTypes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 * @author anhbt 5/9/2018
 * com.soap.demo.endpoint.core.implemented
 */
public class ReadDanhMuc {
    static Logger log = LogManager.getLogger(ReadDanhMuc.class.getName());

    public List<ResultDmDonViSort>getDmDonViSortByProcedure(long id,String search){
        try {
            List<ResultDmDonViSort>list=new ArrayList<>();
            String get_dm_don_viVSA = "{call dm_don_vi_qltb_sort(:p_id,:p_search,:p_recordset)}";
            CallableStatement callableStatement = null;
            ResultSet rs = null;
            Connection connection = ConnectOracleServer.getConnectionOracleQLCB();
            callableStatement = connection.prepareCall(get_dm_don_viVSA);
            callableStatement.setLong("p_id", id);
            callableStatement.setObject("p_search", search);
            callableStatement.registerOutParameter("p_recordset", OracleTypes.CURSOR);
            callableStatement.executeUpdate();
            rs = (ResultSet) callableStatement.getObject("p_recordset");
            ResultDmDonViSort resultDmDonViSort;
            while (rs.next()) {
                resultDmDonViSort = new ResultDmDonViSort();
                if (rs.getString("id") != null) {
                    resultDmDonViSort.setId(rs.getLong("id"));
                }
                if (rs.getString("ma_don_vi") != null) {
                    resultDmDonViSort.setMaDonVi(rs.getString("ma_don_vi"));
                }
                if (rs.getString("ten_tieng_viet") != null) {
                    resultDmDonViSort.setTenTiengViet(rs.getString("ten_tieng_viet"));
                }
                if (rs.getString("tinh_thanh_id") != null) {
                    resultDmDonViSort.setTinhThanhId(rs.getLong("tinh_thanh_id"));
                }
//                if (rs.getString("ten_tinh_thanh") != null) {
//                    resultDmDonViSort.setTenTinhThanh(rs.getString("ten_tinh_thanh"));
//                }
                if (rs.getString("dia_chi") != null) {
                    resultDmDonViSort.setDiaChi(rs.getString("dia_chi"));
                }
                if (rs.getString("donvi_cha_id") != null) {
                    resultDmDonViSort.setDonViChaId(rs.getLong("donvi_cha_id"));
                }
                if (rs.getString("cap_don_vi") != null) {
                    resultDmDonViSort.setCapDonVi(rs.getLong("cap_don_vi"));
                }
                list.add(resultDmDonViSort);
            }
            if (callableStatement != null) {
                callableStatement.close();
            }
            if (rs != null) {
                rs.close();
            }
            connection.close();
            return list;
        } catch (SQLException e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }
//    public List<DanhMucPhongBan> getDmPhongBan() throws SQLException {
//        List<DanhMucPhongBan> danhMucPhongBans = new ArrayList<>();
//        Statement stmt = null;
//        Connection connection = ConnectOracleServer.getConnectionOracleQLCB();
//        String query = "Select * from DM_PHONG_BAN";
//        DanhMucPhongBan temp;
//        try {
//            stmt = connection.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                temp = new DanhMucPhongBan();
//                temp.setId(rs.getInt(ColumnConfig.DEFAULT_DM_PHONG_BAN_ID));
//                temp.setDonViId(rs.getInt(ColumnConfig.DEFAULT_DM_PHONG_BAN_DON_VI_ID));
//                temp.setLaBanGd(rs.getInt(ColumnConfig.DEFAULT_DM_PHONG_BAN_LA_BAN_GD));
//                temp.setLastUpdate(rs.getDate(ColumnConfig.DEFAULT_DM_PHONG_BAN_LAST_UPDATE));
//                temp.setMaPhongBan(rs.getString(ColumnConfig.DEFAULT_DM_PHONG_BAN_MA_PHONG_BAN));
//                temp.setMoTa(rs.getString(ColumnConfig.DEFAULT_DM_PHONG_BAN_MO_TA));
//                temp.setPhoPhong(rs.getObject(ColumnConfig.DEFAULT_DM_PHONG_BAN_PHO_PHONG) != null ? rs.getInt(ColumnConfig.DEFAULT_DM_PHONG_BAN_PHO_PHONG) : null);
//                temp.setSoLuongCanBo(rs.getInt(ColumnConfig.DEFAULT_DM_PHONG_BAN_SO_LUONG_CAN_BO));
//                temp.setTenPhongBan(rs.getString(ColumnConfig.DEFAULT_DM_PHONG_BAN_TEN_PHONG_BAN));
//                temp.setTruongPhong(rs.getInt(ColumnConfig.DEFAULT_DM_PHONG_BAN_TRUONG_PHONG));
//                danhMucPhongBans.add(temp);
//            }
//            return danhMucPhongBans;
//        } catch (SQLException e) {
//            log.error(e.getMessage());
//        } finally {
//            if (stmt != null) {
//                stmt.close();
//                connection.close();
//            }
//
//        }
//        return null;
//    }
//
//    public List<DanhMucTinhThanh> getDmTinhThanh() throws SQLException {
//        List<DanhMucTinhThanh> danhMucTinhThanhs = new ArrayList<>();
//        Statement stmt = null;
//        Connection connection = ConnectOracleServer.getConnectionOracleQLCB();
//        String query = "Select * from DM_TINH_THANH";
//        log.info("Query: " + query);
//        DanhMucTinhThanh temp;
//        try {
//            stmt = connection.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                temp = new DanhMucTinhThanh();
//                temp.setId(rs.getInt(ColumnConfig.DEFAULT_DM_TINH_THANH_ID));
//                temp.setMaTinhThanh(rs.getString(ColumnConfig.DEFAULT_DM_TINH_THANH_MA_TINH_THANH));
//                temp.setTenTinhThanh(rs.getString(ColumnConfig.DEFAULT_DM_TINH_THANH_TEN_TINH_THANH));
//                temp.setLastUpdate(rs.getDate(ColumnConfig.DEFAULT_DM_TINH_THANH_LAST_UPDATE));
//                danhMucTinhThanhs.add(temp);
//            }
//            return danhMucTinhThanhs;
//        } catch (SQLException e) {
//            log.error(e.getMessage());
//        } finally {
//            if (stmt != null) {
//                stmt.close();
//                connection.close();
//            }
//
//        }
//        return null;
//    }
//
//
//    public List<DanhMucQuanHuyen> getDmQuanHuyen() throws SQLException {
//        List<DanhMucQuanHuyen> danhMucQuanHuyens = new ArrayList<>();
//        Statement stmt = null;
//        Connection connection = ConnectOracleServer.getConnectionOracleQLCB();
//        String query = "Select * from DM_QUAN_HUYEN";
//        log.info("Query: " + query);
//        DanhMucQuanHuyen temp;
//        try {
//            stmt = connection.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                temp = new DanhMucQuanHuyen();
//                temp.setId(rs.getString(ColumnConfig.DEFAULT_DM_QUAN_HUYEN_ID));
//                temp.setMaQuanHuyen(rs.getString(ColumnConfig.DEFAULT_DM_QUAN_HUYEN_MA_QUAN_HUYEN));
//                temp.setTenQuanHuyen(rs.getString(ColumnConfig.DEFAULT_DM_QUAN_HUYEN_TEN_QUAN_HUYEN));
//                temp.setTinhThanhId(rs.getString(ColumnConfig.DEFAULT_DM_QUAN_HUYEN_TINH_THANH_ID));
//                temp.setLastUpdate(rs.getDate(ColumnConfig.DEFAULT_DM_QUAN_HUYEN_LAST_UPDATE));
//                danhMucQuanHuyens.add(temp);
//            }
//            return danhMucQuanHuyens;
//        } catch (SQLException e) {
//            log.error(e.getMessage());
//        } finally {
//            if (stmt != null) {
//                stmt.close();
//                connection.close();
//            }
//
//        }
//        return null;
//    }
//
//    public List<DanhMucDonVi> getDmDonVi() throws SQLException {
//        List<DanhMucDonVi> danhMucDonVis = new ArrayList<>();
//        Statement stmt = null;
//        Connection connection = ConnectOracleServer.getConnectionOracleQLCB();
//        String query = "Select * from DM_DON_VI";
//        log.info("Query: " + query);
//        DanhMucDonVi temp;
//        try {
//            stmt = connection.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                temp = new DanhMucDonVi();
//                temp.setId(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_ID));
//                temp.setTenTiengViet(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_TEN_TIENG_VIET));
//                temp.setTenTiengAnh(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_TEN_TIENG_ANH));
//                temp.setTenVietTat(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_TEN_VIET_TAT));
//                temp.setTinhThanhId(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_TINH_THANH_ID));
//                temp.setDiaChi(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_DIA_CHI));
//                temp.setDienThoai(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_DIEN_THOAI));
//                temp.setEmail(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_EMAIL));
//                temp.setFax(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_FAX));
//                temp.setMaSoThue(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_MA_SO_THUE));
//                temp.setDbName(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_DB_NAME));
//                temp.setLastUpdate(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_LAST_UPDATE));
//                temp.setMaDonVi(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_MA_DON_VI));
//                temp.setDonviChaId(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_DONVI_CHA_ID));
//                temp.setCapDonVi(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_CAP_DON_VI));
//                temp.setLoaiHinh(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_LOAI_HINH));
//                temp.setMaKcb(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_MA_KCB));
//                temp.setSoTaiKhoan(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_SO_TAI_KHOAN));
//                temp.setNganHang(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_NGAN_HANG));
//                temp.setLoaiHinhDonVi(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_LOAI_HINH_DON_VI));
//                temp.setSlDiemKho(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_SL_DIEM_KHO));
//                temp.setCoQuanTongCuc(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_CO_QUAN_TONG_CUC));
//                temp.setXaPhuongId(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_XA_PHUONG_ID));
//                temp.setSttCap(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_STT_CAP));
//                temp.setPcKhuVuc(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_PC_KHU_VUC));
//
//                danhMucDonVis.add(temp);
//            }
//            return danhMucDonVis;
//        } catch (SQLException e) {
//            log.error(e.getMessage());
//        } finally {
//            if (stmt != null) {
//                stmt.close();
//                connection.close();
//            }
//
//        }
//        return null;
//    }
//
//    public List<DanhMucDonViQltb> getDmDonViQltb() throws SQLException {
//        List<DanhMucDonViQltb> danhMucDonViQltbs = new ArrayList<>();
//        Statement stmt = null;
//        Connection connection = ConnectOracleServer.getConnectionOracleQLCB();
//        String query = "Select a." + ColumnConfig.DEFAULT_DM_DON_VI_MA_DON_VI + ",a." + ColumnConfig.DEFAULT_DM_DON_VI_TEN_TIENG_VIET + ",a." + ColumnConfig.DEFAULT_DM_DON_VI_DIA_CHI + ",a." + ColumnConfig.DEFAULT_DM_DON_VI_LOAI_HINH + ",a." + ColumnConfig.DEFAULT_DM_DON_VI_LOAI_HINH_DON_VI
//                + ",b." + ColumnConfig.DEFAULT_DM_TINH_THANH_TEN_TINH_THANH + " from DM_DON_VI a LEFT JOIN DM_TINH_THANH b ON a.TINH_THANH_ID = b.ID";
//        log.info("Query: " + query);
//        DanhMucDonViQltb temp;
//        try {
//            stmt = connection.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                temp = new DanhMucDonViQltb();
//                temp.setDiaChi(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_DIA_CHI));
//                temp.setMaDonVi(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_MA_DON_VI));
//                temp.setLoaiHinh(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_LOAI_HINH));
//                temp.setLoaiHinhDonVi(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_LOAI_HINH_DON_VI));
//                temp.setTinhThanh(rs.getString(ColumnConfig.DEFAULT_DM_TINH_THANH_TEN_TINH_THANH));
//                danhMucDonViQltbs.add(temp);
//            }
//            return danhMucDonViQltbs;
//        } catch (SQLException e) {
//            log.error(e.getMessage());
//        } finally {
//            if (stmt != null) {
//                stmt.close();
//                connection.close();
//            }
//
//        }
//        return null;
//    }
//
//    /**
//     * @return
//     * @throws SQLException
//     */
//    public List<DanhMucChucVu> getDmChucVu() throws SQLException {
//        List<DanhMucChucVu> danhMucChucVus = new ArrayList<>();
//        Statement stmt = null;
//        Connection connection = ConnectOracleServer.getConnectionOracleQLCB();
//        String query = "Select " + ColumnConfig.DEFAULT_DM_CHUC_VU_TEN_CHUC_VU + "," + ColumnConfig.DEFAULT_DM_CHUC_VU_CAP_TRUONG + "," + ColumnConfig.DEFAULT_DM_CHUC_VU_HS_PHU_CAP + "," + ColumnConfig.DEFAULT_DM_CHUC_VU_MA_CHUC_VU
//                + " from DM_CHUC_VU";
//        log.info("Query: " + query);
//        DanhMucChucVu temp;
//        try {
//            stmt = connection.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                temp = new DanhMucChucVu();
//                temp.setMaChucVu(rs.getString(ColumnConfig.DEFAULT_DM_CHUC_VU_MA_CHUC_VU));
//                temp.setTenChucVu(rs.getString(ColumnConfig.DEFAULT_DM_CHUC_VU_TEN_CHUC_VU));
//                temp.setCapTruong(rs.getString(ColumnConfig.DEFAULT_DM_CHUC_VU_CAP_TRUONG));
//                temp.setHsPhuCap(rs.getString(ColumnConfig.DEFAULT_DM_CHUC_VU_HS_PHU_CAP));
//                danhMucChucVus.add(temp);
//            }
//            return danhMucChucVus;
//        } catch (SQLException e) {
//            log.error(e.getMessage());
//        } finally {
//            if (stmt != null) {
//                stmt.close();
//                connection.close();
//            }
//
//        }
//        return null;
//    }
//
//    public List<DmDonViCungCap> getDmDonViCungCap() throws SQLException {
//        List<DmDonViCungCap> dmDonViCungCaps = new ArrayList<>();
//        Statement stmt = null;
//        Connection connection = ConnectOracleServer.getConnectionOracleQLTB();
//        String query = "Select " + ColumnConfig.DEFAULT_DM_DON_VI_CUNGCAP_MA_DON_VI + "," + ColumnConfig.DEFAULT_DM_DON_VI_CUNGCAP_DIA_CHI + "," + ColumnConfig.DEFAULT_DM_DON_VI_CUNGCAP_MO_TA + "," + ColumnConfig.DEFAULT_DM_DON_VI_CUNGCAP_TEN_DON_VI
//                + "," + ColumnConfig.DEFAULT_DM_DON_VI_CUNGCAP_SDT + "," + ColumnConfig.DEFAULT_DM_DON_VI_CUNGCAP_NGAY_CAP_NHAT + "," + ColumnConfig.DEFAULT_DM_DON_VI_CUNGCAP_NGUOI_CAP_NHAT + "," + ColumnConfig.DEFAULT_DM_DON_VI_CUNGCAP_NGAY_TAO + "," + ColumnConfig.DEFAULT_DM_DON_VI_CUNGCAP_NGUOI_TAO
//                + " from " + ColumnConfig.DEFAULT_DM_DON_VI_CUNGCAP_TABLE_NAME;
//        log.info("Query: " + query);
//        DmDonViCungCap temp;
//        try {
//            stmt = connection.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                temp = new DmDonViCungCap();
//                temp.setMaDonVi(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_CUNGCAP_MA_DON_VI));
//                temp.setDiaChi(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_CUNGCAP_DIA_CHI));
//                temp.setMoTa(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_CUNGCAP_MO_TA));
//                temp.setTenDonVi(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_CUNGCAP_TEN_DON_VI));
//                temp.setSdt(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_CUNGCAP_SDT));
//                temp.setNgayCapNhat(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_CUNGCAP_NGAY_CAP_NHAT));
//                temp.setNguoiCapNhat(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_CUNGCAP_NGUOI_CAP_NHAT));
//                temp.setNgayTao(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_CUNGCAP_NGAY_TAO));
//                temp.setNguoiTao(rs.getString(ColumnConfig.DEFAULT_DM_DON_VI_CUNGCAP_NGUOI_TAO));
//                dmDonViCungCaps.add(temp);
//            }
//            return dmDonViCungCaps;
//        } catch (SQLException e) {
//            log.error(e.getMessage());
//        } finally {
//            if (stmt != null) {
//                stmt.close();
//                connection.close();
//            }
//
//        }
//        return null;
//    }
//
//    public List<DmNhomTB> getDmNhomTB() throws SQLException {
//        List<DmNhomTB> dmNhomTBs = new ArrayList<>();
//        Statement stmt = null;
//        Connection connection = ConnectOracleServer.getConnectionOracleQLTB();
//        String query = "Select " + ColumnConfig.DEFAULT_DM_NHOM_TB_MA_NHOM_TB + "," + ColumnConfig.DEFAULT_DM_NHOM_TB_TEN_NHOM_TB + "," + ColumnConfig.DEFAULT_DM_NHOM_TB_MO_TA
//                + "," + ColumnConfig.DEFAULT_DM_NHOM_TB_NGAY_CAP_NHAT + "," + ColumnConfig.DEFAULT_DM_NHOM_TB_NGUOI_CAP_NHAT + "," + ColumnConfig.DEFAULT_DM_NHOM_TB_NGAY_TAO + "," + ColumnConfig.DEFAULT_DM_NHOM_TB_NGUOI_TAO
//                + " from " + ColumnConfig.DEFAULT_DM_NHOM_TB_TABLE_NAME;
//        log.info("Query: " + query);
//        DmNhomTB temp;
//        try {
//            stmt = connection.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                temp = new DmNhomTB();
//                temp.setMaNhomTb(rs.getString(ColumnConfig.DEFAULT_DM_NHOM_TB_MA_NHOM_TB));
//                temp.setMoTa(rs.getString(ColumnConfig.DEFAULT_DM_NHOM_TB_MO_TA));
//                temp.setTenNhomTb(rs.getString(ColumnConfig.DEFAULT_DM_NHOM_TB_TEN_NHOM_TB));
//                temp.setNgayCapNhat(rs.getString(ColumnConfig.DEFAULT_DM_NHOM_TB_NGAY_CAP_NHAT));
//                temp.setNguoiCapNhat(rs.getString(ColumnConfig.DEFAULT_DM_NHOM_TB_NGUOI_CAP_NHAT));
//                temp.setNgayTao(rs.getString(ColumnConfig.DEFAULT_DM_NHOM_TB_NGAY_TAO));
//                temp.setNguoiTao(rs.getString(ColumnConfig.DEFAULT_DM_NHOM_TB_NGUOI_TAO));
//                dmNhomTBs.add(temp);
//            }
//            return dmNhomTBs;
//        } catch (SQLException e) {
//            log.error(e.getMessage());
//        } finally {
//            if (stmt != null) {
//                stmt.close();
//                connection.close();
//            }
//
//        }
//        return null;
//    }
//
//    public List<DmLoaiTb> getDmLoaiTb() throws SQLException {
//        List<DmLoaiTb> dmLoaiTbs = new ArrayList<>();
//        Statement stmt = null;
//        Connection connection = ConnectOracleServer.getConnectionOracleQLTB();
//        String query = "Select a." + ColumnConfig.DEFAULT_DM_LOAI_TB_MA_LOAI_TB + ",a." + ColumnConfig.DEFAULT_DM_LOAI_TB_TEN_LOAI_TB + ",b." + ColumnConfig.DEFAULT_DM_NHOM_TB_TEN_NHOM_TB
//                + " from " + ColumnConfig.DEFAULT_DM_LOAI_TB_TABLE_NAME + " a LEFT JOIN " + ColumnConfig.DEFAULT_DM_NHOM_TB_TABLE_NAME + " b ON a." + ColumnConfig.DEFAULT_DM_LOAI_TB_NHOM_TB_ID + " = b." + ColumnConfig.DEFAULT_DM_NHOM_TB_ID;
//        log.info("Query: " + query);
//        DmLoaiTb temp;
//        try {
//            stmt = connection.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                temp = new DmLoaiTb();
//                temp.setMaLoaiTb(rs.getString(ColumnConfig.DEFAULT_DM_LOAI_TB_MA_LOAI_TB));
//
//                temp.setTenLoaiTb(rs.getString(ColumnConfig.DEFAULT_DM_LOAI_TB_TEN_LOAI_TB));
//                temp.setTenNhomTb(rs.getString(ColumnConfig.DEFAULT_DM_NHOM_TB_TEN_NHOM_TB));
//
//                dmLoaiTbs.add(temp);
//            }
//            return dmLoaiTbs;
//        } catch (SQLException e) {
//            log.error(e.getMessage());
//        } finally {
//            if (stmt != null) {
//                stmt.close();
//                connection.close();
//            }
//
//        }
//        return null;
//    }
//
//    public List<DmHangTb> getDmHangTb() throws SQLException {
//        List<DmHangTb> dmHangTbs = new ArrayList<>();
//        Statement stmt = null;
//        Connection connection = ConnectOracleServer.getConnectionOracleQLTB();
//        String query = "Select a." + ColumnConfig.DEFAULT_DM_HANG_TB_LINK + ",a." + ColumnConfig.DEFAULT_DM_HANG_TB_PASS_LOGIN + ",a." + ColumnConfig.DEFAULT_DM_HANG_TB_USER_LOGIN + ",a." + ColumnConfig.DEFAULT_DM_HANG_TB_MO_TA + ",a." + ColumnConfig.DEFAULT_DM_HANG_TB_TEN_HANG
//                + " from " + ColumnConfig.DEFAULT_DM_HANG_TB_TABLE_NAME + " a ";
//        log.info("Query: " + query);
//        DmHangTb temp;
//        try {
//            stmt = connection.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                temp = new DmHangTb();
//                temp.setLink(rs.getString(ColumnConfig.DEFAULT_DM_HANG_TB_LINK));
//                temp.setPassLogin(rs.getString(ColumnConfig.DEFAULT_DM_HANG_TB_PASS_LOGIN));
//                temp.setUserLogin(rs.getString(ColumnConfig.DEFAULT_DM_HANG_TB_USER_LOGIN));
//                temp.setDescription(rs.getString(ColumnConfig.DEFAULT_DM_HANG_TB_MO_TA));
//                temp.setTenThietBi(rs.getString(ColumnConfig.DEFAULT_DM_HANG_TB_TEN_HANG));
//                dmHangTbs.add(temp);
//            }
//            return dmHangTbs;
//        } catch (SQLException e) {
//            log.error(e.getMessage());
//        } finally {
//            if (stmt != null) {
//                stmt.close();
//                connection.close();
//            }
//
//        }
//        return null;
//    }
}
