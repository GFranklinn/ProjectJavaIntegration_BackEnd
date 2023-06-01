package model;

import util.HibernateUtilFactory;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "table_model")
public class EntityModel implements EntityInterface{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_category", columnDefinition = "int")
    private EntityCategory id_category;

    public EntityModel() {
    }

    EntityModel(EntityCategory id_category, int id, String name) {
        this.id_category = id_category;
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static List<EntityModel> getListModel(EntityCategory entityCategory) {
        List<EntityModel> listModel = HibernateUtilFactory.getInstance().createQuery(String.format("FROM EntityModel WHERE id_category = '%s'", entityCategory.getId())).list();
        return listModel;
    }
}