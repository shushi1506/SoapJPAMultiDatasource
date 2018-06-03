package com.soap.qlcb.endpoint;

import com.soap.qlcb.DefinedConfig;
import com.soap.qlcb.endpoint.implemented.create.*;
import com.soap.qlcb.endpoint.implemented.delete.*;
import com.soap.qlcb.endpoint.implemented.read.*;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * @author anhbt 5/26/2018
 * com.soap.qlcb.endpoint
 */
public interface SoapServiceQlcb {
    public GetDmPhongBanResponse getDmPhongBan(GetDmPhongBanRequest request);
    public GetDmQuanHuyenResponse getDmQuanHuyen(GetDmQuanHuyenRequest request);
    public GetDmDonViResponse getDmDonVi(GetDmDonViRequest request);
    public GetDmDonViBtProcedureResponse getDmDonVi2(GetDmDonViRequest request);
    public GetDmChucVuResponse getDmChucVu(GetDmChucVuRequest request);
    public GetCbCanBoResponse getCbCanBo(GetCbCanBoRequest request);
    public GetCbCanBoByIdResponse getCbCanBoById(GetCbCanBoByIdRequest request);
    public GetDmDonViSortResponse getDmDonViSort(GetDmDonViSortRequest request);
//    public GetDmDonViCungCapResponse getDmDonViCungCap(GetDmDonViCungCapRequest request);
//    public GetDmNhomTbResponse getDmNhomTB(GetDmNhomTbRequest request);
//    public GetDmLoaiTbResponse getDmLoaiTB(GetDmLoaiTbRequest request);

    //for dong bo danh muc
    public CreateDongBoDmCanBoResponse createDmCanBo(CreateDongBoDmCanBoRequest request);
    CreateDongBoDmChucVuResponse createDmChucVu(CreateDongBoDmChucVuRequest request);
    DeleteDongBoDmCanBoResponse deleteDmCanBo(DeleteDongBoDmCanBoRequest request);
    CreateDongBoDmPhongBanResponse createDmPhongBan(CreateDongBoDmPhongBanRequest request);


    CreateDongBoCbCanBoDetailResponse createCbCanBoDetail( CreateDongBoCbCanBoDetailRequest request);

    @WebMethod(
            action = "CategoriesQltb/CreateDmDonVi",
            operationName = "CreateDmDonVi",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbCreateDongBoDmDonViRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbCreateDongBoDmDonViResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    CreateDongBoDmDonViResponse createDmDonVi(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) CreateDongBoDmDonViRequest request);

    @WebMethod(
            action = "CategoriesQltb/DeleteDmCanBoDetail",
            operationName = "DeleteDmCanBoDetail",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbDeleteDongBoDmCanBoDetailRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbDeleteDongBoDmCanBoDetailResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    DeleteDongBoDmCanBoDetailResponse deleteDmCanBoDetail(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) DeleteDongBoDmCanBoDetailRequest request);

    @WebMethod(
            action = "CategoriesQltb/DeleteDmDonVi",
            operationName = "DeleteDmDonVi",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbDeleteDongBoDmDonViRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbDeleteDongBoDmDonViResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    DeleteDongBoDmDonViResponse deleteDmDonVi(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) DeleteDongBoDmDonViRequest request);

    @WebMethod(
            action = "CategoriesQltb/DeleteDmChucVu",
            operationName = "DeleteDmChucVu",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbDeleteDongBoDmChucVuRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbDeleteDongBoDmChucVuResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    DeleteDongBoDmChucVuResponse deleteDmChucVu(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) DeleteDongBoDmChucVuRequest request);

    @WebMethod(
            action = "CategoriesQltb/DeleteDmPhongBan",
            operationName = "DeleteDmPhongBan",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbDeleteDongBoDmPhongBanRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbDeleteDongBoDmPhongBanResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    DeleteDongBoDmPhongBanResponse deleteDmPhongBan(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) DeleteDongBoDmPhongBanRequest request);
}
