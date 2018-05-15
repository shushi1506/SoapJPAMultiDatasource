package com.soap.demo.qltb.repository;

import com.soap.demo.qltb.model.AuthItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author anhbt 5/14/2018
 * com.soap.demo.qltb.repository
 */
@Repository
public interface AuthItemRepository extends JpaRepository<AuthItem,String> {
    @Override
    List<AuthItem> findAll();
}
