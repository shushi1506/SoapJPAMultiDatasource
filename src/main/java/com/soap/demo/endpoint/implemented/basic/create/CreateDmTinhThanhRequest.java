package com.soap.demo.endpoint.implemented.basic.create;

import com.soap.demo.DefinedConfig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * @author anhbt 5/27/2018
 * com.soap.demo.endpoint.implemented.basic.create
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CreateDmTinhThanhRequest {
    @XmlAttribute(required = true,namespace = DefinedConfig.NAME_SPACE)
    private String userName;
    @XmlAttribute(required = true,namespace = DefinedConfig.NAME_SPACE)
    private String password;
    private long id;
    private String maTinhThanh;
    private String tenTinhThanh;
    private String maVuTaiChinh;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getMaVuTaiChinh() {
        return maVuTaiChinh;
    }

    public void setMaVuTaiChinh(String maVuTaiChinh) {
        this.maVuTaiChinh = maVuTaiChinh;
    }

}
