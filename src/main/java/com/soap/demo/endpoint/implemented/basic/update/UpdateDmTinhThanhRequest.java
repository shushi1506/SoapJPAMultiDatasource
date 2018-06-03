package com.soap.demo.endpoint.implemented.basic.update;


import com.soap.demo.DefinedConfig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author anhbt 5/27/2018
 * com.soap.demo.endpoint.implemented.basic.update
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class UpdateDmTinhThanhRequest{
    @XmlElement(namespace = DefinedConfig.NAME_SPACE)
    private String maTinhThanh;
    @XmlElement(namespace = DefinedConfig.NAME_SPACE)
    private String maVuTaiChinh;

    public String getMaTinhThanh() {
        return maTinhThanh;
    }

    public void setMaTinhThanh(String maTinhThanh) {
        this.maTinhThanh = maTinhThanh;
    }

    public String getMaVuTaiChinh() {
        return maVuTaiChinh;
    }

    public void setMaVuTaiChinh(String maVuTaiChinh) {
        this.maVuTaiChinh = maVuTaiChinh;
    }
}
