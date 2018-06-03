package com.soap.qlcb;

import com.soap.qlcb.endpoint.SoapServiceQlcb;
import com.soap.qlcb.endpoint.controller.entity.*;
import com.soap.qlcb.endpoint.controller.results.*;
import com.soap.qlcb.endpoint.core.service.ReadDanhMuc;
import com.soap.qlcb.endpoint.core.service.ServiceCrudDanhMuc;
import com.soap.qlcb.endpoint.implemented.create.*;
import com.soap.qlcb.endpoint.implemented.delete.*;
import com.soap.qlcb.endpoint.implemented.read.*;
import com.soap.qlcb.endpoint.util.ServiceStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.validation.annotation.Validated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import javax.xml.ws.WebFault;
import java.util.ArrayList;
import java.util.List;

/**
 * @author anhbt 5/26/2018
 * com.soap.qlcb
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
public class SoapServiceQlcbMain implements SoapServiceQlcb {
    static Logger log = LogManager.getLogger(SoapServiceQlcbMain.class);
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
        GetDmPhongBanResponse ret = new GetDmPhongBanResponse();
        try {
//            List<DanhMucPhongBan> temp = readDanhMuc.getDmPhongBan();
            List<ResultDmPhongBan> temp= ServiceCrudDanhMuc.getResultDmPhongBanQlcb();
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

        } catch (Exception e) {
            log.error(e.getMessage());
            ret.setMessage_(e.getMessage());
//            ret.getErrorCode(e.);
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

        GetDmQuanHuyenResponse ret = new GetDmQuanHuyenResponse();
        try {
            List<ResultDmQuanHuyen> temp = ServiceCrudDanhMuc.getResultDmQuanHuyenQlcb();
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
        } catch (Exception e) {
            log.error(e.getMessage());
            ret.setMessage_(e.getMessage());
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
        GetDmDonViResponse ret = new GetDmDonViResponse();
        try {
            List<ResultDmDonVi> temp = ServiceCrudDanhMuc.getResultDmDonViQlcb();
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
        } catch (Exception e) {
            log.error(e.getMessage());
            ret.setMessage_(e.getMessage());
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
            action = "CategoriesQltb/GetDmDonViByProcedure",
            operationName = "GetDmDonViByProcedure",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbGetDmDonViByProcedureRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbGetDmDonViByProcedureResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public GetDmDonViBtProcedureResponse getDmDonVi2(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) GetDmDonViRequest request) {
        GetDmDonViBtProcedureResponse ret = new GetDmDonViBtProcedureResponse();
        try {
            List<ResultDmDonVi> temp = ServiceCrudDanhMuc.getResultDmDonViQlcbByProcdedure();
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
        } catch (Exception e) {
            log.error(e.getMessage());
            ret.setMessage_(e.getMessage());
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
        GetDmChucVuResponse ret = new GetDmChucVuResponse();
        try {
            List<ResultDmChucVu> temp = ServiceCrudDanhMuc.getResultDmChucVuQlcb();
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
        } catch (Exception e) {
            log.error(e.getMessage());
            ret.setMessage_(e.getMessage());
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
            action = "CategoriesQltb/GetDmCbCanBo",
            operationName = "GetDmCbCanBo",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbGetCbCanBoRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbGetCbCanBoResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public GetCbCanBoResponse getCbCanBo(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) GetCbCanBoRequest request) {
        GetCbCanBoResponse ret = new GetCbCanBoResponse();
        try {
//            Page<ResultCbCanBo> t=ServiceCrudDanhMuc.getResultCbCanBoQlcbPage(request.getPage(),request.getSize());
//            List<ResultCbCanBo> temp = ServiceCrudDanhMuc.getResultCbCanBoQlcb();
            if(request.getIdDonVi()==0){
                ret.setStatus_(false);
                ret.setMessage_("Invalid id");
                return ret;
            }
            //mã đơn vị tw 301
            List<ResultCbCanBo> temp;
//            if(request.getIdDonVi()==301){
//                temp=ServiceCrudDanhMuc.getResultCbCanBoQlcb();
//            }else {
                temp = ServiceCrudDanhMuc.getResultCbCanBoQlcb(request.getIdDonVi());
//            }
//            List<ResultCbCanBo> temp = t.getContent();
            if (temp != null) {
                if (temp.size() > 0) {
                    ret.setList(temp);
//                    ret.setTotalPage(t.getTotalPages());
//                    ret.setTotalElement(t.getTotalElements());
                    ret.setCount_((long) temp.size());
//                    ret.setCurrentPage(t.getPageable().getPageNumber());
//                    ret.setPrevious(t.getPageable().hasPrevious());
                    ret.setMessage_("Success");
                    ret.setStatus_(true);
                    return ret;
                } else {
                    ret.setStatus_(true);
                    ret.setMessage_("Success");
                    ResultCbCanBo rs=new ResultCbCanBo();
                    temp.add(rs);
                    ret.setList(temp);
                    return ret;
                }
            } else {
                ret.setStatus_(false);
                ret.setMessage_("Fail");
                return ret;
            }
        } catch (Exception e) {
            log.error(e.getMessage());
            ret.setMessage_(e.getMessage());
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
            action = "CategoriesQltb/GetDmCbCanBoById",
            operationName = "GetDmCbCanBoById",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbGetCbCanBoByIdRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbGetCbCanBoByIdResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public GetCbCanBoByIdResponse getCbCanBoById(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) GetCbCanBoByIdRequest request) {
        GetCbCanBoByIdResponse ret = new GetCbCanBoByIdResponse();
        try {
            if(request.getId()==0){
                ret.setStatus_(false);
                ret.setMessage_("Invalid id");
                return ret;
            }
           ResultCbCanBo temp;
            temp = ServiceCrudDanhMuc.getResultCbCanBoByIdQlcb(request.getId());
            if (temp != null) {
                    ret.setCount_((long) 1);
                    ret.setMessage_("Success");
                    ret.setStatus_(true);
                    ret.setCanBo(temp);
                    return ret;

            } else {
                ret.setStatus_(false);
                ret.setMessage_("Fail");
                return ret;
            }
        } catch (Exception e) {
            log.error(e.getMessage());
            ret.setMessage_(e.getMessage());
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
            action = "CategoriesQltb/GetDmDonViSort",
            operationName = "GetDmDonViSort",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbGetDmDonViSortRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbGetDmDonViSortResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public GetDmDonViSortResponse getDmDonViSort(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) GetDmDonViSortRequest request) {
        GetDmDonViSortResponse ret = new GetDmDonViSortResponse();
        try {
            if(request.getId()==0){
                ret.setStatus_(false);
                ret.setMessage_("Invalid id");
                return ret;
            }
            ReadDanhMuc readDanhMuc=new ReadDanhMuc();
            String search="%"+request.getSearch()+"%";
            List<ResultDmDonViSort> temp =ServiceCrudDanhMuc.getResultDmDonViQlcbSort(request.getId(),search);
//            List<ResultDmDonViSort> temp = readDanhMuc.getDmDonViSortByProcedure(request.getId(),request.getSearch());
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

        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
            ret.setMessage_(e.getMessage());
//            ret.getErrorCode(e.);
            ret.setStatus_(false);
            return ret;
        }

    }

//    /**
////     * @param request
////     * @return
////     */
//    @Override
//    @WebMethod(
//            action = "CategoriesQltb/GetDmDonViCungCap",
//            operationName = "GetDmDonViCungCap",
//            exclude = false
//    )
//    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
//    @RequestWrapper(
//            localName = "QltbGetDmDonViCungCapRequest",
//            targetNamespace = DefinedConfig.NAME_SPACE
//    )
//    @ResponseWrapper(
//            localName = "QltbGetDmDonViCungCapResponse",
//            targetNamespace = DefinedConfig.NAME_SPACE
//    )
//    public GetDmDonViCungCapResponse getDmDonViCungCap(@WebParam(
//            name = "request",
//            partName = "request",
//            targetNamespace = DefinedConfig.NAME_SPACE) GetDmDonViCungCapRequest request) {
//        ReadDanhMuc readDanhMuc = new ReadDanhMuc();
//        GetDmDonViCungCapResponse ret = new GetDmDonViCungCapResponse();
//        try {
//            List<DmDonViCungCap> temp = readDanhMuc.getDmDonViCungCap();
//            if (temp != null) {
//                if (temp.size() > 0) {
//                    ret.setListDm(temp);
//                    ret.setCount_((long) temp.size());
//                    ret.setMessage_("Success");
//                    ret.setStatus_(true);
//                    return ret;
//                } else {
//                    ret.setStatus_(false);
//                    ret.setMessage_("Fail");
//                    return ret;
//                }
//            } else {
//                ret.setStatus_(false);
//                ret.setMessage_("Không đọc được dữ liệu");
//                return ret;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            ret.setMessage_(e.getMessage());
//            ret.getErrorCode(e.getErrorCode());
//            ret.setStatus_(false);
//            return ret;
//        }
//
//    }

