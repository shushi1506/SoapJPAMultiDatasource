package com.soap.demo.endpoint;



import com.soap.demo.endpoint.implemented.basic.*;
import com.soap.demo.endpoint.implemented.basic.create.CreateDmTinhThanhRequest;
import com.soap.demo.endpoint.implemented.basic.create.CreateDmTinhThanhResponse;
import com.soap.demo.endpoint.implemented.basic.read.*;
import com.soap.demo.endpoint.implemented.basic.update.UpdateDmTinhThanhRequest;
import com.soap.demo.endpoint.implemented.basic.update.UpdateDmTinhThanhResponse;

/**
 * Created by anhbt on 5/5/2018.
 */
public interface SoapInterfaceService {
//    public GetStudentResponse getTest(GetStudentRequest request);
//    public GetDmPhongBanResponse getDmPhongBan(GetDmPhongBanRequest request);
////    public GetDmTinhThanhResponse getDmTinhThanh(GetDmTinhThanhRequest request);
//    public GetDmQuanHuyenResponse getDmQuanHuyen(GetDmQuanHuyenRequest request);
//    public GetDmDonViResponse getDmDonVi(GetDmDonViRequest request);
//    public GetDmChucVuResponse getDmChucVu(GetDmChucVuRequest request);
//    public GetCbCanBoResponse getCbCanBo(GetCbCanBoRequest request);
//    public GetDmDonViCungCapResponse getDmDonViCungCap(GetDmDonViCungCapRequest request);
//    public GetDmNhomTbResponse getDmNhomTB(GetDmNhomTbRequest request);
//    public GetDmLoaiTbResponse getDmLoaiTB(GetDmLoaiTbRequest request);
//    public GetDmHangTbResponse getDmHangTB(GetDmHangTbRequest request);
    public SaveFileFtpRespone saveFileToFtp(SaveFileFtpRequest request);
    public GetAuthenItemRespone getAuthItem(GetAuthenItemRequest request);
    public GetDmTinhThanhResponse getDmTinhThanh(GetDmTinhThanhRequest request);
    public UpdateDmTinhThanhResponse updateDmTinhThanhByMaTinhThanh(UpdateDmTinhThanhRequest request);
    public CreateDmTinhThanhResponse createDmTinhThanhByAdmin(CreateDmTinhThanhRequest request);
    DeleteFileSftpResponse deleteFileSftp(DeleteFileSftpRequest request);
    UpdateFileSftpResponse updateFileSftp(UpdateFileSftpRequest request);
}
