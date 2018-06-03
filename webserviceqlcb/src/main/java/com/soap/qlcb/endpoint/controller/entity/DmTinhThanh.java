package com.soap.qlcb.endpoint.controller.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.io.Serializable;

/**
 * @author anhbt 5/14/2018
 * com.soap.demo.qlcb.model
 */
@Entity
@Table(name = "DM_TINH_THANH")
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "DmTinhThanh.getDmTinhThanhByProcedure",
                procedureName = "GET_DM_TINH_THANH_PROC",
                resultClasses = DmTinhThanh.class,
                parameters = {
                        @StoredProcedureParameter(name = "role_list_o", mode = ParameterMode.REF_CURSOR, type = void.class) }
        ),
        @NamedStoredProcedureQuery(name = "DmTinhThanh.getProcedure",
                procedureName = "PLUS1INOUT",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "arg", type = Integer.class),
                        @StoredProcedureParameter(mode = ParameterMode.OUT, name = "res", type = Integer.class) }
        )
})

@XmlAccessorType(XmlAccessType.FIELD)
public class DmTinhThanh implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
    @SequenceGenerator(sequenceName = "DM_TINH_THANH_SEQ", allocationSize = 1, name = "generator")
    @Column(name = "ID",nullable = false)
    private Long id;
    @Column(name = "MA_TINH_THANH",length = 100)
    private String maTinhThanh;
    @Column(name = "TEN_TINH_THANH",length = 350)
    private String tenTinhThanh;
//    @Column(name = "LAST_UPDATE")
//    private Date lastUpdate;

    public DmTinhThanh() {
    }

    public DmTinhThanh(Long id,String maTinhThanh, String tenTinhThanh) {
        this.id=id;
        this.maTinhThanh = maTinhThanh;
        this.tenTinhThanh = tenTinhThanh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

//    public Date getLastUpdate() {
//        return lastUpdate;
//    }
//
//    public void setLastUpdate(Date lastUpdate) {
//        this.lastUpdate = lastUpdate;
//    }

    @Override
    public String toString() {
        return "DmTinhThanh{" +
                "id=" + id +
                ", maTinhThanh='" + maTinhThanh + '\'' +
                ", tenTinhThanh='" + tenTinhThanh + '\'' +
//                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
