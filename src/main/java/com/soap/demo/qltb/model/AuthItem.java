package com.soap.demo.qltb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author anhbt 5/14/2018
 * com.soap.demo.qltb.model
 */
@Entity
@Table(name = "AUTH_ITEM")
public class AuthItem implements Serializable {
    @Id
    private String name;
    private int type;
    private String description;

    public AuthItem() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "AuthItem{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", description='" + description + '\'' +
                '}';
    }
}
