package com.soap.demo.qlcb.repository;

import com.soap.demo.qlcb.model.DmDonViEntity;
import com.soap.demo.qlcb.model.ResultDmDonVi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author anhbt 5/15/2018
 * com.soap.demo.qlcb.repository
 */
@Repository
public interface DmDonViRepository extends JpaRepository<DmDonViEntity,Long> {
    @Override
    Page<DmDonViEntity> findAll(Pageable pageable);

    @Query("select new com.soap.demo.qlcb.model.ResultDmDonVi(u.id,u.tenTiengViet,u.tenTiengAnh,u.tinhThanhId,t.tenTinhThanh) from DmDonViEntity u left join DmTinhThanh t on u.tinhThanhId = t.id")
    List<ResultDmDonVi> getDmDonVi();

    @Query("select new com.soap.demo.qlcb.model.ResultDmDonVi(u.id,u.tenTiengViet,u.tenTiengAnh,u.tinhThanhId,t.tenTinhThanh) from DmDonViEntity u left join DmTinhThanh t on u.tinhThanhId = t.id")
    Page<ResultDmDonVi> getDmDonViPage(Pageable pageable);
}
