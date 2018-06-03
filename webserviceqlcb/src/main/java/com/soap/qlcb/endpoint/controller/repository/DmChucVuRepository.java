package com.soap.qlcb.endpoint.controller.repository;


import com.soap.qlcb.endpoint.controller.entity.DmChucVuEntity;
import com.soap.qlcb.endpoint.controller.results.ResultDmChucVu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author anhbt 5/17/2018
 * com.soap.demo.qlcb.repository
 */
public interface DmChucVuRepository extends JpaRepository<DmChucVuEntity,Long> {
    @Query("select new com.soap.qlcb.endpoint.controller.results.ResultDmChucVu(u.maChucVu,u.tenChucVu,u.hsPhuCap,u.capTruong) from DmChucVuEntity u ")
    List<ResultDmChucVu> getDmChucVuQlcb();
}
