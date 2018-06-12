package com.soap.qlcb.endpoint.core.service;

import com.soap.qlcb.endpoint.controller.entity.*;
import com.soap.qlcb.endpoint.controller.repository.*;
import com.soap.qlcb.endpoint.controller.results.*;
import com.soap.qlcb.endpoint.util.ServiceStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author anhbt 5/15/2018
 * com.soap.demo.endpoint.core.implemented
 */
@Service
public class ServiceCrudQlcb implements ImplementService {
    static Logger logger= LogManager.getLogger(ServiceCrudQlcb.class);
    @Autowired
    DmTinhThanhRepository dmTinhThanhRepository;
    @Autowired
    DmQuocGiaRepo dmQuocGiaRepo;
    @Autowired
    DmDonViRepository dmDonViRepository;
    @Autowired
    DmPhongBanRepository dmPhongBanRepository;
    @Autowired
    CommonDmDbhcRepository commonDmDbhcRepository;
    @Autowired
    DmChucVuRepository dmChucVuRepository;
    @Autowired
    CbCanBoRepository cbCanBoRepository;
    @Autowired
    CbCanBoDetailCustomRepository cbCanBoDetailCustomRepository;
    @Autowired
    DmDonViFixRepository dmDonViFixRepository;

    //region dm tinh thanh
    @Override
    @Transactional(readOnly = true)
    public List<DmTinhThanh> serviceDmTinhThanhQlcb() {
        List<DmTinhThanh> t = new ArrayList<>();
        dmTinhThanhRepository.findAll().forEach(t::add);
        return t;
    }
//    @Transactional()
//    public boolean addDmTinhThanh(){
//        DmTinhThanh t=new DmTinhThanh();
//        t.setMaTinhThanh("96");
//        t.setTenTinhThanh("Tuan");
//        dmTinhThanhRepository.save(t);
//        return true;
//    }
    //endregion

    //region dm don vi
//    public List<DmDonViEntity>getDmDonViPage(int page){
//        return dmDonViRepository.findAll(gotoPage(2)).getContent();
//    }
    public List<ResultDmDonVi> serviceDmDonViQlcb() {
        return dmDonViRepository.getDmDonViQlcb();
    }
    public List<ResultDmDonVi> serviceDmDonViQlcbByProcedure() {
        return dmDonViRepository.getDmDonViByProc();
    }
    public List<ResultDmDonViSort>serviceDmDonViQlcbSort(long id,String search){
        return dmDonViRepository.getListDmDonViSort(id,search);
    }
    //endregion

    //region dm quoc gia
//    public List<DmQuocGia> getAllDmQuocGia() {
//        return dmQuocGiaRepo.findAll();
//    }
    //endregion

    //region dm phong ban
//    @Transactional()
//    public boolean addDmPhongBan(){
//        DmPhongBanEntity t=new DmPhongBanEntity();
//        t.setDonViId(333L);
//        t.setMaPhongBan("ABC");
//        t.setTenPhongBan("TuanAnh");
//        dmPhongBanRepository.save(t);
//        return true;
//    }
//    @Transactional
//    public boolean deleteDmPhongBanById(long id){
//        dmPhongBanRepository.deleteById(id);
//        return true;
//    }
    public List<ResultDmPhongBan> serviceDmPhongBanQlcb() {
        return dmPhongBanRepository.getDmPhongBanByProc();
    }
    //endregion

    //region dm quan huyen
    @Override
    @Transactional(readOnly = true)
    public List<ResultDmQuanHuyen> serviceDmQuanHuyenQlcb() {
        return commonDmDbhcRepository.getDmQuanHuyenQlcb();
    }
    //endregion

    //region dm chuc vu
    @Override
    @Transactional(readOnly = true)
    public List<ResultDmChucVu> serviceDmChucVuQlcb() {
        return dmChucVuRepository.getDmChucVuQlcb();
    }
    //endregion

    //region dm cb can bo
    @Override
    @Transactional(readOnly = true)
    public List<ResultCbCanBo> serviceCbCanBoQlcb() {
        return cbCanBoRepository.getCbCanBoQlcb();
    }

