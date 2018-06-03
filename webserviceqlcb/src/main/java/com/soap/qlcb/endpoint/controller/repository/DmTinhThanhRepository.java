package com.soap.qlcb.endpoint.controller.repository;

import com.soap.qlcb.endpoint.controller.entity.DmTinhThanh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author anhbt 5/14/2018
 * com.soap.demo.qlcb.repository
 */
@Repository
public interface DmTinhThanhRepository extends CrudRepository<DmTinhThanh,Long>,DmTinhThanhRepositoryCustom {
    DmTinhThanh findById(long id);
//    @Override
//    Iterable<DmTinhThanh> findAll();
//    @Procedure()
//    Object[] getDmTinhThanhByProcedure();
    @Procedure
    Integer getProcedure(@Param("arg")Integer arg);
}
