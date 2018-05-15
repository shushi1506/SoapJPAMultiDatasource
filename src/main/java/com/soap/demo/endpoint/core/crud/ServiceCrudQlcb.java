package com.soap.demo.endpoint.core.crud;

import com.soap.demo.qlcb.model.DmQuocGia;
import com.soap.demo.qlcb.model.DmTinhThanh;
import com.soap.demo.qlcb.repository.DmQuocGiaRepo;
import com.soap.demo.qlcb.repository.DmTinhThanhRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<DmQuocGia> getAllDmQuocGia() {
        return dmQuocGiaRepo.findAll();
    }
}
