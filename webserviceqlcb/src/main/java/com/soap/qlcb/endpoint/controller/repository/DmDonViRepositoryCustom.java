package com.soap.qlcb.endpoint.controller.repository;

import com.soap.qlcb.endpoint.controller.results.ResultDmDonVi;

import java.util.List;

/**
 * @author anhbt 5/30/2018
 * com.soap.qlcb.endpoint.controller.repository
 */
public interface DmDonViRepositoryCustom {
    List<ResultDmDonVi>getDmDonViByProc();
}
