package com.java.projectintegration.model;

import org.hibernate.annotations.Type;
import javax.persistence.*;

@Entity
@Table(name = "table_model")
public class EntityModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Type(type = "org.hibernate.type.IntegerType")
    private int id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private EntityCategory entityCategory;

    public EntityModel() {
    }

    public int getId() {
        return id;
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

    public EntityCategory getEntityCategory() {
        return entityCategory;
    }

    public void setEntityCategory(EntityCategory entityCategory) {
        this.entityCategory = entityCategory;
    }

    EntityModel(EntityCategory entityCategory, int id, String name) {
        this.entityCategory = entityCategory;
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}