//    /**
//     * @param request
//     * @return
//     */
//    @Override
//    @WebMethod(
//            action = "CategoriesQltb/GetDmNhomTb",
//            operationName = "GetDmNhomTb",
//            exclude = false
//    )
//    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
//    @RequestWrapper(
//            localName = "QltbGetDmNhomTbRequest",
//            targetNamespace = DefinedConfig.NAME_SPACE
//    )
//    @ResponseWrapper(
//            localName = "QltbGetDmNhomTbResponse",
//            targetNamespace = DefinedConfig.NAME_SPACE
//    )
//    public GetDmNhomTbResponse getDmNhomTB(@WebParam(
//            name = "request",
//            partName = "request",
//            targetNamespace = DefinedConfig.NAME_SPACE) GetDmNhomTbRequest request) {
//        ReadDanhMuc readDanhMuc = new ReadDanhMuc();
//        GetDmNhomTbResponse ret = new GetDmNhomTbResponse();
//        try {
//            List<DmNhomTB> temp = readDanhMuc.getDmNhomTB();
//            if (temp != null) {
//                if (temp.size() > 0) {
//                    ret.setListDm(temp);
//                    ret.setCount_((long) temp.size());
//                    ret.setMessage_("Success");
//                    ret.setStatus_(true);
//                    return ret;
//                } else {
//                    ret.setStatus_(false);
//                    ret.setMessage_("Fail");
//                    return ret;
//                }
//            } else {
//                ret.setStatus_(false);
//                ret.setMessage_("Không đọc được dữ liệu");
//                return ret;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            ret.setMessage_(e.getMessage());
//            ret.getErrorCode(e.getErrorCode());
//            ret.setStatus_(false);
//            return ret;
//        }
//
//    }

