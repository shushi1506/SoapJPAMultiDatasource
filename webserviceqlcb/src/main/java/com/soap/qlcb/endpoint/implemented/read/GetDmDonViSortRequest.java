package com.soap.qlcb.endpoint.implemented.read;

import com.soap.qlcb.endpoint.implemented.BasicRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * @author anhbt 5/28/2018
 * com.soap.qlcb.endpoint.implemented.read
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class GetDmDonViSortRequest extends BasicRequest{
    private long id;
    private String search="";
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
