package com.soap.qlcb.endpoint.controller.repository;

import com.soap.qlcb.endpoint.controller.repository.DmPhongBanRepositoryCustom;
import com.soap.qlcb.endpoint.controller.results.ResultDmPhongBan;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.List;

/**
 * @author anhbt 6/7/2018
 * com.soap.qlcb.endpoint.controller.impl
 */
public class DmPhongBanRepositoryImpl implements DmPhongBanRepositoryCustom {
    @PersistenceContext
    EntityManager em;
    @Override
    public List<ResultDmPhongBan> getDmPhongBanByProc() {
        StoredProcedureQuery query = em.createNamedStoredProcedureQuery("DmPhongBanEntity.procGetDmPhongBan");
        query.execute();

        @SuppressWarnings("unchecked")
        List<ResultDmPhongBan> emps = query.getResultList();

        return emps;
    }

}
