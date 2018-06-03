package com.soap.demo.endpoint.core.crud;

import com.soap.demo.DefinedConfig;
import com.soap.demo.endpoint.core.Utils.StateReponse;
import com.soap.demo.endpoint.implemented.basic.update.UpdateDmTinhThanhResponse;
import com.soap.demo.qltb.model.AuthItem;
import com.soap.demo.qltb.model.DmTinhThanhEntity;
import com.soap.demo.qltb.repository.AuthItemRepository;
import com.soap.demo.qltb.repository.DmTinhThanhRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author anhbt 5/15/2018
 * com.soap.demo.endpoint.core.implemented
 */
@Service
public class ServiceCrudQltb {
    static Logger log = LogManager.getLogger(ServiceCrudQltb.class);
    @Autowired
    private AuthItemRepository authItemRepository;
    @Autowired
    private DmTinhThanhRepository dmTinhThanhRepository;

    @Transactional(transactionManager = "transactionManagerqltb",readOnly = true)
    public List<AuthItem> getAllAuthItem(){
        return authItemRepository.findAll();
    }
    @Transactional(transactionManager = "transactionManagerqltb",readOnly = false)
    public void addAuthItem(){
        AuthItem t=new AuthItem();
        t.setName("tuananh");
        t.setDescription("aaa");
        t.setType(2);
        AuthItem k=authItemRepository.save(t);
        System.out.println(k.toString());
    }
    public List<DmTinhThanhEntity>getAllDmTinhThanhQltb(){
        return dmTinhThanhRepository.findAll();
    }
    public UpdateDmTinhThanhResponse updateDmTinhThanhByMaTinhThanh(String maTinhThanh, String maVuTaiChinh){
        DmTinhThanhEntity dmTinhThanhEntity=dmTinhThanhRepository.getByMaTinhThanh(maTinhThanh);
        if(dmTinhThanhEntity!=null) {
            dmTinhThanhEntity.setMaVuTaiChinh(maVuTaiChinh);
            try {
                dmTinhThanhRepository.save(dmTinhThanhEntity);
                return new UpdateDmTinhThanhResponse("Success","00",true);
            }catch (Exception ex){
                log.error("Exception " + ex);
                String error = "";
                if (ex.getCause() != null) {
                    if (ex.getCause().getCause() != null) {
                        error = ex.getCause().getCause().getMessage();
                    }
                }
                return new UpdateDmTinhThanhResponse(ex.getMessage()+error,DefinedConfig.HIBERNATE_ERROR_CODE,false);
            }
        }else {
            return new UpdateDmTinhThanhResponse(DefinedConfig.NOT_FOUND_ERROR_MESSAGE,DefinedConfig.NOT_FOUND_ERROR_CODE,false);
        }
    }
}
