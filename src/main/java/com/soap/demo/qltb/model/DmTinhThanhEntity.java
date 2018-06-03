package com.soap.demo.qltb.model;

import javax.persistence.*;
import java.util.Date;


/**
 * @author anhbt 5/26/2018
 * com.soap.demo.qltb.model
 */
@Entity
@Table(name = "DM_TINH_THANH", schema = "QLTB", catalog = "")
public class DmTinhThanhEntity {
    private long id;
    private String maTinhThanh;
    private String tenTinhThanh;
    private Date lastUpdate;
    private String maVuTaiChinh;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "MA_TINH_THANH")
    public String getMaTinhThanh() {
        return maTinhThanh;
    }

    public void setMaTinhThanh(String maTinhThanh) {
        this.maTinhThanh = maTinhThanh;
    }

    @Basic
    @Column(name = "TEN_TINH_THANH")
    public String getTenTinhThanh() {
        return tenTinhThanh;
    }

    public void setTenTinhThanh(String tenTinhThanh) {
        this.tenTinhThanh = tenTinhThanh;
    }

    @Basic
    @Column(name = "LAST_UPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    public java.util.Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(java.util.Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Basic
    @Column(name = "MA_VU_TAI_CHINH")
    public String getMaVuTaiChinh() {
        return maVuTaiChinh;
    }

    public void setMaVuTaiChinh(String maVuTaiChinh) {
        this.maVuTaiChinh = maVuTaiChinh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmTinhThanhEntity that = (DmTinhThanhEntity) o;

        if (id != that.id) return false;
        if (maTinhThanh != null ? !maTinhThanh.equals(that.maTinhThanh) : that.maTinhThanh != null) return false;
        if (tenTinhThanh != null ? !tenTinhThanh.equals(that.tenTinhThanh) : that.tenTinhThanh != null) return false;
        if (lastUpdate != null ? !lastUpdate.equals(that.lastUpdate) : that.lastUpdate != null) return false;
        if (maVuTaiChinh != null ? !maVuTaiChinh.equals(that.maVuTaiChinh) : that.maVuTaiChinh != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (maTinhThanh != null ? maTinhThanh.hashCode() : 0);
        result = 31 * result + (tenTinhThanh != null ? tenTinhThanh.hashCode() : 0);
        result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
        result = 31 * result + (maVuTaiChinh != null ? maVuTaiChinh.hashCode() : 0);
        return result;
    }
}
