package com.soap.demo;


import com.soap.demo.endpoint.SoapInterfaceService;
import com.soap.demo.endpoint.core.Utils.Commons;
import com.soap.demo.endpoint.core.Utils.UploadFileSuccess;
import com.soap.demo.endpoint.core.crud.ServiceCrudDanhMuc;
import com.soap.demo.endpoint.implemented.basic.*;
import com.soap.demo.endpoint.implemented.basic.create.CreateDmTinhThanhRequest;
import com.soap.demo.endpoint.implemented.basic.create.CreateDmTinhThanhResponse;
import com.soap.demo.endpoint.implemented.basic.read.*;
import com.soap.demo.endpoint.implemented.basic.update.UpdateDmTinhThanhRequest;
import com.soap.demo.endpoint.implemented.basic.update.UpdateDmTinhThanhResponse;
import com.soap.demo.qltb.model.AuthItem;
import com.soap.demo.qltb.model.DmTinhThanhEntity;
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
import java.util.List;

/**
 * @author anhbt 5/5/2018
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
    static Logger log = LogManager.getLogger(BasicApplication.class.getName());
//    /**
//     * @param request
//     * @return
//     */
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
//
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
            action = "CategoriesQltb/SaveFileToFtp",
            operationName = "SaveFileToFtp",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "SaveFileToFtpRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "SaveFileToFtpResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public SaveFileFtpRespone saveFileToFtp(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) SaveFileFtpRequest request) {
        SaveFileFtpRespone ret = new SaveFileFtpRespone();
        List<FileSftp> listFile = request.getListFile();
        if (listFile == null || listFile.size() == 0) {
            ret.setErrorCode("S06");
            ret.setMessage("No file upload");
            return ret;
        } else {
            String temp = request.checkList();
            if (!temp.isEmpty()) {
                ret.setErrorCode("S07");
                ret.setMessage(temp);
                return ret;
            }
        }
        Commons cm = new Commons();

//        if(encoded== null){
//            ret.setErrorCode("S04");
//            ret.setMessage("No string encoded base 64");
//            return ret;
//        }
//        if(file== null){
//            ret.setErrorCode("S05");
//            ret.setMessage("No file name");
//            return ret;
//        }
//        if(type<1 || type >5){
//            ret.setErrorCode("S06");
//            ret.setMessage("No type upload");
//            return ret;
//        }
        List<UploadFileSuccess> sp = cm.upLoadListFile(listFile);
        if (sp.size() == listFile.size()) {
            ret.setMessage("Success");
            ret.setErrorCode("00");
            ret.setSuccessList(sp);
        } else {
            ret.setErrorCode("S11");
            ret.setMessage("Error file");
            ret.setSuccessList(sp);
        }
        return ret;
    }

    /**
     * @param request
     * @return
     */
    @Override
    @WebMethod(
            action = "CategoriesQltb/GetAuthItem",
            operationName = "GetAuthItem",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "GetAuthenItemRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "GetAuthenItemRespone",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public GetAuthenItemRespone getAuthItem(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) GetAuthenItemRequest request) {
        GetAuthenItemRespone ret = new GetAuthenItemRespone();
        try {
            List<AuthItem> temp = ServiceCrudDanhMuc.getAllAuthItem();
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
            e.printStackTrace();
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
            action = "CategoriesQltb/GetDmTinhThanh",
            operationName = "GetDmTinhThanh",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "GetDmTinhThanhRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "GetDmTinhThanhResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public GetDmTinhThanhResponse getDmTinhThanh(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) GetDmTinhThanhRequest request) {
        GetDmTinhThanhResponse ret = new GetDmTinhThanhResponse();
        try {
            List<DmTinhThanhEntity> temp = ServiceCrudDanhMuc.getAllDmTinhThanh();
            if (temp != null) {
                if (temp.size() > 0) {
                    ret.setListTt(temp);
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
            e.printStackTrace();
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
            action = "CategoriesQltb/UpdateDmTinhThanhByMaTinhThanh",
            operationName = "UpdateDmTinhThanhByMaTinhThanh",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "UpdateDmTinhThanhRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "UpdateDmTinhThanhResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public UpdateDmTinhThanhResponse updateDmTinhThanhByMaTinhThanh(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) UpdateDmTinhThanhRequest request) {
        if (Commons.checkString(request.getMaTinhThanh()) || Commons.checkString(request.getMaVuTaiChinh())) {
            return ServiceCrudDanhMuc.updateDmTinhThanhByMaTinhThanh(request.getMaTinhThanh(), request.getMaVuTaiChinh());
        } else {
            return new UpdateDmTinhThanhResponse("Please enter information!", DefinedConfig.INPUT_INVALID, false);
        }
    }
    /**
     * @param request
     * @return
     */
    @Override
    @WebMethod(
            action = "CategoriesQltb/CreateDmTinhThanhByAdmin",
            operationName = "CreateDmTinhThanhByAdmin",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "CreateDmTinhThanhRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "CreateDmTinhThanhResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public CreateDmTinhThanhResponse createDmTinhThanhByAdmin(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) CreateDmTinhThanhRequest request) {
        return new CreateDmTinhThanhResponse();
//        if (Commons.c) {
//            return ServiceCrudDanhMuc.updateDmTinhThanhByMaTinhThanh(request.getMaTinhThanh(), request.getMaVuTaiChinh());
//        } else {
//            return new UpdateDmTinhThanhResponse("Please enter information!", DefinedConfig.INPUT_INVALID, false);
//        }
    }
    /**
     * @param request
     * @return
     */
    @Override
    @WebMethod(
            action = "CategoriesQltb/DeleteFileSftp",
            operationName = "DeleteFileSftp",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbDeleteFileSftpRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbDeleteFileSftpResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public DeleteFileSftpResponse deleteFileSftp(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) DeleteFileSftpRequest request) {
        if(!Commons.checkString(request.getPathFile())){
            return new DeleteFileSftpResponse("Invalid Path",false);
        }
        Commons cm = new Commons();
        boolean status=cm.deleteFile(request.getPathFile());
        if(status){
            return new DeleteFileSftpResponse("Success",true);
        }else return new DeleteFileSftpResponse("Delete fail",false);
    }
    /**
     * @param request
     * @return
     */
    @Override
    @WebMethod(
            action = "CategoriesQltb/UpdateFileSftp",
            operationName = "UpdateFileSftp",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbUpdateFileSftpRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbUpdateFileSftpResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public UpdateFileSftpResponse updateFileSftp(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) UpdateFileSftpRequest request) {
        if(!Commons.checkString(request.getPath(),request.getFileSftp().getFileName(),request.getFileSftp().getEncoded()) || request.getFileSftp().getType() == 0){
            return new UpdateFileSftpResponse("Invalid data",false,"");
        }
        Commons cm = new Commons();
        UploadFileSuccess up=cm.updateFile(request.getPath(),request.getFileSftp());
        if(up!=null){
            return new UpdateFileSftpResponse("Success",true,up.getLink());
        }else return new UpdateFileSftpResponse("Delete fail",false,"");
    }
}
