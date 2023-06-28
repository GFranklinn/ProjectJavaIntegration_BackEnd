package com.java.projectintegration.model;

import javax.persistence.*;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "table_line")
public class EntityLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Type(type = "org.hibernate.type.IntegerType")
    private int id;
    private String name;
    public EntityLine() {
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EntityLine(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

}