package com.soap.qlcb.endpoint.controller.repository;


import com.soap.qlcb.endpoint.controller.entity.DmQuanHuyenEntity;
import com.soap.qlcb.endpoint.controller.results.ResultDmQuanHuyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author anhbt 5/17/2018
 * com.soap.demo.qlcb.repository
 */
@Repository
public interface DmQuanHuyenRepository extends JpaRepository<DmQuanHuyenEntity,Long> {
    @Query("select new com.soap.qlcb.endpoint.controller.results.ResultDmQuanHuyen(u.maQuanHuyen,u.tenQuanHuyen,t.tenTinhThanh) from DmQuanHuyenEntity u left join DmTinhThanh t on u.tinhThanhId = t.id")
    List<ResultDmQuanHuyen>getDmQuanHuyenQlcb();
}
