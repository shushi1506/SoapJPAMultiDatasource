package com.soap.qlcb.endpoint.implemented.delete;

import com.soap.qlcb.endpoint.util.ServiceStatus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author anhbt 6/2/2018
 * com.soap.qlcb.endpoint.implemented.delete
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class DeleteDongBoDmCanBoDetailResponse {
    @XmlElement(name = "serviceStatus")
    private ServiceStatus serviceStatus;

    public ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(ServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
    }
}
