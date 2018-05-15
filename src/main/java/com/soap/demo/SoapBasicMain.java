package com.soap.demo;


import com.soap.demo.endpoint.SoapInterfaceService;
import com.soap.demo.endpoint.core.crud.ReadDanhMuc;
import com.soap.demo.endpoint.core.crud.ServiceCrudQlcb;
import com.soap.demo.endpoint.core.crud.ServiceCrudQltb;
import com.soap.demo.endpoint.core.crud.ServiceSumary;
import com.soap.demo.endpoint.implemented.basic.model.*;
import com.soap.demo.endpoint.implemented.basic.read.*;
import com.soap.demo.qlcb.model.DmTinhThanh;
import com.soap.demo.qltb.model.AuthItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import javax.xml.ws.WebFault;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tunglt 5/5/2018
 * com.tecapro.soap
 */
@WebService(
        targetNamespace = DefinedConfig.NAME_SPACE,
        portName = "IAMCategoriesQltb",
        name = "IAMCategoriesQltb",
        serviceName = "IAMCategoriesQltbService"
)
@WebFault(
        name = "FaultErrorResponse",
        targetNamespace = DefinedConfig.NAME_SPACE
)
@SOAPBinding(
        parameterStyle = SOAPBinding.ParameterStyle.WRAPPED,
        style = SOAPBinding.Style.DOCUMENT,
        use = SOAPBinding.Use.LITERAL)
@Validated
@EnableAutoConfiguration
public class SoapBasicMain implements SoapInterfaceService {
    @Override
    @WebMethod(
            action = "CategoriesQltb/GetStudent",
            operationName = "GetAuthentication",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbGetStudentRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbGetStudentResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public GetStudentResponse getTest(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE
    ) GetStudentRequest request) {
        System.out.println(request.getUserId());
        GetStudentResponse ret = new GetStudentResponse();
        return ret;
    }

