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
public class UpdateFileSftpRequest extends BasicRequest {
    @XmlElement(name = "path",namespace = DefinedConfig.NAME_SPACE)
    private String path;
    @XmlElement(name = "fileSftp",namespace = DefinedConfig.NAME_SPACE)
    private FileSftp fileSftp;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public FileSftp getFileSftp() {
        return fileSftp;
    }

    public void setFileSftp(FileSftp fileSftp) {
        this.fileSftp = fileSftp;
    }
}
