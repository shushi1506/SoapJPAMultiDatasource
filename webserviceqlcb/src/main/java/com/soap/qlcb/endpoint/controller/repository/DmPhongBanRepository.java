package com.soap.qlcb.endpoint.controller.repository;


import com.soap.qlcb.endpoint.controller.entity.DmPhongBanEntity;
import com.soap.qlcb.endpoint.controller.results.ResultDmPhongBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author anhbt 5/16/2018
 * com.soap.demo.qlcb.repository
 */
@Repository
public interface DmPhongBanRepository extends JpaRepository<DmPhongBanEntity,Long>, DmPhongBanRepositoryCustom {
    @Query("select new com.soap.qlcb.endpoint.controller.results.ResultDmPhongBan(u.id,u.donViId,t.tenTiengViet,u.maPhongBan,u.tenPhongBan,'','',0) from DmPhongBanEntity u left join DmDonViEntity t on u.donViId = t.id order by u.maPhongBan")
    List<ResultDmPhongBan> getDmPhongBanQlcb();

}
