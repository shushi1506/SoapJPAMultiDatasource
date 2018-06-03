package com.soap.qlcb.endpoint.controller.entity;

import javax.persistence.*;
import java.sql.Time;

/**
 * @author anhbt 5/15/2018
 * com.soap.demo.qlcb.model
 */
@Entity
@Table(name = "DM_QUAN_HUYEN", schema = "QLTB", catalog = "")
public class DmQuanHuyenEntity {
    private long id;
    private String maQuanHuyen;
    private String tenQuanHuyen;
    private Long tinhThanhId;
    private Time lastUpdate;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "MA_QUAN_HUYEN")
    public String getMaQuanHuyen() {
        return maQuanHuyen;
    }

    public void setMaQuanHuyen(String maQuanHuyen) {
        this.maQuanHuyen = maQuanHuyen;
    }

    @Basic
    @Column(name = "TEN_QUAN_HUYEN")
    public String getTenQuanHuyen() {
        return tenQuanHuyen;
    }

    public void setTenQuanHuyen(String tenQuanHuyen) {
        this.tenQuanHuyen = tenQuanHuyen;
    }

    @Basic
    @Column(name = "TINH_THANH_ID")
    public Long getTinhThanhId() {
        return tinhThanhId;
    }

    public void setTinhThanhId(Long tinhThanhId) {
        this.tinhThanhId = tinhThanhId;
    }

    @Basic
    @Column(name = "LAST_UPDATE")
    public Time getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Time lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmQuanHuyenEntity that = (DmQuanHuyenEntity) o;

        if (id != that.id) return false;
        if (maQuanHuyen != null ? !maQuanHuyen.equals(that.maQuanHuyen) : that.maQuanHuyen != null) return false;
        if (tenQuanHuyen != null ? !tenQuanHuyen.equals(that.tenQuanHuyen) : that.tenQuanHuyen != null) return false;
        if (tinhThanhId != null ? !tinhThanhId.equals(that.tinhThanhId) : that.tinhThanhId != null) return false;
        if (lastUpdate != null ? !lastUpdate.equals(that.lastUpdate) : that.lastUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (maQuanHuyen != null ? maQuanHuyen.hashCode() : 0);
        result = 31 * result + (tenQuanHuyen != null ? tenQuanHuyen.hashCode() : 0);
        result = 31 * result + (tinhThanhId != null ? tinhThanhId.hashCode() : 0);
        result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
        return result;
    }
}
