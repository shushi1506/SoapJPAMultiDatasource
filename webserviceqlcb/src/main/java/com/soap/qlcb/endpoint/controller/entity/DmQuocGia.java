package com.soap.qlcb.endpoint.controller.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author anhbt 5/13/2018
 * com.tecapro.jpa.model
 */
@Entity
@Table(name = "DM_QUOC_GIA")
public class DmQuocGia implements Serializable {
    @Id
    private int id;
    @Column(name = "MA_QUOC_GIA")
    private String maQuocGia;
    @Column(name = "TEN_QUOC_GIA")
    private String tenQuocGia;
    @Column(name = "LAST_UPDATE")
    private Date lastUpdate;

    public DmQuocGia() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaQuocGia() {
        return maQuocGia;
    }

    public void setMaQuocGia(String maQuocGia) {
        this.maQuocGia = maQuocGia;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }


    @Override
    public String toString() {
        return "DmQuocGia{" +
                "id=" + id +
                ", maQuocGia='" + maQuocGia + '\'' +
                ", tenQuocGia='" + tenQuocGia + '\'' +
                '}';
    }
}
