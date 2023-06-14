package model;

import helper.DataBaseHelper;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "table_line")
public class EntityLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public EntityLine() {
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

    public static List<EntityLine> getListLine() {
        return DataBaseHelper.getInstance().createQuery("FROM EntityLine ").list();
    }
}
