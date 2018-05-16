package com.soap.demo.qlcb.model;

/**
 * @author anhbt 5/16/2018
 * com.soap.demo.qlcb.model
 */
public class ResultDmDonVi {
    long id;
    String tenTiengViet,tenTiengAnh;
    long tinhThanhId;
    String tenTinhThanh;

    public ResultDmDonVi(long id, String tenTiengViet, String tenTiengAnh, long tinhThanhId, String tenTinhThanh) {
        this.id = id;
        this.tenTiengViet = tenTiengViet;
        this.tenTiengAnh = tenTiengAnh;
        this.tinhThanhId = tinhThanhId;
        this.tenTinhThanh = tenTinhThanh;
    }
}
