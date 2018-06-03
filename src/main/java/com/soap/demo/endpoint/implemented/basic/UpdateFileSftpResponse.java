package com.soap.demo.endpoint.implemented.basic;

import com.soap.demo.DefinedConfig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author anhbt 6/1/2018
 * com.soap.demo.endpoint.implemented.basic
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class UpdateFileSftpResponse {
    @XmlElement(name = "errorMessage",namespace = DefinedConfig.NAME_SPACE)
    private String errorMessage;
    @XmlElement(name = "status",namespace = DefinedConfig.NAME_SPACE)
    private boolean status;
    @XmlElement(name = "link",namespace = DefinedConfig.NAME_SPACE)
    private String link;

    public UpdateFileSftpResponse() {
    }

    public UpdateFileSftpResponse(String errorMessage, boolean status, String link) {
        this.errorMessage = errorMessage;
        this.status = status;
        this.link = link;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
