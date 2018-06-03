package com.soap.qlcb.endpoint.implemented.read;



import com.soap.qlcb.endpoint.controller.results.ResultCbCanBo;
import com.soap.qlcb.endpoint.implemented.BasicResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author anhbt 5/17/2018
 * com.soap.demo.endpoint.implemented.basic.read
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class GetCbCanBoResponse extends BasicResponse {
//    private int totalPage;
//    private long totalElement;
//    private boolean isPrevious;
//    private int currentPage;
    @XmlElement(name = "dmCanBo",nillable = true)
    List<ResultCbCanBo>list=new ArrayList<>();

    public List<ResultCbCanBo> getList() {
        return list;
    }

    public void setList(List<ResultCbCanBo> list) {
        this.list = list;
    }

//    public int getTotalPage() {
//        return totalPage;
//    }
//
//    public void setTotalPage(int totalPage) {
//        this.totalPage = totalPage;
//    }
//
//    public long getTotalElement() {
//        return totalElement;
//    }
//
//    public void setTotalElement(long totalElement) {
//        this.totalElement = totalElement;
//    }
//
//    public boolean isPrevious() {
//        return isPrevious;
//    }
//
//    public void setPrevious(boolean previous) {
//        isPrevious = previous;
//    }
//
//    public int getCurrentPage() {
//        return currentPage;
//    }
//
//    public void setCurrentPage(int currentPage) {
//        this.currentPage = currentPage;
//    }
}
