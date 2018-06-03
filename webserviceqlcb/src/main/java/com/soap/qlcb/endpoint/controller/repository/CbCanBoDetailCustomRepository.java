package com.soap.qlcb.endpoint.controller.repository;

import com.soap.qlcb.endpoint.controller.entity.CbCanBoDetailEntityCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author anhbt 6/2/2018
 * com.soap.qlcb.endpoint.controller.repository
 */
@Repository
public interface CbCanBoDetailCustomRepository extends JpaRepository<CbCanBoDetailEntityCustom,Long> {
}
