package com.soap.demo.endpoint.core.crud;

import com.soap.demo.qlcb.model.DmDonViEntity;
import com.soap.demo.qlcb.model.DmQuocGia;
import com.soap.demo.qlcb.model.DmTinhThanh;
import com.soap.demo.qlcb.repository.DmDonViRepository;
import com.soap.demo.qlcb.repository.DmQuocGiaRepo;
import com.soap.demo.qlcb.repository.DmTinhThanhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author anhbt 5/15/2018
 * com.soap.demo.endpoint.core.crud
 */
@Service
public class ServiceCrudQlcb {
    @Autowired
    DmTinhThanhRepository dmTinhThanhRepository;
    @Autowired
    DmQuocGiaRepo dmQuocGiaRepo;
    @Autowired
    DmDonViRepository dmDonViRepository;

    @Transactional(readOnly = true)
    public List<DmTinhThanh> getAllDmTinhThanh() {
        List<DmTinhThanh>t=new ArrayList<>();
        dmTinhThanhRepository.findAll().forEach(t::add);
        return t ;
    }

    @Transactional()
    public boolean addDmTinhThanh(){
        DmTinhThanh t=new DmTinhThanh();
        t.setMaTinhThanh("96");
        t.setTenTinhThanh("Tuan");
        dmTinhThanhRepository.save(t);
        return true;
    }
    private PageRequest gotoPage(int page)
    {
        PageRequest request = new PageRequest(page,50);
        return request;
    }
    public List<DmDonViEntity>getDmDonViPage(int page){
        return dmDonViRepository.findAll(gotoPage(2)).getContent();
    }
    public List<DmQuocGia> getAllDmQuocGia() {
        return dmQuocGiaRepo.findAll();
    }
    public List<DmDonViEntity>getAllDmDonVi(){
        return dmDonViRepository.findAll();
    }
}
