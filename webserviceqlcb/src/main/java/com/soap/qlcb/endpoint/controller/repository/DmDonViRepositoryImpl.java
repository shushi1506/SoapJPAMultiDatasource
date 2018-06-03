package com.soap.qlcb.endpoint.controller.repository;

import com.soap.qlcb.endpoint.controller.results.ResultDmDonVi;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.List;

/**
 * @author anhbt 5/30/2018
 * com.soap.qlcb.endpoint.controller.repository
 */
public class DmDonViRepositoryImpl implements DmDonViRepositoryCustom {
    @Override
    public List<ResultDmDonVi> getDmDonViByProc() {
        StoredProcedureQuery query = em.createNamedStoredProcedureQuery("DmDonViEntity.procGetDmDonVi");
        query.execute();

        @SuppressWarnings("unchecked")
        List<ResultDmDonVi> emps = query.getResultList();

        return emps;
    }
    @PersistenceContext
    EntityManager em;

}
