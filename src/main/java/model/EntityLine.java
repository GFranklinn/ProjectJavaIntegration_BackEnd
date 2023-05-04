package model;

import javax.persistence.*;
import java.util.List;

import helper.DataBaseHelper;

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
        List<EntityLine> listLine = DataBaseHelper.getInstance().createQuery("FROM EntityLine ").list();
        return listLine;
    }
}