    @Override
    @Transactional(readOnly = true)
    public List<ResultCbCanBo> serviceCbCanBoQlcb(long idDonVi) {
        return cbCanBoRepository.getCbCanBoQlcbByDonViID(idDonVi);
    }
    @Override
    @Transactional(readOnly = true)
    public ResultCbCanBo serviceCbCanBoByIdQlcb(long id) {
        return cbCanBoRepository.getCbCanBoQlcbByID(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<ResultCbCanBo> serviceCbCanBoQlcbPage(int page, int size) {
        return cbCanBoRepository.getCbCanBoQlcbPage(gotoPage(page, size));
    }

    @Override
    @Transactional
    public boolean serviceCreateDmCanBo(List<CbCanBoEntity> list) {
        cbCanBoRepository.saveAll(list);
        cbCanBoRepository.flush();
        return true;
    }
    @Override
    @Transactional
    public boolean serviceCreateDmChucVu(List<DmChucVuEntity> list) {
        dmChucVuRepository.saveAll(list);
        dmChucVuRepository.flush();
        return true;
    }
    @Override
    @Transactional
    public boolean serviceCreateDmPhongBan(List<DmPhongBanEntity> list) {
        dmPhongBanRepository.saveAll(list);
        dmPhongBanRepository.flush();
        return true;
    }

    @Override
    @Transactional
    public boolean serviceCreateCbCanBoDetail(List<CbCanBoDetailEntityCustom> list) {
        cbCanBoDetailCustomRepository.saveAll(list);
        cbCanBoDetailCustomRepository.flush();
        return true;
    }
    @Override
    @Transactional
    public boolean serviceCreateDmDonVi(List<DmDonViEntityFix> list) {
        dmDonViFixRepository.saveAll(list);
        dmDonViFixRepository.flush();
        return true;
    }



    @Override
    @Transactional
    public ServiceStatus serviceDeleteDmCanBo(long id) {
        ServiceStatus serviceStatus;
        try {
            cbCanBoRepository.deleteById(id);
            serviceStatus= new ServiceStatus("Success","00",true);
        }catch (Exception e){
            logger.error(e);
            serviceStatus= new ServiceStatus(e.getMessage(),"99",false);
        }
        return serviceStatus;
    }

    @Override
    @Transactional
    public ServiceStatus serviceDeleteDmCanBoDetail(long id) {
        ServiceStatus serviceStatus;
        try {
            cbCanBoDetailCustomRepository.deleteById(id);
            serviceStatus= new ServiceStatus("Success","00",true);
        }catch (Exception e){
            logger.error(e);
            serviceStatus= new ServiceStatus(e.getMessage(),"99",false);
        }
        return serviceStatus;
    }
    @Override
    @Transactional
    public ServiceStatus serviceDeleteDmDonVi(long id) {
        ServiceStatus serviceStatus;
        try {
            dmDonViRepository.deleteById(id);
            serviceStatus= new ServiceStatus("Success","00",true);
        }catch (Exception e){
            logger.error(e);
            serviceStatus= new ServiceStatus(e.getMessage(),"99",false);
        }
        return serviceStatus;
    }
    @Override
    @Transactional
    public ServiceStatus serviceDeleteDmPhongBan(long id) {
        ServiceStatus serviceStatus;
        try {
            dmPhongBanRepository.deleteById(id);
            serviceStatus= new ServiceStatus("Success","00",true);
        }catch (Exception e){
            logger.error(e);
            serviceStatus= new ServiceStatus(e.getMessage(),"99",false);
        }
        return serviceStatus;
    }
    @Override
    @Transactional
    public ServiceStatus serviceDeleteDmChucVu( long id) {
        ServiceStatus serviceStatus;
        try {
            dmChucVuRepository.deleteById(id);
            serviceStatus= new ServiceStatus("Success","00",true);
        }catch (Exception e){
            logger.error(e);
            serviceStatus= new ServiceStatus(e.getMessage(),"99",false);
        }
        return serviceStatus;
    }
    //endregion
    private PageRequest gotoPage(int page, int size) {
        return PageRequest.of(page, size);
    }


}
