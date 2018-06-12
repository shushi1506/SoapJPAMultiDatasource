package com.soap.qlcb.endpoint.controller.repository;

import com.soap.qlcb.endpoint.controller.entity.CommonDmDbhcEntity;
import com.soap.qlcb.endpoint.controller.results.ResultDmQuanHuyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author anhbt 6/7/2018
 * com.soap.qlcb.endpoint.controller.repository
 */
public interface CommonDmDbhcRepository extends JpaRepository<CommonDmDbhcEntity,Long>{
    @Query("select new com.soap.qlcb.endpoint.controller.results.ResultDmQuanHuyen(u.id,u.maDbhc,u.ten,t.tenTinhThanh,u.loaiHuyen,u.maCha) from CommonDmDbhcEntity u left join DmTinhThanh t on u.maCha = t.maTinhThanh where length(u.maDbhc)=3 order by u.maDbhc")
    List<ResultDmQuanHuyen> getDmQuanHuyenQlcb();
}
