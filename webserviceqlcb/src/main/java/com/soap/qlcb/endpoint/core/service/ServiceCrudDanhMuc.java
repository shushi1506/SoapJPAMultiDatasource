package com.soap.qlcb.endpoint.core.service;


import com.soap.qlcb.endpoint.controller.entity.*;
import com.soap.qlcb.endpoint.controller.results.*;
import com.soap.qlcb.endpoint.util.ServiceStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author anhbt 5/15/2018
 * com.soap.demo.endpoint.core.implemented
 */
@Service
public class ServiceCrudDanhMuc {
    private static ServiceCrudQlcb serviceCrudQlcb;


    @Autowired
    public ServiceCrudDanhMuc(ServiceCrudQlcb serviceCrudQlcb){
        ServiceCrudDanhMuc.serviceCrudQlcb =serviceCrudQlcb;
    }

    public static List<DmTinhThanh> getResultDmTinhThanhQlcb(){
        return serviceCrudQlcb.serviceDmTinhThanhQlcb();
    }
    public static List<ResultDmDonVi>getResultDmDonViQlcb(){
        return serviceCrudQlcb.serviceDmDonViQlcb();
    }
    public static List<ResultDmDonVi>getResultDmDonViQlcbByProcdedure(){
        return serviceCrudQlcb.serviceDmDonViQlcbByProcedure();
    }
    public static List<ResultDmDonViSort>getResultDmDonViQlcbSort(long id, String search){
        return serviceCrudQlcb.serviceDmDonViQlcbSort(id,search);
    }
    public static List<ResultDmChucVu>getResultDmChucVuQlcb(){return serviceCrudQlcb.serviceDmChucVuQlcb();}
    public static List<ResultDmPhongBan>getResultDmPhongBanQlcb(){return serviceCrudQlcb.serviceDmPhongBanQlcb();}
    public static List<ResultDmQuanHuyen>getResultDmQuanHuyenQlcb(){return serviceCrudQlcb.serviceDmQuanHuyenQlcb();}
    public static List<ResultCbCanBo>getResultCbCanBoQlcb(long idDonVi){return serviceCrudQlcb.serviceCbCanBoQlcb(idDonVi);}
    public static ResultCbCanBo getResultCbCanBoByIdQlcb(long id){return serviceCrudQlcb.serviceCbCanBoByIdQlcb(id);}
    public static List<ResultCbCanBo>getResultCbCanBoQlcb(){return serviceCrudQlcb.serviceCbCanBoQlcb();}
    public static Page<ResultCbCanBo>getResultCbCanBoQlcbPage(int page,int size){return serviceCrudQlcb.serviceCbCanBoQlcbPage(page,size);}
    public static boolean createDongBoDmCanBo(List<CbCanBoEntity>list){return serviceCrudQlcb.serviceCreateDmCanBo(list);}
    public static boolean createDongBoDmChucVu(List<DmChucVuEntity>list){return serviceCrudQlcb.serviceCreateDmChucVu(list);}
    public static boolean createDongBoDmPhongBan(List<DmPhongBanEntity>list){return serviceCrudQlcb.serviceCreateDmPhongBan(list);}
    public static boolean createDongBoDmDonVi(List<DmDonViEntity>list){return serviceCrudQlcb.serviceCreateDmDonVi(list);}
    public static boolean createDongBoCbCanBoDetail(List<CbCanBoDetailEntityCustom>list){return serviceCrudQlcb.serviceCreateCbCanBoDetail(list);}
    public static ServiceStatus deleteDongBoDmCanBo(long id){return serviceCrudQlcb.serviceDeleteDmCanBo(id);}
    public static ServiceStatus deleteDongBoDmCanBoDetail(long id){return serviceCrudQlcb.serviceDeleteDmCanBoDetail(id);}
    public static ServiceStatus deleteDongBoDmDonVi(long id){return serviceCrudQlcb.serviceDeleteDmDonVi(id);}
    public static ServiceStatus deleteDongBoDmChucVu(long id){return serviceCrudQlcb.serviceDeleteDmChucVu(id);}
    public static ServiceStatus deleteDongBoDmPhongBan(long id){return serviceCrudQlcb.serviceDeleteDmPhongBan(id);}
}
