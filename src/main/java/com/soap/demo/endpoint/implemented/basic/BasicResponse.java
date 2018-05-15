package com.soap.demo.endpoint.implemented.basic;

import com.soap.demo.DefinedConfig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author anhbt 5/9/2018
 * com.soap.demo.endpoint.implemented.basic
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class BasicResponse {
    @XmlElement(name = "status", namespace = DefinedConfig.NAME_SPACE)
    private Boolean status_;
    @XmlElement(name = "message", namespace = DefinedConfig.NAME_SPACE)
    private String message_;
    @XmlElement(name = "count", namespace = DefinedConfig.NAME_SPACE)
    private Long count_ = -1L;
    @XmlElement(name = "errorCode", namespace = DefinedConfig.NAME_SPACE)
    private int errorCode;
    public BasicResponse()
    {
        this.status_ = false;
        this.count_ = -1L;
        this.message_ = "None";
        errorCode = 0;
    }

    public Boolean getStatus_() {
        return status_;
    }

    public void setStatus_(Boolean status_) {
        this.status_ = status_;
    }

    public String getMessage_() {
        return message_;
    }

    public void setMessage_(String message_) {
        this.message_ = message_;
    }

    public Long getCount_() {
        return count_;
    }

    public void setCount_(Long count_) {
        this.count_ = count_;
    }

    public int getErrorCode(int errorCode) {
        return this.errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
