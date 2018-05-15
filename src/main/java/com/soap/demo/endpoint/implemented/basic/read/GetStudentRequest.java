package com.soap.demo.endpoint.implemented.basic.read;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by anhbt on 5/5/2018.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class GetStudentRequest {
    @XmlAttribute(name = "userID")
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