//    /**
//     * @param request
//     * @return
//     */
//    @Override
//    @WebMethod(
//            action = "CategoriesQltb/GetDmLoaiTb",
//            operationName = "GetDmLoaiTb",
//            exclude = false
//    )
//    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
//    @RequestWrapper(
//            localName = "QltbGetDmLoaiTbRequest",
//            targetNamespace = DefinedConfig.NAME_SPACE
//    )
//    @ResponseWrapper(
//            localName = "QltbGetDmLoaiTbResponse",
//            targetNamespace = DefinedConfig.NAME_SPACE
//    )
//    public GetDmLoaiTbResponse getDmLoaiTB(@WebParam(
//            name = "request",
//            partName = "request",
//            targetNamespace = DefinedConfig.NAME_SPACE) GetDmLoaiTbRequest request) {
//        ReadDanhMuc readDanhMuc = new ReadDanhMuc();
//        GetDmLoaiTbResponse ret = new GetDmLoaiTbResponse();
//        try {
//            List<DmLoaiTb> temp = readDanhMuc.getDmLoaiTb();
//            if (temp != null) {
//                if (temp.size() > 0) {
//                    ret.setListDm(temp);
//                    ret.setCount_((long) temp.size());
//                    ret.setMessage_("Success");
//                    ret.setStatus_(true);
//                    return ret;
//                } else {
//                    ret.setStatus_(false);
//                    ret.setMessage_("Fail");
//                    return ret;
//                }
//            } else {
//                ret.setStatus_(false);
//                ret.setMessage_("Không đọc được dữ liệu");
//                return ret;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            ret.setMessage_(e.getMessage());
//            ret.getErrorCode(e.getErrorCode());
//            ret.setStatus_(false);
//            return ret;
//        }
//
//    }

    /**
     * @param request
     * @return
     */
    @Override
    @WebMethod(
            action = "CategoriesQltb/IAMCreateDmChucVu",
            operationName = "IAMCreateDmChucVu",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbCreateDongBoDmChucVuRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbCreateDongBoDmChucVuResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public CreateDongBoDmChucVuResponse createDmChucVu(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) CreateDongBoDmChucVuRequest request) {
        CreateDongBoDmChucVuResponse ret = new CreateDongBoDmChucVuResponse();
        try {
            List<DmChucVuEntity> list=request.getDmChucVuEntities();
            boolean tem=ServiceCrudDanhMuc.createDongBoDmChucVu(list);
            if(tem){
                return new CreateDongBoDmChucVuResponse("00","Success",true);
            }else return new CreateDongBoDmChucVuResponse("01","Fail create dm can bo",false);

        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
            ret.setErrorMessage(e.getMessage());
            ret.setStatus(false);
            return ret;
        }

    }
    /**
     * @param request
     * @return
     */
    @Override
    @WebMethod(
            action = "CategoriesQltb/IAMCreateDmCanBo",
            operationName = "IAMCreateDmCanBo",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbCreateDongBoDmCanBoRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbCreateDongBoDmCanBoResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public CreateDongBoDmCanBoResponse createDmCanBo(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) CreateDongBoDmCanBoRequest request) {
        CreateDongBoDmCanBoResponse ret = new CreateDongBoDmCanBoResponse();
        try {
            List<CbCanBoEntity> list=request.getCbCanBoEntityList();
            boolean tem=ServiceCrudDanhMuc.createDongBoDmCanBo(list);
            if(tem){
                return new CreateDongBoDmCanBoResponse("00","Success",true);
            }else return new CreateDongBoDmCanBoResponse("01","Fail create dm can bo",false);

        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
            ret.setErrorMessage(e.getMessage());
            ret.setStatus(false);
            return ret;
        }

    }
    /**
     * @param request
     * @return
     */
    @Override
    @WebMethod(
            action = "CategoriesQltb/IAMDeleteDmCanBo",
            operationName = "IAMDeleteDmCanBo",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbDeleteDongBoDmCanBoRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbDeleteDongBoDmCanBoResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public DeleteDongBoDmCanBoResponse deleteDmCanBo(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) DeleteDongBoDmCanBoRequest request) {
        DeleteDongBoDmCanBoResponse ret = new DeleteDongBoDmCanBoResponse();
        try {

            ServiceStatus ss=ServiceCrudDanhMuc.deleteDongBoDmCanBo(request.getId());
            ret.setServiceStatus(ss);
            return ret;
        } catch (Exception e) {
            log.error(e);
            String error = "";
            if (e.getCause() != null) {
                if (e.getCause().getCause() != null) {
                    error = e.getCause().getCause().getMessage();
                }
            }
            ret.setServiceStatus(new ServiceStatus(error+e.getMessage(),"99",false));
            return ret;
        }
    }
    /**
     * @param request
     * @return
     */
    @Override
    @WebMethod(
            action = "CategoriesQltb/IAMCreateDmPhongBan",
            operationName = "IAMCreateDmPhongBan",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbCreateDongBoDmPhongBanRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbCreateDongBoDmPhongBanResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public CreateDongBoDmPhongBanResponse createDmPhongBan(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) CreateDongBoDmPhongBanRequest request) {
        CreateDongBoDmPhongBanResponse ret = new CreateDongBoDmPhongBanResponse();
        try {
            List<DmPhongBanEntity> list=request.getDmPhongBanEntities();
            boolean tem=ServiceCrudDanhMuc.createDongBoDmPhongBan(list);
            if(tem){
                return new CreateDongBoDmPhongBanResponse("00","Success",true);
            }else return new CreateDongBoDmPhongBanResponse("01","Fail create dm phong ban",false);

        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
            ret.setErrorMessage(e.getMessage());
            ret.setStatus(false);
            return ret;
        }
    }
    /**
     * @param request
     * @return
     */
    @Override
    @WebMethod(
            action = "CategoriesQltb/IAMCreateCbCanBoDetail",
            operationName = "IAMCreateCbCanBoDetail",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbCreateDongBoCbCanBoDetailRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbCreateDongBoCbCanBoDetailResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public CreateDongBoCbCanBoDetailResponse createCbCanBoDetail(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) CreateDongBoCbCanBoDetailRequest request) {
        CreateDongBoCbCanBoDetailResponse ret = new CreateDongBoCbCanBoDetailResponse();
        try {
            List<ResultCbCanBoDetail> list=request.getResultCbCanBoDetailList();
            List<CbCanBoDetailEntityCustom>cbCanBoDeatails=new ArrayList<>();
            if(list==null || list.isEmpty()){
                return new CreateDongBoCbCanBoDetailResponse("02","No objects",false);
            }else {
                for (ResultCbCanBoDetail i :list
                     ) {
                    CbCanBoDetailEntityCustom cb=new CbCanBoDetailEntityCustom();
                    cb.setId(i.getId());
                    cb.setCanBoId(i.getCanBoId());
                    cb.setChucVuId(i.getChucVuId());
                    cb.setDonViId(i.getDonViId());
                    cb.setEmailCoQuan(i.getEmailCoQuan());
                    cb.setPhongBanId(i.getPhongBanId());
                    cbCanBoDeatails.add(cb);
                }
            }
            boolean tem=ServiceCrudDanhMuc.createDongBoCbCanBoDetail(cbCanBoDeatails);
            if(tem){
                return new CreateDongBoCbCanBoDetailResponse("00","Success",true);
            }else return new CreateDongBoCbCanBoDetailResponse("01","Fail create dm can bo detail",false);

        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
            ret.setErrorMessage(e.getMessage());
            ret.setStatus(false);
            return ret;
        }
    }
    /**
     * @param request
     * @return
     */
    @Override
    @WebMethod(
            action = "CategoriesQltb/IAMCreateDmDonVi",
            operationName = "IAMCreateDmDonVi",
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
    public CreateDongBoDmDonViResponse createDmDonVi(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) CreateDongBoDmDonViRequest request) {
        CreateDongBoDmDonViResponse ret = new CreateDongBoDmDonViResponse();
        try {
            List<DmDonViEntity> list=request.getDmDonViEntities();
            boolean tem=ServiceCrudDanhMuc.createDongBoDmDonVi(list);
            if(tem){
                return new CreateDongBoDmDonViResponse("00","Success",true);
            }else return new CreateDongBoDmDonViResponse("01","Fail create dm don vi",false);

        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
            ret.setErrorMessage(e.getMessage());
            ret.setStatus(false);
            return ret;
        }
    }
    /**
     * @param request
     * @return
     */
    @Override
    @WebMethod(
            action = "CategoriesQltb/IAMDeleteDmCanBoDetail",
            operationName = "IAMDeleteDmCanBoDetail",
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
    public DeleteDongBoDmCanBoDetailResponse deleteDmCanBoDetail(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) DeleteDongBoDmCanBoDetailRequest request) {
        DeleteDongBoDmCanBoDetailResponse ret = new DeleteDongBoDmCanBoDetailResponse();
        try {

            ServiceStatus ss=ServiceCrudDanhMuc.deleteDongBoDmCanBoDetail(request.getId());
            ret.setServiceStatus(ss);
            return ret;
        } catch (Exception e) {
            log.error(e);
            String error = "";
            if (e.getCause() != null) {
                if (e.getCause().getCause() != null) {
                    error = e.getCause().getCause().getMessage();
                }
            }
            ret.setServiceStatus(new ServiceStatus(error+e.getMessage(),"99",false));
            return ret;
        }
    }
    /**
     * @param request
     * @return
     */
    @Override
    @WebMethod(
            action = "CategoriesQltb/IAMDeleteDmDonVi",
            operationName = "IAMDeleteDmDonVi",
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
    public DeleteDongBoDmDonViResponse deleteDmDonVi(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) DeleteDongBoDmDonViRequest request) {
        DeleteDongBoDmDonViResponse ret = new DeleteDongBoDmDonViResponse();
        try {

            ServiceStatus ss=ServiceCrudDanhMuc.deleteDongBoDmDonVi(request.getId());
            ret.setServiceStatus(ss);
            return ret;
        } catch (Exception e) {
            log.error(e);
            String error = "";
            if (e.getCause() != null) {
                if (e.getCause().getCause() != null) {
                    error = e.getCause().getCause().getMessage();
                }
            }
            ret.setServiceStatus(new ServiceStatus(error+e.getMessage(),"99",false));
            return ret;
        }
    }
    /**
     * @param request
     * @return
     */
    @Override
    @WebMethod(
            action = "CategoriesQltb/IAMDeleteDmChucVu",
            operationName = "IAMDeleteDmChucVu",
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
    public DeleteDongBoDmChucVuResponse deleteDmChucVu(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) DeleteDongBoDmChucVuRequest request) {
        DeleteDongBoDmChucVuResponse ret = new DeleteDongBoDmChucVuResponse();
        try {

            ServiceStatus ss=ServiceCrudDanhMuc.deleteDongBoDmChucVu(request.getId());
            ret.setServiceStatus(ss);
            return ret;
        } catch (Exception e) {
            log.error(e);
            String error = "";
            if (e.getCause() != null) {
                if (e.getCause().getCause() != null) {
                    error = e.getCause().getCause().getMessage();
                }
            }
            ret.setServiceStatus(new ServiceStatus(error+e.getMessage(),"99",false));
            return ret;
        }
    }
    /**
     * @param request
     * @return
     */
    @Override
    @WebMethod(
            action = "CategoriesQltb/IAMDeleteDmPhongBan",
            operationName = "IAMDeleteDmPhongBan",
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
    public DeleteDongBoDmPhongBanResponse deleteDmPhongBan(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) DeleteDongBoDmPhongBanRequest request) {
        DeleteDongBoDmPhongBanResponse ret = new DeleteDongBoDmPhongBanResponse();
        try {

            ServiceStatus ss=ServiceCrudDanhMuc.deleteDongBoDmPhongBan(request.getId());
            ret.setServiceStatus(ss);
            return ret;
        } catch (Exception e) {
            log.error(e);
            String error = "";
            if (e.getCause() != null) {
                if (e.getCause().getCause() != null) {
                    error = e.getCause().getCause().getMessage();
                }
            }
            ret.setServiceStatus(new ServiceStatus(error+e.getMessage(),"99",false));
            return ret;
        }
    }
}