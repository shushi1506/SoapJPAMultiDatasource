package com.soap.qlcb.endpoint.controller.repository;


import com.soap.qlcb.endpoint.controller.entity.DmPhongBanEntity;
import com.soap.qlcb.endpoint.controller.results.ResultDmPhongBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author anhbt 5/16/2018
 * com.soap.demo.qlcb.repository
 */
@Repository
public interface DmPhongBanRepository extends JpaRepository<DmPhongBanEntity,Long> {
    @Query("select new com.soap.qlcb.endpoint.controller.results.ResultDmPhongBan(u.donViId,t.tenTiengViet,u.maPhongBan,u.tenPhongBan,u.truongPhong,u.phoPhong,u.soLuongCanBo) from DmPhongBanEntity u left join DmDonViEntity t on u.donViId = t.id")
    List<ResultDmPhongBan> getDmPhongBanQlcb();
}
