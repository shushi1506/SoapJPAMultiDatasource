package com.soap.qlcb.endpoint.controller.repository;


import com.soap.qlcb.endpoint.controller.entity.DmDonViEntity;
import com.soap.qlcb.endpoint.controller.entity.DmDonViEntityResult;
import com.soap.qlcb.endpoint.controller.results.ResultDmDonVi;
import com.soap.qlcb.endpoint.controller.results.ResultDmDonViSort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author anhbt 5/15/2018
 * com.soap.demo.qlcb.repository
 */
@Repository
public interface DmDonViRepository extends JpaRepository<DmDonViEntity,Long> ,DmDonViRepositoryCustom{
    @Override
    Page<DmDonViEntity> findAll(Pageable pageable);

    @Query("select new com.soap.qlcb.endpoint.controller.results.ResultDmDonVi(u.id,u.maDonVi,u.tenTiengViet,u.tenTiengAnh,u.tinhThanhId,t.tenTinhThanh,u.diaChi,u.donviChaId,u.capDonVi,'','',0) from DmDonViEntity u left join DmTinhThanh t on u.tinhThanhId = t.id order by u.tinhThanhId")
    List<ResultDmDonVi> getDmDonViQlcb();

    @Query("select new com.soap.qlcb.endpoint.controller.results.ResultDmDonVi(u.id,u.maDonVi,u.tenTiengViet,u.tenTiengAnh,u.tinhThanhId,t.tenTinhThanh,u.diaChi,u.donviChaId,u.capDonVi,'','',0) from DmDonViEntity u left join DmTinhThanh t on u.tinhThanhId = t.id order by u.tinhThanhId")
    Page<ResultDmDonVi> getDmDonViPage(Pageable pageable);

    @Query("SELECT new com.soap.qlcb.endpoint.controller.results.ResultDmDonViSort(dv.id,dv.maDonVi,dv.tenTiengViet,dv.tinhThanhId,dv.diaChi,dv.donviChaId,dv.capDonVi,dv.loaiHinhDonVi)from DmDonViEntity dv where dv.id=:id or (dv.donviChaId=:id and LOWER(dv.tenTiengViet) like LOWER(:search)) order by dv.sttCap")
    List<ResultDmDonViSort>getListDmDonViSort(@Param("id")long id, @Param("search")String search);

//    @Procedure(name = "myProc",procedureName = "dm_don_vi_qltb_select")
//    List<DmDonViEntityResult>findDmDonViEntityResultViaProcedure();
    @Query(nativeQuery = true)
    List<Object>myProc();
    @Query(nativeQuery = true)
    List<Object>getDmDonViByNativeQuery();
    @Procedure
    List<Object>procGetDmDonVi();
}