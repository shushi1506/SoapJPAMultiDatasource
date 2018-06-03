package com.soap.demo.qltb.repository;

import com.soap.demo.qltb.model.DmDonViCungcapEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author anhbt 5/26/2018
 * com.soap.demo.qltb.repository
 */
@Repository
public interface DmDonViCungCapRepository extends JpaRepository<DmDonViCungcapEntity,Long> {
}
