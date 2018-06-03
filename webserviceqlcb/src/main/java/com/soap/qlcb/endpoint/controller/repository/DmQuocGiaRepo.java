package com.soap.qlcb.endpoint.controller.repository;



import com.soap.qlcb.endpoint.controller.entity.DmQuocGia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author anhbt 5/13/2018
 * com.tecapro.jpa.repository
 */
@Repository
public interface DmQuocGiaRepo extends JpaRepository<DmQuocGia,Integer> {
    @Override
    List<DmQuocGia> findAll();
}
