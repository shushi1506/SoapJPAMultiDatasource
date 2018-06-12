package com.soap.qlcb.endpoint.controller.repository;

import com.soap.qlcb.endpoint.controller.entity.DmDonViEntityFix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author anhbt 6/5/2018
 * com.soap.qlcb.endpoint.controller.repository
 */
@Repository
public interface DmDonViFixRepository extends JpaRepository<DmDonViEntityFix,Long> {
}
