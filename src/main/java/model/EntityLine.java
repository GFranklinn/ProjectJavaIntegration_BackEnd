package model;

import javax.persistence.*;

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
}
