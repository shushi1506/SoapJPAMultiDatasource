package com.soap.demo.endpoint.implemented.basic;

import com.soap.demo.endpoint.core.Utils.Commons;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.List;

/**
 * @author anhbt 5/22/2018
 * com.soap.demo.endpoint.implemented.basic
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class SaveFileFtpRequest extends BasicRequest{
    List<FileSftp> listFile;

    public List<FileSftp> getListFile() {
        return listFile;
    }

    public void setListFile(List<FileSftp> listFile) {
        this.listFile = listFile;
    }
    public String checkList() {
        StringBuilder sb = new StringBuilder();
        String re = "";
        for (int i = 0; i < listFile.size(); i++) {
            FileSftp temp = listFile.get(i);
            if (!Commons.checkString(temp.getEncoded()) || !Commons.checkString(temp.getFileName()) || temp.getType() == 0) {
                sb.append("Wrong format:i");
            }
        }
        if (!sb.toString().isEmpty()) {
            re = sb.toString();
        }
        return re;
    }
}
