package com.soap.qlcb.endpoint.controller.repository;


import com.soap.qlcb.endpoint.controller.entity.CbCanBoEntity;
import com.soap.qlcb.endpoint.controller.results.ResultCbCanBo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author anhbt 5/17/2018
 * com.soap.demo.qlcb.repository
 */
public interface CbCanBoRepository extends JpaRepository<CbCanBoEntity,Long> {
    @Query("select new com.soap.qlcb.endpoint.controller.results.ResultCbCanBo(u.id,u.soHieuCongChuc,u.hoTen,u.gioiTinh,t.tenTiengViet,c.tenChucVu,u.trangThai,d.emailCoQuan,t.maDonVi,c.maChucVu,t.id,pb.maPhongBan,pb.tenPhongBan) from CbCanBoEntity u left join DmDonViEntity t on u.donViId = t.id left join DmChucVuEntity c on u.chucVuId = c.id left join CbCanBoDetailEntity d on u.id=d.canBoId left join DmPhongBanEntity pb on u.phongBanId =pb.id where u.trangThai=1 order by u.id")
    List<ResultCbCanBo> getCbCanBoQlcb();

    @Query("select new com.soap.qlcb.endpoint.controller.results.ResultCbCanBo(u.id,u.soHieuCongChuc,u.hoTen,u.gioiTinh,t.tenTiengViet,c.tenChucVu,u.trangThai,d.emailCoQuan,t.maDonVi,c.maChucVu,t.id,pb.maPhongBan,pb.tenPhongBan) from CbCanBoEntity u left join DmDonViEntity t on u.donViId = t.id left join DmChucVuEntity c on u.chucVuId = c.id left join CbCanBoDetailEntity d on u.id=d.canBoId left join DmPhongBanEntity pb on u.phongBanId =pb.id where u.trangThai=1 and u.donViId in (select dt.id from DmDonViEntity dt where dt.id=:idDonvi or dt.donviChaId=:idDonvi ) order by u.id")
    List<ResultCbCanBo> getCbCanBoQlcbByDonViID(@Param("idDonvi")long idDonVi);

    @Query("select new com.soap.qlcb.endpoint.controller.results.ResultCbCanBo(u.id,u.soHieuCongChuc,u.hoTen,u.gioiTinh,t.tenTiengViet,c.tenChucVu,u.trangThai,d.emailCoQuan,t.maDonVi,c.maChucVu,t.id,pb.maPhongBan,pb.tenPhongBan) from CbCanBoEntity u left join DmDonViEntity t on u.donViId = t.id left join DmChucVuEntity c on u.chucVuId = c.id left join CbCanBoDetailEntity d on u.id=d.canBoId left join DmPhongBanEntity pb on u.phongBanId =pb.id where u.trangThai =1 and u.donViId in (select dt.id from DmDonViEntity dt where u.id=:id ) order by u.id")
    ResultCbCanBo getCbCanBoQlcbByID(@Param("id")long id);

    @Query("select new com.soap.qlcb.endpoint.controller.results.ResultCbCanBo(u.id,u.soHieuCongChuc,u.hoTen,u.gioiTinh,t.tenTiengViet,c.tenChucVu,u.trangThai,d.emailCoQuan,t.maDonVi,c.maChucVu,t.id,pb.maPhongBan,pb.tenPhongBan) from CbCanBoEntity u left join DmDonViEntity t on u.donViId = t.id left join DmChucVuEntity c on u.chucVuId = c.id left join CbCanBoDetailEntity d on u.id = d.canBoId left join DmPhongBanEntity pb on u.phongBanId =pb.id where u.trangThai =1 order by u.id")
    Page<ResultCbCanBo> getCbCanBoQlcbPage(Pageable pageable);
}
