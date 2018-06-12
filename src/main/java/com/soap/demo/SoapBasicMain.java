package com.soap.demo;


import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.soap.demo.endpoint.SoapInterfaceService;
import com.soap.demo.endpoint.core.Utils.Commons;
import com.soap.demo.endpoint.core.Utils.UploadFileSuccess;
import com.soap.demo.endpoint.core.api.Pkcs12Crypto;
import com.soap.demo.endpoint.core.crud.ServiceCrudDanhMuc;
import com.soap.demo.endpoint.implemented.basic.*;
import com.soap.demo.endpoint.implemented.basic.create.*;
import com.soap.demo.endpoint.implemented.basic.read.*;
import com.soap.demo.endpoint.implemented.basic.update.UpdateDmTinhThanhRequest;
import com.soap.demo.endpoint.implemented.basic.update.UpdateDmTinhThanhResponse;
import com.soap.demo.qltb.model.AuthItem;
import com.soap.demo.qltb.model.DmTinhThanhEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.validation.annotation.Validated;
import shushi.support.barcode.GeneralBarcode;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import javax.xml.ws.WebFault;
import java.io.IOException;
import java.util.*;

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
        log.info(request.getUsername_()+ "_ Call saveFileToFtp_"+ new Date());
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
        List<UploadFileSuccess> sp = cm.upLoadListFileFtp(listFile);
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
        log.info(request.getUsername_()+ "_ Call deleteFileSFtp_"+ new Date());
        if(!Commons.checkString(request.getPathFile())){
            return new DeleteFileSftpResponse("Invalid Path",false);
        }
        Commons cm = new Commons();
        boolean status=cm.deleteFileMultiSystem(request.getPathFile());
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
        log.info(request.getUsername_()+ "_ Call updateFileSFtp_"+ new Date());
        if(!Commons.checkString(request.getPath(),request.getFileSftp().getFileName(),request.getFileSftp().getEncoded()) || request.getFileSftp().getType() == 0){
            return new UpdateFileSftpResponse("Invalid data",false,"");
        }
        Commons cm = new Commons();
        UploadFileSuccess up=cm.updateFileFtp(request.getPath(),request.getFileSftp());
        if(up!=null){
            return new UpdateFileSftpResponse("Success",true,up.getLink());
        }else return new UpdateFileSftpResponse("Delete fail",false,"");
    }
    /**
     * @param request
     * @return
     */
    @Override
    @WebMethod(
            action = "CategoriesQltb/CreateImageQr",
            operationName = "CreateImageQr",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbCreateImageBarcodeQrRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbCreateImageBarcodeQrResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public CreateImageBarcodeQrResponse createImageQr(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) CreateImageBarcodeQrRequest request) {
        log.info(request.getUsername_()+ "_ Call createImageQr"+ new Date());
        if(!Commons.checkString(request.getData())){
            return new CreateImageBarcodeQrResponse("Invalid data",false,"");
        }
        String re = null;
        try {
            Map hintMap2 = new HashMap();
            hintMap2.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
            hintMap2.put(EncodeHintType.MARGIN,0);
            re= GeneralBarcode.imageBarcodeQrToBase64String(request.getData(),"png",70,70,hintMap2);
        } catch (WriterException e) {
           log.error(e.getMessage());
        } catch (IOException e) {
            log.error(e.getMessage());
        }
        if(Commons.checkString(re)){
            return new CreateImageBarcodeQrResponse("Success",true,re);
        }else return new CreateImageBarcodeQrResponse("Fail Data",false,"");
    }

    /**
     *
     * @param request
     * @return
     */
    @Override
    @WebMethod(
            action = "CategoriesQltb/CreatePdfQr",
            operationName = "CreatePdfQr",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbCreatePdfBarcodeQrRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbCreatePdfBarcodeQrResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public CreatePdfBarcodeQrResponse createPdfQr(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) CreatePdfBarcodeQrRequest request) {
        log.info(request.getUsername_()+ "_ Call createPdfQr"+ new Date());
        if(request.getCodes()== null || request.getCodes().isEmpty() ){
            return new CreatePdfBarcodeQrResponse("Invalid data",false,"");
        }
        String re = null;
        try {
            re= GeneralBarcode.pdfListBarcodeQrToBase64String("data/app/services/apiqlcb/file/temp/pdf",request.getCodes(),new float[]{2.5f,2.5f,2.5f,2.5f},10,2,null,true);
        } catch (WriterException e) {
            log.error(e.getMessage());
        } catch (IOException e) {
            log.error(e.getMessage());
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        if(Commons.checkString(re)){
            return new CreatePdfBarcodeQrResponse("Success",true,re);
        }else return new CreatePdfBarcodeQrResponse("Fail Data",false,"");
    }

    /**
     *
     * @param request
     * @return
     */
    @Override
    @WebMethod(
            action = "CategoriesQltb/CreateToken",
            operationName = "CreateToken",
            exclude = false
    )
    @WebResult(name = "GetData", targetNamespace = DefinedConfig.NAME_SPACE)
    @RequestWrapper(
            localName = "QltbCreateTokenRequest",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    @ResponseWrapper(
            localName = "QltbCreateTokenResponse",
            targetNamespace = DefinedConfig.NAME_SPACE
    )
    public CreateTokenResponse createToken(@WebParam(
            name = "request",
            partName = "request",
            targetNamespace = DefinedConfig.NAME_SPACE) CreateTokenRequest request) {
        log.info(request.getUsername_()+ "_ Call createToken"+ new Date());
        Pkcs12Crypto pkcs12Crypto=new Pkcs12Crypto();
        if(Commons.checkString(request.getToken())){
            try {
                String decrypt=pkcs12Crypto.decryptText(request.getToken(),pkcs12Crypto.getPrivateKey(DefinedConfig.PKCS12_FILE,DefinedConfig.PKCS12_PASSWORD,DefinedConfig.PKCS12_ALIAS));
                String[] temp=decrypt.split("_");
                if(Commons.isExpried(Long.valueOf(temp[temp.length-1]))){
                    return new CreateTokenResponse("Token còn hạn",true,"");
                }else {
                    return new CreateTokenResponse("Token hết hạn",false,"");
                }
            } catch (Exception e) {
                log.error(e.getMessage());
                return new CreateTokenResponse("Token không hợp lệ",false,"");
            }
        }
        if(Commons.checkString(request.getData())){
            Calendar calendar=new GregorianCalendar();
            calendar.add(Calendar.MINUTE,30);
            try {
                String encrypt=pkcs12Crypto.encryptText(request.getData()+"_"+calendar.getTimeInMillis(),pkcs12Crypto.getPublicKey(DefinedConfig.PKCS12_FILE,DefinedConfig.PKCS12_PASSWORD,DefinedConfig.PKCS12_ALIAS));
                return new CreateTokenResponse("Success",true,encrypt);
            } catch (Exception e) {
                log.error(e.getMessage());
                return new CreateTokenResponse("Invalid data "+ e.getMessage(),false,"");
            }
        }else return new CreateTokenResponse("Invalid data",false,"");
    }
}
