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
 * com.soap.demo.endpoint.implemented.basic.read
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class BasicRequest {
    @XmlAttribute(name = "username", required = true)
    private String username_;

    public BasicRequest() {
    }

    public String getUsername_() {
        return username_;
    }

    public void setUsername_(String username_) {
        this.username_ = username_;
    }
}
