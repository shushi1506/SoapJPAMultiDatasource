package com.soap.qlcb.endpoint.controller.repository;

import com.soap.qlcb.endpoint.controller.entity.DmTinhThanh;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.List;

/**
 * @author anhbt 5/30/2018
 * com.soap.qlcb.endpoint.controller.repository
 */
public class DmTinhThanhRepositoryImpl implements DmTinhThanhRepositoryCustom {
    @PersistenceContext
    EntityManager em;

    @Override
    public List<DmTinhThanh> getDmTinhThanhProc() {
        StoredProcedureQuery query = em.createNamedStoredProcedureQuery("DmTinhThanh.getDmTinhThanhByProcedure");
        query.execute();

        @SuppressWarnings("unchecked")
        List<DmTinhThanh> emps = query.getResultList();

        return emps;
    }
}
