package com.soap.demo.endpoint.core.crud;

import com.soap.demo.qlcb.model.DmDonViEntity;
import com.soap.demo.qlcb.model.DmTinhThanh;
import com.soap.demo.qltb.model.AuthItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author anhbt 5/15/2018
 * com.soap.demo.endpoint.core.crud
 */
@Service
public class ServiceSumary {
    private static ServiceCrudQlcb serviceCrudQlcb;
    private static ServiceCrudQltb serviceCrudQltb;

    @Autowired
    public ServiceSumary(ServiceCrudQlcb serviceCrudQlcb,ServiceCrudQltb serviceCrudQltb){
        ServiceSumary.serviceCrudQlcb =serviceCrudQlcb;
        ServiceSumary.serviceCrudQltb =serviceCrudQltb;
    }

    public static List<DmTinhThanh>getAllDmTinhThanh(){
        return serviceCrudQlcb.getAllDmTinhThanh();
    }
    public static List<DmDonViEntity>getAllDmDonVi(){
        return serviceCrudQlcb.getAllDmDonVi();
    }
    public static List<DmDonViEntity>getDmDonViPage(int page){
        return serviceCrudQlcb.getDmDonViPage(page);
    }
    public static List<AuthItem>getAllAuthItem(){
        return serviceCrudQltb.getAllAuthItem();
    }
    public static boolean addDmTinhThanh(){
        return serviceCrudQlcb.addDmTinhThanh();
    }
}
