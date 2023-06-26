package com.java.projectintegration.model;

import org.hibernate.annotations.Type;
import javax.persistence.*;

@Entity
@Table(name = "table_category")
public class EntityCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Type(type = "org.hibernate.type.IntegerType")
    private int id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_line")
    private EntityLine entityLine;

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EntityLine getEntityLine() {
        return entityLine;
    }

    public void setEntityLine(EntityLine entityLine) {
        this.entityLine = entityLine;
    }

    public EntityCategory() {}

    public EntityCategory(EntityLine entityLine, int id, String name) {
        this.entityLine = entityLine;
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