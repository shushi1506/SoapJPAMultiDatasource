package com.soap.demo.endpoint.core.crud;

import com.soap.demo.qltb.model.AuthItem;
import com.soap.demo.qltb.repository.AuthItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author anhbt 5/15/2018
 * com.soap.demo.endpoint.core.crud
 */
@Service
public class ServiceCrudQltb {
    @Autowired
    private AuthItemRepository authItemRepository;
    public List<AuthItem> getAllAuthItem(){
        return authItemRepository.findAll();
    }
    @Transactional("transactionManagerqltb")
    public void addAuthItem(){
        AuthItem t=new AuthItem();
        t.setName("tuananh");
        t.setDescription("aaa");
        t.setType(2);
        AuthItem k=authItemRepository.save(t);
        System.out.println(k.toString());
    }
}
