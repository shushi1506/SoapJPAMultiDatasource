package com.soap.demo.endpoint.core.crud;

import com.soap.demo.endpoint.core.Utils.StateReponse;
import com.soap.demo.endpoint.implemented.basic.update.UpdateDmTinhThanhResponse;
import com.soap.demo.qltb.model.AuthItem;
import com.soap.demo.qltb.model.DmTinhThanhEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author anhbt 5/15/2018
 * com.soap.demo.endpoint.core.implemented
 */
@Service
public class ServiceCrudDanhMuc {

    private static ServiceCrudQltb serviceCrudQltb;

    @Autowired
    public ServiceCrudDanhMuc( ServiceCrudQltb serviceCrudQltb){
        ServiceCrudDanhMuc.serviceCrudQltb =serviceCrudQltb;
    }

//
//    public static List<ResultDmDonVi>getResultDmDonViQlcb(){
//        return serviceCrudQlcb.serviceDmDonViQlcb();
//    }
//    public static List<ResultDmChucVu>getResultDmChucVuQlcb(){return serviceCrudQlcb.serviceDmChucVuQlcb();}
//    public static List<ResultDmPhongBan>getResultDmPhongBanQlcb(){return serviceCrudQlcb.serviceDmPhongBanQlcb();}
//    public static List<ResultDmQuanHuyen>getResultDmQuanHuyenQlcb(){return serviceCrudQlcb.serviceDmQuanHuyenQlcb();}
//    public static List<ResultCbCanBo>getResultCbCanBoQlcb(){return serviceCrudQlcb.serviceCbCanBoQlcb();}
//    public static Page<ResultCbCanBo>getResultCbCanBoQlcbPage(int page,int size){return serviceCrudQlcb.serviceCbCanBoQlcbPage(page,size);}

    public static List<AuthItem>getAllAuthItem(){
        return serviceCrudQltb.getAllAuthItem();
    }
    public static List<DmTinhThanhEntity>getAllDmTinhThanh(){
        return serviceCrudQltb.getAllDmTinhThanhQltb();
    }
    public static UpdateDmTinhThanhResponse updateDmTinhThanhByMaTinhThanh(String maTinhThanh, String maVuTaiChinh){
        return serviceCrudQltb.updateDmTinhThanhByMaTinhThanh(maTinhThanh,maVuTaiChinh);
    }
}
