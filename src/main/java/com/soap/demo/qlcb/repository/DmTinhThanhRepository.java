package com.soap.demo.qlcb.repository;

import com.soap.demo.qlcb.model.DmTinhThanh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author anhbt 5/14/2018
 * com.soap.demo.qlcb.repository
 */
@Repository
public interface DmTinhThanhRepository extends CrudRepository<DmTinhThanh,Long> {
    DmTinhThanh findById(long id);


    @Override
    Iterable<DmTinhThanh> findAll();

}
