package com.soap.demo.endpoint.implemented.basic.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.Date;

/**
 * @author anhbt 5/9/2018
 * com.soap.demo.endpoint.implemented.basic.model
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class DanhMucTinhThanh {
    protected Integer id;
    protected String maTinhThanh;
    protected String tenTinhThanh;
    protected Date lastUpdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaTinhThanh() {
        return maTinhThanh;
    }

    public void setMaTinhThanh(String maTinhThanh) {
        this.maTinhThanh = maTinhThanh;
    }

    public String getTenTinhThanh() {
        return tenTinhThanh;
    }

    public void setTenTinhThanh(String tenTinhThanh) {
        this.tenTinhThanh = tenTinhThanh;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public DanhMucTinhThanh() {

    }
}