    /**
     * @param request
     * @return
     */
    @Override
    @WebMethod(
            action = "CategoriesQltb/GetDmPhongBan",
            operationName = "GetDmPhongBan",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbGetDmPhongBanRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbGetDmPhongBanResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public GetDmPhongBanResponse getDmPhongBan(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) GetDmPhongBanRequest request) {
        ReadDanhMuc readDanhMuc = new ReadDanhMuc();
        GetDmPhongBanResponse ret = new GetDmPhongBanResponse();
        try {
            List<DanhMucPhongBan> temp = readDanhMuc.getDmPhongBan();
            if (temp.size() > 0) {
                ret.setListDm(temp);
                ret.setCount_((long) temp.size());
                ret.setMessage_("Success");
                ret.setStatus_(true);
                return ret;
            } else {
                ret.setStatus_(false);
                ret.setMessage_("Fail");
                return ret;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            ret.setMessage_(e.getMessage());
            ret.getErrorCode(e.getErrorCode());
            ret.setStatus_(false);
            return ret;
        }

    }

    /**
     * @param request
     * @return
     */
    @Override
    @WebMethod(
            action = "CategoriesQltb/GetDmTinhThanh",
            operationName = "GetDmTinhThanh",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbGetDmTinhThanhRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbGetDmTinhThanhResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public GetDmTinhThanhResponse getDmTinhThanh(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) GetDmTinhThanhRequest request) {
        ReadDanhMuc readDanhMuc = new ReadDanhMuc();
        GetDmTinhThanhResponse ret = new GetDmTinhThanhResponse();
//        try {
//            List<DanhMucTinhThanh>temp= readDanhMuc.getDmTinhThanh();
//            List<DmTinhThanh>temp= ServiceDmTinhThanh.getAllDmTinhThanh();
        List<DmTinhThanh> temp = ServiceSumary.getAllDmTinhThanh();
        if (temp != null) {
            if (temp.size() > 0) {
                ret.setListDm(temp);
                ret.setCount_((long) temp.size());
                ret.setMessage_("Success");
                ret.setStatus_(true);
                return ret;
            } else {
                ret.setStatus_(false);
                ret.setMessage_("Fail");
                return ret;
            }
        } else {
            ret.setStatus_(false);
            ret.setMessage_("Không đọc được dữ liệu");
            return ret;
        }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            ret.setMessage_(e.getMessage());
//            ret.getErrorCode(e.getErrorCode());
//            ret.setStatus_(false);
//            return ret;
//        }

    }

    /**
     * @param request
     * @return
     */
    @Override
    @WebMethod(
            action = "CategoriesQltb/GetDmQuanHuyen",
            operationName = "GetDmQuanHuyen",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbGetDmQuanHuyenRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbGetDmQuanHuyenResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public GetDmQuanHuyenResponse getDmQuanHuyen(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) GetDmQuanHuyenRequest request) {
        ReadDanhMuc readDanhMuc = new ReadDanhMuc();
        GetDmQuanHuyenResponse ret = new GetDmQuanHuyenResponse();
        try {
            List<DanhMucQuanHuyen> temp = readDanhMuc.getDmQuanHuyen();
            if (temp != null) {
                if (temp.size() > 0) {
                    ret.setListDm(temp);
                    ret.setCount_((long) temp.size());
                    ret.setMessage_("Success");
                    ret.setStatus_(true);
                    return ret;
                } else {
                    ret.setStatus_(false);
                    ret.setMessage_("Fail");
                    return ret;
                }
            } else {
                ret.setStatus_(false);
                ret.setMessage_("Không đọc được dữ liệu");
                return ret;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            ret.setMessage_(e.getMessage());
            ret.getErrorCode(e.getErrorCode());
            ret.setStatus_(false);
            return ret;
        }
    }

    /**
     * @param request
     * @return
     */
    @Override
    @WebMethod(
            action = "CategoriesQltb/GetDmDonVi",
            operationName = "GetDmDonVi",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbGetDmDonViRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbGetDmDonViResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public GetDmDonViResponse getDmDonVi(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) GetDmDonViRequest request) {
        ReadDanhMuc readDanhMuc = new ReadDanhMuc();
        GetDmDonViResponse ret = new GetDmDonViResponse();
        try {
            List<DanhMucDonViQltb> temp = readDanhMuc.getDmDonViQltb();
            if (temp != null) {
                if (temp.size() > 0) {
                    ret.setList(temp);
                    ret.setCount_((long) temp.size());
                    ret.setMessage_("Success");
                    ret.setStatus_(true);
                    return ret;
                } else {
                    ret.setStatus_(false);
                    ret.setMessage_("Fail");
                    return ret;
                }
            } else {
                ret.setStatus_(false);
                ret.setMessage_("Không đọc được dữ liệu");
                return ret;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            ret.setMessage_(e.getMessage());
            ret.getErrorCode(e.getErrorCode());
            ret.setStatus_(false);
            return ret;
        }

    }

    /**
     * @param request
     * @return
     */
    @Override
    @WebMethod(
            action = "CategoriesQltb/GetDmChucVu",
            operationName = "GetDmChucVu",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbGetDmChucVuRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbGetDmChucVuResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public GetDmChucVuResponse getDmChucVu(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) GetDmChucVuRequest request) {
        ReadDanhMuc readDanhMuc = new ReadDanhMuc();
        GetDmChucVuResponse ret = new GetDmChucVuResponse();
        try {
            List<DanhMucChucVu> temp = readDanhMuc.getDmChucVu();
            if (temp != null) {
                if (temp.size() > 0) {
                    ret.setListDm(temp);
                    ret.setCount_((long) temp.size());
                    ret.setMessage_("Success");
                    ret.setStatus_(true);
                    return ret;
                } else {
                    ret.setStatus_(false);
                    ret.setMessage_("Fail");
                    return ret;
                }
            } else {
                ret.setStatus_(false);
                ret.setMessage_("Không đọc được dữ liệu");
                return ret;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            ret.setMessage_(e.getMessage());
            ret.getErrorCode(e.getErrorCode());
            ret.setStatus_(false);
            return ret;
        }

    }

    /**
     * @param request
     * @return
     */
    @Override
    @WebMethod(
            action = "CategoriesQltb/GetDmDonViCungCap",
            operationName = "GetDmDonViCungCap",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbGetDmDonViCungCapRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbGetDmDonViCungCapResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public GetDmDonViCungCapResponse getDmDonViCungCap(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) GetDmDonViCungCapRequest request) {
        ReadDanhMuc readDanhMuc = new ReadDanhMuc();
        GetDmDonViCungCapResponse ret = new GetDmDonViCungCapResponse();
        try {
            List<DmDonViCungCap> temp = readDanhMuc.getDmDonViCungCap();
            if (temp != null) {
                if (temp.size() > 0) {
                    ret.setListDm(temp);
                    ret.setCount_((long) temp.size());
                    ret.setMessage_("Success");
                    ret.setStatus_(true);
                    return ret;
                } else {
                    ret.setStatus_(false);
                    ret.setMessage_("Fail");
                    return ret;
                }
            } else {
                ret.setStatus_(false);
                ret.setMessage_("Không đọc được dữ liệu");
                return ret;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            ret.setMessage_(e.getMessage());
            ret.getErrorCode(e.getErrorCode());
            ret.setStatus_(false);
            return ret;
        }

    }

    /**
     * @param request
     * @return
     */
    @Override
    @WebMethod(
            action = "CategoriesQltb/GetDmNhomTb",
            operationName = "GetDmNhomTb",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbGetDmNhomTbRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbGetDmNhomTbResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public GetDmNhomTbResponse getDmNhomTB(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) GetDmNhomTbRequest request) {
        ReadDanhMuc readDanhMuc = new ReadDanhMuc();
        GetDmNhomTbResponse ret = new GetDmNhomTbResponse();
        try {
            List<DmNhomTB> temp = readDanhMuc.getDmNhomTB();
            if (temp != null) {
                if (temp.size() > 0) {
                    ret.setListDm(temp);
                    ret.setCount_((long) temp.size());
                    ret.setMessage_("Success");
                    ret.setStatus_(true);
                    return ret;
                } else {
                    ret.setStatus_(false);
                    ret.setMessage_("Fail");
                    return ret;
                }
            } else {
                ret.setStatus_(false);
                ret.setMessage_("Không đọc được dữ liệu");
                return ret;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            ret.setMessage_(e.getMessage());
            ret.getErrorCode(e.getErrorCode());
            ret.setStatus_(false);
            return ret;
        }

    }

    /**
     * @param request
     * @return
     */
    @Override
    @WebMethod(
            action = "CategoriesQltb/GetDmLoaiTb",
            operationName = "GetDmLoaiTb",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbGetDmLoaiTbRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbGetDmLoaiTbResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public GetDmLoaiTbResponse getDmLoaiTB(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) GetDmLoaiTbRequest request) {
        ReadDanhMuc readDanhMuc = new ReadDanhMuc();
        GetDmLoaiTbResponse ret = new GetDmLoaiTbResponse();
        try {
            List<DmLoaiTb> temp = readDanhMuc.getDmLoaiTb();
            if (temp != null) {
                if (temp.size() > 0) {
                    ret.setListDm(temp);
                    ret.setCount_((long) temp.size());
                    ret.setMessage_("Success");
                    ret.setStatus_(true);
                    return ret;
                } else {
                    ret.setStatus_(false);
                    ret.setMessage_("Fail");
                    return ret;
                }
            } else {
                ret.setStatus_(false);
                ret.setMessage_("Không đọc được dữ liệu");
                return ret;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            ret.setMessage_(e.getMessage());
            ret.getErrorCode(e.getErrorCode());
            ret.setStatus_(false);
            return ret;
        }

    }

}
