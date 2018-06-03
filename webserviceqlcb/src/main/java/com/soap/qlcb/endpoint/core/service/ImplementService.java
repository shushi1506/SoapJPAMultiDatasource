package com.soap.qlcb.endpoint.core.service;

import com.soap.qlcb.endpoint.controller.entity.*;
import com.soap.qlcb.endpoint.controller.results.*;
import com.soap.qlcb.endpoint.util.ServiceStatus;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author anhbt 5/17/2018
 * com.soap.demo.endpoint.core.implemented
 */
public interface ImplementService {
    public List<ResultDmQuanHuyen> serviceDmQuanHuyenQlcb();
    public List<ResultDmPhongBan>serviceDmPhongBanQlcb();
    public List<DmTinhThanh> serviceDmTinhThanhQlcb();
    public List<ResultDmDonVi>serviceDmDonViQlcb();
    public List<ResultDmDonVi>serviceDmDonViQlcbByProcedure();
    public List<ResultDmDonViSort>serviceDmDonViQlcbSort(long id,String search);
    public List<ResultDmChucVu>serviceDmChucVuQlcb();
    public List<ResultCbCanBo>serviceCbCanBoQlcb();
    public List<ResultCbCanBo>serviceCbCanBoQlcb(long idDonVi);
    public ResultCbCanBo serviceCbCanBoByIdQlcb(long id);
    public Page<ResultCbCanBo> serviceCbCanBoQlcbPage(int page, int size);
    boolean serviceCreateDmCanBo(List<CbCanBoEntity>list);

    @Transactional
    boolean serviceCreateDmChucVu(List<DmChucVuEntity> list);

    @Transactional
    boolean serviceCreateDmPhongBan(List<DmPhongBanEntity> list);

    @Transactional
    boolean serviceCreateCbCanBoDetail(List<CbCanBoDetailEntityCustom> list);

    @Transactional
    boolean serviceCreateDmDonVi(List<DmDonViEntity> list);

    ServiceStatus serviceDeleteDmCanBo(long id);

    @Transactional
    ServiceStatus serviceDeleteDmCanBoDetail(long id);

    @Transactional
    ServiceStatus serviceDeleteDmDonVi(long id);

    @Transactional
    ServiceStatus serviceDeleteDmPhongBan(long id);

    @Transactional
    ServiceStatus serviceDeleteDmChucVu(long id);
}
