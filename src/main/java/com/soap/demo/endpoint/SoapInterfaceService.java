package com.soap.demo.endpoint;



import com.soap.demo.endpoint.implemented.basic.read.*;

/**
 * Created by anhbt on 5/5/2018.
 */
public interface SoapInterfaceService {
    public GetStudentResponse getTest(GetStudentRequest request);
    public GetDmPhongBanResponse getDmPhongBan(GetDmPhongBanRequest request);
    public GetDmTinhThanhResponse getDmTinhThanh(GetDmTinhThanhRequest request);
    public GetDmQuanHuyenResponse getDmQuanHuyen(GetDmQuanHuyenRequest request);
    public GetDmDonViResponse getDmDonVi(GetDmDonViRequest request);
    public GetDmChucVuResponse getDmChucVu(GetDmChucVuRequest request);
    public GetDmDonViCungCapResponse getDmDonViCungCap(GetDmDonViCungCapRequest request);
    public GetDmNhomTbResponse getDmNhomTB(GetDmNhomTbRequest request);
    public GetDmLoaiTbResponse getDmLoaiTB(GetDmLoaiTbRequest request);
//    public GetDmHangTbResponse getDmHangTB(GetDmHangTbRequest request);
}
