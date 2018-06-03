package com.soap.qlcb.endpoint.implemented.read;





import com.soap.qlcb.DefinedConfig;
import com.soap.qlcb.endpoint.implemented.model.Student;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by anhbt on 5/5/2018.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class GetStudentResponse {
    @XmlElement(name = "message",namespace = DefinedConfig.NAME_SPACE)
    private String message_;
    @XmlElement(name = "studentList",namespace = DefinedConfig.NAME_SPACE)
    private List<Student> studentList =new ArrayList<>();

    public GetStudentResponse() {
        List<Student> example=new ArrayList<>();
        example.add(new Student("Tuan","Anh",18));
        example.add(new Student("Tuan1","Anh1",18));
        example.add(new Student("Tuan2","Anh2",18));
        this.studentList=example;
        this.message_="success";
    }
}
