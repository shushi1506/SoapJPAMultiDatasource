package com.soap.demo.endpoint.implemented.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * @author anhbt 5/23/2018
 * com.soap.demo.endpoint.implemented.basic
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class DeleteFileSftpRequest {
    private String pathFile;

    public String getPathFile() {
        return pathFile;
    }

    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }
}
