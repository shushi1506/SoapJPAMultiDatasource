package com.soap.demo.endpoint.implemented.basic.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.Date;

/**
 * @author anhbt 5/10/2018
 * com.soap.demo.endpoint.implemented.basic.model
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class DanhMucQuanHuyen {
    protected String id;
    protected String maQuanHuyen;
    protected String tenQuanHuyen;
    protected String tinhThanhId;
    protected Date lastUpdate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaQuanHuyen() {
        return maQuanHuyen;
    }

    public void setMaQuanHuyen(String maQuanHuyen) {
        this.maQuanHuyen = maQuanHuyen;
    }

    public String getTenQuanHuyen() {
        return tenQuanHuyen;
    }

    public void setTenQuanHuyen(String tenQuanHuyen) {
        this.tenQuanHuyen = tenQuanHuyen;
    }

    public String getTinhThanhId() {
        return tinhThanhId;
    }

    public void setTinhThanhId(String tinhThanhId) {
        this.tinhThanhId = tinhThanhId;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
