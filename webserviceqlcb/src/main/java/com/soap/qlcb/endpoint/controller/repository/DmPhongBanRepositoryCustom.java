package com.soap.qlcb.endpoint.controller.repository;

import com.soap.qlcb.endpoint.controller.results.ResultDmPhongBan;

import java.util.List;

/**
 * @author anhbt 6/7/2018
 * com.soap.qlcb.endpoint.controller.repository
 */
public interface DmPhongBanRepositoryCustom {
    List<ResultDmPhongBan> getDmPhongBanByProc();
}
